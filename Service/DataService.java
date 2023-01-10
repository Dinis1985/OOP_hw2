package OOP_hw2.Service;

import OOP_hw2.Data.User;

public interface DataService {
    void write(User user);

    User read(User user);

}