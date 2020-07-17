package online.xuqian.xuqian.controller;

import online.xuqian.xuqian.mapper.collegemapper;
import online.xuqian.xuqian.pojo.college;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class collegeController {
    @Autowired
    collegemapper collegemapper;

    @GetMapping("/findList")
    public List<college> queryForList(){
        List<college> colleges = collegemapper.queryForList();
        for (college college : colleges) {
            System.out.println(college);
        }
        return colleges;
    }
}
