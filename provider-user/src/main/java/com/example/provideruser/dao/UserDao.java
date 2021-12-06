package com.example.provideruser.dao;

import com.example.provideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/8 15:32
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
}
