package online.xuqian.xuqian.mapper;

import online.xuqian.xuqian.pojo.college;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface collegemapper {

    List<college> queryForList();

    college queryCollegeById(int i);

    int updateCollege(college college);

    int addCollege(college college);

    int deleteCollege(int i);
}
