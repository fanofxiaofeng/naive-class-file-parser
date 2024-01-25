package com.study.signature;

import java.util.List;

public class SubType implements Signature {

    private final Signature follower;

    public SubType(Signature follower) {
        this.follower = follower;
    }

    @Override
    public List<String> desc() {
        String desc = String.format("? extends %s", follower.desc().get(0));
        return List.of(desc);
    }
}
