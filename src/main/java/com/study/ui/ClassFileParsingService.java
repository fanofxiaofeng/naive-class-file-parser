package com.study.ui;

import com.study.io.BasicInputStream;
import com.study.parser.MainParser;
import com.study.parser.ParseResult;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Unified entry for parsing a class file from an arbitrary location.
 * The CLI ({@code com.study.parser.Main}) reads from the classpath,
 * while the GUI needs to open arbitrary files selected via a file chooser
 * or drag and drop.
 */
public final class ClassFileParsingService {

    private ClassFileParsingService() {
    }

    public static ParseResult parse(Path path) throws IOException {
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(path))) {
            return parse(inputStream);
        }
    }

    public static ParseResult parse(InputStream inputStream) {
        return new MainParser(new BasicInputStream(inputStream)).parse();
    }
}
