package com.qfedu.ts.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantApplication
 * @description TODO
 * @date 2019/9/10 17:49
 */

@SpringBootApplication  // 开关类
@EnableSwagger2  // 启用 Swagger
@EnableFeignClients // 启用 Feign 实现服务消费
@EnableDiscoveryClient //发现服务
public class ApplicantApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApplicantApiApplication.class,args);
    }
}
