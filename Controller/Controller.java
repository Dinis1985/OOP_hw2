package Controller;

import Data.StudentGroup;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import Service.StudentDataService;
import Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent (Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher (Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}