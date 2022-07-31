package entities.concretes;

public class Customer extends Person{

    String creditCardNo;

    public Customer() {
    }

    public Customer(int id, String firstName, String creditCardNo) {
        super(id, firstName);
        this.creditCardNo = creditCardNo;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
