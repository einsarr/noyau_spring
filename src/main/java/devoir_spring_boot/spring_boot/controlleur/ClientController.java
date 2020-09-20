package devoir_spring_boot.spring_boot.controlleur;

import devoir_spring_boot.spring_boot.dao.ClientRepository;
import devoir_spring_boot.spring_boot.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping("/all")
    public String clientPage(Model model) {
        List<Client> clientList = clientRepository.findAll();
        model.addAttribute("clients", clientList);
        return "clients/liste";
    }
}
