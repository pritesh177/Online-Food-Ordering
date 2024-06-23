package com.morc.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome To Food Delivery Platform !!", HttpStatus.OK);
    }
}
