package lesson1.maraphon.competitors;

import com.sun.istack.internal.localization.NullLocalizable;

import java.sql.SQLOutput;

public class Team {

    String name;
    Competitor [] teamMembers;
    int competNumber;

    /**
     *  Конструктор класса
     * @param nm название команды
     * @param tm массив участников комманды
     */

    public Team( String nm, Competitor [] tm) {
        name = nm;
        teamMembers = tm;
        competNumber = 0;
    }

    /**
     *  Устанавливает курсор на первого участника комманды
     */

    public void setFirstCompetitor(){
        competNumber = 0;
    }

    /**
     * Выводит текущего участника комманды и переводит курсор на одну позицию вперёд
     * @return текущий участник команды
     */

    public Competitor getNextCompetitor(){
        Competitor res = null;
        if (competNumber <= teamMembers.length -1){
           res = teamMembers[competNumber++];
        }
        return res;
    }

    /**
     * Выводит информации об участниках команды
     */
    public void getInfo(){
        for (Competitor comp: teamMembers) {
            comp.info();
        }
    }

    /**
     * Выводит резуьтат марафона
     */

    public void ShowResults(){
        boolean somethingOnDistance = false;
        System.out.println("Результаты команды \"" + name + "\"");
        System.out.println();
        for (Competitor comp: teamMembers) {
            if (comp.isDistance()) {
                if (!somethingOnDistance) {
                    somethingOnDistance = true;
                    System.out.println("Дистанцию прошли:");
                }
                comp.info();
            }
        }
        if (!somethingOnDistance)
            System.out.println("К сожалению дистанцию никто не прошёл");
    }


}
