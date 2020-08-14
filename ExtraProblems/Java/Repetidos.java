import java.util.*;
import java.util.ArrayList;
public class Repetidos {

    public static List<Integer> RepeatedNumbers(List<Integer> a) {
        HashSet <Integer> numbers = new HashSet<>();
        
        HashSet<Integer> result = new HashSet<Integer>(); 

        ArrayList<Integer> go = new ArrayList<>();
        
        for (int i = 0; i < a.size(); i++){
            
            if( numbers.contains( a.get(i) ) ) {
                result.add( a.get(i) );
            }else{
                numbers.add( a.get(i) );
            }
        }

        for(int i : a){
            //System.out.println(i);
            if(result.contains(i) && go.indexOf(i) == -1){
                go.add(i);
            }
        }

        for(int i: go){
            System.out.println(i);
        }

    
        return go;

    }
        

    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(1);
        a.add(2);
        
        RepeatedNumbers(a);

    }
}