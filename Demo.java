public class Demo{
    public static void removeDuplicates(SuperArray s){  
        for (int i = s.size() - 1; i < s.size() && i >= 0; i--) {
          if (s.indexOf(s.get(i)) != i) {
            s.remove(i);
          }
        }
    }
    
    public static void main(String[]args){
      SuperArray words = new SuperArray();
      //grouped to save vertical space
      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro"); 
      removeDuplicates(words);
      System.out.println(words);
      SuperArray arrayA = new SuperArray();
      arrayA.add("9"); arrayA.add("1"); arrayA.add("2"); arrayA.add("2"); arrayA.add("3"); arrayA.add("4");
      SuperArray arrayB = new SuperArray();
      arrayB.add("0"); arrayB.add("4"); arrayB.add("2"); arrayB.add("2"); arrayB.add("9");
      System.out.println(findOverlap( arrayA, arrayB ));

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

      System.out.println(zip(ranArr, test0Arr));
      System.out.println(zip(ranArr, test1Arr));
      System.out.println(zip(randomArr, test0Arr));
    }
  }