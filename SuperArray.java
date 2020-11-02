/**
 * SuperArray
 */
public class SuperArray {

    private String [] data;
    private int size; //The current size

    public SuperArray() {
        this.data = new String[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }
}