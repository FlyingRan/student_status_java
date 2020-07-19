package online.xuqian.xuqian.mapper;

import online.xuqian.xuqian.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface studentMapper {

    student studentLogin(String username,String password);

    List<student> queryForList();

    List<student> queryForSome(student student);

    student queryForOne(String id);

    int addStudent(student student);

    int updateStudent(student student);

    int deleteStudent(student student);

    int addPunishment(String sid,String punishment);

    int deletePunishment(String sid);

    int changeState(String sid);
}
