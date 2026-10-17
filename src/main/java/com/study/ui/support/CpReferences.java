package com.study.ui.support;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Finds constant pool references (like {@code #5} or {@code #5.#13})
 * inside presenter-produced text. Used by the constant pool table
 * to implement "jump to referenced entry" on double click.
 */
public final class CpReferences {

    private static final Pattern REFERENCE = Pattern.compile("#(\\d+)");

    private CpReferences() {
    }

    /**
     * @return referenced constant pool indices, in first-seen order and de-duplicated.
     * Index 0 (e.g., super_class of java.lang.Object) is included, but callers
     * can treat it as non-navigable.
     */
    public static List<Integer> findIn(String... texts) {
        Set<Integer> references = new LinkedHashSet<>();
        for (String text : texts) {
            if (text == null) {
                continue;
            }
            Matcher matcher = REFERENCE.matcher(text);
            while (matcher.find()) {
                references.add(Integer.parseInt(matcher.group(1)));
            }
        }
        return new ArrayList<>(references);
    }
}
