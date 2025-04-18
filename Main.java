public class Main
{
  public static void main(String [] args)
  {
    // Student(String name, int age, String gender, String idNum, double gpa)
   

    HistoryTeacher h = new HistoryTeacher("Emily", 31, "F");
    System.out.println(h.toString());
    h.teachLesson();

    CollegeStudent c = new CollegeStudent("Liam", 19, "M","156829", 3.4,
    "Computer Science", 3);
    System.out.println(c.toString());
    c.attendLecture("Comp Sci Principles");
    c.changeMajor("Business");
  }
}
