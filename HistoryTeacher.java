public class HistoryTeacher extends Teacher {
    private String subject;

    public HistoryTeacher(String name, int age, String gender) {
        super(name, age, gender);
        this.subject = "History";
    }

    public String getSubject() {
        return subject;
    }

    public void teachLesson() {
        System.out.println(getName() + " is teaching a lesson on " + subject + ".");
    }


    public String toString() {
        return super.toString().replace("is a teacher!", "They teach " + subject + ".");
    }
}
