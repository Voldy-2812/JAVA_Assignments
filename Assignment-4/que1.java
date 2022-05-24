import java.util.Scanner;

class AmountExceededException extends Exception {
    private int amount;
    AmountExceededException(int amt) {
        amount = amt;
    }
    public String toString() {
        return ("Balance less than Rs. 1000/- ");
    }
}

class Account {
    int balance;
    int withdrawnAmount;

    Account(int balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(int withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
        balance = balance - this.withdrawnAmount;
    }

    public int getBalance() {
        return balance;
    }
}

public class que1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        Account[] arr = new Account[5];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Account((int) (Math.random() * 9000) + 1000);
            System.out.println("Available Balance in Account " + (i + 1) + ": Rs. " + arr[i].getBalance() + "/-");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nWithdrawn Amount from Account " + (i + 1) + " in Rs. : ");
            int withdrawal = ob.nextInt();
            int remainingAmount = arr[i].balance - withdrawal;
            try {
                if (remainingAmount >= 1000) {
                    arr[i].setWithdrawAmount(withdrawal);
                    System.out.println("Amount after withdrawal: Rs." + arr[i].getBalance() + "/-");
                }
                else {
                    throw new AmountExceededException(remainingAmount);
                }
            }
            catch (AmountExceededException e) {
                System.out.println(e);
            }
        }
    }
}
