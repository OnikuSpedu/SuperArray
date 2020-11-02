/**
 * SuperArray
 */
public class SuperArray {

    private String [] data;
    private int size; //The current size
    private int buffer;

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

            return true;
        } else {
            resize();

            this.data[size] = element;
            this.size += 1;

            if (this.data[size].equals(element)) { //Verifies if it was changed
                return true;
            }
        }

        return false; //If their is not enough capacity or the adding fails it returns false
        
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
}