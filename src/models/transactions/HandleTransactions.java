package models.transactions;

import java.util.ArrayList;
import java.util.List;

public class HandleTransactions {
     List<Transaction> transactionList = new ArrayList<>();


    public  void createTransactions() {

        for (int n = 0; n < 5; n++) {
            Transaction transaction = new Transaction();
            transaction.setAccountId(n + 15);
            transaction.setAmount((1000*n) +230 *(n)+ (250));
            transaction.setCustomerId("CS- " + n);
            transaction.setTransactionId("TXN" + n);
            transaction.setTransactionType(Transaction.DEPOSIT);
            transactionList.add(transaction);
        }


    }
    public  void deposit(String Id, int amount ) {

        for (int n = 0; n < 5; n++) {
            Transaction transaction = new Transaction();
            transaction.setAccountId(n + 15);
            transaction.setAmount((1000*n) +230 *(n)+ (250));
            transaction.setCustomerId("CS- " + n);
            transaction.setTransactionId("TXN" + n);
            transaction.setTransactionType(Transaction.DEPOSIT);
            transactionList.add(transaction);
        }


    }
    public   void showTransactions(){
        System.out.println( "TRXN ID "+  "CUst-ID "+  " AMT ");
        for ( Transaction trx: transactionList){
            System.out.println(trx.getTransactionId() +"   "+ trx.getCustomerId()+ "     "+ trx.getAmount());
        }
    }

    public void  withdrawal(String accounId,int amount){



    }



}
