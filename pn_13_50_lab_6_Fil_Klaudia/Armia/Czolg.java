package Armia;

import java.util.ArrayList;
import Armia.Rozkaz;

public class Czolg {
    private ArrayList<Rozkaz> _rozkazy;

    public Czolg() {
        _rozkazy = new ArrayList<Rozkaz>();
    }

    public String ostatniRozkaz() {
        String ostatni = _rozkazy.get(_rozkazy.size() - 1).getOrder();
        return "Ostatni rozkaz do mnie: " + ostatni;
    }

    public void setOrder(Rozkaz rozkaz) {
        this._rozkazy.add(rozkaz);
    }

    public String getAll() {
        String all = "";
        for (int i = 0; i < _rozkazy.size(); i++)
            all += _rozkazy.get(i).getOrder() + "\n";
        return all;
    }
}
