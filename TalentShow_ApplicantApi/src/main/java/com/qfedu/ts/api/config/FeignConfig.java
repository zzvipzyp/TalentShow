package com.qfedu.ts.api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZZzz
 * @version 1.0
 * @className FeignConfig
 * @description TODO
 * @date 2019/9/10 16:52
 */
@Configuration
public class FeignConfig {
    private int connecttimeout = 10000;
    private int readtimeout = 10000;

    @Bean
    public Request.Options createOp() {
        return new Request.Options(connecttimeout, readtimeout);
    }


}
