package pl.piotrdawidziuk.gsontutorial;

public class User {

    private String name;
    private String mail;
    private int age;
    private transient String password;

    public User(String name, String mail, int age, String password) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.password = password;
    }
}
