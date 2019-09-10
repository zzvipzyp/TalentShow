package com.qfedu.ts.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantApplication
 * @description TODO
 * @date 2019/9/10 14:57
 */
@SpringBootApplication //开关类
@MapperScan("com.qfedu.ts.provider.dao") //扫描Mybatis的 Dao层接口
@EnableDiscoveryClient //注册服务
public class ApplicantApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApplicantApplication.class,args);
    }
}
