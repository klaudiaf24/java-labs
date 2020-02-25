/**
* Klasa Square dziedziczaca po Point
*
* @author Klaudia Fil
*/
class Square extends Point {
    /** Chroniona dla dziedziczenia zmienna klasy Point  */
    protected double side;

    /**
    * Konstruktor klasy Square
    * @param a wzpolczedna x punktu
    * @param b wzpolczedna y punktu
    * @param s dlugosc boku kwadratu
    */
    Square(double s, double a, double b) {
        super(a, b);
        side = s;
    }

    /**
    * Pobieranie nazwe klasy
    * @return nazwa Klasy
    */
    public String getName() {
        return "Square";
    }

    /**
    * Pobieranie parametrów klasy w stringu
    * @return parametry klasy
    */
    public String toString() {
        return ("Corner = " + super.toString() + "; side = " + side);
    }

    /**
    * Zwraca pole figury
    * @return pole
    */
    public double area() {
        return side * side;
    }

    /**
    * Zwraca objetosc bryly
    * @return objetosc
    */
    public double volume() {
        return 0.0;
    }

}