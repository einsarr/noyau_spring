package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
}
