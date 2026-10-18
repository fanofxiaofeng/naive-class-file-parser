package com.test.ui.cases;

/**
 * Fixture for the attributes panel test: a record carries a class-level
 * {@code Record} attribute whose presenter is not implemented yet, so the
 * detail pane must fall back to the placeholder text instead of failing.
 */
public record GuiRecordCase(String name) {
}
