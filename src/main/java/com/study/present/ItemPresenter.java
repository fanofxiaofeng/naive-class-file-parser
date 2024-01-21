package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.constant.CpInfo;
import com.study.util.ConstantPoolUtils;
import com.study.util.PaddingUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.io.PrintStream;
import java.util.Optional;

public class ItemPresenter extends AbstractPresenter {

    private final Pair<Integer, CpInfo> pair;

    private static final int TYPE_PART_WIDTH = 19;

    protected ItemPresenter(ParseResult result, PrintStream printStream, Pair<Integer, CpInfo> pair) {
        super(result, printStream);
        this.pair = pair;
    }

    @Override
    public void present() {
        int index = pair.getKey();
        CpInfo item = pair.getRight();

        String indexPart = buildIndexPart(index);
        String typePart = item.getTag().getType();
        String descPart = item.desc();

        String content;
        Optional<String> detail = item.detail(result.getConstantPool());
        if (detail.isPresent()) {
            content = buildContent(indexPart, typePart, descPart, detail.get());
        } else {
            content = buildContent(indexPart, typePart, descPart);
        }

        printStream.println(content);
    }

    private String buildCoreInfo(String indexPart, String typePart, String descPart) {
        return String.format("%s = %s%s",
                indexPart,
                StringUtils.rightPad(typePart, TYPE_PART_WIDTH),
                descPart
        );
    }

    private String buildContent(String indexPart, String typePart, String descPart) {
        String content = buildCoreInfo(indexPart, typePart, descPart);
        return PaddingUtils.prepend(content, DEFAULT_LEFT_PADDING_CNT);
    }

    private String buildContent(String indexPart, String typePart, String descPart, String detail) {
        String coreInfo = buildCoreInfo(indexPart, typePart, descPart);
        String result1 = StringUtils.rightPad(coreInfo, CORE_INFO_WIDTH);
        String result2 = result1 + "// " + detail;

        return PaddingUtils.prepend(result2, DEFAULT_LEFT_PADDING_CNT);
    }

    private String buildIndexPart(int index) {
        int lastIndex = ConstantPoolUtils.lastIndex(result.getConstantPool());
        int numberPartFixedWidth = String.format("#%d", lastIndex).length();
        return StringUtils.leftPad(String.format("#%d", index), numberPartFixedWidth);
    }
}
