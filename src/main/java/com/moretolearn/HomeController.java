package com.moretolearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/{path:[^\\.]*}")
//	@GetMapping(value = "/")
    public String redirect() {
        return "forward:/index";
    }
	
	
}
