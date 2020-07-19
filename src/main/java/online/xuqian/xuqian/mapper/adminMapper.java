package online.xuqian.xuqian.mapper;

import online.xuqian.xuqian.pojo.admin;
import online.xuqian.xuqian.pojo.college;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface adminMapper {
    admin login(String username, String password);
    college login2(String username,String password);
}
