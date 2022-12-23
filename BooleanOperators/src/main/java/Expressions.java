

/**
 * In order to make our programs even more impressive and interactive, we need to learn how to better leverage
 * boolean expressions. This will allow our programs to follow their own logic. For this example, you should look into
 * the different operators for basic boolean expressions.
 * 
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators.
 */
public class Expressions {
    public static void main(String [] args){
       Expressions sc=new Expressions();
       sc.returnBoolean(true);
      System.out.println(sc.returnBoolean(true)); 
      sc.returnBoolean1(false);
      System.out.println(sc.returnBoolean1(false)); 
      sc.returnNot(false);
      System.out.println(sc.returnNot(false));
      sc.returnNot1(true);
      System.out.println(sc.returnNot1(true));
      sc.returnAnd(true, true);
      System.out.println(sc.returnAnd(true, true));
      sc.returnAnd(false, true);
      System.out.println(sc.returnAnd(false, true));
      sc.returnAnd(false, false);
      System.out.println(sc.returnAnd(false, false));
      sc.returnOr(true, false);
      System.out.println(sc.returnOr(true, false));
      sc.returnOr(true, true);
      System.out.println(sc.returnOr(true, true));
      sc.returnOr(false, true);
      System.out.println(sc.returnOr(false, true));
      sc.returnOr(false, false);
      System.out.println(sc.returnOr(false, false));
    }
    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
    public boolean returnBoolean(boolean b){
        b=true;
        return b;
        
    }
    public boolean returnBoolean1(boolean b){
        b=false;
        return b;
        
    }
    /**
     * @param b a true/false value.
     * @return if b is true, return false. if b is false, return true.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnNot(boolean b){
        b=true;
        return false;
    }
    public boolean returnNot1(boolean b){
        b=false;
        return true;
    }
    

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnAnd(boolean b1, boolean b2){
       
        if((b1==true && b2==true)){
        return true;
        }
        else if((b1==false && b2==true)){
            return false;
            }
        else if((b1==false && b2==false)){
                return false;
                }
        else if((b1==false && b2==true)){
                    return true;
                    }
                    else{
                        return false;
                    }
    }
    
    

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b1 are true. false if both are false.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnOr(boolean b1, boolean b2){
       
        if((b1==true || b2==true)){
        return true;
        }
        else if((b1==false || b2==true)){
            return false;
            }
        else if((b1==false || b2==false)){
                return false;
                }
        else if((b1==false || b2==true)){
                    return true;
                    }
                    else{
                        return false;
                    }

}}
