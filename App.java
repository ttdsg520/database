package com.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);


        System.out.println("-------------======= 华丽的分割线 =========----------");
        //返回Java虚拟机中的堆内存总量
        long xmsMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //返回Java虚拟机中使用的最大堆内存
        long xmxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + xmsMemory + "M");
        System.out.println("-Xmx:" + xmxMemory + "M");

    }
}
