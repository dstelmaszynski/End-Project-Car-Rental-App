package car_rent.demo.dto;

//to co przesyłamy między entity a uzytkownikiem
public class CarRentalDto {
    private String carBrand;
    private String status;
    private Integer perDayCost;

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
