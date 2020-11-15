package car_rent.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="client")
public class ClientEntity {
    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    private String clientVorname;
    private String clientSurname;
    private String clientAddress;
    private String clientEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
