//find max number using Streams

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        
        int max  = Arrays.stream(numbers).max().getAsInt();
        
        System.out.println("Maxnumber is "+max);
       
    }
}
