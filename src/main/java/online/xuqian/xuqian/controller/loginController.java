package online.xuqian.xuqian.controller;

import online.xuqian.xuqian.pojo.admin;
import online.xuqian.xuqian.service.StudentService;
import online.xuqian.xuqian.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

import java.beans.PersistenceDelegate;
import java.util.Base64;
import java.util.Map;

@RestController
public class loginController {

    @Autowired
    adminService adminService;
    @Autowired
    StudentService studentService;
    @PostMapping("/login")
    public Object login(@RequestParam("username") String username ,
                      @RequestParam("password") String password,
                      @RequestParam("identity") String identity){
//        System.out.println(username);
//        System.out.println(password);
        System.out.println(identity.equals("student"));
        password=new BASE64Encoder().encode(password.getBytes());
        System.out.println(password);
        Object login=null;
        if(identity.equals("admin")) {
            System.out.println("admin1");
            login = adminService.login(username, password);
        }else if(identity.equals("student")){
            System.out.println("student2");
            login = studentService.studentLogin(username, password);
        }else {
            login = adminService.login2(username,password);
        }
        System.out.println(login);
        if(login!=null)
            return login;
        else
            return "error";
    }


}
