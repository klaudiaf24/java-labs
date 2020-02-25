import java.io.*;
import java.util.*;

public class lab10{
    public static void main (String[] args){    
        ArrayList<Pair> dict = new ArrayList<Pair>();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("dictionary.txt"));
            String line;
            while( (line = buffer.readLine() ) != null ){
                    String[] word = line.split(" ");
                    dict.add(new Pair(word[0], word[1]));
                }
                
                buffer.close();
        }
        catch(Exception e)  {   System.out.println(e);  }

        if((args.length > 0) && (args.length < 4)){
            // znajdowanie odpowiednika w drugim jezyku
            if(args.length == 1){
                int num = 0;
                for(Pair p : dict){
                    num++;
                    if(args[0].equals(p.getFirst())){
                        System.out.println(p.getSecound());
                        break;
                    }
                    if(args[0].equals(p.getSecound())){
                        System.out.println(p.getFirst());
                        break;
                    }
                    if(num == dict.size()){
                        System.out.println("Brak słowa w słowniku!");
                        break;
                    }
                }
            }

            // usuwanie rekordu
            if(args.length == 2){
                if(args[0].equals("del")){
                    int num = 0;
                    for(Pair p : dict){
                        if(args[1].equals(p.getFirst()) || args[1].equals(p.getSecound())){
                            System.out.println("Poprawnie usnieto: " + args[1]);
                            dict.remove(num);
                            break;
                        }
                        if(num == dict.size() - 1){
                            System.out.println("Brak słowa w super słowniku!");
                            break;
                        }
                        num++;
                    }
                }
            else
                System.out.println("Brak polecenia!");
            }

            // dodawanie rekordu
            if(args.length == 3){
                if(args[0].equals("add")){
                    Pair newPair = new Pair(args[1], args[2]);
                    boolean tof = false;
                    for(Pair p : dict){
                        if  (     
                            (p.getFirst().equals(newPair.getFirst()) || p.getFirst().equals(newPair.getSecound()))
                            &&
                            (p.getSecound().equals(newPair.getFirst()) || p.getSecound().equals(newPair.getSecound()))
                            )
                        {
                            tof = true;
                        }
                    }
                    if(tof)   
                        System.out.println("Podana para słów istnieje już w słowniku!");
    
                    else{
                            System.out.println("Poprawnie dodawno: " + args[1] + " " + args[2]);
                            dict.add(new Pair(args[1], args[2]));
                        }
                }
                else
                    System.out.println("Brak polecenia!");
            }

            // nadpisanie pliku
            if(args.length != 1){
                try{
                    FileWriter writer = new FileWriter("dictionary.txt", false);    
                    for(int i = 0; i < dict.size(); ++i){
                        writer.write(dict.get(i).getFirst() + " " + dict.get(i).getSecound() + "\n");
                    }

                    writer.close(); 
                }
                catch(Exception e){System.out.println(e);}
            }
        }
        else {
            System.out.println("Zla ilosc argumentow!\nMozliwe 1 2 lub 3 argumenty!");
        }
    }
    
}