package LinkedList.scenarioQuestions;


import java.util.*;
import java.time.LocalDateTime;
//two classes
//1) Account
//     => deposit
//     => withdrawl
//     => check balance

// 2) Trainsaction
//     => transaction history
class Account{
    private int amount;
    public void deposit(int dep) {
        amount += dep;
    }
    public void withdraw(int wtdrw) {
        amount -= wtdrw;
    }
    public int checkBalance() {
        return amount;
    }
}
class Transaction{
    private List<String> datelist = new ArrayList<String>();
    private List<Integer> amount = new ArrayList<Integer>();
    private List<String> transactiontype = new ArrayList<String>();
    private List<Integer> totalAmount = new ArrayList<Integer>();
    public void deposit(int cash) {
        Account acc = new Account();
        LocalDateTime dt = LocalDateTime.now();
        datelist.add(dt.toString());
        amount.add(cash);
        transactiontype.add("Deposit");
        totalAmount.add(acc.checkBalance());
    }
    public void withdraw(int cash) {
        Account acc = new Account();
        LocalDateTime dt = LocalDateTime.now();
        datelist.add(dt.toString());
        amount.add(cash);
        transactiontype.add("Withdraw");
        totalAmount.add(acc.checkBalance());
    }
    public void printTSN() {
        int n = datelist.size();
        if(n == 0) {
            System.out.println("No Transaction History");
            return;
        }
        for(int i=0;i<n;i++) {
            System.out.print(datelist.get(i)+"   ");
            System.out.print(amount.get(i)+"   ");
            System.out.print(transactiontype.get(i)+"    ");
            System.out.print(totalAmount.get(i)+"    ");
            System.out.println();
        }
    }
}
public class bankingSystem  {
    public  void depositCash(int cash) {
        Account acc = new Account();
        Transaction tsn = new Transaction();
        acc.deposit(cash);
        tsn.deposit(cash);
    }
    public  void withdrawCash(int cash) {
        Account acc = new Account();
        Transaction tsn = new Transaction();
        acc.withdraw(cash);
        tsn.withdraw(cash);
    }
    public void transactionHistory() {
        Transaction tsn = new Transaction();
        tsn.printTSN();
    }
    
    public void operations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to IBIBI Bank");
        System.out.println("Type to proceed");
        System.out.println("1 : Deposit");
        System.out.println("2 : Withdraw");
        System.out.println("3 : Transaction History");
        int inp = sc.nextInt();
        if(inp == 1) {
            System.out.println("Enter the amount to deposit");
            int cash = sc.nextInt();
            depositCash(cash);
            System.out.println("Press 1 if you want  to proceed");
            int inp2 = sc.nextInt();
            if(inp2 == 1) {
                operations();
            }
        }
        else if(inp == 2) {
            System.out.println("Enter the amount  to withdraw");
            int cash = sc.nextInt();
            withdrawCash(cash);
            System.out.println("Press 1 if you want  to proceed");
            int inp2 = sc.nextInt();
            if(inp2 == 1) {
                operations();
            }

        }
        else if(inp == 3) {
            transactionHistory();
            System.out.println("Press 1 if you want  to proceed");
            int inp2 = sc.nextInt();
            if(inp2 == 1) {
                operations();
            }

        }
        else{
            System.out.println("Invalid Input. Try Again");
            operations();
        }
        sc.close();
    }
    public static void main(String[] args) {
        // Transaction trn = new Transaction();
        // Account acc = new Account();
        bankingSystem bn = new bankingSystem();
        bn.operations();
        

    }
    
}
