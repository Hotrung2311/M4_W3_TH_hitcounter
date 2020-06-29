package trung.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import trung.codegym.model.MyCounter;

@Controller
@SessionAttributes("TrungCounter")
public class CounterController {

    @ModelAttribute("TrungCounter")
    public MyCounter setUpCounter(){
        return new MyCounter();
    }

    @GetMapping("")
    public String getCounter(@ModelAttribute("TrungCounter") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }
}
