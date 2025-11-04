package chapter8;

public class PracticeOnStringClass {


    public static void main(String[] args) {

        char[] stringArray = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: ");
        for(char c :stringArray)
            System.out.println(c);
        //--------------------------------
  // Training on String class metods
        String name="IslamRaafat";
        String name2 ="";
        System.out.println("Length of the string: " + name.length());
        System.out.println("Character at index 5: " + name.charAt(5));
        //check if the String Contains a sequence of characters
        System.out.println("Contains 'Raaf': " + name.contains("K"));
        System.out.println("Equals ignore case 'islamraafat': " + name.equalsIgnoreCase("islamraafat"));
        System.out.println(" check if ends with " +name.endsWith("at"));
        System.out.println(" check if starts with " +name.startsWith("Isl"));
        System.out.println(" equal to "+name.equals("IslmRaafat") );
        System.out.println(" index of character 'R'  "+name.indexOf('j') );
        //Is empty
        System.out.println(" is empty  "+name2.isEmpty() );
        System.out.println("//Formate"+String.format(" My name is %s and my age is %d ","Islam",23) );

        String newString = String.format(" my name is %s " +
                "and my salary is %.2f" +
                " and my age is %d ", "Islam", 5000.567, 23);
        System.out.println(newString);
        //---------------
        String num = "12345";
        System.out.println(num.matches("[0-9]+"));
        System.out.println("is matches regex  "+num.matches("\\d+") );

        //----------------
        System.out.println(num);
        System.out.println("replace just the char  "+ name.replace('a','o') );
        System.out.println("replace all to replace with more than one word "+
                name.replaceAll("a","oo") );
        System.out.println(name);
        /// ////////////

        System.out.println("substring from index 3 to 7  "+ name.substring(3,7) );
        System.out.println("to lower case  "+ name.toLowerCase() );
        System.out.println("to upper case  "+ name.toUpperCase() );
        System.out.println("value of  "+ String.valueOf(500+20) );

        // split is to split the word into array of strings
        String  sentence = "Welcome to Java programming";
        String[] words = sentence.split(" ");
        // pring the array of words
        System.out.println("Splitted words: ");
        for(String w : words) {
            System.out.println(w);    }

    }
    }

