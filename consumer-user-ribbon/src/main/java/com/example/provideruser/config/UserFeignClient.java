package com.example.provideruser.config;

import com.example.provideruser.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/16 10:43
 */
@FeignClient(value = "eureka-provider")
public interface UserFeignClient {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User findById(@RequestParam("id") Long id);
//    @RequestLine("GET /{id}")
//    User findById(@Param("id") Long id);
}
