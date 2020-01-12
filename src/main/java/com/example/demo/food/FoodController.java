package com.example.demo.food;

import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }

}
