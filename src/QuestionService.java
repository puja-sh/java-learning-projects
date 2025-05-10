import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        String[] questionList = {"Which is use in frontend?", "Who will won the war?", "Capital of India?", "Capital of Jharkhand?", "Two + Three is?"};
        String[][] optionsList = {
                {"Reactjs", "Springboot", "Java", "Python"},
                {"Pakistan", "India", "America", "Nepal"},
                {"New Delhi", "Mumbai", "Kolkata", "Chennai"},
                {"Bhubaneswar", "Patna", "Ranchi", "Kolkata"},
                {"6", "5", "7", "8"}
        };

        for (int i = 0; i < questionList.length; i++) {
            String[] answerOption = {"1", "2", "1", "1", "1"};

            questions[i] = new Question(i + 1, questionList[i], answerOption[i], optionsList[i][0], optionsList[i][1], optionsList[i][2], optionsList[i][3]);
        }
    }

    public void playQuiz() {
        for (Question question : questions) {
            System.out.println("Question No. " + question.getId() + " " + question.getQuestion());

            String[] options = {question.getOpt1(), question.getOpt2(), question.getOpt3(), question.getOpt4()};

            for (int i = 0; i < options.length; i++) {
                System.out.println("Option " + (i + 1) + ". " + options[i]);
            }

            // User Input
            Scanner sc = new Scanner(System.in);
            String answered = sc.nextLine();

            if (answered.equals(question.getAnswer())) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }

            System.out.println();
        }
    }
}