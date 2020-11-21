package com.dulab.common.util;

import java.util.List;

public class CommonUtil {

    /**
     * This method will check String is emtpy Or not.
     *
     * @param string
     * @return boolean
     */
    public static boolean stringIsEmpty(String string) {
        return string == null || string.isEmpty() || string.isBlank();
    }

    /**
     * This method will check list is emtpy Or not.
     *
     * @param list
     * @return boolean
     */
    public static boolean collectionIsEmpty(List list) {
        return list == null || list.isEmpty();
    }
}
