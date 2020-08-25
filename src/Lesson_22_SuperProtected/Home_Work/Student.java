package Lesson_22_SuperProtected.Home_Work;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;


    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5)
            this.course = course;
    }

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }


    Student() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11)
            this.grade = grade;
    }

    void showinfo() {
        System.out.println("name: " + getName() + " " + "course: " + getCourse() + " " + "grade:" + getGrade());

    }
}
class TestStudent extends Student {


    public static void main(String[] args) {
        Student s = new Student();
        StringBuilder name=new StringBuilder("ivan");
        s.setName(name);
        s.showinfo();

        s.setCourse(2);
        s.showinfo();
        s.setGrade(8);
        s.showinfo();
    }
}

