package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {
    private StudentGroup group;

    public StudentGroupServiceImpl(StudentGroup group) {
        this.group = group;
    }
    
    public StudentGroup getGroup() {
        return group;
    }

    public void setGroup(StudentGroup group) {
        this.group = group;
    }

    @Override
    public Student read(Student student) {
        return ReaderFromTxt.read(student);
    }

    @Override
    public Teacher read(Teacher teacher) {
        return ReaderFromTxt.read(teacher);
    }
}