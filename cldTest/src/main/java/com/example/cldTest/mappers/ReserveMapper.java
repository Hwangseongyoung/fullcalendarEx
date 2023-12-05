package com.example.cldTest.mappers;

import com.example.cldTest.dto.ReserveDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReserveMapper {
    @Insert("insert into reserve values(null, #{username}, #{checkin}, #{checkout}, #{room})")
    public void setReserve(ReserveDto reserveDto);

    @Select("select * from reserve")
    public List<ReserveDto> getReserve();
}
