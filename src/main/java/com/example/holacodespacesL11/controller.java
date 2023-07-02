package com.example.holacodespacesL11;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class controller{

    @GetMapping(path="/")
    public String home(){ 

        return "A123456789 - Angello Rodriguez";
    }
}