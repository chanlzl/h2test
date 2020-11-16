package com.h2.test.h2test.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lzl
 * @description
 * @ClassName User
 * @date 2020.11.11 22:41
 */

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private int status;
}
