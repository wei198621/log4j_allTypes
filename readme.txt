
------- 名称  ------------------复杂等级(数字越大越复杂)----------------
-------log4j-------------------1------------------------------
-------log4j2------------------2------------------------------
-------log4j2_slf4j------------4------------------------------
-------log4j_slf4j-------------3------------------------------
-------logback-----------------1------------------------------

下面的连接是关于  slf4j+log4j2使用及log4j2配置文件解析  的介绍  ， 我测试的程序是java控制器，没有使用app,用下面的目录测试不过
需要修改   scope ，不要这个test 的范围，经测试 compile runtime 都可以
         <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <version>${log4j2.version}</version>
            <scope>test</scope>
        </dependency>
https://blog.csdn.net/qq_34294121/article/details/100111995




log4j已经停止维护(2015年5月，Apache宣布Log4J 1.x 停止更新。最新版为1.2.17。)

log4j2只是假借了log4j之名而已，log4j的真正升级版是logback。
log4j2是一个日志库。log4j2是log4j的第二版，log4j2和log4j并不兼容。


log4j 2.x版本不再支持像1.x中的.properties后缀的文件配置方式，2.x版本配置文件后缀名只能为".xml",".json"或者".jsn".

log4j2 配置文件使用  classpath下名为log4j2.xml的文件.













