package models.accounts;

import models.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class HandleAccounts {

   private  List<Account> accountList = new ArrayList<>();

    public  void createAccounts() {
        for (int n = 0; n < 5; n++) {
            Account account = new Account();
            account.setAccountName("ACC- " + n);
            account.setAccountNumber(n + 15);
            account.setCustomerId("CS- " + n);
            accountList.add(account);
        }
    }

    public void deleteAccounts(){

    }


}
