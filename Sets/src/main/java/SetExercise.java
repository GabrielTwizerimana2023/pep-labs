
import java.util.HashSet;
import java.util.Set;

/**
 * Sets are unordered collections of elements. Sets do not allow duplicates.
 *
 * Sets are very efficient for storing items that should be unique.
 *
 * You can read about HashSet, a common and very efficient implementation of Set, here:
 * https://www.w3schools.com/java/java_hashset.asp
 */
public class SetExercise {
    /**
     * Instantiate and return a Set of Integers.
     *
     * Like List, Set is an interface. However, the Set interface is different: for instance, it doesn't make sense
     * for Sets to have a get method to retrieve an item at a particular index from a set, because Sets are unordered.
     *
     * Some common implementations of Set are HashSet and TreeSet. Look into how to instantiate them.
     * @return a new Set<Integer> object.
     */
    Set<Integer> numbs;
    public static void main(String [] args){
    SetExercise sets=new SetExercise();
    System.out.println(sets.createSet());
    System.out.println(sets.getSize(null));
    sets.addUniqueItem(null, 0);
    sets.addUniqueItem1(null, 0);
    sets.removeItem(null, 0);
    }
    public Set<Integer> createSet(){
    numbs=new HashSet<>();
    numbs.add(1);
        return numbs;
    }

    /**
     * Return the size of a set.
     * @param set The set that we will be manipulating.
     * @return the size of set. (number of values)
     */
    public int getSize(Set<Integer> set){
        SetExercise s=new SetExercise();
        numbs=s.createSet();
        //numbs=new HashSet<>();
        numbs.size();
        return numbs.size();
    }

    /**
     * Add a new, unique item to a set. Sets can only store unique items (no duplicates).
     * @param set The set that we will be manipulating.
     * @param item The item which we will be adding to set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void addUniqueItem(Set<Integer> set, int item){
    SetExercise s=new SetExercise();
    numbs=s.createSet();
    numbs.add(1);
    System.out.println(numbs.contains(1));
    System.out.println(numbs.contains(2));
    }
    
   public void addUniqueItem1(Set<Integer> set, int item){
        SetExercise s=new SetExercise();
   
        numbs=s.createSet();
        
        numbs.add(1);
        numbs.add(2);
        System.out.println( numbs.contains(1));
        System.out.println( numbs.contains(2));
        }
   
    /**
     * Remove an item from a set.
     * @param set The set that we will be manipulating.
     * @param item The item which we will be removing from set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void removeItem(Set<Integer> set, int item){
    SetExercise s=new SetExercise();
    numbs=s.createSet();
    numbs.remove(2);
    System.out.println(numbs.remove(1));
    System.out.println(numbs.remove(2));
    }
}
