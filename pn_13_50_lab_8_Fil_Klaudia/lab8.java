import java.util.*;
import java.io.*;
import java.lang.*;

public class lab8 {
    public static void main(String[] args) throws Exception {
        try{
        if( args.length != 2) throw new Exception();
        
        double sum = 0.0;
        int all = 0;
        double a = 0.0;
        try{
 
            double temp;
            Scanner scanner = new Scanner(new File(args[0]));
            
            while(scanner.hasNextDouble()){
                temp = scanner.nextDouble();
                if ( (temp == Double.POSITIVE_INFINITY) || (temp == Double.NEGATIVE_INFINITY) ) 
                    {throw new RuntimeException();}
                sum += temp;
                all++;
            }

            if(all == 0) {throw new ArithmeticException();}
            a = sum / all; 
        }         
        catch(FileNotFoundException e) { System.out.println("Nie ma takiego pliku");}        
        catch(ArithmeticException e){ System.out.println("Brak liczb w pliku");}     
        catch(RuntimeException e){System.out.println("Jedna z wartości to nieskończoność!"); }
        
        finally{
           try{ 
            FileWriter filewr = new FileWriter(new File(args[1]));
            filewr.write(String.valueOf(a)); 
            filewr.close();  
           }
            catch(IOException e){ System.out.println("Błąd przy zapisie do pliku");}  
            catch(ArrayIndexOutOfBoundsException e){System.out.println("Brak argumentów");}   
        }

        }
        catch(Exception e){ System.out.println("Podana została zła liczba argumentów!"); }
    }
}