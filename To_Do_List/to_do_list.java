package To_Do_List;
import java.util.*;



public class to_do_list {
   private static ArrayList<String> tasks = new ArrayList<>();
   private static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
   while(true){
     displayMenu();
        int Choice = sc.nextInt();
         sc.nextLine();

     switch (Choice) {
        case 1:
            addTask();
            break;
    
        case 2 :
            viweTask();
            break;

        case 3 :
            markTaskComplete();
            break;
        case 4 :
            deleteTask();
            break;
        case 5 :
            System.out.println("Exiting......");
            return;
        default :
            System.out.println("Invalid.... TRY AGAIN");
               
          
        }
    }
 }
    
        public static void displayMenu(){
            System.out.println("<<<<<TO DO LIST MENU>>>>>");
            System.out.println("1, ADD A TASK.....");
            System.out.println("2, VIEW TASK.....");
            System.out.println("3, MARK AS COMPLETED.....");
            System.out.println("4, DELETE TASK.....");
            System.out.println("5, EXITING.....");
            System.out.print("Choose an option: ");
        }
        public static void pause() {
        System.out.println("Press Enter to continue...");
        sc.nextLine();
        }
      public static void addTask(){
        System.out.println("Enter New Task");
        String Task = sc.nextLine();
        tasks.add(Task);
        System.out.println("Task added sucessfully..");
        pause();

        }
        public static void viweTask(){
            if(tasks.isEmpty()){
                System.out.println("No Tasks Is There Yet");
            }
            for(int i = 0;i<tasks.size();i++){
                System.out.println((i+1)+". "+tasks.get(i));
            }
            pause();
        }
        public static void  markTaskComplete(){
            if(tasks.isEmpty()){
                return;
            }
            viweTask();

            System.out.println("Enter task to mark as done");
            int num = sc.nextInt();
            sc.nextLine();

            if(num <= 0 || num > tasks.size()) {
              System.out.println("Invalid number");
            }
            else{
                String completeTask = tasks.get(num-1)+"Completed";
                tasks.set(num-1, completeTask);
                System.out.println("Mark as complete!");
            }
            pause();
        }
        public static void deleteTask(){
             viweTask();
            if(tasks.isEmpty()){
                return;
            }
            System.out.println("Enter Task Number To Delete");
            int num = sc.nextInt();
            sc.nextLine();
            if(num>0 && num<=tasks.size()){
                tasks.remove(num -1);
                System.out.println("Task Deleted ");
            }else{
                System.out.println("Invalid Task number");
            }
            pause();
        }
        
}
