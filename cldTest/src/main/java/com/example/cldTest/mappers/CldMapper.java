package com.example.cldTest.mappers;

import com.example.cldTest.dto.CldDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CldMapper {

//    @Select("select * from cldList")
//    public List<CldDto> getCldList();
//
//    @Insert("insert into cldList values(#{id}, #{title}, #{start}, #{end}, #{display}, #{color})")
//    public void setCldList(CldDto cldDto);
}
