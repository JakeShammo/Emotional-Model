//by Ehtesham

public class ExpressiveDomain {
    private static ExpressiveDomain expressiveDomain;
    private FacialExpression facialExpression;
    private Speech speech;
    private Posture posture;
    private double decayRate;

    private ExpressiveDomain(){
        //cognitiveDomain = CognitiveDomain.getInstance();
        expressiveDomain = ExpressiveDomain.getInstance();
    }

    public static ExpressiveDomain getInstance(){
        if(expressiveDomain == null){
            expressiveDomain = new ExpressiveDomain();
        }
        return expressiveDomain;
    }

    public FacialExpression getFacialExpression() {
        return facialExpression;
    }

    public void setFacialExpression(FacialExpression facialExpression) {
        this.facialExpression = facialExpression;
    }

    public Speech getSpeech() {
        return speech;
    }

    public void setSpeech(Speech speech) {
        this.speech = speech;
    }

    public Posture getPosture() {
        return posture;
    }

    public void setPosture(Posture posture) {
        this.posture = posture;
    }

    public void showExpression()
    {

    }

    public void recalculateExpression()
    {

    }
}
