package car_rent.demo.entity;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="car")
public class CarEntity {

    @Id
    @GeneratedValue
    @NotNull
    private Integer carId;
    private String carBrand;
    private String carModel;
    private String carType;
    private String carProductionYear;
    private String carColor;
    private Integer carMileage;
    private String status;
    private Integer perDayCost;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer id) {
        this.carId = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarProductionYear() {
        return carProductionYear;
    }

    public void setCarProductionYear(String carProductionYear) {
        this.carProductionYear = carProductionYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPerDayCost() {
        return perDayCost;
    }

    public void setPerDayCost(Integer perDayCost) {
        this.perDayCost = perDayCost;
    }
}
