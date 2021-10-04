public class MainClass {
    public static void main(String[] args) {
//        creating instances
        Person person1 = new Person("Giorgi", "Kalatozishvili", "Male", 19);
        Student student1 = new Student("Sebastiane", "Kalatozi", "Male", 20, "IT");
        Athlete athlete1 = new Athlete("Ioane", "Kalatozi", "male", 16, "Judo" );





        System.out.println(person1.personInformation());
        System.out.println(student1.personInformation());
        System.out.println(athlete1.personInformation());
//  demonstration of method overloading
        System.out.println(person1.infoAboutMe("Giorgi", "Kalatozi", "Male"));




    }
}
