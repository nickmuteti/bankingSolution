import models.accounts.HandleAccounts;
import models.customers.HandleCustomers;
import models.transactions.HandleTransactions;
import models.transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BankingSolution {


    public static void main(String[] args) {
        System.out.println("BANKING SYSTEM");
        System.out.println("CUSTOMER REGISTRATION");
        System.out.println("*********************************");

        HandleCustomers customersManager= new HandleCustomers();
        customersManager.createCustomers();

        HandleAccounts accountsManager= new HandleAccounts();
        accountsManager.createAccounts();

        HandleTransactions transactionsManager= new HandleTransactions();//
        transactionsManager.createTransactions();
        transactionsManager.showTransactions();


        /// Do a withdrawal from one customers Account



    }




}
