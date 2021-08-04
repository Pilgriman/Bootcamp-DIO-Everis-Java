package Pilgriman.tutorial.rest.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String ckeck(){
        return "Online";
    }
}
