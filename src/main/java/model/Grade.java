package model;

/**
 * Created by tjDu on 2016/12/20.
 */
public class Grade {
    /**
     * 课程名
     */
    private String course;
    /**
     * 成绩
     */
    private double grade;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
