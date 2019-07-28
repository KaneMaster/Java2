package lesson1.maraphon.obstacles;

import lesson1.maraphon.competitors.Competitor;
import lesson1.maraphon.competitors.Team;


public class Course {
    Obstacle[] obstacles;


    /**
     * конструктор полосы препятствий
     * @param obs
     */
    public Course(Obstacle[] obs) {
        obstacles = obs;
    }

    /**
     * Прохождение полосы препятствий
     * @param tm комманда, которая проходит полосу препятствий
     */

    public void  doIt(Team tm){
        Competitor comp;
        tm.setFirstCompetitor();
        while (true){
            comp = tm.getNextCompetitor();
            if (comp == null) break;
            for (Obstacle obs: obstacles) {
                obs.doIt(comp);
            }
        }
    }
}
