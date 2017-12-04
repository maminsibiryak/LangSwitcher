package com.home.language;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LangSwitcher {
    private String str;

    public LangSwitcher(String str) {

        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public char[] getSwitcher() {
        String answer = getStr().toLowerCase();
        char[] elements = answer.toCharArray();
        HashMap<String, String> map = new HashMap<String, String>();
        //first
        map.put("q", "й");
        map.put("w", "ц");
        map.put("e", "у");
        map.put("r", "к");
        map.put("t", "е");
        map.put("y", "н");
        map.put("u", "г");
        map.put("i", "ш");
        map.put("o", "щ");
        map.put("p", "з");
        map.put("[", "х");
        map.put("]", "ъ");
        //second
        map.put("a", "ф");
        map.put("s", "ы");
        map.put("d", "в");
        map.put("f", "а");
        map.put("g", "п");
        map.put("h", "р");
        map.put("j", "о");
        map.put("k", "л");
        map.put("l", "д");
        map.put(";", "ж");
        map.put("'", "э");
        map.put("\\", "ё");
        //third
        map.put("z", "я");
        map.put("x", "ч");
        map.put("c", "с");
        map.put("v", "м");
        map.put("b", "и");
        map.put("n", "т");
        map.put("m", "ь");
        map.put("^", ",");
        map.put("&", "?");
        map.put(".", "ю");
        map.put(",", "б");
        map.put(" ", " ");
        map.put("!", "!");
        int countElements = elements.length;
        char[] newElements = new char[countElements];


        for (Map.Entry<String, String> m : map.entrySet()
                ) {

            String key = m.getKey();
            String value = m.getValue();
            char[] aValue = value.toCharArray();
            char[] aKey = key.toCharArray();


            for (int i = 0; i < countElements; i++) {

                for (int j = 0; j < aValue.length; j++) {
                    if (elements[i] == aKey[j]) {
                        newElements[i] = aValue[j];
                    }
                }
            }


        }


        return newElements;
    }

    public void setStr(String str) {
        this.str = str;
    }


}
