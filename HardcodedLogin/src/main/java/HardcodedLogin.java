import java.util.Scanner;
public class HardcodedLogin {

    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public static void main(String [] args){
        HardcodedLogin logins;
        logins=new HardcodedLogin();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username");
        String us=sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter password");
        String pass=sc1.nextLine();
        Boolean check=logins.login(us, pass);
        System.out.println(check);
        
    }
    public boolean login(String username, String password){
        if(username.equals("user") && password.equals("password")){
            return true;
        }else if(username.equals("admin") && password.equals("qwerty")){
            return true;
        }else
        return false;
    }
}
