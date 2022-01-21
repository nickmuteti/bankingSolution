package models.transactions;

public class Transaction {

    public static int DEPOSIT=0;
    public static int WITHDRAW=1;
    public static int BORROW=2;
    public static int TRANSFER=3;



    private String transactionId="";
    private int transactionType=0;// 0 - Deposit, 1 Withdraw
    private int amount=0;
    private String customerId="";
    private int accountId=0;

    public Transaction() {
    }

    public String getTransactionId() {

        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
