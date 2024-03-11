import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class student_one{
    private String name;
    private LocalDate dateofbirth;

    public student_one(String name ,String dateofbirth)
    {
        this.name=name;
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dateofbirth =LocalDate.parse(dateofbirth,formatter);
    }
    public void displaystudentname()
    {
        System.out.println("Student Name: " + name);
    }
    public void displayage()
    {
        LocalDate currentDate = LocalDate.now();
        long age  = ChronoUnit.YEARS.between(this.dateofbirth ,currentDate );
        System.out.println("Age of Student is: " + age + " Years");
    }
    public static void main(String[] args) {
        student_one stu1 = new student_one("Hazra","2004-12-04");
        stu1.displayage();
        stu1.displaystudentname();

    }
}