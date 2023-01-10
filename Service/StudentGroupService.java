package Service;

import Data.Student;
import Data.Teacher;

public interface StudentGroupService {
    Teacher read (Teacher teacher);
    Student read (Student student);
}