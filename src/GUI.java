
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application {

    final Slider intensity = new Slider(-1, 1, 0);
    final Slider fluency = new Slider(-1, 1, 0);
    final Slider intonation = new Slider(-1, 1, 0);
    final Slider duration = new Slider(-1, 1, 0);
    final Slider pithRange = new Slider(-1, 1, 0);
    final Slider volume = new Slider(-1, 1, 0);
    final Slider rate = new Slider(-1, 1, 0);
    final Slider pitchVarience = new Slider(-1, 1, 0);

    final Label intensityCaption = new Label("Intensity :");
    final Label fluencyCaption = new Label("Fluency :");
    final Label intonationCaption = new Label("Intonation :");
    final Label durationCaption = new Label("Duration :");
    final Label pithRangeCaption = new Label("Pitch Range :");
    final Label volumeCaption = new Label("Volume :");
    final Label rateCaption = new Label("Rate :");
    final Label pitchVarienceCaption = new Label("Pitch Varience:");

    final Label intensityValue = new Label(
            Double.toString(intensity.getValue()));
    final Label fluencyValue = new Label(
            Double.toString(fluency.getValue()));
    final Label intonationValue = new Label(
            Double.toString(intonation.getValue()));
    final Label durationValue = new Label(
            Double.toString(duration.getValue()));
    final Label pitchRangeValue = new Label(
            Double.toString(pithRange.getValue()));
    final Label volumeValue = new Label(
            Double.toString(volume.getValue()));
    final Label rateValue = new Label(
            Double.toString(rate.getValue()));
    final Label pitchVarienceValue = new Label(
            Double.toString(pitchVarience.getValue()));


    final Button calculate = new Button("Calculate");

    final Label result = new Label("Result: ");
    final Label resultValue = new Label();


    final Label suddenness = new Label("Suddenness :");
    final Label familiarity = new Label("Familiarity :");
    final Label predictability = new Label("Predictability :");
    final Label valence = new Label("Valence :");
    final Label discripancyFromExp = new Label("Discrepancy From Expectation :");
    final Label conduciveToGoal = new Label("Conducive To Goal :");
    final Label urgency = new Label("Urgency :");


    final Label suddennessValue = new Label("0.0");
    final Label familiarityValue = new Label("0.0");
    final Label predictabilityValue = new Label("0.0");
    final Label valenceValue = new Label("0.0");
    final Label discripancyFromExpValue = new Label("0.0");
    final Label conduciveToGoalValue = new Label("0.0");
    final Label urgencyValue = new Label("0.0");



    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.setTitle("EmoBot");
        scene.setFill(Color.BLACK);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(70);

        scene.setRoot(grid);

        setGridSlider(grid, intensity, intensityCaption, intensityValue, 1);
        setGridSlider(grid, fluency, fluencyCaption, fluencyValue, 2);
        setGridSlider(grid, intonation, intonationCaption, intonationValue, 3);
        setGridSlider(grid, duration, durationCaption, durationValue, 4);
        setGridSlider(grid, pithRange, pithRangeCaption, pitchRangeValue, 5);
        setGridSlider(grid, volume, volumeCaption, volumeValue, 6);
        setGridSlider(grid, rate, rateCaption, rateValue, 7);
        setGridSlider(grid, pitchVarience, pitchVarienceCaption, pitchVarienceValue, 8);

        GridPane.setConstraints(calculate, 2, 9);
        grid.getChildren().add(calculate);

        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Speech speech = new Speech();
                speech.setPitchVariance(pitchVarience.getValue());
                speech.setRate(rate.getValue());
                speech.setVolume(volume.getValue());
                speech.setIntonation(intonation.getValue());
                speech.setIntensity(intensity.getValue());
                speech.setFluency(fluency.getValue());
                speech.setPitchRange(pithRange.getValue());
                speech.setDuration(duration.getValue());
                Stimuli stimuli = new Stimuli();
                stimuli.setSpeech(speech);
                Perception perception = new Perception();
                perception.setStimuli(stimuli);
                perception.calculate();
                AbstractDomain abstractDomain = AbstractDomain.getInstance();
                GenerateEmotion generateEmotion = new GenerateEmotion();
                resultValue.setText(generateEmotion.calculateEmotion());
                suddennessValue.setText(String.format("%.2f",abstractDomain.suddenness));
                familiarityValue.setText(String.format("%.2f",abstractDomain.familiarity));
                predictabilityValue.setText(String.format("%.2f",abstractDomain.predictibility));
                valenceValue.setText(String.format("%.2f",abstractDomain.valence));
                discripancyFromExpValue.setText(String.format("%.2f",abstractDomain.discrepencyFromExpectation));
                conduciveToGoalValue.setText(String.format("%.2f",abstractDomain.conduciveToGoal));
                urgencyValue.setText(String.format("%.2f",abstractDomain.urgency));
            }
        });
        setGridResult(grid, suddenness, suddennessValue, 10, 0.0);
        setGridResult(grid, familiarity, familiarityValue, 11, 0.0);
        setGridResult(grid, predictability, predictabilityValue, 12, 0.0);
        setGridResult(grid, valence, valenceValue, 13, 0.0);
        setGridResult(grid, discripancyFromExp, discripancyFromExpValue, 14, 0.0);
        setGridResult(grid, conduciveToGoal, conduciveToGoalValue, 15, 0.0);
        setGridResult(grid, urgency, urgencyValue, 16, 0.0);
        setGridResult(grid,result,resultValue,18,0);


        stage.show();
    }

    public void setGridSlider(GridPane grid, Slider slider, Label caption, Label value, int row)
    {
        GridPane.setConstraints(caption, 0, row);
        grid.getChildren().add(caption);


        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                value.setText(String.format("%.2f", new_val));
            }
        });

        GridPane.setConstraints(slider, 1, row);
        grid.getChildren().add(slider);

        GridPane.setConstraints(value, 2, row);
        grid.getChildren().add(value);
    }

    public void setGridResult(GridPane grid, Label caption, Label value, int row, double calculatedValue)
    {
        GridPane.setConstraints(caption, 0, row);
        grid.getChildren().add(caption);



        value.setText(String.format("%.2f", calculatedValue));

        GridPane.setConstraints(value, 1, row);
        grid.getChildren().add(value);
    }
}
