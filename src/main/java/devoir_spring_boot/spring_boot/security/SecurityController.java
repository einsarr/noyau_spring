package devoir_spring_boot.spring_boot.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/403")
    public String notfound(Model model){
        return "403";
    }
    @GetMapping("/login")
    public String login(){
        return "assets/login";
    }
}
