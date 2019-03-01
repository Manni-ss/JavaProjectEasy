public class Question {
    public String que[] = new String[10];
    public int ans[]= new int [10];

    public Question() {
        makeQuestions();
    }

    public void makeQuestions(){
        que[0] = "On a scale from 1-10, how much do you like vegetables?";
        que[1] = "On a scale from 1-10, how much do you dislike cigarettes?";
        que[2] = "How many days a week do you exercise?";
        que[3] = "How many glasses of water do you drink everyday?";
        que[4] = "On a scale from 1-10, how happy are you?";
        que[5] = "On a scale from 1-10, how much do you dislike alcohol?";
        que[6] = "How many friends do you have?";
        que[7] = "How many hours do you read per week?";
        que[8] = "On a scale from 1-10, how good is your health care provider?";
        que[9] = "On a scale from 1-10 pick a number";

    }

    public int evaluate(){
        int sum = 0;
        for(int i = 0; i<ans.length; i++){
            int num = ans[i];
            sum = num+sum;
        }
        return sum+15;




    }
}
