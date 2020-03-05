package com.jk.util;
import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Myconverter implements Converter {

    @Override
    public <Date> Date convert(Class<Date> aClass, Object o) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if (aClass == java.util.Date.class) {
            String str = (String) o;
            java.util.Date date = null;
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return (Date) date;
        }

        return null;
    }
}