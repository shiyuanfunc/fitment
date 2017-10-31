package com.song.service.impl;

import com.song.dao.UserDao;
import com.song.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private HttpSession session;
    /**
     *   用户登录
     */
    @Override
    public Map<String, String> login(String userName, String userPass) throws Exception {
        List<Map<String, Object>> rmap = userDao.adminLogin(userName);
        Map<String,String> map = new HashMap<>();
        if (rmap != null && !rmap.isEmpty()) {
            for (Map<String, Object> m : rmap) {
                if (userPass.trim().equals(String.valueOf(m.get("passWord")).trim())){
                    map.put("status","success");
                    map.put("msg","success");
                    map.put("userName",userName);
                    session.setAttribute("loginMap",map);
                    break;
                }else{
                    map.put("status","error");
                    map.put("msg","error");
                }
            }
        }
        return map;
    }
}
