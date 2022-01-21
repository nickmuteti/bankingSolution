package models.customers;

import java.util.Calendar;

public class Customer {
    private String customerName = "";
    private String customerID = "";
    private int yearOfBirth = 0;
    private String dateRegistered = "";

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int current_year = calendar.get(Calendar.YEAR);
        return current_year - yearOfBirth;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", dateRegistered='" + dateRegistered + '\'' +
                '}';
    }
}
