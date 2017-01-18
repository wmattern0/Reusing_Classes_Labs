package mattern.william;

/**
 * Created by williammattern on 1/18/17.
 */
public class Human {

    String name;
    int age;
    String gender;
    String occupation;
    String address;

    public static void main(String[] args) {
        Human bill = new Human();
        Human alex = new Human();
        SuperHuman steve = new SuperHuman();
        SuperHuman carly = new SuperHuman();
        bill.name = "Bill";
        alex.name = "Alex";
        steve.name = "Steve";
        carly.name = "Carly";
        alex.occupation = "Barber";
        steve.age = 18;
        carly.setAllegiance("Bad");
        steve.setAllegiance("Good");
        carly.setSuperHeroName("Supergirl");
        steve.setSuperHeroName("Slippin Jimmy");
        carly.setSuperPower("Super Strength");
        steve.setSuperPower("Invisibility");
        alex.address = "123 fake st";
        bill.gender = "male";
        carly.age = 44;
        steve.gender = "male";
        steve.occupation = "insurance";



        steve.speak();
        alex.speak();
        bill.speak();
        carly.speak();
        carly.getSuperHeroName();
        carly.getSuperPower();
        carly.getAllegiance();
        steve.getSuperPower();
        steve.speak();
        steve.getAllegiance();
        steve.getSuperHeroName();
        steve.getGender();
        carly.getAge();
    }

    void speak(){
        System.out.println(name);
    }

    void getAge(){
        System.out.println(age);
    }

    void getGender(){
        System.out.println(gender);
    }

    void getOccupation(){
        System.out.println(occupation);
    }

    void getAddress(){
        System.out.println(address);
    }
}
