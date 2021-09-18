package Lesson1ObjectHomeWork;
/*
 *       Create by student from curse QA Engineering
 *       Kuznetsov Leonid Ivanovich
 *       users ID 5513793
 *
 * */
public class Dog extends Animal{
    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public void swim() {
        System.out.println(getName() + " плывет");
    }
}
