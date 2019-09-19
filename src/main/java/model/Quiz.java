package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz {

    private List<Question> questionList;
    private int currentQuestion;
    private int score;

    public Quiz(){
        this.questionList = Arrays.asList(
                new Question("3, 1, 4, 1, 5", "9"),
                new Question("1, 1, 2, 3, 5", "8"),
                new Question("1, 4, 9, 16, 25", "36"),
                new Question("2, 3, 5, 7, 11", "13"),
                new Question("1, 2, 4, 8, 16", "32")
        );
        Collections.shuffle(this.questionList);
    }

    public String getNextQuestion(){
        if(currentQuestion >= questionList.size()){
            return null;
        }else{
            return this.questionList.get(currentQuestion++).getQues();
        }
    }
    public void checkAnswer(String answer){
        int temp = currentQuestion - 1;
        boolean result = this.questionList.get(temp).checkAnswer(answer);
        if(result) this.score++;
    }

    public int getScore(){
        return score;
    }

    public int getTotalScore(){
        return this.questionList.size();
    }

}
