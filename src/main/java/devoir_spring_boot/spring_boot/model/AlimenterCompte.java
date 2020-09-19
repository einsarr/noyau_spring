package devoir_spring_boot.spring_boot.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "alimentation_compte")
public class AlimenterCompte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long alimentation_id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_alimentation;
    @Column(name = "montant")
    private float montant;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

    public long getAlimentation_id() {
        return alimentation_id;
    }

    public void setAlimentation_id(long alimentation_id) {
        this.alimentation_id = alimentation_id;
    }

    public Date getDate_alimentation() {
        return date_alimentation;
    }

    public void setDate_alimentation(Date date_alimentation) {
        this.date_alimentation = date_alimentation;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
