import java.util.Random;

public class TheGameOfLife {

    private int xSize;
    private int ySize;
    private int step;

    private int tab[][];
    private int nextTab[][];

    public TheGameOfLife(int size_x, int size_y, int steps, int preset) {
        xSize = size_x;
        ySize = size_y;
        step = steps;

        tab = new int[ySize][xSize];

        switch (preset) {
        case 0: {
            int range = xSize * ySize + 1;
            int x, y;
            int num = (int)(Math.random() * range);  // ilosc losowych zmiennych
            for (int i = 0; i < num; i++) {
                x = (int)(Math.random() * xSize);
                y = (int)(Math.random() * ySize);
                tab[y][x] = 1;
            }
            break;
        }
        case 1: {
            tab[(ySize / 2) -1] [(xSize / 2) - 1]   = 1;
            tab[(ySize / 2) -1] [(xSize / 2)]       = 1;
            tab[(ySize / 2) ]   [(xSize / 2) - 1]   = 1;
            tab[(ySize / 2) ]   [(xSize / 2) + 1]   = 1;
            tab[(ySize / 2) + 1][(xSize / 2)]       = 1;
            break;
        }
        case 2: {
            tab[(ySize / 2) - 1][(xSize / 2)] = 1;
            tab[(ySize / 2)]    [(xSize / 2)] = 1;
            tab[(ySize / 2) + 1][(xSize / 2)] = 1;
            break;
        }
        case 3: {
            tab[(ySize / 2) - 1][(xSize / 2)]       = 1;
            tab[(ySize / 2) - 1][(xSize / 2) - 1]   = 1;
            tab[(ySize / 2) - 1][(xSize / 2) + 1]   = 1;
            tab[(ySize / 2)]    [(xSize / 2) - 1]   = 1;
            tab[(ySize / 2) + 1][(xSize / 2)]       = 1;
            break;
        }
        default: {
            System.out.println("Nie ma takiej opcji");
            System.exit(1);
        }
        }
    }


    public void printTab() {
        for (int i = 0; i < ySize; i++) {
            for (int j = 0; j < xSize; j++) {
                if (tab[i][j] == 1)
                    System.out.print("x");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }

    public void update() {
        int neighbour = 0;

        nextTab = new int[ySize][xSize];

        for (int i = 1; i < ySize - 1; i++) {
            for (int j = 1; j < xSize - 1; j++) {

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (tab[k][l] == 1)
                            neighbour++;
                    }
                }
                if (tab[i][j] == 1) {
                    neighbour--;
                    if (neighbour == 2 || neighbour == 3)
                        nextTab[i][j] = 1;
                } 
                else if (tab[i][j] == 0 && neighbour == 3)
                    nextTab[i][j] = 1;

                neighbour = 0;

            }
        }
        tab = nextTab;
    }

    public void play() {
        for (int i = 1; i <= step; i++) {
            for(int j = 0 ; j < ySize/2 ; j++)
                System.out.print("-");
            System.out.print(i);
            for(int j = 0 ; j < ySize/2 ; j++)
                System.out.print("-");
            System.out.println();
            printTab();
            update();
        }
    }

}