package io.atlas.medicartweb.Web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.ResponseWrapper;

@RestController
public class HomeController {
    private String msg = " Hello from Medicart";

    @RequestMapping
    public String getMsg() {
        return msg;
    }
}
