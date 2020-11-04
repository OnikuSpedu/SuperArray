/**
 * SuperArray
 */
public class SuperArray {

    private String [] data;
    private int size; //The current size
    private int buffer; //How much the capacity should increase by after resizing.

    public SuperArray() {
        this.data = new String[10];
        this.size = 0;
        this.buffer = 10;
    }

    public int size() {
        return this.size;
    }

    public boolean add(String element) {
        if (this.data.length > this.size) {

            this.data[size] = element;
            this.size += 1;


            if (this.size != 0 && this.data[size-1].equals(element)) {
                return true;
            }
        } else {
            resize();

            this.data[size] = element;
            this.size += 1;

            if (this.size != 0 && this.data[size-1].equals(element)) {
                return true;
            }
        }
        return false;
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
        String[] arr = new String[this.size + this.buffer];
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
        this.data = new String[this.buffer];
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
}