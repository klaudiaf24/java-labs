package Armia;

import java.util.ArrayList;
import Armia.Czolg;

public class CentrumDowodzenia {
    private ArrayList<Czolg> _czolgi;

    public CentrumDowodzenia() {
        _czolgi = new ArrayList<Czolg>();
    }

    public void zarejestrujCzolg(Czolg tank) {
        _czolgi.add(tank);
    }

    public void wydajRozkaz(String num, Rozkaz rozkaz) {
        int number = Integer.parseInt(num) - 1;
        _czolgi.get(number).setOrder(rozkaz);
    }

    public String toString() {
        String wyn = "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";
        for (int i = 0; i < _czolgi.size(); i++) {
            wyn += "Czolg nr " + (i + 1) + " otrzymal rozkazy:\n" + _czolgi.get(i).getAll() + "\n";
        }
        return wyn;
    }
}
