package com.menuorderingsystem.web;

import com.menuorderingsystem.core.Breakfast;
import com.menuorderingsystem.core.BreakfastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class GreetingController {
    private BreakfastRepository breakfastRepository;

    @Autowired
    public GreetingController(BreakfastRepository breakfastRepository) {
        this.breakfastRepository = breakfastRepository;
    }

    @GetMapping("/ping")
    public ResponseEntity pong() {
        return ResponseEntity.ok("Pong");
    }

    @GetMapping("/me")
    public ResponseEntity me() {
        return ResponseEntity.ok("It is me!");
    }

    @PostMapping("/breakfast")
    public ResponseEntity addBreakfast(@RequestBody Breakfast breakfast) {
        breakfastRepository.save(breakfast);
        System.out.println(breakfast);
        return ResponseEntity.ok("Saved breakfast");
    }
}