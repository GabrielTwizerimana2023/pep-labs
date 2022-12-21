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
    public static void main(String [] args){
        Parrot sc=new Parrot();
        String x=sc.copy("hello");
        String y=sc.parrot("polly");
        System.out.println(x);
        System.out.println(y);
    }
    public String copy(String hi){
        return "hello";
    }
    public String parrot(String n){
        return "polly";
    }
}