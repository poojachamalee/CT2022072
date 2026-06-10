package Q1;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.setName("Charly");
        myCat.setName("Kitty");

        System.out.println(myDog.getName() + " says: " + myDog.speak());
        System.out.println(myCat.getName() + " says: " + myCat.speak());
    }
}
