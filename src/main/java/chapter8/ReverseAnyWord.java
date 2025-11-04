package chapter8;

public class ReverseAnyWord {

    public static void main(String[] args) {
        String word = "Cancelation";
        String word2 = "HelloWorld";
        String word3 = word + word2;
        System.out.println("Original word: " + word3);
        reverse(word);

    }
   public static void reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed +word.charAt(i);
        }
        System.out.println("Reversed word: " + reversed);
    }

}
