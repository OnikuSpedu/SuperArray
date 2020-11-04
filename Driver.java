public class Driver {
    public static void main(String[] args) {
        SuperArray words = new SuperArray();
        String[] addWords = {"kani", "uni", "ebi", "Hey", "this", "is", "a", "test", "yay", "apples", "oranges", "bananas"};
        for(int i = 0; i < addWords.length; i++){
            System.out.println("Added \"" + addWords[i] + "\": " + words.add(addWords[i]));
        }
        for(int i = 0; i < words.size(); i++){
            System.out.println("At index " + i + ": " + words.get(i));
        }
        System.out.println("Array Data: " + words.toString());
        System.out.println("Empty?: " + words.isEmpty());
        words.clear();
        System.out.println("Cleared");
        System.out.println("Empty?: " + words.isEmpty());
        System.out.println("Array Data: " + words.toString());
    }
}