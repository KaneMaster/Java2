package lesson1.maraphon;

import lesson1.maraphon.competitors.*;
import lesson1.maraphon.obstacles.*;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors ={
                new Human("Bob"),
                new Cat("Barsik"),
                new Dog("Jack"),
                new Dog("Тузик") };
        Obstacle[] obstacles = {
                new Cross(80),
                new Wall(2),
                new Wall(1),
                new Water(10)  };



        Team teamA = new Team ("Комманда А", competitors);
        Course course1 = new Course(obstacles);
        course1.doIt(teamA);
        System.out.println();
        teamA.ShowResults();
    }
}
