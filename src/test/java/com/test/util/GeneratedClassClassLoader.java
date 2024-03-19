package com.test.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedClassClassLoader extends ClassLoader {

    private static final Logger logger = LoggerFactory.getLogger(GeneratedClassClassLoader.class);

    private byte[] getBytes(String className) {
        String fileName = "src/test/resources/" + className.replace('.', '/') + ".class";
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            return fileInputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name.startsWith("com.generated.")) {
            byte[] bytes = getBytes(name);
            return super.defineClass(StringUtils.removeEnd(name, ".class"), bytes, 0, bytes.length);
        }

        logger.error("You are probably using a wrong class loader for class: {}, please check", name);
        throw new ClassNotFoundException(String.format("Class not found: [%s]", name));
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = new GeneratedClassClassLoader().loadClass("com.generated.attribute.synthetic.Generated");
        logger.info("name of clazz: {}", clazz.getCanonicalName());
    }
}
