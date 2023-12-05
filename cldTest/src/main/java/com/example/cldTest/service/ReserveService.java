package com.example.cldTest.service;

import com.example.cldTest.dto.CldDto;
import com.example.cldTest.dto.ReserveDto;
import com.example.cldTest.mappers.CldMapper;
import com.example.cldTest.mappers.ReserveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ReserveService {

    @Autowired
    ReserveMapper reserveMapper;

    @Autowired
    CldMapper cldMapper;

    public String cldSet(@ModelAttribute ReserveDto reserveDto, @ModelAttribute CldDto cldDto) {
        String str="";
        if(reserveDto != null) {
            cldDto.setId(reserveDto.getId());
            cldDto.setTitle(reserveDto.getUsername());
            cldDto.setStart(reserveDto.getCheckin());
            cldDto.setEnd(reserveDto.getCheckout());
            cldDto.setDisplay(cldDto.getDisplay());
            if(reserveDto.getRoom().equals("A")) {
                cldDto.setColor("#cccccc");
            }else if(reserveDto.getRoom().equals("B")) {
                cldDto.setColor("#fff9f89");
            }
            reserveMapper.setReserve(reserveDto);
            cldMapper.setCldList(cldDto);
            str = "success";
        }else {
            str = "fail";
        }
        return str;
    }

    public List<CldDto> getcld() {
        return cldMapper.getCldList();
    }

    public  List<ReserveDto> getReserve() {
        return reserveMapper.getReserve();
    }
}
