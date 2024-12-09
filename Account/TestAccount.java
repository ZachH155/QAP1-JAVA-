package Account;

public class TestAccount {
    
    public static void main(String[] args) {
        //vars
        int balance = 0;
        String name;
        
        //Accounts
        Account Acc1 = new Account("2134", "John", 5000);
        Account Acc2 = new Account("5347", "Daisy", 4000);
        

        //display balance 1
        System.out.println("_________________");
        System.out.println("");

        balance = Acc1.getBalance();
        name = Acc1.getName();
        System.out.println(name + "'s balance: " + balance);

        System.out.println("");

        balance = Acc2.getBalance();
        name = Acc2.getName();
        System.out.println(name + "'s balance: " + balance);

        //transfer money between accounts
        Acc1.transferTo(Acc2, 1000);

        //display balance 2
        System.out.println("");

        balance = Acc1.getBalance();
        name = Acc1.getName();
        System.out.println(name + "'s balance: " + balance);

        System.out.println("");

        balance = Acc2.getBalance();
        name = Acc2.getName();
        System.out.println(name + "'s balance: " + balance);
    }
}
