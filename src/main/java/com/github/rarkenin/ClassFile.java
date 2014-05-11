package com.github.rarkenin;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by hexafraction on 5/11/14.
 * http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html
 */

public class ClassFile {

    final int major, minor;

    @NotNull
    final ConstantPoolInfo[] pool;

    // http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.1-200-E.1
    final int accessFlags;

    @NotNull
    final ConstantPoolClassRef thisClass;

    @Nullable
    final ConstantPoolClassRef superclass;

    @NotNull
    final ConstantPoolClassRef[] interfaces;

    @NotNull
    final JVMField[] fields;

    @NotNull
    final JVMMethod[] methods;

    @NotNull
    final AttributesInfo[] attributes;

    //FIXME map for quick field and method lookup

    /**
     * Created by hexafraction on 5/11/14.
     * http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.5
     * Inner as associated with class
     */
    public class JVMField {
        final int accessFlags;

        @NotNull
        final ConstantPoolUTF8 name;

        @NotNull
        final ConstantPoolUTF8 descriptor;


        @NotNull
        final AttributesInfo[] attributes;


    }

    private class JVMMethod {
        final int accessFlags;

        @NotNull
        final ConstantPoolUTF8 name;

        @NotNull
        final ConstantPoolUTF8 descriptor;


        @NotNull
        final AttributesInfo[] attributes;
    }

    private interface AttributesInfo {
    }
}
