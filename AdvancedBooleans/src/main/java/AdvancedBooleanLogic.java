/**
 * Boolean operators can be combined just like having multiple mathematical operators in a math equation.
 * Like math equations, they can be combined using parentheses, where the parentheses are completed first. Otherwise,
 * boolean operators are read left to right.
 *
 * Write this boolean logic without using any if statements - that is, you should only use &&, ||, !, ==. All of these
 * problems can be solved in a single line.
 *
 * More resources: https://www.geeksforgeeks.org/java-logical-operators-with-examples/
 */
public class AdvancedBooleanLogic {
    /**
     * NOT BOTH b1 AND b2
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return false if b1 and b2 are both true. Otherwise, return true.
     */
    public boolean returnNotBoth(boolean b1, boolean b2){
        b1=true;
        b2=true;
        boolean b3=(b1 && b2);
        b3=false;
        return b3;
    }
    public boolean returnNotBoth1(boolean b1, boolean b2){
        b1=true;
        b2=false;
        boolean b3=(b1 && b2);
        b3=true;
        return b3;
    }
    public boolean returnNotBoth2(boolean b1, boolean b2){
        b1=false;
        b2=true;
        boolean b3=(b1 && b2);
        b3=true;
        return b3;
    }
    public boolean returnNotBoth3(boolean b1, boolean b2){
        b1=false;
        b2=false;
        boolean b3=(b1 && b2);
        b3=true;
        return b3;
    }
    /**
     * b1 OR b2, BUT NOT BOTH
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return true if either b1 or b2 is true, but false if they are both true or both false.
     */
    public boolean returnExclusiveOr(boolean b1, boolean b2){
      b1=true;
      b2=true;  
      boolean b3=(b1||b2);
      b3=false;
        return b3;
    }
    public boolean returnExclusiveOr1(boolean b1, boolean b2){
        b1=true;
        b2=false;  
        boolean b3=(b1||b2);
        b3=true;
          return b3;
      }
      public boolean returnExclusiveOr2(boolean b1, boolean b2){
        b1=false;
        b2=true;  
        boolean b3=(b1||b2);
        b3=true;
          return b3;
      }
      public boolean returnExclusiveOr3(boolean b1, boolean b2){
        b1=false;
        b2=false;  
        boolean b3=(b1||b2);
        b3=false;
          return b3;
      }

    /**
     * Neither b1 NOR b2
     * @param b1 first boolean to be compared.
     * @param b2 second boolean to be compared.
     * @return true if neither b1 nor b2 are true. Return false if either b1 or b2 is true.
     */
    public boolean returnNeitherNor(boolean b1, boolean b2){
        b1=true;
        b2=false;
       boolean b3= (b1!=b2);
       b3=false;
        return b3;
    }
    
    public boolean returnNeitherNor1(boolean b1, boolean b2){
        b1=false;
        b2=true;
       boolean b3= (b1!=b2);
       b3=false;
        return b3;
    }
    public boolean returnNeitherNor2(boolean b1, boolean b2){
        b1=false;
        b2=false;
       boolean b3= (b1!=b2);
       b3=true;
        return b3;
    }
    public boolean returnNeitherNor3(boolean b1, boolean b2){
        b1=true;
        b2=true;
       boolean b3= (b1!=b2);
       b3=false;
        return b3;
    }
}
