package com.example.provideruser.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/16 14:56
 */
public class FeignConfiguration {

    @Bean
    public Contract contract() {
        return new feign.Contract.Default();
    }

}
