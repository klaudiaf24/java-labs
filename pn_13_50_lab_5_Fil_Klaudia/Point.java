/**
* Klasa Point dziedziczaca po Shape
*
* @author Klaudia Fil
*/
class Point extends Shape {
    /** Chroniona dla dziedziczenia zmienna klasy Point  */
    protected double x;
    
    /** Chroniona dla dziedziczenia zmienna klasy Point  */
    protected double y;

    /**
    * Konstruktor klasy Point
    * @param a wzpolczedna x punktu
    * @param b wzpolczedna y punktu
    */
    Point(double a, double b) {
        x = a;
        y = b;
    }

    /**
    * Pobieranie nazwy klasy
    * @return nazwa Klasy
    */
    public String getName() {
        return "Point";
    }
   
    /**
    * Pobieranie parametrów klasy w stringu
    * @return parametry klasy
    */
    public String toString() {
        return ("[" + x + ", " + y + "]");
    }
        
    /**
    * Zwraca pole figury
    * @return pole
    */
    public double area(){
        return 0.0;
    }

    /**
    * Zwraca objetosc bryly
    * @return objetosc
    */
    public double volume(){
        return 0.0;
    }

}