package com.example.provideruser.controller;

import com.example.provideruser.config.UserFeignClient;
import com.example.provideruser.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/8 15:33
 */
@RestController
public class UserContorller {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserContorller.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }

    @GetMapping("/log-user-instance")
    public void logUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("eureka-provider");
        // 打印当前选择的是那个节点
        UserContorller.LOGGER.info("{},{},{}",serviceInstance.getServiceId()
        ,serviceInstance.getHost(),serviceInstance.getPort());
    }
}
