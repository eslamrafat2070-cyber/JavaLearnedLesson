package chapter8;

public class TextProcessor {
   public  static void main(String[] args) {
       var text= "I love Egypt Wallahy";

       String tempString;
         tempString= text.replace(" ","");
            System.out.println("Text without spaces: "+ tempString);// lengh
            System.out.println("Length of text without spaces: "+ tempString.length());// lengh
       ///  or we can make that
       String[] words = text.split(" ");
       int wordsLengh=0;
       for (String word: words) {
           wordsLengh = word.length() + wordsLengh;
           System.out.println(word);
       }
       System.out.println("Length of text without spaces using split: "+ wordsLengh);
    }




}
