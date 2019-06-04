package pl.piotrdawidziuk.gsontutorial;

import com.google.gson.annotations.Expose;

public class User {

   @Expose
    private String name;
   @Expose (serialize = false)
    private String mail;
   @Expose (deserialize = false)
    private int age;
   //@Expose
    private String password;

    public User(String name, String mail, int age, String password) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.password = password;
    }
}
