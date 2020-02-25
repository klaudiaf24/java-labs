import java.util.*; 

class Student{
    private String _lname;
    private String _fname;
    private int _age;

    Student(){
        _lname = new String();
        _fname = new String();
        _age = 0;
    }

    public void setImie(String lname){
        this._lname = lname;
    }
    public void setNazwisko(String fname){
        this._fname = fname;
    }
    public void setWiek(int age){
        this._age = age;
    }

    public String getImie() {
        return this._lname;
    }
    public String getNazwisko(){
        return this._fname;
    }
    public int getWiek(){
        return this._age;
    }

    public String toString() {
		return _lname + " " + _fname + " " + _age;
	}
}

class SortByLnameASC implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return o1.getImie().compareTo(o2.getImie()); 
    } 
} 

class SortByLnameDESC implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return -o1.getImie().compareTo(o2.getImie()); 
    } 
} 

class SortByFnameASC implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return o1.getNazwisko().compareTo(o2.getNazwisko()); 
    } 
} 

class SortByFnameDESC implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return -o1.getNazwisko().compareTo(o2.getNazwisko()); 
    } 
} 

class SortByAgeASC implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return o1.getWiek() - o2.getWiek(); 
    } 
} 

class SortByAgeDECS implements Comparator<Student> 
{ 
    public int compare(Student o1, Student o2) 
    { 
        return -(o1.getWiek() - o2.getWiek()); 
    } 
} 