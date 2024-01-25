package com.study.parser;

import com.study.type.*;
import com.study.type.info.attribute.AttributeInfo;
import com.study.type.info.FieldInfo;
import com.study.type.info.MethodInfo;

public class ParseResult {
    /**
     * Magic number
     */
    private U4 magic;

    private U2 minorVersion;

    private U2 majorVersion;

    private ConstantPool constantPool;
    private U2 accessFlags;
    private U2 thisClass;
    private U2 superClass;
    private U2 interfacesCount;
    private U2[] interfaces;
    private ItemsContainer<FieldInfo> fields;

    private ItemsContainer<MethodInfo> methods;

    private ItemsContainer<AttributeInfo> attributes;


    public void setMagic(U4 magic) {
        this.magic = magic;
    }

    public U4 getMagic() {
        return magic;
    }

    public void setMinorVersion(U2 minorVersion) {
        this.minorVersion = minorVersion;
    }

    public U2 getMinorVersion() {
        return minorVersion;
    }

    public void setMajorVersion(U2 majorVersion) {
        this.majorVersion = majorVersion;
    }

    public U2 getMajorVersion() {
        return majorVersion;
    }


    public void setConstantPool(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    public void setAccessFlags(U2 accessFlags) {
        this.accessFlags = accessFlags;
    }

    public void setThisClass(U2 thisClass) {
        this.thisClass = thisClass;
    }

    public void setSuperClass(U2 superClass) {
        this.superClass = superClass;
    }

    public U2 getInterfacesCount() {
        return interfacesCount;
    }

    public void setInterfacesCount(U2 interfacesCount) {
        this.interfacesCount = interfacesCount;
    }

    public void setInterfaces(U2[] interfaces) {
        this.interfaces = interfaces;
    }

    public void setFields(ItemsContainer<FieldInfo> fields) {
        this.fields = fields;
    }

    public ItemsContainer<FieldInfo> getFields() {
        return fields;
    }


    public void setMethods(ItemsContainer<MethodInfo> methods) {
        this.methods = methods;
    }

    public void setAttributes(ItemsContainer<AttributeInfo> attributes) {
        this.attributes = attributes;
    }

    public U2 getAccessFlags() {
        return accessFlags;
    }

    public U2 getThisClass() {
        return thisClass;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public U2 getSuperClass() {
        return superClass;
    }


    public ItemsContainer<MethodInfo> getMethods() {
        return methods;
    }

    public ItemsContainer<AttributeInfo> getAttributes() {
        return attributes;
    }
}
