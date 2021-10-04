import java.text.MessageFormat;

public class Athlete extends Person {
    public String sportName;

    public Athlete(String name, String surname, String gender, int age, String sportName) {
        super(name, surname, gender, age);
    }


    //  Polymorphism // method overriding
    public String personInformation() {
        super. personInformation();
        this.sportName = "Judo";
        return MessageFormat.format("name: {0}, surname: {1} , gender: {2}, education: {3}, " +
                "age: {4} ", this.name, this.surname, this.gender, this.education, this.getAge(),
                this.sportName);
    }
}
