//By Jacob

import java.util.ArrayList;

public class AffectiveDomain {
    private static AffectiveDomain affectiveDomain;
    ArrayList <Emotion> emotions;
    Mood mood;
    AffectiveState affectiveState;

    private AffectiveDomain(){
        emotions = new ArrayList<Emotion>();
        //mood  = new Mood();
        affectiveState = AffectiveState.getInstance();
    }

    public static AffectiveDomain getInstance(){
        if(affectiveDomain == null){
            affectiveDomain = new AffectiveDomain();
        }
        return affectiveDomain;
    }

    public ArrayList<Emotion> getEmotion() {
        return emotions;
    }

    public Mood getMood() {
        return mood;
    }

    public AffectiveState getAffectiveState() {
        return affectiveState;
    }

    public void changeEmotions() {

    }

    public void changeMood() {

    }

    public void changeAffectiveState() {

    }
}
