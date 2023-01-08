
import java.util.Scanner;

public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    public static void main(String [] args){
        
            Scanner c=new Scanner(System.in);
            System.out.println("How old are u?");
            int age=c.nextInt();
            try {
                throwCustomException(age);
        } catch (Exception e) {
            System.out.println("A problem occurred!"+e);
        }
    }
        
    static void throwCustomException(int age)  throws CustomException{
     
        if(age<18){
            throw new CustomException("Age is not valid to vote");
        }else{
            System.out.println("Welcome To Vote");
        
     }
    }
    }

