package com.wangkaiping.crm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeUtil {
    public static String getSysTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = new Date();
        String dateStr = sdf.format(date);
        return dateStr;
    }
}
