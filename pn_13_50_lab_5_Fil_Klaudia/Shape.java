/**
* Abstrakcyjna klasa Shape
*
* @author Klaudia Fil
*/

abstract class Shape {
    /**
    * Pobieranie nazwy klasy
    * @return nazwa Klasy
    */
    public String getName(){
        return "Shape";
    }

    /**
    * Pobieranie parametrów klasy w stringu
    * @return parametry klasy
    */
    public abstract String toString();

    /**
    * Zwraca pole figury
    * @return pole
    */
    public abstract double area();

    /**
    * Zwraca objetosc bryly
    * @return objetosc
    */
    public abstract double volume();
}