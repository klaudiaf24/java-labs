// Proszę napisać "grę w życie". Parametry programu:

// java lab04 size_x size_y steps preset

// gdzie wszystkie parametry programu sš typu całkowitego i majš następujšce
// znaczenie:

// size_x, size_y - rozmiar planszy
// steps - liczba kroków symulacji do wykonania
// preset - w zależnoci od wartoci ustawia jednš z plansz predefiniowanych:
// 0 - losowy rozkład (przydatna będzie funkcja Math.random())
// 1 - na rodku planszy umieszczona jest "łód" (niezmiennik)

// .....
// .XX..
// .X.X.
// ..X..
// .....

// 2 - na rodku planszy umieszczony jest "blinker" (oscylator)

// .....
// ..X..
// ..X..
// ..X..
// .....

// 3 - na rodku planszy umieszczony jest "szybowiec" (jest to tzw "spaceship" -
// odleci on poza plansze)

// .....
// .XXX.
// .X...
// ..X..
// .....

// Ouptput z programu powinien wyglšdać jak następuje:

// ------ 1 --------
// .....X...........
// .....X...........
// ...X.............
// ...X.............
// ...X......X...X..
// ......X....X.....
// ------ 2 --------
// ....X....X....X..

// itd. przez "steps" kroków. Uwaga - 2 punkty rezerwuję sobie za ładnš
// "obiektywnoć" rozwišzania.

// Tym co nie pamiętajš przypominam, że w grze w życie każda komórka ma 8
// sšsiadów a reguły sš jak następuje:

// 1) Martwa komórka, która ma dokładnie 3 żywych sšsiadów, staje się żywa w
// następnej jednostce czasu (rodzi się)
// 2) Żywa komórka z 2 albo 3 żywymi sšsiadami pozostaje nadal żywa; przy innej
// liczbie sšsiadów umiera (z "samotnoci" albo "zatłoczenia").

// Miłej zabawy.

public class lab04 {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Zla liczba argumrntow");
            System.out.println("java lab04 size_x size_y steps preset");
            System.exit(1);
        }

        int size_x = Integer.parseInt(args[0]);
        int size_y = Integer.parseInt(args[1]);
        int steps = Integer.parseInt(args[2]);
        int preset = Integer.parseInt(args[3]);

        TheGameOfLife game = new TheGameOfLife(size_x, size_y, steps, preset);
        game.play();
    }
}