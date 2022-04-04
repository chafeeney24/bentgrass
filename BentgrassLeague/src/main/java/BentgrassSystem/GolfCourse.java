package BentgrassSystem;

public class GolfCourse {
    private String courseName;
    private int par;
    private int yardage;
    private double courseRating;



    public GolfCourse(){}

    public GolfCourse(String courseName, int par, int yardage, double courseRating){
        this.courseName = courseName;
        this.par = par;
        this.yardage = yardage;
        this.courseRating = courseRating;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getPar() {
        return par;
    }

    public int getYardage() {
        return yardage;
    }

    public void setYardage(int yardage) {
        this.yardage = yardage;
    }

    public double getCourseRating() {
        return courseRating;
    }

   }
