

public class Question {
    private String questionText;
    private String[] options;
    private char correctOption;

    public Question(String questionText,String[] options, char correctOption){
        this.questionText = questionText;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public void displayQuestion(){
        System.out.println("\n" + questionText);
        System.out.println("A)"+ options[0]);
        System.out.println("B)"+ options[1]);
        System.out.println("C)"+ options[2]);
        System.out.println("D)"+ options[3]);
    }
    public boolean correctAnswer(char userOption){
        return Character.toUpperCase(userOption) == correctOption; 
       }
       public char getCorrectOption(){
        return correctOption;
       }
}
