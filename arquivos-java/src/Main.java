import java.io.*;
import java.util.Locale;
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
//        String path = "C:\\Windows\\Temp\\teste-para-java.txt";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro " + e.getMessage());
//        }

        // Escrita em arquivos usando BufferedWrite e FileWrite
//        String path = "C:\\Windows\\Temp\\teste-para-escrita.txt";
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//            String[] lines = new String[] {"Olá", "Tudo", "Bem?"};
//
//            for (String line : lines) {
//                bw.write(line);
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Manipulação de pastas com File
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite o caminho do diretório: ");
//        String path = sc.nextLine();
//        File file = new File(path);
//
//        File[] folders = file.listFiles(File::isDirectory);
//        System.out.println(("Pastas"));
//        for (File folder : folders) {
//            System.out.println(folder);
//        }
//
//        File[] files = file.listFiles(File::isFile);
//        System.out.println(("Arquivos"));
//        for (File f : files) {
//            System.out.println(f);
//        }
//
//        boolean success = new File(path + "/subdiretorio").mkdir();
//        System.out.println("Diretório criado com sucesso:" + success);
//
//        sc.close();

        // Informações do arquivo
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o caminho do arquivo: ");
//        String path = sc.nextLine();
//        File file = new File(path);
//
//        System.out.println("Nome do arquivo: " + file.getName());
//        System.out.println("Pai do arquivo: " + file.getParent());
//        System.out.println("Caminho do arquivo: " + file.getPath());
//
//        sc.close();

        // Exercicio proposto
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do csv: ");
        String path = sc.nextLine();
        ReadFileCSV readFileCSV = new ReadFileCSV(path);
        readFileCSV.createFileOutResultCsv();

        sc.close();
    }
}