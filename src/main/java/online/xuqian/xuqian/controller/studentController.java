package online.xuqian.xuqian.controller;

import online.xuqian.xuqian.mapper.studentMapper;
import online.xuqian.xuqian.pojo.student;
import online.xuqian.xuqian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/allSearch")
    public List<student> allSearch(){
        List<student> students = studentService.queryForList();
        return students;
    }

    @GetMapping("/singleSearch")
    public List<student> singleSearch(student student){
        System.out.println(student);
        return studentService.queryForSome(student);
    }

    @GetMapping("/updateSearch")
    public  Object updateSearch(@RequestParam("text") String id){
        return studentService.queryForOne(id) == null ? 0 : studentService.queryForOne(id);
    }

    @GetMapping("/addStudent")
    public String addStudent(student student){
        studentService.addStudent(student);
        return "success";
    }

    @GetMapping("/updateStudent")
    public  String updateStudent(student student){
        studentService.updateStudent(student);
        return "success";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(student student){
        studentService.deleteStudent(student);
        return "success";
    }

    @GetMapping("/addPunishment")
    public String addPunishment(@RequestParam("sid") String sid,@RequestParam("punishment") String punishment){
        studentService.addPunishment(sid, punishment);
        return "success";
    }

    @GetMapping("/changeState")
    public String changeState(String sid){
        studentService.changeState(sid);
        return "success";
    }
}
