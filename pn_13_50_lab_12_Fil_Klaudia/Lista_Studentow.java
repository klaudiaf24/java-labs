import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Lista_Studentow{
    private ArrayList<Student>  _list = new ArrayList<Student>();

    Lista_Studentow(){}
    public void add(Student stud){
        this._list.add(stud);
    }

    public void add(String lname, String fname, int age){
        Student newStud = new Student();
        newStud.setImie(lname);
        newStud.setNazwisko(fname);
        newStud.setWiek(age);

        this._list.add(newStud);
    }
    
    public void sort_imie_rosnaca(){
        Collections.sort(_list, new SortByLnameASC());
    }
    public void sort_imie_malejaca(){
        Collections.sort(_list, new SortByLnameDESC());
    }

    public void sort_nazwisko_rosnaca(){
        Collections.sort(_list, new SortByFnameASC());
    }
    public void sort_nazwisko_malejaca(){
        Collections.sort(_list, new SortByFnameDESC());
    }

    public void sort_wiek_rosnaca(){
        Collections.sort(_list, new SortByAgeASC());
    }
    public void sort_wiek_malejaca(){
        Collections.sort(_list, new SortByAgeDECS());
    }    
    
    public void wypisz_wszystkich(){
        for (int i = 0; i < this._list.size(); i++)
            System.out.println(this._list.get(i));
    }
}

