public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }

    @Override
    public void makeSound() {
        System.out.println("woof woof ");

    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping");
    }
}
