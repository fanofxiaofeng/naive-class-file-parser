package com.study.signature;

public class SuperType extends AbstractSignature {

    private final Signature follower;

    public SuperType(Signature follower) {
        this.follower = follower;
    }

    @Override
    public String desc() {
        return String.format("? super %s", follower);
    }
}
