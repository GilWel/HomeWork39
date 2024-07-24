import java.time.ZonedDateTime;
import java.util.Objects;

public class Package {
    private String departureCity;
    private String cityOfReceipt;
    private double weight;
    private ZonedDateTime zonedDateTime;

    public Package(String departureCity, String cityOfReceipt, double weight, ZonedDateTime zonedDateTime) {
        this.departureCity = departureCity;
        this.cityOfReceipt = cityOfReceipt;
        this.weight = weight;
        this.zonedDateTime = zonedDateTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getCityOfReceipt() {
        return cityOfReceipt;
    }

    public void setCityOfReceipt(String cityOfReceipt) {
        this.cityOfReceipt = cityOfReceipt;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(weight, aPackage.weight) == 0 && Objects.equals(departureCity, aPackage.departureCity) && Objects.equals(cityOfReceipt, aPackage.cityOfReceipt) && Objects.equals(zonedDateTime, aPackage.zonedDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, cityOfReceipt, weight, zonedDateTime);
    }

    @Override
    public String toString() {
        return "Package{" +
                "departureCity='" + departureCity + '\'' +
                ", cityOfReceipt='" + cityOfReceipt + '\'' +
                ", weight=" + weight +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }
}
