package com.w.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static String generator() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    }

    public static void main(String[] args) {

    }
}
