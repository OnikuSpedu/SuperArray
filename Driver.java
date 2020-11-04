public class Driver {
    public static void main(String[] args) {
        SuperArray words = new SuperArray();
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
        }
        System.out.println("Array Data: " + words.toString());
        System.out.println("Empty?: " + words.isEmpty());
        words.clear();
        System.out.println("Cleared");
        System.out.println("Empty?: " + words.isEmpty());
        System.out.println("Array Data: " + words.toString());
    }
}