package com.Vishesh.config;

import com.Vishesh.config.coverters.StringToBrowserTypeConverter;
import com.Vishesh.enums.BrowserType;
import org.aeonbits.owner.Config;

/*
* The config .sources would first if any parameter is received through maven then it would check
* jenkins parameter and finally it wd check properties file
*
* */
@Config.Sources({
        "system:properties", // used to pass property through maven
        "system:env",// used to pass property through Jenkins
        "file:./src/test/resources/config.properties" // used to pass property through Property file
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME") // If no value is provided default value would be used
    @ConverterClass(StringToBrowserTypeConverter.class) // Convert the string into Browser type enum
    BrowserType browser();
}