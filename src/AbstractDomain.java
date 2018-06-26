//By Jacob

import java.util.ArrayList;

public class AbstractDomain {
    private static  AbstractDomain abstractDomain;
    private Stimuli stimuli;

    //Appraisal variables
    public double suddenness, familiarity, predictibility, valence, goalRelevance; //relevance variables
    public double discrepencyFromExpectation,conduciveToGoal, urgency; //implication variables
    public double control, power, adjustment; //coping potential variables


    //private CognitiveDomain cognitiveDomain;
    private AffectiveDomain affectiveDomain;


    private AbstractDomain(){
        //cognitiveDomain = CognitiveDomain.getInstance();
        affectiveDomain = AffectiveDomain.getInstance();
    }

    public static AbstractDomain getInstance(){
        if(abstractDomain == null){
            abstractDomain = new AbstractDomain();
        }
        return abstractDomain;
    }

    public Stimuli getStimuli() {
        return stimuli;
    }

    public void calculateAppraisalVariables(){

    }

}
