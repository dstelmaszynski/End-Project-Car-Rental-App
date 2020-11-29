package car_rent.demo.dto;

import java.util.Date;

public class ReservationDto {
    private long id;
    //typ zmieniony z Date na String
    private String reservationCreateDate;
    //typ zmieniony z Date na String
    private String reservationDateStart;
    //typ zmieniony z Date na String
    private String reservationDateEnd;
    private Integer clientId;
    private Integer carId;
    private Integer reservationCost;
//    private long selectedCar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public long getSelectedCar() {
//        return selectedCar;
//    }
//
//    public void setSelectedCar(long selectedCar) {
//        this.selectedCar = selectedCar;
//    }

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

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getReservationCost() {
        return reservationCost;
    }

    public void setReservationCost(Integer reservationCost) {
        this.reservationCost = reservationCost;
    }
}
