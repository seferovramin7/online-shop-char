package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineShopController {
    @GetMapping("/")
    String hello(){
        return "Hello World!";
    }
}
