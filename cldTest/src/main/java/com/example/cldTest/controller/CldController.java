package com.example.cldTest.controller;

import com.example.cldTest.dto.CldDto;
import com.example.cldTest.dto.ReserveDto;
import com.example.cldTest.mappers.CldMapper;
import com.example.cldTest.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CldController {

    @Autowired
    ReserveService reserveService;

    @GetMapping("/cld")
    public String getCld() {
        return "cld.html";
    }

//    @GetMapping("/cldList")
//    @ResponseBody
//    public Map<String, Object> getCldList() {
//        Map<String, Object> map = new HashMap<>();
//        map.put("cldList", reserveService.getcld());
//
//        return map;
//    }

    @GetMapping("/cldList")
    @ResponseBody
    public Map<String, Object> getCldList() {
        Map<String, Object> map = new HashMap<>();
        map.put("cldList", reserveService.getReserve());

        return map;
    }
}
