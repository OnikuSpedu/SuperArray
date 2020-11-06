/**
 * SuperArray
 */
public class SuperArray {

    private String [] data;
    private int size; //The current size
    private int initialCapacity; //How much the capacity should increase by after resizing.

    public SuperArray(int initialCapacity) {
        this.data = new String[10];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    public int size() {
        return this.size;
    }

    public boolean add(String element) {
        if (this.data.length <= this.size) {
            resize();
        } 

        this.data[size] = element;
        this.size += 1;

        if (this.size != 0 && this.data[size-1].equals(element)) {
            return true;
        }

        return false;
    }
    public void add(int index, String element) {
        if (index <= this.size && index >= 0) {

            if (this.data.length <= this.size) {
                resize();
            }
            
            String[] arr = new String[this.data.length];

            for (int i = 0; i < index; i++) {
                arr[i] = this.data[i];
            }

            arr[index] = element;

            for (int i = index+1; i <= this.size; i++) {
                arr[i] = this.data[i-1-index];
            }

            this.data = arr;
            this.size += 1;

        }
        
    }
    public String get(int index) {
        if (this.size > index) {
            return this.data[index];
        }
        return null; //Return null if there is no number at the index
    }

    public String set(int index, String element) {
        if (this.size > index) {
            String old = this.data[index];
            this.data[index] = element;
            return old;
        } 
        return null;
    }
    
    private void resize() {
        String[] arr = new String[this.size * 2];
        for (int i = 0; i < this.data.length; i++) {
            arr[i] = this.data[i];
        }
        this.data = arr;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.size = 0;
        this.data = new String[this.initialCapacity];
    }

    public String toString() {
        String res = "";

        res += "[";

        for (int i = 0; i < this.size; i++) {
            res += this.data[i];
            if (i != this.size - 1) res += ", ";
        }
        res += "]";
        return res;
    }

    public boolean contains(String s) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(s)) 
                return true;
        }
        return false;
    }
    
    public void remove(int index) {
        if (index <= this.size && index >= 0) {

            String[] arr = new String[this.data.length];

            for (int i = 0; i < index; i++) {
                arr[i] = this.data[i];
            }
            for (int i = index + 1; i < this.size; i++) {
                arr[i-1] = this.data[i];
            }

            this.data = arr;
            this.size -= 1;

        }
        
    }
}