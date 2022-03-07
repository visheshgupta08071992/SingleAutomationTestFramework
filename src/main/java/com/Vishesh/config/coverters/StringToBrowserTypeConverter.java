package com.Vishesh.config.coverters;

import com.Vishesh.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

/*
* Class to convert string to BrowserType Enum
*
*
* */

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        return BrowserType.valueOf(browserName);
    }
}
