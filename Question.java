public class Question {
    private String questionText;
    private String[] options;
    private int  answer;

    public Question(String questionText, String[] options, int answer) {
        this.questionText = questionText;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getAnswer() {
        return answer;
    }

    public boolean isCorrect(int userAnswer) {
        return answer == userAnswer;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
