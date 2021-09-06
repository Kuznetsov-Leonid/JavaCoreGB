package Lesson1ObjectHomeWork;
/*
 *       Create by student from curse QA Engineering
 *       Kuznetsov Leonid Ivanovich
 *       users ID 5513793
 *
 * */
public class Cat extends Animal{
    public Cat(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
