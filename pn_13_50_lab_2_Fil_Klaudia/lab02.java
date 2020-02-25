/*Na tablicy napisane są dwa ciągi zer i jedynek. 
Chcemy teraz w każdym z tych ciągów skreślić 
niektóre cyfry tak, żeby pozostałe ciągi były 
takie same oraz były uporządkowane, tj. 
po pierwszym wystąpieniu jedynki nie może już 
wystąpić żadne zero (czyli np. 0000111111). 
Jaki najdłuższy ciąg może pozostać na tablicy? 

Na wejściu podane są długości obu ciągów oraz same ciągi np:

4 4
0 1 0 1
0 0 1 1

daje wynik:
3
[ bo taki sam ciąg to : 0 1 1 i powstaje on z pierwszego poprzez skreślenie ostatniego 0 oraz z drugiego poprzez skreślenie pierwszego zera]

inny przykład:
5 5
0 1 0 1 1
0 1 1 0 0
daje wynik:
3
[ ciąg: 0 1 1] */

import java.util.*;
public class lab02
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  int size1 = in.nextInt();
  int size2 = in.nextInt();

  //UZUPELNIENIE TABLIC STATYCZNYCH

  int[] tab1 = new int[size1];
  int[] tab2 = new int[size2];

  for(int i = 0 ; i < size1 ; i++)
    tab1[i] = in.nextInt();

    for(int i = 0 ; i < size2 ; i++)
    tab2[i] = in.nextInt();

    // MAX CIAG Z 1. //
    ArrayList<Integer> tab1ZeroMax = new ArrayList<Integer> (); // maximum 0 z 1 tablicy i dopełnienie 1
    ArrayList<Integer> tab1OneMax = new ArrayList<Integer> (); // maximum 1 z 1 tablicy i dopełnienie 0
    int i = 0;
    int j = size1 - 1;
    int lastIndex = 0;

    while (i < size1) { // maximum 0 z pierwszego ciagu
        if (tab1[i] == 0) {
                tab1ZeroMax.add(tab1[i]);
                lastIndex = i;
                i++;
            } else {
                i++;
            }
        }

        i = lastIndex;
        while (i < size1) { // maximum 0 dopelniamy 1
            if (tab1[i] == 1) {
                tab1ZeroMax.add(tab1[i]);
                lastIndex = i;
                i++;
            } else {
                i++;
            }
        }

    
        lastIndex = 0;
        while (j > -1) { // maximum 1 z pierwszego ciagu
            if (tab1[j] == 1) {
                tab1OneMax.add(tab1[j]);
                lastIndex = j;
                j--;
            } else {
                j--;
            }
        }

        j = lastIndex;
        while (j > -1) {
            if (tab1[j] == 1) { // maximum 1 dopelniam 0
                tab1OneMax.add(tab1[j]);
                lastIndex = j;
                j--;
            } else {
                j--;
            }
        }



    // MAX CIAG Z 2. //
    ArrayList<Integer> tab2ZeroMax = new ArrayList<Integer> (); // maximum 0 z 1 tablicy i dopełnienie 1
    ArrayList<Integer> tab2OneMax = new ArrayList<Integer> (); // maximum 1 z 1 tablicy i dopełnienie 0
    i = 0;
    j = size2 - 1;
    lastIndex = 0;

    while (i < size2) { // maximum 0 z drugiego ciagu
        if (tab2[i] == 0) {
                tab2ZeroMax.add(tab2[i]);
                lastIndex = i;
                i++;
            } else {
                i++;
            }
        }

        i = lastIndex;
        while (i < size2) { // maximum 0 dopelniamy 1
            if (tab2[i] == 1) {
                tab2ZeroMax.add(tab2[i]);
                lastIndex = i;
                i++;
            } else {
                i++;
            }
        }

    
        lastIndex = 0;
        while (j > -1) { // maximum 1 z pierwszego ciagu
            if (tab2[j] == 1) {
                tab2OneMax.add(tab2[j]);
                lastIndex = j;
                j--;
            } else {
                j--;
            }
        }

        j = lastIndex;
        while (j > -1) {
            if (tab2[j] == 1) { // maximum 1 dopelniam 0
                tab2OneMax.add(tab2[j]);
                lastIndex = j;
                j--;
            } else {
                j--;
            }
        }

    //Porownanie max ciagow zer i jedynek dla obu ciagow
    int maxSizeZero = 0;
    int maxSizeOne = 0;
    i = tab1OneMax.size() -1;
    j = tab2OneMax.size() -1;

    while(i > -1 && j > -1){  //max dlugosc ciagu gdy przewazaja 1
        if(tab1OneMax.get(i) == tab2OneMax.get(j)){
            i--;
            j--;
            maxSizeOne++;
        } 
        else if(tab1OneMax.get(i) < tab2OneMax.get(j)){
            j--;
        }
            else{
                i--;
            }
    }
    maxSizeOne -=1;
    // porównanie list z maximum 0
    i = 0;
    j = 0;
    while (i < tab1ZeroMax.size() && j < tab2ZeroMax.size()) {
        if (tab1ZeroMax.get(i) == tab2ZeroMax.get(j)) {
            i++;
            j++;
            maxSizeZero++;
        } 
        else if (tab1ZeroMax.get(i) > tab2ZeroMax.get(j)) {
            j++;
        } 
            else{ 
                i++;
            }
    }

    int maxSize = 0;
    maxSize = maxSizeOne > maxSizeZero ? maxSizeOne : maxSizeZero;

    System.out.println("\n\nMax dlugosc podciagu to: " + maxSize + "\n\n");

 }
}