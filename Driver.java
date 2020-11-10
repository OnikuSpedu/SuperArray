import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray words = new SuperArray(10);
        String[] addWords0 = {"kani", "uni", "ebi", "Hey", "this", "is", "a", "test", "yay", "apples", "oranges", "bananas"};
        for(int i = 0; i < addWords0.length; i++){
            System.out.println("Added \"" + addWords0[i] + "\": " + words.add(addWords0[i]));
        }
        for(int i = 0; i < words.size(); i++){
            System.out.println("At index " + i + ": " + words.get(i));
        }
        System.out.println("Array Data: " + words);
        System.out.println("Empty?: " + words.isEmpty());
        words.clear();
        System.out.println("Cleared");
        System.out.println("Empty?: " + words.isEmpty());
        System.out.println("Array Data: " + words);

        for(int i = 0; i < addWords0.length; i++){
            System.out.println("Added \"" + addWords0[i] + "\": " + words.add(addWords0[i]));
        }

        System.out.println("Array Data: " + words);

        System.out.println("Inserted \"1\" at index 1");
        words.add(1, "1");
        System.out.println("Array Data: " + words);
        System.out.println("Contains \"1\": " + words.contains("1"));

        System.out.println("Removed element at index 1");
        words.remove(1);
        System.out.println("Array Data: " + words);
        System.out.println("Contains \"1\": " + words.contains("1"));

        System.out.println("Added \"last\": " + words.add("last"));
        System.out.println("Array Data: " + words);

        System.out.println("Removed element at index 0");

        System.out.println(words.remove(0));
        System.out.println("Array Data: " + words);

        System.out.println("indexOf Hey: " + words.indexOf("Hey"));

        System.out.println("toArray:");
        System.out.println(Arrays.toString(words.toArray()));

        words.clear();
        for(int i = 0; i < 10; i++){
            System.out.println(words.add("test"));
        }
        words.getCapacity();
        System.out.println(Arrays.toString(words.toArray()));
        System.out.println("lastIndexOf test: " + words.lastIndexOf("test"));
        
        SuperArray test0Arr = new SuperArray();
        for(int i = 0; i < 10; i++){
            System.out.println(test0Arr.add("test"));
        }
        SuperArray test1Arr = new SuperArray();
        for(int i = 0; i < 11; i++){
            System.out.println(test1Arr.add("test"));
        }
        SuperArray ranArr = new SuperArray();
        for(int i = 0; i < 10; i++){
            System.out.println(ranArr.add("ran"));
        }
        SuperArray randomArr = new SuperArray();
        String[] randomArrWords = {"A", "s", "ds", "A", "s", "ds", "A", "s", "ds", "a"};
        for(int i = 0; i < randomArrWords.length; i++){
            System.out.println(randomArr.add(randomArrWords[i]));
        }
        System.out.println(words +" and " + test0Arr + "equal?: " + words.equals(test0Arr));
        System.out.println(words +" and " + test1Arr + "equal?: " + words.equals(test1Arr));
        System.out.println(words +" and " + ranArr + "equal?: " + words.equals(ranArr));
        System.out.println(words +" and " + randomArr + "equal?: " + words.equals(randomArr));

        try {
            SuperArray negativeArray = new SuperArray(-1);
            System.out.println("Created a SuperArray with a negative initCapacity.");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Initial capacity cannot be negative.");
        }
        try {
            SuperArray setArray = new SuperArray(0);
            setArray.add("10");
            setArray.set(10, "0");
            System.out.println(setArray);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("initCapacity cannot be negative.");
        }
        try {
            SuperArray getArray = new SuperArray(0);
            setArray.add("10");
            setArray.get(10);
            System.out.println(setArray);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of bound.");
        }
        try {
            SuperArray removeArray = new SuperArray(0);
            setArray.add("10");
            setArray.remove(10);
            System.out.println(setArray);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of bound.");
        }
        try {
            SuperArray addArray = new SuperArray(0);
            setArray.add(20, "10");
            System.out.println(setArray);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of bound.");
        }
    }
}