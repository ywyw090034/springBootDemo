package com.yilaguan.springbootdemo.controller;

import com.yilaguan.springbootdemo.entity.TestUser;
import com.yilaguan.springbootdemo.service.TestUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author w.yi
 * @date 2021/4/14
 */
@RestController
public class TestUserController {

    @Resource
    private TestUserService testUserService;

    @RequestMapping("/findAll")
    public List<TestUser> getTestUser(){
        return testUserService.findAll();
    }

    @RequestMapping("/insertUser")
    public int insertUser(@Param("account") String account, @Param("testName") String testName){
        TestUser testUser=new TestUser();
        testUser.setAccount(account);
        testUser.setTestName(testName);
        return testUserService.insertUser(testUser);
    }

    @RequestMapping("/deleteUser")
    public  int deleteUser(@Param("id")long id){
        return testUserService.deleteUser(id);
    }

    @RequestMapping("/updateUser")
    public int updateUser(@Param("id")long id,@Param("account")String account){
        return testUserService.updateUser(id,account);
    }
}
