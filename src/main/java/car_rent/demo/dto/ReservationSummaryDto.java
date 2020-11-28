package car_rent.demo.dto;

public class ReservationSummaryDto {

    private String reservationCreateDate;
    private String reservationDateStart;
    private String reservationDateEnd;
    private ClientDto client;
    private CarDto car;
    private Integer reservationCost;

    public String getReservationCreateDate() {
        return reservationCreateDate;
    }

    public void setReservationCreateDate(String reservationCreateDate) {
        this.reservationCreateDate = reservationCreateDate;
    }

    public String getReservationDateStart() {
        return reservationDateStart;
    }

    public void setReservationDateStart(String reservationDateStart) {
        this.reservationDateStart = reservationDateStart;
    }

    public String getReservationDateEnd() {
        return reservationDateEnd;
    }

    public void setReservationDateEnd(String reservationDateEnd) {
        this.reservationDateEnd = reservationDateEnd;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public CarDto getCar() {
        return car;
    }

    public void setCar(CarDto car) {
        this.car = car;
    }

    public Integer getReservationCost() {
        return reservationCost;
    }

    public void setReservationCost(Integer reservationCost) {
        this.reservationCost = reservationCost;
    }
}
