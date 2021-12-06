package com.example.provideruser.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/8 15:22
 */
@Data
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String username;
    private String password;
}
