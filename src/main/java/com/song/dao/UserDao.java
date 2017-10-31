package com.song.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/31.
 */
public interface UserDao {

    /**
     * 用户登录
     */
    public List<Map<String,Object>> adminLogin(String userName) throws Exception;
}
