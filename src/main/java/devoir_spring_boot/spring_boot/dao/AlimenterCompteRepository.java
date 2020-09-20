package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.AlimenterCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimenterCompteRepository extends JpaRepository<AlimenterCompte,Long> {
}
