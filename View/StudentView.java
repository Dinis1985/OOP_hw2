package OOP_hw2.View;

import java.util.List;

import OOP_hw2.Data.User;

public class StudentView extends UserView{

    @Override
    protected User findTheBest(List<User> userList) {
        User user = userList.get(0);
        return user;
    }
}