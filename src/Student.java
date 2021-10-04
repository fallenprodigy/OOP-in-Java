import java.text.MessageFormat;

public class Student extends  Person {
    public String facultyName;

    public Student(String name, String surname, String gender, int age, String facultyName) {
        super(name, surname, gender, age);
    }


    //  Polymorphism // method overriding
    public String personInformation() {
        super.personInformation();
        this.facultyName = "IT";
        return MessageFormat.format("name: {0}, surname: {1} , gender: {2}, education: {3}, " +
                "age: {4} ", this.name, this.surname, this.gender, this.education, this.getAge());

    }
}
