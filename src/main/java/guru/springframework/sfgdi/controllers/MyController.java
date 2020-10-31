package guru.springframework.sfgdi.controllers;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");
        return "hello folks";
    }
}
