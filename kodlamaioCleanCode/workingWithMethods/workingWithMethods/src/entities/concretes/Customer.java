package entities.concretes;

public class Customer {
    int id;
    int cityId;
    String firstName;
    String lastName;
    String ıdenttityNumber;

    public Customer() {
    }

    public Customer(int id, int cityId, String firstName, String lastName, String ıdenttityNumber) {
        this.id = id;
        this.cityId = cityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ıdenttityNumber = ıdenttityNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdenttityNumber() {
        return ıdenttityNumber;
    }

    public void setIdenttityNumber(String ıdenttityNumber) {
        this.ıdenttityNumber = ıdenttityNumber;
    }
}
