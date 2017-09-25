package com.feng;

import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;

/**
 * Desc:
 * Created by jinx on 2017/9/25.
 */
public class 牛逼 {

    public static void main(String[] args) throws NoSuchMethodException {

        if (1 < 2) {
            System.out.println(11);
        }
        System.out.println(new 牛逼().牛逼他爹() + "-->" + 牛逼.class.getDeclaredMethod("牛逼他爹", null).getName());

        StringBuffer sb = new StringBuffer();
// 超过 120 个字符的情况下，换行缩进 4 个空格， 点号和方法名称一起换行
        sb.append("zi").append("xin").append("huang").append("huang").append("huang").append("huang")
                .append("huang")
                .append("huang");
        System.out.println(getName("xxx"));

        Collections.synchronizedMap(new HashMap<>());

    }

    @Deprecated
    public static String getName(String name) {
        URLDecoder.decode(name);
        return name;
    }

    private String 牛逼他爹() {
        String name = this.getClass().getSimpleName();
        return name;
    }

    private String double牛逼() {
        String name = this.getClass().getSimpleName();
        return name;
    }

}
