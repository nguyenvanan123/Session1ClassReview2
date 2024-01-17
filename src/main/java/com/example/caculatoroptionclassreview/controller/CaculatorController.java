package com.example.caculatoroptionclassreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
@RequestMapping("/caculator")
public class CaculatorController {
    @GetMapping()
    public String show () {
        return "/home";
    }

    @PostMapping("/submit")
    public String submit ( @RequestParam("number1") float number1,
                           @RequestParam("number2") float number2,
                           @RequestParam("option") String option,
                           Model model ) {
        float result = 0.0f;


        switch (option) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;

                break;


        }

        model.addAttribute ( "result", result  );


        return "/home";

    }
}
