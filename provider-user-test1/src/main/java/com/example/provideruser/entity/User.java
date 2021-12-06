package com.example.provideruser.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/8 15:22
 */
@Entity
@Data
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    private String password;
}
