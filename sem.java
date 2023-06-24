import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class sem {
    public static void main(String[] args) {
        Set set1 = new Set();
        set1.add(555);
        set1.add(123);
        set1.add(333);
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println(set1);
            System.out.println(set1.get(1));
        }
    }

    static class Set<E> extends ArrayList<E> {
        private HashMap<E, Object> set = new HashMap<>();
        private static final Object VALL = new Object();


        public boolean add(E tel) {
            if (set.containsKey(tel)) return false;
            return set.put(tel, VALL) == null;
        }

        public boolean remove(Object tel) {
            return set.remove(tel) == VALL;
        }

        public int size() {
            return set.size();
        }

        public boolean isEmpty() {
            return set.isEmpty();
        }

        public Iterator<E> iterator() {
            return set.keySet().iterator();
        }

        public void clear() {
            set.clear();
        }

        public String toString() {
            return set.toString();
        }

        public E get(int index) {
            if (index >= 0 && index < set.size()) {
                return (E) (set.keySet().toArray())[index];
            } else throw new IndexOutOfBoundsException();
        }
    }
}
