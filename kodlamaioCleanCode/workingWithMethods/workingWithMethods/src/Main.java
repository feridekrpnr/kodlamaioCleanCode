import business.concretes.CustomerManager;
import entities.concretes.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        Customer customer = new Customer(1,1,"Feride","Karpınar","31325154244");
        customerManager.add(customer);
         }
}