package models.customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandleCustomers {
    static List<Customer> customerList = new ArrayList<>();

    public  void registerCustomer(){
        Customer customer= new Customer();

        System.out.println("Please Enter Your ID Number");
        Scanner scanner= new Scanner(System.in);
        String customerId= scanner.next();
        customer.setCustomerID(customerId);

        System.out.println("Please Enter Your Name");
        scanner= new Scanner(System.in);
        String customerName= scanner.next();
        customer.setCustomerName(customerName);


        System.out.println("Please Enter Your Year of Birth");
        scanner= new Scanner(System.in);
        int yearOfBirth= scanner.nextInt();
        customer.setYearOfBirth(yearOfBirth);

        long currentDate= System.currentTimeMillis();
        customer.setDateRegistered(String.valueOf(currentDate));// data type Long

        customerList.add(customer);
        System.out.println("*********************************");

    }
    public  void createCustomers() {
        //10
        for (int n = 0; n < 5; n++) {
            Customer customer = new Customer();
            customer.setCustomerID("CS- " + n);
            customer.setCustomerName("Customer " + n);
            customer.setDateRegistered(" 2022 - 1- 06");
            customer.setYearOfBirth(1980);
            customerList.add(customer);
        }



    }

}
