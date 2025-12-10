//Qn.2

class Account
{
    String accountHolder;
    double accountNumber;
    double initialAmount;
    String address;
    String typeOfAccount;
    double currentBalance;

    public Account(String ah, double an, double ia)
    {
        accountHolder = ah;
        accountNumber = an;
        initialAmount = ia;
    }

    public Account(String ah, double an, String ad, String toa, double cb) {
        accountHolder = ah;
        accountNumber = an;
        address = ad;
        typeOfAccount = toa;
        currentBalance = cb;
    }

    public void Deposite(double amount){
        currentBalance += amount;
        System.out.println("Your current balance after depositing " + amount + " is " + currentBalance);
    }

    public void withDraw(double amount) {
        currentBalance -= amount;
        System.out.println("Your current balance after withdrawing " + amount + " is " + currentBalance);
    }

    public double getBalance(){
        return currentBalance;
    }

    public void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Address: " + address);
        System.out.println("Initial Amount: " + initialAmount);
        System.out.println("Current Balance: " + currentBalance);
    }
    public static void main(String[] args) {
        System.out.println("First Account Holder:");
        Account A1 = new Account("Seeta", 536584, 8000);
        A1.display();
        A1.withDraw(400);
        A1.Deposite(78000);
        System.out.println("Remaining Balance is " + A1.getBalance());
        System.out.println();

        System.out.println("Second Account Holder:");
        Account A2 = new Account("Ram", 536584, "Koteshwor", "Saving", 8000);
        A2.display();
        A2.withDraw(400);
        A2.Deposite(80000);
        System.out.println("Remaining Balance is " + A2.getBalance());
        System.out.println();

    }
}