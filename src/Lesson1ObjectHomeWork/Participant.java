package Lesson1ObjectHomeWork;
/*
 *       Create by student from curse QA Engineering
 *       Kuznetsov Leonid Ivanovich
 *       users ID 5513793
 *
 * */
public interface Participant {
    String getName();

    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
