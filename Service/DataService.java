package Service;

import Data.User;

public interface DataService {
    void write(User user);

    User read(User user);

}