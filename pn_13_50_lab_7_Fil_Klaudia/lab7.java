import java.util.*;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for(int i = 0; i < n*m ; i++)
            tab.add(scanner.nextInt());
        
        Test.test(n, m, tab);
    }
}
