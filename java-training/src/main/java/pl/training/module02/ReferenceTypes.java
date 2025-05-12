package pl.training.module02;

public class ReferenceTypes {

    public static void main(String[] args) {
        String name = "John"; // alokacja pamięci może nie być przeprowadzona, jeśli tekst jest już w pamięci
        String secondName = "John";
        String lastName = new String("Smith"); // new zawsze wymusza alokację pamięci

        int age = 6;
        String text = "Ala ma " + age + " lat.";
        System.out.println(text);

        int firstValue = 1;
        int secondValue = 2;
        System.out.println("Result: " + firstValue + secondValue);
        System.out.println("Result: " + (firstValue + secondValue));
        System.out.println(firstValue + secondValue + " is result");

        Account firstAccount = new Account(); //domyślny konstruktor, wygenerowany automatycznie
        firstAccount.number = "123456789";
        System.out.println("First account numer: " + firstAccount.number);
        firstAccount.printBalance();
        Account myAccount = firstAccount;
        System.out.println("My account account numer: " + myAccount.number);

        Account secondAccount = new Account();
        secondAccount.number = "111111111";
        System.out.println("Second account numer: " + secondAccount.number);
        secondAccount.deposit(1_000);
        secondAccount.withdraw(500);
        secondAccount.printBalance();

        ReferenceTypes referenceTypes = new ReferenceTypes();
        int score = 5;
        int myScore = score;
        myScore = myScore + 1;
        referenceTypes.passByValues(score);
        System.out.println("Score: " + score);
        System.out.println("My score: " + myScore);

        Account testAccount = new Account();
//        Account testAccount2 = testAccount; //Utworzenie kopii referencji do obiekt
        referenceTypes.passByReference(testAccount);
        System.out.println("Account balance: " + testAccount.balance);

        {
            int x = 1;
            testAccount.deposit(100);
        }

        var user = new User("Janek", "Nowak", 19);
        user.printInfo();
    }

    public void passByValues(int value) {   //przekazanie kopii zmiennej
        value = value + 1; //zwykle nie jest dobrą praktyką modyfikowanie otrzymanych parametrów
        System.out.println("Value: " + value);
    }

    public void passByReference(Account account) {  //przekazanie kopii referencji do obiektu
        account.deposit(500);
        System.out.println("Amount balance: " + account.balance);
    }
}
