import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leitura de arquivo usando File e Scanner
//        File file = new File("C:\\Windows\\Temp\\teste-para-java.txt");
//        Scanner sc = null;
//
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Erro " + e.getMessage());
//        } finally {
//            if (sc != null) {
//                sc.close();
//            }
//        }


        // Leitura de arquivo usando FileReader e BufferedReader
//        String path = "C:\\Windows\\Temp\\teste-para-java.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro " + e.getMessage());
//        } finally {
//            try {
//                if (fr != null) {
//                    fr.close();
//                }
//
//                if (br != null) {
//                    br.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // Leitura com FileReader e BufferedReader usando try resources
        String path = "C:\\Windows\\Temp\\teste-para-java.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }


    }
}