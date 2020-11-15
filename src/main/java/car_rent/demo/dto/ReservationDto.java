package car_rent.demo.dto;

import java.util.Date;

public class ReservationDto {
    private Date reservationCreateDate;
    private Date reservationDateStart;
    private Date reservationDateEnd;
    private Integer clientId;
    private Integer carId;
    private Integer reservationCost;

    public Date getReservationCreateDate() {
        return reservationCreateDate;
    }

    public void setReservationCreateDate(Date reservationCreateDate) {
        this.reservationCreateDate = reservationCreateDate;
    }

    public Date getReservationDateStart() {
        return reservationDateStart;
    }

    public void setReservationDateStart(Date reservationDateStart) {
        this.reservationDateStart = reservationDateStart;
    }

    public Date getReservationDateEnd() {
        return reservationDateEnd;
    }

    public void setReservationDateEnd(Date reservationDateEnd) {
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
