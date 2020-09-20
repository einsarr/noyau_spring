package devoir_spring_boot.spring_boot.controlleur;

import devoir_spring_boot.spring_boot.dao.OperationRepository;
import devoir_spring_boot.spring_boot.dao.UsersRepository;
import devoir_spring_boot.spring_boot.model.Compte;
import devoir_spring_boot.spring_boot.model.Operation;
import devoir_spring_boot.spring_boot.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/operations")
public class OperationController {

    @Autowired
    private OperationRepository operationRepository;
    @GetMapping("/all")
    public String OperationPage(Model model) {
        List<Operation> operationList = operationRepository.findAll();
        model.addAttribute("operations", operationList);
        return "operations/liste";
    }
}
