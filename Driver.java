import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray words = new SuperArray(10);
        String[] addWords = {"kani", "uni", "ebi", "Hey", "this", "is", "a", "test", "yay", "apples", "oranges", "bananas"};
        for(int i = 0; i < addWords.length; i++){
            System.out.println("Added \"" + addWords[i] + "\": " + words.add(addWords[i]));
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

        for(int i = 0; i < addWords.length; i++){
            System.out.println("Added \"" + addWords[i] + "\": " + words.add(addWords[i]));
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
        words.remove(0);
        System.out.println("Array Data: " + words);

        System.out.println("indexOf Hey: " + words.indexOf("Hey"));

        System.out.println("toArray:");
        System.out.println(Arrays.toString(words.toArray()));
    }
}