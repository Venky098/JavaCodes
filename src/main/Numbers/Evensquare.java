
import java.util.*;
import java.util.stream.*;
class Evensquare {
    public static void main(String[] args) {
       List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       
       List<Integer> even = num.stream().filter(n->n%2==0).toList();


         List<Integer> evenusingand = num.stream().filter(n->(n&1)==0).toList();
       List<Integer> evensq = even.stream().map(n->n*n).collect(Collectors.toList());
       System.out.println(even.toString());
        System.out.println(evenusingand.toString());
       System.out.println(evensq.toString());
}

}
