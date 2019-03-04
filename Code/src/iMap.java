//package src;
 /**
 * Associations establish a link between a key and a value.
 * An associative array or map is a structure that allows a disjoint
 * set of keys to become associated with an arbitrary set of values.
 * The convenience of an associative array is that the values used to
 * index the elements need not be comparable and their range need not
 * be known ahead of time.  Furthermore, there is no upper bound on
 * the size of the structure.  It is able to maintain an arbitrary number
 * of different pieces of information simultaneously.  Maps are sometimes
 * called dictionaries because of the uniqueness of the association of
 * words and definitions in a household dictionary.
 * <P>
 * Example Usage:
 * <P>
 * To create a dictionary by reading a collection of words and
 * definitions from System.in we could use the following!
 * <P>
 * <pre>
 * public static void main (String[] argv){
 *      Map dict = new {@link structure.MapBST#MapBST()};
 *      ReadStream r = new ReadStream();
 *      String word, def;
 *      System.out.println("Enter a word: ");
 *      while(!r.eof()){
 *          word = r.readLine();
 *          System.out.println("Enter a definition: ");
 *          def = r.readLine();
 *          dict.{@link structure.MapBST#put(Object,Object) put(word,def)};
 *          System.out.println("Enter a word: ");
 *      }
 *      System.out.println(dict);
 * }
 * </pre>
 */
 import org.jetbrains.annotations.Contract;

 import java.util.*;

public interface iMap<K,V>
{
    /**
     * @post returns the number of entries in the map
     */
    public int size();

    /**
     * @post returns true iff this map does not contain any entries
     */
    public boolean isEmpty();

    /**
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    public boolean containsKey(K k);

    /**
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry;
     * that is, v is in the range of the map
     */
    public boolean containsValue(V v);

    /**
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    public V get(K k);

    /**
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    public V put(K k, V v);

    /**
     * @pre k is non-null
     * @post removes any mapping from k to a value, from the mapping
     */
    public V remove(K k);

    /**
     * @post returns a set of all keys associated with this map
     */
    public Set<K> keySet();

    /**
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    @Contract(value = "null -> false", pure = true)
    public boolean equals(Object other);
}
