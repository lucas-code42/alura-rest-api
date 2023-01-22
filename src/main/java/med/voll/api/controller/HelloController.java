package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // declarando que esta classe é um rest controller
@RequestMapping("/hello") // declarando que essa classe mapeia a rota /hello
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World Spring!";
    }
}
