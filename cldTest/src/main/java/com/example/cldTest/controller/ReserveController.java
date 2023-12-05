package com.example.cldTest.controller;

import com.example.cldTest.dto.CldDto;
import com.example.cldTest.dto.ReserveDto;
import com.example.cldTest.mappers.ReserveMapper;
import com.example.cldTest.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ReserveController {

    @Autowired
    ReserveService reserveService;

    @GetMapping("/reserve")
    public String getReserve() {
        return "reserve.html";
    }

    @PostMapping("/reserve")
    @ResponseBody
    public Map<String, Object> setReserve(@ModelAttribute ReserveDto reserveDto/*, @ModelAttribute CldDto cldDto*/) {
        String result = reserveService.cldSet(reserveDto/*, cldDto*/);
        Map<String, Object> map = new HashMap<>();

        map.put("msg", result);
        return map;
    }
}
