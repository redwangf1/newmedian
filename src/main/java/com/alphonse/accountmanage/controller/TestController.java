package com.alphonse.accountmanage.controller;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {	
	@RequestMapping("/hello")
    public List<String> index() {
		List<String> test = new ArrayList<String>();
		test.add("asdfsa");
        return test;
    }
}
