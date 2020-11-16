package car_rent.demo.dto;

public class ClientDto {

    private String carBrand;
    private String carModel;
    private String carType;
    private String carProductionYear;
    private String carColor;
    private Integer carMileage;
    private String status;
    private Integer perDayCost;

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
