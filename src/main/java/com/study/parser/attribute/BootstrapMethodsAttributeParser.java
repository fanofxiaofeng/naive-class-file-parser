package com.study.parser.attribute;

import com.study.io.U1InputStream;
import com.study.type.U2;
import com.study.type.U4;
import com.study.type.info.attribute.BootstrapMethodsAttribute;

import java.util.List;

public class BootstrapMethodsAttributeParser extends AttributeParser<BootstrapMethodsAttribute> {
    public BootstrapMethodsAttributeParser(U2 attributeNameIndex, U4 attributeLength, U1InputStream infoStream) {
        super(attributeNameIndex, attributeLength, infoStream);
    }

    @Override
    public BootstrapMethodsAttribute parse() {
        /*
        u2 num_bootstrap_methods;
    {   u2 bootstrap_method_ref;
        u2 num_bootstrap_arguments;
        u2 bootstrap_arguments[num_bootstrap_arguments];
    } bootstrap_methods[num_bootstrap_methods];
         */
        U2 numBootstrapMethods = infoStream.readU2();

        List<BootstrapMethodsAttribute.BootstrapMethod> bootstrapMethods =
                numBootstrapMethods.mapToList(() -> {
                    U2 bootstrapMethodRef = infoStream.readU2();
                    U2 numBootstrapArguments = infoStream.readU2();
                    List<U2> bootstrapArguments = infoStream.readU2List(numBootstrapArguments.toInt());
                    return new BootstrapMethodsAttribute.BootstrapMethod(bootstrapMethodRef, bootstrapArguments);
                });

        return new BootstrapMethodsAttribute(attributeNameIndex, attributeLength, bootstrapMethods);
    }
}
