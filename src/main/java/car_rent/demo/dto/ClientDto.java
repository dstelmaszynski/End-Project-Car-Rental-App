package car_rent.demo.dto;

public class ClientDto {

    private String clientVorname;
    private String clientSurname;
    private String clientAddress;
    private String clientEmail;

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
