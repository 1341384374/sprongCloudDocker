package com.example.provideruser.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/16 10:11
 */
@Configuration
public class RibbonConfiguration {
    // 修改负载均衡
    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}
