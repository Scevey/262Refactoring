import java.util.ArrayList;

/**
 * Created by Steven on 5/7/2016.
 */
public class IsNewFrame implements FrameState {
    ScoreCalculator scoreCalculator;
    int score;
    String name;
    public IsNewFrame(ScoreCalculator newScoreCalculator){
        scoreCalculator = newScoreCalculator;
    }
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setString(String newName) {
        name=newName;
    }
}