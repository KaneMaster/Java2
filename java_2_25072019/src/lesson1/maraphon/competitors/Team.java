package lesson1.maraphon.competitors;

import com.sun.istack.internal.localization.NullLocalizable;

import java.sql.SQLOutput;

public class Team {

    String name;
    Competitor [] teamMembers;
    int competNumber;


    public Team( String nm, Competitor [] tm) {
        name = nm;
        teamMembers = tm;
        competNumber = 0;
    }

    public void setFirstCompetitor(){
        competNumber = 0;
    }

    public Competitor getNextCompetitor(){
        Competitor res = null;
        if (competNumber <= teamMembers.length -1){
           res = teamMembers[competNumber++];
        }
        return res;
    }

    public void getInfo(){
        for (Competitor comp: teamMembers) {
            comp.info();
        }
    }

    public void ShowResults(){
        boolean somethingOnDistance = false;
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
