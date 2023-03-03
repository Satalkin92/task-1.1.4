package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Victor", "Golovin", (byte) 29);
        userService.saveUser("Ivan", "Vasilev", (byte) 30);
        userService.saveUser("Anna", "Busova", (byte) 27);
        userService.saveUser("Danil", "Konev", (byte) 31);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
