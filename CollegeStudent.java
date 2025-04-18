public class CollegeStudent extends Student {
    private String fieldOfStudy;
    private int yearInCollege; // 1 = Freshman, 2 = Sophomore, etc.

    public CollegeStudent(String name, int age, String gender,
                          String idNum, double gpa,
                          String fieldOfStudy, int yearInCollege) {
        super(name, age, gender, idNum, gpa);
        this.fieldOfStudy = fieldOfStudy;
        this.yearInCollege = yearInCollege;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public int getYearInCollege() {
        return yearInCollege;
    }

    public void changeMajor(String newMajor) {
        fieldOfStudy = newMajor;
        System.out.println(getName() + " has switched their major to " + fieldOfStudy + ".");
    }

    public void attendLecture(String courseName) {
        System.out.println(getName() + " is attending a lecture for " + courseName + ".");
    }

    public String toString() {
        return super.toString() +
               ", Year: " + yearInCollege +
               ", Major: " + fieldOfStudy;
    }
}

