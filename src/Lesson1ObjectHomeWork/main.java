package Lesson1ObjectHomeWork;
/*
 *       Create by student from curse QA Engineering
 *       Kuznetsov Leonid Ivanovich
 *       users ID 5513793
 *
 * */
public class main {
    public static void main (String[] args){
        Course c = new Course(new Cross(7), new Wall(2), new Water(3));

        Team team = new Team("Animal team",
                new Cat("Baton", 10, 12, 0),
                new Dog("Jack", 20, 5, 15),
                new Cat("Tom", 9, 14, 0),
                new Robot("Boston Dynamic", 50, 50, 50));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}
