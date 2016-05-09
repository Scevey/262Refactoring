/**
 * Created by Steven on 5/7/2016.
 */
public class ScoreCalculator{
    FrameState isStrike;
    FrameState isSpare;
    FrameState isStandard;
    FrameState isNewFrame;
    FrameState isLastFrame;
    int score;
    String name;

    FrameState frameState;

    public ScoreCalculator(){
        isStrike= new IsStrike(this);
        isSpare = new IsSpare(this);
        isStandard = new IsStandard(this);
        isNewFrame = new IsNewFrame(this);
        isLastFrame = new IsLastFrame(this);

        if(frameState==null){
            setFrameState(getIsStandard());
        }


    }

    void setFrameState(FrameState newFrameState){
        frameState = newFrameState;

    }

    void setScore(int newScore){

        score=newScore;
        System.out.println(score + "score");
        frameState.setScore(score);
    }

    String getName(){
       if(frameState!=null) {
           System.out.println(frameState.getName());
           return frameState.getName();
       }return "none";
    }

    void setString(String newName){
        frameState.setString(newName);
    }

    public int getScore() {
        return score;
    }



    public FrameState getIsStrike(){return isStrike;}
    public FrameState getIsSpare(){return isSpare;}
    public FrameState getIsStandard() {return isStandard;}
    public FrameState getIsNewFrame() {return isNewFrame;}
    public FrameState getIsLastFrame() {return isLastFrame;}
}
