public class Speech {
    private double  fluency;
    private double intonation;
    private double pitchRange;
    private double volume;
    private double rate;
    private double intensity;
    private double duration;
    private double pitchVariance;

    public void setIntensity(double intensity) { this.intensity = intensity; }

    public double getIntensity() { return intensity; }

    public double getFluency() {
        return fluency;
    }

    public void setFluency(double fluency) {
        this.fluency = fluency;
    }

    public double getIntonation() {
        return intonation;
    }

    public void setIntonation(double intonation) {
        this.intonation = intonation;
    }

    public double getPitchRange() {
        return pitchRange;
    }

    public void setPitchRange(double pitchRange) {
        this.pitchRange = pitchRange;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRate() { return rate; }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getDuration() { return duration; }

    public void setDuration(double duration) { this.duration = duration; }

    public double getPitchVariance() { return pitchVariance; }

    public void setPitchVariance(double pitchVariance) { this.pitchVariance = pitchVariance; }
}
