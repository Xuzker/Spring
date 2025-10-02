package org.example;

public class UserService {
    private final Notifier notifier;

    public UserService(Notifier notifier){
        this.notifier = notifier;
    }

    public void registerUser(String name){
        System.out.println("Пользователь " + name + " зарегистрирован!");
        notifier.send("Добро пожаловать, " + name);
    }
}
