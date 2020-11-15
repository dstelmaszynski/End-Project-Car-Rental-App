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
    private Integer id;
    private String carBrand;
    private String status;
    private Integer perDayCost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
