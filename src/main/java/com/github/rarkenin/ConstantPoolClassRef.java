package com.github.rarkenin;

import org.jetbrains.annotations.NotNull;

/**
 * Created by hexafraction on 5/11/14.
 */
public class ConstantPoolClassRef implements ConstantPoolInfo{
    public ConstantPoolClassRef(@NotNull String descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public byte getTag() {
        // http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.4-140
        return 7;
    }

    @NotNull
    public String getDescriptor() {
        return descriptor;
    }

    private final @NotNull
    String descriptor;
}
