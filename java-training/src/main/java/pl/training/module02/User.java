package pl.training.module02;

public class User {

    String firsName;
    String lastname;
    int age;

    public User(String firsName, String lastname, int age) {
        this.firsName = firsName;
        this.lastname = lastname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("firsName: " + firsName);
        System.out.println("lastname: " + lastname);
        System.out.println("Age: " + age);
    }
}
