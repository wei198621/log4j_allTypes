package com.tz.leo.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    //import org.apache.logging.log4j.Logger;
    //import org.apache.logging.log4j.LogManager;
    private static Logger logger= LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.debug("Log4j2__调试debug信息");
        logger.info("Log4j2__普通Info信息");
        logger.warn("Log4j2__警告warn信息");
        logger.error("Log4j2__报错error信息");
        logger.fatal("Log4j2__严重错误fatal信息");

        // logger.error("报错信息", new IllegalArgumentException("非法参数"));
        int i=0;
        while(i<10){
            logger.debug("Log4j2__ RollingFile 调试debug信息");
            logger.debug("Log4j2__ RollingFile 调试debug信息");
            logger.debug("Log4j2__ RollingFile 调试debug信息");
            logger.debug("Log4j2__ RollingFile 调试debug信息");
            logger.debug("Log4j2__ RollingFile 调试debug信息");
            i++;
        }
    }
}
