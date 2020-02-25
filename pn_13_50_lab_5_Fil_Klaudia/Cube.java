/**
* Klasa Cube dziedziczaca po Square
*
* @author Klaudia Fil
*/
class Cube extends Square {
    /** Chroniona dla dziedziczenia zmienna klasy Point  */
    protected double depth;

    /**
    * Konstruktor klasy Cube
    * @param a wzpolczedna x punktu
    * @param b wzpolczedna y punktu
    * @param d dlugosc boku szescianu
    */
    Cube(double d, double a, double b) {
        super(d, a, b);
        depth = d;
    }

    /**
    * Pobieranie nazwy klasy
    * @return nazwa Klasy
    */
    public String getName() {
        return "Cube";
    }
    
    /**
    * Pobieranie parametrów klasy w stringu
    * @return parametry klasy
    */
    public String toString() {
        return (super.toString() + "; depth = " + depth);
    }

    /**
    * Zwraca pole figury
    * @return pole
    */
    public double area() {
        return 6.0 * super.area();
    }

    /**
    * Zwraca objetosc bryly
    * @return objetosc
    */
    public double volume() {
        return depth * super.area();
    }
}