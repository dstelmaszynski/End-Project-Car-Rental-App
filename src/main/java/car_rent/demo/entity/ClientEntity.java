package car_rent.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity(name="client")
public class ClientEntity {
    @Id
    @GeneratedValue
    @NotNull
    private Integer clientId;
    private String clientVorname;
    private String clientSurname;
    private String clientAddress;
    private String clientEmail;

    @Column(nullable=false)
    private String username;
    @Column(nullable=false)
    private String password;

    @OneToMany(mappedBy = "client")
    private List<ReservationEntity> reservations;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientVorname() {
        return clientVorname;
    }

    public void setClientVorname(String clientVorname) {
        this.clientVorname = clientVorname;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
