package com.junhwa.springboot.web;

import com.junhwa.springboot.web.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final LocationService locationService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("locations", locationService.findAllDesc());
        return "index";
    }
}
