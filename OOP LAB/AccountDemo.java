class Account {
    int account_num;
    double account_bal;
    Account(int acc_num, double acc_bal) {
        account_num = acc_num;
        account_bal = acc_bal;
    }
    void deposit(double val) {
        account_bal += val;
        System.out.println("MONEY DEPOSITED = "+val);
    }
    void withdraw(double val) {
        if(account_bal >= val) {
            account_bal -= val;
            System.out.println("MONEY WITHRAW = "+val);
        }
        else {
            System.out.println("INSUFFICIENT BALANCE.");
        }
    }
    void display(String str) {
        System.out.println ("ACCOUNT TYPE: "+str);
        System.out.println("ACCOUNT BALANCE = "+account_bal);
    }
}
class Savings extends Account {
    double min_bal = 1000;
    double interest;
    Savings(int acc_num, double acc_bal) {
        super(acc_num, acc_bal);
    }
    void display() {
        super.display("SAVINGS");
    }
    void withdraw(double val) {
        if(account_bal-val<min_bal) {
            System.out.println("CANNOT WITHDRAW, MINIMUM BALANCE REACHED.");
        }
        else {
            super.withdraw(val);
        }
    }
    void calcInterest(double year) {
        double rate = 6;
        interest = (account_bal*rate*year)/100;
        account_bal+=interest;
        System.out.println("SAVING ACCOUNT INTEREST = "+interest);
    }    
}
class Current extends Account {
    Current(int acc_num, double acc_bal) {
        super(acc_num, acc_bal);
    }
    void display() {
        super.display("CURRENT");
    }
    void withdraw(double val) {
        double min_overdraft = 5000;
       if(account_bal<val) {
            if(val-account_bal<=min_overdraft) 
                account_bal-=val;
            else
                System.out.println("OVERDRAFT LIMIT REACHED, CANNOT WITHDRAW.");
       }
       else {
            super.withdraw(val);
       }
    }
}
class AccountDemo {
    public static void main(String args[]) {
        Savings acc1 = new Savings(12345, 5000);
        acc1.display();
        acc1.withdraw(4000);
        acc1.display();
        acc1.calcInterest(2);
        acc1.display();

        System.out.println();
        Current acc2 = new Current(9876, 10000);
        acc2.display();
        acc2.deposit(2000);
        acc2.display();
        acc2.withdraw(18000);
        acc2.display();

    }
}
