package com.example.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String getName()
	{
		return "pradeep Singh1";
	}
	
	@GetMapping("/test1")
	public String getName1()
	{
		return "pradeep Singh";
	}

	@GetMapping("/test2")
	public String getName2()
	{
		return "Into IntelliJ";
	}


    @GetMapping("/test3")
    public String getName3()
    {
        return "Into IntelliJ";
    }
}
