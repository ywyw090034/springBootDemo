package com.yilaguan.springbootdemo.service;

import com.yilaguan.springbootdemo.entity.TestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author w.yi
 * @date 2021/4/14
 */
@Component
public interface TestUserService {
    List<TestUser> findAll();

    int insertUser(TestUser testUser);

    int deleteUser(long id);

    int updateUser(long id,String account);
}
