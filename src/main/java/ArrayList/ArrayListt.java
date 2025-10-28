package ArrayList;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class ArrayListt {


    @Test
    public void case1()
    {

        String y ;
        y="8";

        String[] K = new String[9];
        K[1]="ali";
        System.out.println(K[1]);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Sara");
        names.add("Omar");
        names.remove("Ali");

        System.out.println(names.get(1));


    }

}
