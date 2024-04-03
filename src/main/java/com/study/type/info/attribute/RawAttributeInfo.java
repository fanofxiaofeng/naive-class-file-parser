package com.study.type.info.attribute;

import com.study.io.U1InputStream;
import com.study.type.U1;
import com.study.type.U2;
import com.study.type.U4;

public class RawAttributeInfo extends AttributeInfo {
    private final U1InputStream infoStream;

    public RawAttributeInfo(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength);
        this.infoStream = infoStream;
    }

    public RawAttributeInfo(U2 attributeNameIndex, U1InputStream u1InputStream) {
        super(attributeNameIndex, u1InputStream.readU4());

        U1[] info = u1InputStream.readU1Array(attributeLength.toInt());
        this.infoStream = new U1InputStream(info);
    }

    public RawAttributeInfo(U1InputStream u1InputStream) {
        super(u1InputStream.readU2(), u1InputStream.readU4());
        this.infoStream = new U1InputStream(u1InputStream.readU1Array(attributeLength.toInt()));
    }

    public U1InputStream getInfoStream() {
        return infoStream;
    }
}
