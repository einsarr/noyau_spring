package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommissionRepository extends JpaRepository<Commission,Long> {
}
