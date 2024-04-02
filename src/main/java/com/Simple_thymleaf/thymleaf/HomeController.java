package com.Simple_thymleaf.thymleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

//    TomcatServletWebServerFactory
    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);

        return "welcome"; //view
    }
    
    
    
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", message);
        System.out.println("The message is "+message);
        return "home"; // This assumes there's a template named "home.html" or "home.jsp" to be resolved by Thymeleaf or other view resolver.
    }
    
    
    
    
    
    @GetMapping("/third")
    public String third(Model model) {
        
        return "third"; // This assumes there's a template named "home.html" or "home.jsp" to be resolved by Thymeleaf or other view resolver.
    }

}