package com.study.signature;

import java.util.List;

public class SuperType implements Signature {

    private final Signature follower;

    public SuperType(Signature follower) {
        this.follower = follower;
    }

    @Override
    public List<String> desc() {
        String desc = String.format("? super %s", follower.desc().get(0));
        return List.of(desc);
    }
}
