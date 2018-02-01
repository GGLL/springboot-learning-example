package org.spring.springboot.web;

import org.springframework.web.bind.annotation.*;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        System.out.println("-------------------------say start------------------------------------");
        return "Hello,"+name;
    }
}
