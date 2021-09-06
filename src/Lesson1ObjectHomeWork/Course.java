package Lesson1ObjectHomeWork;
/*
 *       Create by student from curse QA Engineering
 *       Kuznetsov Leonid Ivanovich
 *       users ID 5513793
 *
 * */
public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
            //obstacle.doIt(team);
        }
    }
}
