package controller;

public class Student {
    private model.Student student;
    public Student(model.Student student) {
        this.student = student;
    }
    public model.Student getStudent() {
        return student;
    }
    public void setStudent(model.Student student) {
        this.student = student;
    }


}
