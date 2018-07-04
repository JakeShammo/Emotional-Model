import java.util.Scanner;

public class AudioFeed {
    Speech speech;
    public Stimuli getInput(){
        Scanner input = new Scanner(System.in);
        Speech speech = new Speech();
        System.out.println("Enter Fluency:");
        speech.setFluency(input.nextDouble());
        System.out.println("Enter Intonation:");
        speech.setIntonation(input.nextDouble());
        System.out.println("Enter pitch range:");
        speech.setPitchRange(input.nextDouble());
        System.out.println("Enter Volume:");
        speech.setVolume(input.nextDouble());
        System.out.println("Enter Rate:");
        speech.setRate(input.nextDouble());
        System.out.println("Enter Intensity:");
        speech.setIntensity(input.nextDouble());
        System.out.println("Enter Pitch Variance:");
        speech.setPitchVariance(input.nextDouble());
        Stimuli stimuli = new Stimuli();
        stimuli.setSpeech(speech);
        return stimuli;
    }
}
