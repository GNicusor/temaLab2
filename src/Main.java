import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu judetul cautat:");
        String judetCautat = input.nextLine();
        String[] judete = loadArray("judete.txt");
        Arrays.sort(judete);
        System.out.println(Arrays.binarySearch(judete, judetCautat));
        for (String judet : judete) {
            System.out.println(judet);
        }
    }

    public static String[] loadArray(String filename) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File(filename));
        int count = 0;

        while (inputFile.hasNextLine()) {
            inputFile.nextLine();
            count++;
        }
        inputFile.close();
        String[] array = new String[count];
        inputFile = new Scanner(new File(filename));
        for (int i = 0; i < count; i++) {
            array[i] = inputFile.nextLine();
        }
        inputFile.close();
        return array;
    }
}