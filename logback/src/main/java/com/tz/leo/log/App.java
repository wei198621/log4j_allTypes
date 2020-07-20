package com.tz.leo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {

        logger.debug("Logback__调试debug信息");
        logger.info("Logback__普通Info信息");
        logger.warn("Logback__警告warn信息");
        logger.error("Logback__报错error信息");
    }
}
