package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
