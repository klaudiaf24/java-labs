import java.util.*;

public class Test {
    public static void test(int n, int m, ArrayList<Integer> tab) {
    ArrayList<Boolean> el = new ArrayList<Boolean>();
    String toReturn = "TAK";

    for(int i = 0; i < n * n ; i++) 
        el.add(false);
    
    for(int i = 0 ; i < n ; i++)
        for(int j = 0 ; j < n ; j++) 
            el.set(i*j + j, true);

    for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < (n/2) ; j++){
            int row = tab[i * j + j] - 1;
            for(int k = (n/2) ; k < n ; k++){  
                int col = tab[i * k + k] - 1;
                el.set(row * col + row,true);
                el.set(row * col + col,true);
            }
        }
    }
    
    
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            if(el[i * j + j] == false)
             toReturn = "NIE";
        }
    }

    System.out.println(toReturn);
}
