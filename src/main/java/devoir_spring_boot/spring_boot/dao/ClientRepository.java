package devoir_spring_boot.spring_boot.dao;

import devoir_spring_boot.spring_boot.model.Client;
import devoir_spring_boot.spring_boot.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    @Query("SELECT c From Client c WHERE c.numero_piece = ?1")
    public Client findByNumero_piece(String num_piece_env);
}
