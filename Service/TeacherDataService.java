package Service;

import Data.User;
import Util.ReaderFromTxt;
import Util.WriterToTxt;

public class TeacherDataService implements DataService {
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}