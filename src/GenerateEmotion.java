public class GenerateEmotion {
    AbstractDomain abstractDomain;
    public String calculateEmotion(){
        abstractDomain = AbstractDomain.getInstance();
        if(abstractDomain.conduciveToGoal> 0){
            if(abstractDomain.discrepencyFromExpectation>.4 && abstractDomain.suddenness>.2){
                return "Emotion: Surprise\t Effect: Stunned";
            }
            if(abstractDomain.familiarity<0){
                return "Emotion: Hope\t Effect: Focused";
            }
            if(abstractDomain.predictibility<.4 && abstractDomain.suddenness>0){
                return "Emotion: Joy\t Effect: Excited";
            }



        }
        else{
            if(abstractDomain.discrepencyFromExpectation>0 && abstractDomain.familiarity<0 && abstractDomain.predictibility<0){
                if(abstractDomain.urgency>0){
                    if(abstractDomain.power>abstractDomain.valence){
                        return "Emotion: Anger\t Effect: Explosive";
                    }
                    else
                        return "Emotion: Fear\t Effect: Dangered";
                }
                else
                    return "Emotion: Sadness\t Effect: lethargy";
            }
        }
        return "Neutral";
    }
}
