/**
 * Created by Steven on 5/8/2016.
 */
public class IsLastFrame implements FrameState {
    ScoreCalculator scoreCalculator;
    int score;
    String name;
    public IsLastFrame(ScoreCalculator newScoreCalculator){
        scoreCalculator = newScoreCalculator;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setScore(int newScore) {
        score=newScore;
    }

    @Override
    public void setString(String newName) {
        name=newName;
    }

}
