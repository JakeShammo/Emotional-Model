public class Perception {
    public AbstractDomain abstractDomain;
    public Stimuli stimuli;
    public Speech speech;

    public Perception() {
        this.abstractDomain = AbstractDomain.getInstance();
    }

    public void setStimuli(Stimuli stimuli) {
        this.stimuli = stimuli;
        speech = stimuli.getSpeech();
    }

    public void calculate(){
        calculateConduciveToGoal();
        calculateDiscrepencyFromExpectation();
        calculateFamiliarity();
        calculatePredictibility();
        calculateSuddenness();
        calculateUrgency();
        calculateValence();
    }

    public void calculateSuddenness(){
        double value = (speech.getIntensity() + speech.getFluency()*-1 + speech.getIntonation()*-1 + speech.getDuration()*-1
                + speech.getPitchRange() + speech.getVolume() + speech.getPitchVariance())/7;
        abstractDomain.setSuddenness(value);
    }

    public void calculateFamiliarity(){
        double value = (2*(.5-Math.abs(speech.getIntensity())) + 2*(.5-Math.abs(speech.getFluency())) + 2*(.5-Math.abs(speech.getIntonation())) + 2*(.5-Math.abs(speech.getDuration()))
                + speech.getPitchRange()*-1 + 2*(.5-Math.abs(speech.getVolume())) + 2*(.5-Math.abs(speech.getRate())) + speech.getPitchVariance()*-1)/8;
        abstractDomain.setFamiliarity(value);
    }

    void calculatePredictibility(){
        double value = (2*(.5-Math.abs(speech.getIntensity()))+ 2*(.5-Math.abs(speech.getIntonation())) + 2*(.5-Math.abs(speech.getRate()))
        + 2*(.5-Math.abs(speech.getPitchVariance())))/4;
        abstractDomain.setPredictibility(value);
    }

    void calculateValence(){
        double value = (speech.getIntensity() + speech.getFluency() + speech.getIntonation() + speech.getDuration()
                + speech.getPitchRange() + speech.getVolume() + speech.getRate() + speech.getPitchVariance())/8;
        abstractDomain.setValence(value);
    }

    void calculateDiscrepencyFromExpectation(){
        double value = (speech.getFluency()*-1 + speech.getIntonation()*-1
                + -2*(.5-Math.abs(speech.getPitchRange())) + -2*(.5-Math.abs(speech.getVolume()))
                + -2*(.5-Math.abs(speech.getRate())) + -2*(.5-Math.abs(speech.getPitchVariance())))/6;
        abstractDomain.setDiscrepencyFromExpectation(value);
    }

    void calculateConduciveToGoal(){
        double value = (2*(.5-Math.abs(speech.getIntensity())) + speech.getFluency()
                + speech.getIntonation() + 2*(.5-Math.abs(speech.getDuration())) + speech.getPitchRange()*-1
                + 2*(.5-Math.abs(speech.getVolume())) + 2*(.5-Math.abs(speech.getRate())) + speech.getPitchVariance())/8;
        abstractDomain.setConduciveToGoal(value);
    }

    void calculateUrgency(){
        double value = (speech.getIntensity() + speech.getFluency()*-1 + speech.getIntonation() + speech.getDuration()*-1
                + speech.getPitchRange() + speech.getVolume() + speech.getRate() +  speech.getPitchVariance())/8;
        abstractDomain.setUrgency(value);
    }


}
