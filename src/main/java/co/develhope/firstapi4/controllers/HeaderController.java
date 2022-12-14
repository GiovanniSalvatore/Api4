package co.develhope.firstapi4.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class HeaderController {
    @GetMapping(value = "/headers")
    public String headers(@RequestHeader HttpHeaders headers){
        return headers.getHost().toString();
    }
}