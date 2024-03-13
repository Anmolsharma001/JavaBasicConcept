import java.util.Scanner;
class input
        {
           public static void main(String[]args){
               Scanner input=new Scanner(System.in);
               System.out.println("enter an integers");
               int number=input.nextInt();
               System.out.println("you entered"+number);
               input.close();
           }

        }
