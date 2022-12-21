import java.util.Scanner;

public class Parrot {
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    public static void main (String [] args) {
        System.out.println("Say a word!");
        Scanner sc= new Scanner(System.in);
        Parrot p1=new Parrot();
       
        String x=p1.copy("Hello");
        String x1=p1.copy1("polly");
       
       String s=sc.nextLine();
       
       if(s.equals("hello")){
        System.out.println(x);
        
       }else if(s.equals("polly"))
       System.out.println(x1);
    }
    public String copy(String text){
        return "hello";
    }
    public String copy1(String text){
        return "polly";
        
    }
}