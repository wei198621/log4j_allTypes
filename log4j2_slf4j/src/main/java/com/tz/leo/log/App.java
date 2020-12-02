package com.tz.leo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App 
{
    // import org.slf4j.Logger;
    // import org.slf4j.LoggerFactory;
    // private static final Logger logger = LoggerFactory.getLogger("AsyncLogger");
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {

        logger.info("********************************************");
        logger.info("***********   logged by  slf4j  log4j2   *********");
        logger.debug("调试debug信息");
        logger.info("普通Info信息");
        logger.warn("警告warn信息");
        logger.error("报错error信息");

        // logger.error("报错信息", new IllegalArgumentException("非法参数"));
        int i=0;
        while(i<10){
            logger.debug(" RollingFile 调试debug信息");
            logger.debug(" RollingFile 调试debug信息");
            logger.debug(" RollingFile 调试debug信息");
            logger.debug(" RollingFile 调试debug信息");
            logger.debug(" RollingFile 调试debug信息");
            i++;
        }

        logger.info("********************************************");
    }
}
