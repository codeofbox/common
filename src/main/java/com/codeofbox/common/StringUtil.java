package com.codeofbox.common;

import com.google.common.base.Strings;

public class StringUtil {

    boolean isEmpty(String str) {
        return Strings.isNullOrEmpty(str);
    }

    boolean isBlank(String str) {
        return Strings.nullToEmpty(str).trim().isEmpty();
    }
}
