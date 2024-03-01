package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.CompoundCpInfo;
import com.study.type.constant.leaf.ConstantUtf8;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

public class CpInfoPresenter extends AbstractPresenter {

    protected final Pair<Integer, CpInfo> pair;

    private static final int DEFAULT_INDENT_LEVEL = 1;
    private static final int TYPE_PART_WIDTH = 19;

    protected CpInfoPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, Pair<Integer, CpInfo> pair) {
        super(result, printStreamWrapper);
        this.pair = pair;
    }

    @Override
    public void doPresent() {
        int index = pair.getKey();
        CpInfo item = pair.getRight();

        String indexPart = buildIndexPart(index);
        String typePart = item.getTag().getType();

        String content;
        if (item instanceof LeafCpInfo leafCpInfo) {
            String descPart = leafCpInfo.desc();
            if (leafCpInfo instanceof ConstantUtf8) {
                descPart = descPart.stripTrailing();
            }
            content = buildContent(indexPart, typePart, descPart);
        } else if (item instanceof CompoundCpInfo compoundCpInfo) {
            ConstantPool constantPool = result.getConstantPool();
            String componentDesc = compoundCpInfo.componentDesc(constantPool);
            content = buildContent(indexPart, typePart, componentDesc, compoundCpInfo.decoratedDetail(constantPool));
        } else {
            String message = String.format("Unsupported type: %s", item.getClass().getSimpleName());
            throw new IllegalArgumentException(message);
        }

        printStreamWrapper.printlnWithIndentLevel(content, DEFAULT_INDENT_LEVEL);
    }

    private String buildCoreInfo(String indexPart, String typePart, String descPart) {
        if (descPart.isEmpty()) {
            return String.format("%s = %s",
                    indexPart,
                    typePart
            );

        }
        return String.format("%s = %s%s",
                indexPart,
                StringUtils.rightPad(typePart, TYPE_PART_WIDTH),
                descPart
        );
    }

    private String buildContent(String indexPart, String typePart, String descPart) {
        return buildCoreInfo(indexPart, typePart, descPart);
    }

    private String buildContent(String indexPart, String typePart, String descPart, String detail) {
        String coreInfo = buildCoreInfo(indexPart, typePart, descPart);
        String result = StringUtils.rightPad(coreInfo, CORE_INFO_WIDTH);
        return (result + "// " + detail).stripTrailing();
    }

    private String buildIndexPart(int index) {
        int lastIndex = result.getConstantPool().lastIndex();
        int numberPartFixedWidth = String.format("#%s", lastIndex).length();
        return StringUtils.leftPad(String.format("#%s", index), numberPartFixedWidth);
    }
}
