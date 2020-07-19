package online.xuqian.xuqian.service;

import online.xuqian.xuqian.mapper.adminMapper;
import online.xuqian.xuqian.pojo.admin;
import online.xuqian.xuqian.pojo.college;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class adminService {

    @Autowired
    adminMapper adminMapper;

    public admin login(String username, String password){
        return adminMapper.login(username,password);
    }

    public college login2(String username, String password){
        return adminMapper.login2(username, password);
    }
}
