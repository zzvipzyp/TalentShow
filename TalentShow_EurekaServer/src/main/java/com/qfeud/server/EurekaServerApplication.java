package com.qfeud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZZzz
 * @version 1.0
 * @className EurekaServerApplication
 * @description TODO
 * @date 2019/9/10 14:51
 */
@SpringBootApplication // 标记开关类
@EnableEurekaServer //标记这是个注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
