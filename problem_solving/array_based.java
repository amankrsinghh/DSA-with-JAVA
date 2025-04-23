package problem_solving;

import java.util.Arrays;

public class array_based {
    public static void main(String[] args) {

        System.out.println(anagram("aman","namb"));

    }
    public static Boolean anagram ( String s, String t){
        String st1 = s.replaceAll("//s"," ");
        String st2 = t.replaceAll("//s"," ");

        if(st1.length() != st2.length()){
            return  false;
        }
        else{
            char [] c1 = st1.toLowerCase().toCharArray();
            char [] c2 = st2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }

    }

}
