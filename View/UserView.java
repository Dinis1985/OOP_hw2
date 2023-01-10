package OOP_hw2.View;

import java.util.List;
import OOP_hw2.Data.User;

public abstract class UserView {
    public void showTheBest(List <User> userList) {
        System.out.println(findTheBest(userList));
    }

    protected abstract User findTheBest(List<User> userList);
}