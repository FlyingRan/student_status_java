package online.xuqian.xuqian.service;

import online.xuqian.xuqian.mapper.studentMapper;
import online.xuqian.xuqian.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.NestingKind;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    studentMapper studentMapper;

    public student studentLogin(String username,String password){
        student student = studentMapper.studentLogin(username, password);
        return student;
    }

    public List<student> queryForSome(student student){
        List<student> students = studentMapper.queryForSome(student);
        return  students;
    }

    public List<student> queryForList(){
        return studentMapper.queryForList();
    }

    public student queryForOne(String id){
        return studentMapper.queryForOne(id);
    }

    public int  addStudent(student student){
        studentMapper.addStudent(student);
        return 1;
    }
    public int updateStudent(student student){
        studentMapper.updateStudent(student);
        return 1;
    }

    public int deleteStudent(student student){
        studentMapper.deleteStudent(student);
        return 1;
    }
    public int addPunishment(String sid,String punishment){
        studentMapper.addPunishment(sid, punishment);
        return 1;
    }
    public int deletePunishment(String sid){
        studentMapper.deletePunishment(sid);
        return 1;
    }
    public int changeState(String sid){
        studentMapper.changeState(sid);
        return 1;
    }
}
