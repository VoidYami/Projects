import java.util.*;

public class quizAPP {
   private List<Question> questions;
   private int score;

   public quizAPP(){
       questions = new ArrayList<>();
       score = 0;
       loadQuestions();
   }

   private void loadQuestions() {
         questions.add(new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 'C'));
         questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 'B'));
         questions.add(new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald"}, 'A'));
         questions.add(new Question("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, 'D'));
   }

   public void start(){
    Scanner sc  = new Scanner(System.in);
    System.out.println("---------Welcome---------");

    for(Question q : questions){
        q.displayQuestion();
        System.out.print("Your answer: ");
        char userOption = sc.next().charAt(0);
        if(q.correctAnswer(userOption)){
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is " + q.getCorrectOption());
        }
    }

    System.out.println();
    System.out.println("Quiz finished. Your score: " + score + " / " + questions.size());
    // scanner left open intentionally for interactive console; add sc.close() if desired
   }
}
