package com.sample.dockeraws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dockeraws.App;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        
    }
    
    @RequestMapping(value="/")
    public String Demo(){
    	return "Form vijay sai vankadaru";
    }
}
