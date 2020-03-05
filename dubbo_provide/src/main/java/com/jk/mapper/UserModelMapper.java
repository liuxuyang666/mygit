package com.jk.mapper;

import com.jk.model.*;
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



    @Select("select * from dingdan")
    List<IndentModel> countCar();

    @Select("select id,name as text ,url,pid from gs_power where pid = #{id}")
    List<PowerModel> findNodes(Integer id);

    @Select("INSERT INTO t_commodity(spname,haosheng,baozhuang,jine,kucunshuliang,yujingzhi,sunhuaishuliang,zaishoushuliang) VALUES(#{spname},#{haosheng},#{baozhuang},#{jine},#{kucunshuliang},20,0,0)")
    void addDing(CommodityBean commodityBean);
}