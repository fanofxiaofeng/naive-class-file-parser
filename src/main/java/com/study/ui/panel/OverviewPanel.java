package com.study.ui.panel;

import com.study.constants.ClassAccessFlags;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import org.apache.commons.lang3.tuple.Pair;
import com.study.type.constant.CpInfo;
import com.study.ui.support.AccessFlagsTable;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Class file summary: file, magic, version, access flags, this/super class,
 * interfaces and the various counts.
 */
public class OverviewPanel extends JPanel {

    private static final Map<Integer, String> JAVA_VERSIONS = Map.ofEntries(
            Map.entry(45, "JDK 1.1"),
            Map.entry(46, "JDK 1.2"),
            Map.entry(47, "JDK 1.3"),
            Map.entry(48, "JDK 1.4"),
            Map.entry(49, "Java 5"),
            Map.entry(50, "Java 6"),
            Map.entry(51, "Java 7"),
            Map.entry(52, "Java 8"),
            Map.entry(53, "Java 9"),
            Map.entry(54, "Java 10"),
            Map.entry(55, "Java 11"),
            Map.entry(56, "Java 12"),
            Map.entry(57, "Java 13"),
            Map.entry(58, "Java 14"),
            Map.entry(59, "Java 15"),
            Map.entry(60, "Java 16"),
            Map.entry(61, "Java 17"),
            Map.entry(62, "Java 18"),
            Map.entry(63, "Java 19"),
            Map.entry(64, "Java 20"),
            Map.entry(65, "Java 21"),
            Map.entry(66, "Java 22"),
            Map.entry(67, "Java 23"),
            Map.entry(68, "Java 24"),
            Map.entry(69, "Java 25")
    );

    /**
     * JVMS §4.1 Table 4.1-A: class access and property modifiers.
     */
    private static final Map<ClassAccessFlags, String> FLAG_MEANINGS = new EnumMap<>(Map.ofEntries(
            Map.entry(ClassAccessFlags.ACC_PUBLIC,
                    "Declared public; may be accessed from outside its package."),
            Map.entry(ClassAccessFlags.ACC_FINAL,
                    "Declared final; no subclasses allowed."),
            Map.entry(ClassAccessFlags.ACC_SUPER,
                    "Treat superclass methods specially when invoked by the invokespecial instruction."),
            Map.entry(ClassAccessFlags.ACC_INTERFACE,
                    "Is an interface, not a class."),
            Map.entry(ClassAccessFlags.ACC_ABSTRACT,
                    "Declared abstract; must not be instantiated."),
            Map.entry(ClassAccessFlags.ACC_SYNTHETIC,
                    "Declared synthetic; not present in the source code."),
            Map.entry(ClassAccessFlags.ACC_ANNOTATION,
                    "Declared as an annotation interface."),
            Map.entry(ClassAccessFlags.ACC_ENUM,
                    "Declared as an enum class."),
            Map.entry(ClassAccessFlags.ACC_MODULE,
                    "Is a module, not a class or interface.")
    ));

    public OverviewPanel(ParseResult result, Path file) {
        super(new BorderLayout());

        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 6, 3, 6);
        gbc.anchor = GridBagConstraints.WEST;

        int row = 0;
        row = addRow(form, gbc, row, "file", file == null ? "" : file.toAbsolutePath().toString());
        row = addRow(form, gbc, row, "magic", result.getMagic().toString());
        row = addRow(form, gbc, row, "minor version", String.valueOf(result.getMinorVersion().toInt()));
        row = addRow(form, gbc, row, "major version", describeMajorVersion(result.getMajorVersion().toInt()));
        row = addRow(form, gbc, row, "access flags", describeAccessFlags(result));
        row = addAccessFlagsTable(form, gbc, row, result.getAccessFlags().toInt());
        row = addRow(form, gbc, row, "this_class", describeClassIndex(result, result.getThisClass()));
        row = addRow(form, gbc, row, "super_class", describeSuperClass(result));
        row = addRow(form, gbc, row, "interfaces", describeInterfaces(result));
        row = addRow(form, gbc, row, "constant_pool_count", describeConstantPoolCount(result));
        row = addRow(form, gbc, row, "fields_count", String.valueOf(result.getFields().getCount()));
        row = addRow(form, gbc, row, "methods_count", String.valueOf(result.getMethods().getCount()));
        addRow(form, gbc, row, "attributes_count", String.valueOf(result.getAttributes().getCount()));

        // keep the form stuck to the top-left of the scroll pane
        gbc.gridx = 0;
        gbc.gridy = row + 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        form.add(new JPanel(), gbc);

        JScrollPane scrollPane = new JScrollPane(form);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane, BorderLayout.CENTER);
    }

    private int addRow(JPanel form, GridBagConstraints gbc, int row, String key, String value) {
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = row;
        JTextField keyLabel = styledLabel(key + ":");
        keyLabel.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 12));
        form.add(keyLabel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridx = 1;
        form.add(styledLabel(value), gbc);
        return row + 1;
    }

    /**
     * Embeds the full JVMS Table 4.1-A as a table; rows whose flag is set
     * on the current class are highlighted.
     */
    private int addAccessFlagsTable(JPanel form, GridBagConstraints gbc, int row, int accessFlags) {
        List<AccessFlagsTable.FlagRow> rows = Arrays.stream(ClassAccessFlags.values())
                .map(flag -> new AccessFlagsTable.FlagRow(flag.name(), flag.getFlag(), FLAG_MEANINGS.get(flag)))
                .toList();
        AccessFlagsTable table = new AccessFlagsTable(rows, accessFlags);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.gridwidth = 2;
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createTitledBorder("access_flags (JVMS Table 4.1-A)"));
        form.add(scrollPane, gbc);
        gbc.gridwidth = 1;
        return row + 1;
    }

    private JTextField styledLabel(String text) {
        JTextField textField = new JTextField(text);
        textField.setEditable(false);
        textField.setBorder(BorderFactory.createEmptyBorder(2, 4, 2, 4));
        textField.setOpaque(false);
        return textField;
    }

    private String describeMajorVersion(int majorVersion) {
        String javaVersion = JAVA_VERSIONS.get(majorVersion);
        if (javaVersion == null) {
            return String.valueOf(majorVersion);
        }
        return String.format("%d (%s)", majorVersion, javaVersion);
    }

    private String describeAccessFlags(ParseResult result) {
        U2 accessFlags = result.getAccessFlags();
        StringJoiner joiner = new StringJoiner(", ");
        Arrays.stream(ClassAccessFlags.values())
                .filter(item -> accessFlags.isOn(item.getFlag()))
                .forEach(item -> joiner.add(item.toString()));
        return String.format("0x%04x  %s", accessFlags.toInt(), joiner);
    }

    private String describeClassIndex(ParseResult result, U2 classIndex) {
        ConstantPool constantPool = result.getConstantPool();
        return String.format("#%d  // %s", classIndex.toInt(), constantPool.detail(classIndex));
    }

    private String describeSuperClass(ParseResult result) {
        U2 superClass = result.getSuperClass();
        if (superClass.toInt() == 0) {
            return "#0  // java/lang/Object has no superclass";
        }
        return describeClassIndex(result, superClass);
    }

    private String describeInterfaces(ParseResult result) {
        ConstantPool constantPool = result.getConstantPool();
        String names = result.getInterfaces().stream()
                .map(index -> String.format("#%d(%s)", index.toInt(), constantPool.detail(index)))
                .collect(Collectors.joining(", "));
        if (names.isEmpty()) {
            return "0";
        }
        return result.getInterfaces().size() + ": " + names;
    }

    private String describeConstantPoolCount(ParseResult result) {
        int entryCount = 0;
        for (Pair<Integer, CpInfo> ignored : result.getConstantPool()) {
            entryCount++;
        }
        // constant_pool_count is "number of entries + 1" (index 0 is unused)
        return String.format("%d  (%d valid entries)",
                result.getConstantPool().getCount(), entryCount);
    }

}
