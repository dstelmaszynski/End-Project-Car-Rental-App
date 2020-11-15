package car_rent.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name="reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue
    @NotNull
    private Integer reservationId;
    private Date reservationCreateDate;
    private Date reservationDateStart;
    private Date reservationDateEnd;
    private Integer clientId;
    private Integer carId;
    private Integer reservationCost;

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

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
