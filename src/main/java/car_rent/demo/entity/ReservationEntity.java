package car_rent.demo.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name="reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue
    @NotNull
    private Integer reservationId;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationCreateDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationDateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationDateEnd;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarEntity car;

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

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public Integer getReservationCost() {
        return reservationCost;
    }

    public void setReservationCost(Integer reservationCost) {
        this.reservationCost = reservationCost;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }
}
