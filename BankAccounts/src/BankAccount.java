/* This class encapsulates data for checking and savings acounts
and provides an API that allows deposits and withdrawals to be made
to these accounts.
*/
public class BankAccount {
    private String name;
    private int checkMoney;
    private int saveMoney;

    public BankAccount(String who, int checking, int saving) {
        name = who;
        checkMoney = checking;
        saveMoney = saving;
    }

    public String getAccountName() {
        return name;
    }

    public int getCheckMoney() {
        return checkMoney;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void makeCheckingDeposit(int amt) {
        checkMoney = checkMoney + amt;
    }

    public void makeSavingsDeposit(int amt) {
        saveMoney = saveMoney + amt;
    }

    public void makeCheckingWithdrawal(int amt) {
        if (checkMoney >= amt)
            checkMoney = checkMoney - amt;
    }

    public void makeSavingsWithdrawal(int amt) {
        if (saveMoney >= amt)
            saveMoney = saveMoney - amt;
    }

    // prints name and both account balances to the console
    public void printReport() {
        System.out.println(name + " checking: " + checkMoney + " savings: " + saveMoney);
    }
}