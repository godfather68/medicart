package io.atlas.medicartweb.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private String msg = "Welcome to Medicart";

    @RequestMapping()
    public String getMsg() {
        return msg;
    }
}
