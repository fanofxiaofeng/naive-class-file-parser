package com.study.signature;

import java.util.Arrays;
import java.util.Optional;

public sealed class TypeArgument permits TypeArgument.CaseOne, TypeArgument.CaseTwo {

    public String desc() {
        throw new IllegalArgumentException();
    }

    public static final class CaseOne extends TypeArgument {
        private final Optional<WildcardIndicator> wildcardIndicator;

        private final ReferenceTypeSignature referenceTypeSignature;

        public CaseOne(WildcardIndicator wildcardIndicator, ReferenceTypeSignature referenceTypeSignature) {
            this.wildcardIndicator = Optional.of(wildcardIndicator);
            this.referenceTypeSignature = referenceTypeSignature;
        }

        public CaseOne(ReferenceTypeSignature referenceTypeSignature) {
            this.wildcardIndicator = Optional.empty();
            this.referenceTypeSignature = referenceTypeSignature;
        }

        @Override
        public String desc() {
            if (wildcardIndicator.isEmpty()) {
                return referenceTypeSignature.desc();
            }
            switch (wildcardIndicator.get()) {
                case PLUS -> {
                    return String.format("? extends %s", referenceTypeSignature.desc());
                }
                case MINUS -> {
                    return String.format("? super %s", referenceTypeSignature.desc());
                }
                default -> {
                    String message = String.format("Unsupported WildcardIndicator: %s", wildcardIndicator.get());
                    throw new IllegalArgumentException(message);
                }
            }
        }

        public enum WildcardIndicator {
            PLUS('+'),
            MINUS('-');

            private final char symbol;

            WildcardIndicator(char symbol) {
                this.symbol = symbol;
            }

            public static WildcardIndicator toWildcardIndicator(int symbol) {
                Optional<WildcardIndicator> first =
                        Arrays.stream(values()).filter(e -> e.symbol == symbol).findFirst();
                if (first.isEmpty()) {
                    String message = String.format("Symbol: [%s] don't have corresponding WildcardIndicator!", symbol);
                    throw new IllegalArgumentException(message);
                }
                return first.get();
            }
        }
    }

    public static final class CaseTwo extends TypeArgument {
        private static final String SYMBOL = "*";

        private CaseTwo() {

        }

        private static final CaseTwo instance = new CaseTwo();

        public static CaseTwo getInstance() {
            return instance;
        }

        @Override
        public String desc() {
            return "?";
        }
    }
}

