import java.util.*;

public class Main
{

     public static void main(String []args)
     {
     
       
        Integer[] arr = {1,1,1,2,3,3};

        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
     
        System.out.print("This is a List " + list);
        System.out.println();
        
        Set<Integer> set   = new HashSet<>(list); 
        Set<Integer> set_2 = new HashSet<>(Arrays.asList(arr)); 
        
        System.out.print("This is a set " + set);
        System.out.println();
        
        System.out.print("This is a set 2 " + set_2);
        System.out.println();
        
      

     }

    
}
