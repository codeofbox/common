package com.codeofbox.common;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollectionUtil {

    public static boolean isEmpty(Collection coll) {
        return (coll == null || coll.isEmpty());
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return null == map || map.isEmpty();
    }

    public static boolean isNotEmpty(Collection coll) {
        return !isEmpty(coll);
    }

    public static <T> List<T> toList() {
        return Lists.newArrayList();
    }

    public static <T> List<T> newArrayList(T... a) {
        return Lists.newArrayList(a);
    }

}
