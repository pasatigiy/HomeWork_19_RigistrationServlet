package HomeWork19.Servlet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InMemoryStorage {
  static   ArrayList<User> listUser = new ArrayList<>();

    public static User createUser(String name, String username, String password){
        if ( name == null){
            System.out.println("invalid name");
        } else if ( username == null){
            System.out.println("invalid username");
        } else if (password == null){
            System.out.println("invalid password");
        } else return new User(name, username, password);
        return null;
    }

    public static boolean userExist(User user){
        return listUser.contains(user);
    }

    public static void addUser(User user){
        listUser.add(user);
    }


}
