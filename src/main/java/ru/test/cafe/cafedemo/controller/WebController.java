package ru.test.cafe.cafedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.test.cafe.cafedemo.dto.OrderCreateDto;
import ru.test.cafe.cafedemo.dto.OrderPointDto;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.model.Order;

@Controller
public class WebController {
    @GetMapping("/")
    public String index() {
//        model.addAttribute("coffeeGrade", new CoffeeGrade());
        return "index";
    }
    @GetMapping("/create_point")
    public String orderPoint() {
//        model.addAttribute("coffeeGrade", new CoffeeGrade());
        return "orderPoint";
    }

    @GetMapping("/create_order")
    public String order() {
//        model.addAttribute("coffeeGrade", new CoffeeGrade());
        return "order";
    }

    @GetMapping("/complete")
    public String complete() {
//        model.addAttribute("coffeeGrade", new CoffeeGrade());
        return "complete";
    }
}
