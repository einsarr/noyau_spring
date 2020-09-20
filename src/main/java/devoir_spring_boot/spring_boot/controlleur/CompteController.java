package devoir_spring_boot.spring_boot.controlleur;

import devoir_spring_boot.spring_boot.dao.ClientRepository;
import devoir_spring_boot.spring_boot.dao.CompteRepository;
import devoir_spring_boot.spring_boot.dao.UsersRepository;
import devoir_spring_boot.spring_boot.model.Client;
import devoir_spring_boot.spring_boot.model.Compte;
import devoir_spring_boot.spring_boot.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comptes")
public class CompteController {
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping("/all")
    public String comptePage(Model model) {
        List<Compte> compteList = compteRepository.findAll();
        List<Users> users = usersRepository.findAll();
        model.addAttribute("comptes", compteList);
        model.addAttribute("users", users);
        return "comptes/liste";
    }
}
