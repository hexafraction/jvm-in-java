package com.github.rarkenin;

import org.jetbrains.annotations.NotNull;

/**
 * Created by hexafraction on 5/11/14.
 */
public class ConstantPoolUTF8 implements ConstantPoolInfo{
    @NotNull
    public String getContents() {
        return contents;
    }

    public ConstantPoolUTF8(@NotNull String contents) {
        this.contents = contents;

    }

    @Override
    public byte getTag() {
        return 1;
    }

    private @NotNull
    final String contents;
}
