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
            abstractDomain.control = .5;
            abstractDomain.power = .5;
            abstractDomain.adjustment = .5;

        }
        return abstractDomain;
    }

    public Stimuli getStimuli() {
        return stimuli;
    }

    public void setSuddenness(double suddenness) {
        this.suddenness = suddenness;
    }

    public void setFamiliarity(double familiarity) {
        this.familiarity = familiarity;
    }

    public void setPredictibility(double predictibility) {
        this.predictibility = predictibility;
    }

    public void setValence(double valence) {
        this.valence = valence;
    }

    public void setGoalRelevance(double goalRelevance) {
        this.goalRelevance = goalRelevance;
    }

    public void setDiscrepencyFromExpectation(double discrepencyFromExpectation) {
        this.discrepencyFromExpectation = discrepencyFromExpectation;
    }

    public void setConduciveToGoal(double conduciveToGoal) {
        this.conduciveToGoal = conduciveToGoal;
    }

    public void setUrgency(double urgency) {
        this.urgency = urgency;
    }

    public void setControl(double control) {
        this.control = control;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setAdjustment(double adjustment) {
        this.adjustment = adjustment;
    }

    @Override
    public String toString() {
        return "Calculated Variables: \n" +
                "suddenness=" + suddenness +
                "\nfamiliarity=" + familiarity +
                "\npredictibility=" + predictibility +
                "\nvalence=" + valence +
                "\ndiscrepencyFromExpectation=" + discrepencyFromExpectation +
                "\nconduciveToGoal=" + conduciveToGoal +
                "\nurgency=" + urgency;
    }


}
