package model;

public class Question {

    private String ques;
    private String answer;

    public Question(String ques, String answer) {
        this.ques = ques;
        this.answer = answer;
    }

    public String getQues() {
        return ques;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }
}