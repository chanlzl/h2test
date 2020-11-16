package com.h2.test.h2test.controller;

import com.h2.test.h2test.dao.UserRepository;
import com.h2.test.h2test.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author lzl
 * @description
 * @ClassName UserController
 * @date 2020.11.11 22:43
 */
@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    /**
     * 查询用户信息
     *
     * @param id
     * @return ResponseEntity
     * @throws Exception
     */
    @GetMapping("/user/{id}")
    public ResponseEntity findById(@PathVariable Long id) throws Exception {

        Optional optional = this.userRepository.findById(id);
        if (!optional.isPresent()) {
            throw new Exception("user not exists");
        }
        User user = (User) optional.get();
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
