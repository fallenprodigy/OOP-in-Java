import java.text.MessageFormat;

public class Person {

    String name;
    public String surname;
    public boolean education;
    protected String gender;
    private int age;


    public Person(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.education = true;
        this.age = age;
    }

// getter
    public int getAge() {
        return this.age;
    }
// setter
    public void setAge(int age) {
        this.age = age;
    }
//    polymorphism // method overloading
    public String infoAboutMe(String name) {
        return name;
    }
    public String infoAboutMe(String name, String username) {
        return String.format(name + " " + username);

    }
    public String infoAboutMe(String name, String username, String gender ) {
        return String.format(name + " " + username + " " + gender);

    }

    public String personInformation() {
        return MessageFormat.format("name: {0}, surname: {1} , gender: {2}, education: {3}, " +
                "age: {4} ", this.name, this.surname, this.gender, this.education, this.age);

    }
}
