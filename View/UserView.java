package View;

import java.util.List;
import Data.User;

public abstract class UserView {
    public void showTheBest(List <User> userList) {
        System.out.println(findTheBest(userList));
    }

    protected abstract User findTheBest(List<User> userList);
}