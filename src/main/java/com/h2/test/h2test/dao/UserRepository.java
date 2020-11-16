package com.h2.test.h2test.dao;

import com.h2.test.h2test.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lzl
 * @description
 * @ClassName UserRepository
 * @date 2020.11.11 22:42
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
