
import java.util.HashMap;
import java.util.Map;


/**
 * Maps are key/value pairs. They are used in situations where we have some value that we'd like
 * to efficiently be able to access, but can be easily identified by some other value.
 * For instance, a dictionary 'key' may be the word and the 'value' may be its definition.
 * Or, if we'd like to keep track of how many times words were used in a book, we could use a word as a 'key'
 * and the amount of times the word appeared as a 'value'.
 *
 * Keys may not be duplicates, but there may be duplicate values in a map.
 *
 * You can read more about HashMap, a very efficient implementation of Map, here:
 * https://www.w3schools.com/java/java_hashmap.asp
 */
public class MapExercise {
    Map<Integer, String> map;
    /**
     * Create and instantiate a collection that implements that Map interface, like
     * TreeSet or HashSet. This will be a Map that maps Integer keys to String values.
     * For example, 1:cat, 2:dog, 3:rat, etc.
     *
     * @return a new Map instantiated using Integer keys and String values.
     * Like the other collections problems, Map alone is only an interface. Some common Map implementations are
     * HashMap and TreeMap. Also like the other collections, Map must leverage a wrapper class instead of a primitive,
     * so here Integer is a wrapper for int.
     */
    public static void main(String [] args){
    MapExercise dd=new MapExercise();
    System.out.println(dd.createMap());
    dd.getSize(null);
    System.out.println(dd.getSize(null));
    addKeyValuePair(null, 0, null);
    //addKeyValuePair1(null, 0, null);
    System.out.println(dd.getValueFromKey(null, 0));
    extracted();
    //System.out.println(dd.getValueFromKey1(null, 0));
    overwriteValue(null, 0, null);
    }


    private static void extracted() {
        removeKeyValuePair(null, 0);
    }
   
    
    public Map<Integer, String> createMap(){
       map=new HashMap<>();
       //map.put(1, "banana");
       map.put(2, "pear");
        return map;
    }

    /**
     * Get the size of a map. (number of key/value paris)
     * @param map a map to be manipulated.
     * @return the size of map.
     */
    public int getSize(Map<Integer ,String > map){
    
        map=new HashMap();
        
//        return total number of key/value pairs in the map
        return map.size();
    }
   
    /**
     * Insert a key/value pair into a map.
     * @param map a map to be manipulated.
     * @param key the key of the new pair.
     * @param value the value of the new pair.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public static void addKeyValuePair(Map<Integer,String> map, int key, String value){
        map=new HashMap<>();
        map.put(1, "Banana");
        map.put(2, "pear");
        map.put(3, "golden berry");
        System.out.println(map);
    }
    public static void addKeyValuePair1(Map<Integer,String> map, int key, String value){
        map=new HashMap<>();
        map.put(1, "Banana");
       
        System.out.println(map);
    }


    /**
     * Get a value from a map given a key.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the value we will be retrieving.
     * @return the value associated with key in map.
     */
    public String getValueFromKey(Map<Integer, String> map, int key){
       
        map=new HashMap<>();
        map.put(1, "banana");
        map.put(2, "pear");
       String bb=map.get(1);
        return bb;
    }
    /*public String getValueFromKey1(Map<Integer, String> map, int key){
       
        map=new HashMap<>();
        map.put(1, "banana");
        map.put(2, "pear");
       String bb=map.get(1);
        return bb;
    }*/

    /**
     * Remove a key/value pair from a map.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be deleting.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public static void removeKeyValuePair(Map<Integer, String> map, int key){
        map=new HashMap<>();
        map.put(1, "banana");
        map.put(2, "pear");
        map.remove(1, "banana");
        System.out.println(map);
    }

    /**
     * Update the value related to a certain key in a map.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be updating.
     * @param value the new value that should be associated with key.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public static void overwriteValue(Map<Integer, String> map, int key, String value){
     map=new HashMap<>();
     map.put(1, "banana");
     map.put(2, "pear");
     System.out.println(map);
    map.replace(2, "apple");
    System.out.println(map.toString());
    }}
