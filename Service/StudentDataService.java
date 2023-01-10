package OOP_hw2.Service;

import OOP_hw2.Data.User;
import OOP_hw2.Util.ReaderFromTxt;
import OOP_hw2.Util.WriterToTxt;

public class StudentDataService implements DataService {
    
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}