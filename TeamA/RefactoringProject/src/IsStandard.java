import java.util.ArrayList;

/**
 * Created by Steven on 5/7/2016.
 */
public class IsStandard implements FrameState {
    ScoreCalculator scoreCalculator;
    int score;
    String name;
    public IsStandard(ScoreCalculator newScoreCalculator){
        scoreCalculator = newScoreCalculator;
    }
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int newScore) {
        score=newScore;
    }

    @Override
    public void setString(String newName) {
        name=newName;
    }

    @Override
    public String getName() {
        return name;
    }
}
