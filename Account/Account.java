package Account;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    
    //constructor
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //methods
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Amount exceeds balance");
            return balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
            return balance;
        } else {
            System.out.println("Amount exceeds balance");
            return balance;
        }
    }

    public String toString() {
        return "Account[id=\"" + id + "\",name=\"" + name + "\",balance=\"" + balance +"\"]";
    }

}