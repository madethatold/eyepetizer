package com.example.eyepetizer;

import org.litepal.LitePal;

import java.util.List;

public class UserManager {
    //插入用户数据
    public boolean insertUser(String name,String password){
        LitePal.getDatabase();
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        return user.save();
    }

    //通过用户名查找用户是否存在
    public boolean findUserByName(String name){

        List<User> users = LitePal.findAll(User.class);
        for(User person: users){
            if(name.trim().equals(person.getUsername())){
                return false;
            }
        }
        return true;
    }
}
