//by Ehtesham

public class CognitiveDomain {
    private static CognitiveDomain cognitiveDomain;
    private double cues, goals, plans, beliefs, situations, expectations, norms, standards, preferences;
    private CognitiveDomain(){
        cognitiveDomain = CognitiveDomain.getInstance();
    }

    public static CognitiveDomain getInstance(){
        if(cognitiveDomain == null){
            cognitiveDomain = new CognitiveDomain();
        }
        return cognitiveDomain;
    }

    public static CognitiveDomain getCognitiveDomain() {
        return cognitiveDomain;
    }

    public static void setCognitiveDomain(CognitiveDomain cognitiveDomain) {
        CognitiveDomain.cognitiveDomain = cognitiveDomain;
    }

    public double getCues() {
        return cues;
    }

    public void setCues(double cues) {
        this.cues = cues;
    }

    public double getGoals() {
        return goals;
    }

    public void setGoals(double goals) {
        this.goals = goals;
    }

    public double getPlans() {
        return plans;
    }

    public void setPlans(double plans) {
        this.plans = plans;
    }

    public double getBeliefs() {
        return beliefs;
    }

    public void setBeliefs(double beliefs) {
        this.beliefs = beliefs;
    }

    public double getSituations() {
        return situations;
    }

    public void setSituations(double situations) {
        this.situations = situations;
    }

    public double getExpectations() {
        return expectations;
    }

    public void setExpectations(double expectations) {
        this.expectations = expectations;
    }

    public double getNorms() {
        return norms;
    }

    public void setNorms(double norms) {
        this.norms = norms;
    }

    public double getStandards() {
        return standards;
    }

    public void setStandards(double standards) {
        this.standards = standards;
    }

    public double getPreferences() {
        return preferences;
    }

    public void setPreferences(double preferences) {
        this.preferences = preferences;
    }
}
