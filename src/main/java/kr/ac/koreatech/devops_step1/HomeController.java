package kr.ac.koreatech.devops_step1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "hello world";
    }
}
