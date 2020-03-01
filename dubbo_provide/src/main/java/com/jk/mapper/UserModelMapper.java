package com.jk.mapper;

import com.jk.model.DmdPowerModel;
import com.jk.model.UserModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserModelMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);

    @Select("select id,name as text ,url,pid from dmd_power where pid = #{id}")
    List<DmdPowerModel> findNodess(Integer id);

    @Select("UPDATE dmd_user SET password = #{password} where account = #{account} ")
    void xiugai(String account, String password);
}