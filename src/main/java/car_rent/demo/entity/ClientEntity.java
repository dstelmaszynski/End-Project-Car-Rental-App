package car_rent.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
}
