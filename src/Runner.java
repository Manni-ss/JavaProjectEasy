
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Question q = new Question();

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<q.que.length;i++){
            System.out.println(q.que[i]);

            if(sc.hasNextInt()){
                int x = sc.nextInt();
                if(x>=1 && x<=10) {
                    q.ans[i] = x;
                } else {
                    System.out.println("You must enter a number 1-10");
                    break;

                }
            } else {
                System.out.println("You must enter a number 1-10. Restart.");
                break;

            }
            if(i==9){
                int m = q.evaluate();
                System.out.println("You will live to be " + m);
            }

        }


    }

}
