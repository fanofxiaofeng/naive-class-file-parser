package com.study.signature;

public class SubType extends AbstractSignature {

    private final Signature follower;

    public SubType(Signature follower) {
        this.follower = follower;
    }

    @Override
    public String desc() {
        return String.format("? extends %s", follower.desc());
    }
}
