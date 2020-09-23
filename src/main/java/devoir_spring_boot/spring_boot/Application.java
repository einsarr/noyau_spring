package devoir_spring_boot.spring_boot;

import devoir_spring_boot.spring_boot.dao.OperationRepository;
import devoir_spring_boot.spring_boot.model.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private OperationRepository operationRepository;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Operation operation = operationRepository.findByCode_envoi("810140311");
    }
}
