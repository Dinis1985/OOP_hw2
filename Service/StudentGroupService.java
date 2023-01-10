package OOP_hw2.Service;

import OOP_hw2.Data.Student;
import OOP_hw2.Data.Teacher;

public interface StudentGroupService {
    Teacher read (Teacher teacher);
    Student read (Student student);
}