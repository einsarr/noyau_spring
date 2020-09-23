package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.Operation;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation,Long> {
    @Query("SELECT o From Operation o WHERE o.code_envoi = ?1")
    public Operation findByCode_envoi(String code);
}
