import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double massiv[] = {1.5, -4.5, 8.5, -2.5, 5.5, 6.5, 9.5, -5.5, 10.5, 11, 12.5, -13.5, 14.5, 15.5};
        boolean buulean = false;
        double douuble = 0;
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
            if (massiv[i] < 0) {
                buulean = true;
            }
            if (buulean && massiv[i] > 0) {
                count++;
                douuble += massiv[i];
            }
        }

        System.out.println(douuble / count);
        for (int a = 0; a < massiv.length; a++) {
            for (int g = 0; g < massiv.length; g++) {
                if (massiv[a] < massiv[g]) {
                    double gfj = massiv[a];
                    massiv[a] = massiv[g];
                    massiv[g] = gfj;

                    System.out.println();
                }


            }
            System.out.println();
        }

        for (int f = 0; f < massiv.length; f++) {
            System.out.println(massiv[f]);

        }
    }
}


