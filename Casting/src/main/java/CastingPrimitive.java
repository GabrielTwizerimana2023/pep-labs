
public class CastingPrimitive {
    /**
     * Casting is the conversion of one type to another. It exists for both primitive and object types.
     * Casting a double, which is a number with decimals, to an int, which is a number without decimals, will eliminate
     * the decimal portion of the number.
     *
     * If you try to just return d without changes, the method will not compile because d needs to be converted
     * to an int first to reflect the int return type.
     *
     * For example: int a = (int) 3.9;
     *              System.out.println(a); //will print 3 to the console.
     *
     * Now cast d to an int and return it.
     * @param d a decimal number.
     * @return the int form of d.
     */
    public static void main(String[] args){
        CastingPrimitive cast=new CastingPrimitive();
        System.out.println(cast.castToInt(0));
        System.out.println(cast.castToInt1(0));
    }
    public int castToInt(double d){
        double a=4.3;
        int b= (int) a;
        return b;
    }
    public int castToInt1(double d){
        double a=9.999;
        int b= (int) a;
        return b;
    }
}
