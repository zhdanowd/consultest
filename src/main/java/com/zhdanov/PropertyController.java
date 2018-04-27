package com.zhdanov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Value("${my.prop}")
    private String value;

    @GetMapping("/valueFromConsulStorage")
    public String getValueFromConsulStorage() {
        return value;
    }
}
