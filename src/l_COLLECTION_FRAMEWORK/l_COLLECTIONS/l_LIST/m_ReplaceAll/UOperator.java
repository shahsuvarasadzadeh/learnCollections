package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST.m_ReplaceAll;

import java.util.function.UnaryOperator;

public class UOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
