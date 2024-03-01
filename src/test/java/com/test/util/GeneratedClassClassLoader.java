package com.test.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedClassClassLoader extends ClassLoader {

    private static final Logger logger = LoggerFactory.getLogger(GeneratedClassClassLoader.class);

    private byte[] getBytes(String className) {
        try {
            return new FileInputStream("src/test/resources/" + className.replace('.', '/') + ".class").readAllBytes();
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

        logger.warn("You are probably using a wrong class loader for class: {}, please check", name);

        return super.findClass(name);
    }
}
