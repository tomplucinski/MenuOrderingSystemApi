package com.menuorderingsystem.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GreetingController {

    @PostMapping("/{meal}")
    public ResponseEntity breakfastOrder(@PathVariable String meal, @RequestBody List<String> order) throws Exception {

        switch (meal.toUpperCase()) {
            case "BREAKFAST":
                System.out.println("breakfast");
                break;

            case "LUNCH":
                System.out.println("lunch");
                break;

            case "DINNER":
                System.out.println("dinner");
                break;

            default:
                throw new Exception();
        }

        return ResponseEntity.ok("Thanks for your order!");
    }

}