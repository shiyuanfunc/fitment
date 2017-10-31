package com.song.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/31.
 */
public interface UserService {
    /**
     *   用户登录
     */
    public Map<String,String> login(String userName,String userPass) throws Exception;
}
