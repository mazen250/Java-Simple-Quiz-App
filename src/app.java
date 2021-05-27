import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        String q1="is java an oop lang ?\n"+"(a)yes \n (b)no\n (c)ay haga\n";
        String q2="is c++ an oop lang ?\n"+"(a)yes \n (b)no (c)ay haga\n";


        quistion [] quistions ={
                new quistion(q1,"a"),
                new quistion(q2,"b"),
        };
        test(quistions);
    }
    public static void test(quistion [] quiestions )
    {
        int score=0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<2 ; i ++){
            System.out.println(quiestions[i].qes);
            String UserAns = sc.nextLine();
            if (UserAns.equals(quiestions[i].answer))
            {
            score++;

            }
    }
        System.out.println("your score is "+ score +" out of "+quiestions.length);
    }

    }
