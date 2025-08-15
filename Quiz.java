import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int score = 0;
questions.add(new Question(
    "Which language is used for Android app development?",
    new String[]{"Java", "Python", "C++", "Swift"},
    0
));

questions.add(new Question(
    "What does HTML stand for?",
    new String[]{"HyperText Markup Language", "HighText Machine Language", "HyperTabular Markup Language", "None of these"},
    0
));

questions.add(new Question(
    "Which company developed Java?",
    new String[]{"Sun Microsystems", "Microsoft", "Apple", "Google"},
    0
));

questions.add(new Question(
    "Which keyword is used to inherit a class in Java?",
    new String[]{"implement", "inherits", "extends", "super"},
    2
));

questions.add(new Question(
    "What is the size of an int in Java?",
    new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on the system"},
    1
));
        for (Question question : questions) {
            System.out.println("Question: " + question.getQuestionText());
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + ": " + question.getOptions()[i]);
            }
            System.out.print("Your answer (1-" + question.getOptions().length + "): ");
            int userAnswer = sc.nextInt() - 1;
            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + question.getOptions()[question.getAnswer()]);
            }
        }
        System.out.println("Your total score is: " + score + "/" + questions.size());
    }
}
