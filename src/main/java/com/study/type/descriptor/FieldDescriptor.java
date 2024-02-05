package com.study.type.descriptor;

/**
 * Please refer to the following section for more details
 * <a href="https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html#jvms-4.3.2">4.3.2. Field Descriptors</a>
 *
 * @param fieldType {@link BaseType} {@link ObjectType} {@link ArrayType}
 */
public record FieldDescriptor(FieldType fieldType) {
}
