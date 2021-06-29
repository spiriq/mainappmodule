package ru.sber.mainappmodule;

import ru.sber.daomodule.Dao;
import ru.sber.entitymodule.User;
import ru.sber.userdaomodule.UserDao;
import java.util.HashMap;
import java.util.Map;

public class Application {
    
    public static void main(String args[]) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Dao userDao = new UserDao(users);
        userDao.findAll().forEach(System.out::println);
    }
    
}
