package HomeWork19.Servlet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InMemoryStorage {
    ArrayList<User> listUser = new ArrayList<>();

    public String  addlistUser(String name, String userName, String password) {
        User user = new User(name, userName, password);
        if (listUser.contains(user)) {
            return "such user already exists";
        } else {
            listUser.add(user);
        }
        return "user add";
    }
}
