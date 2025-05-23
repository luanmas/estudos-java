import java.io.*;

import java.util.ArrayList;

public class ReadFileCSV {
    String path;

    public ReadFileCSV(String path) {
        this.path = path;
    }

    private ArrayList<String> convertCsvToList () {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                lines.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return lines;
    }

    private void writeFileResult (ArrayList<String> lines) {
        File file = new File(path);
        boolean success = new File(file.getParent() + "\\resultado").mkdir();
        String sourceFolder = file.getParent() + "\\resultado\\resultado.csv";

        for (String line: lines) {
            String name = line.split(",")[0];
            Integer quantity = Integer.valueOf(line.split(",")[1]);
            Float price = Float.parseFloat(line.split(",")[2]);
            Product newProduct = new Product(name, price, quantity);
            Float total = newProduct.getTotal();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFolder, true))) {
                bw.write(name + "," + total);
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Erro ao escritura: " + e.getMessage());
            }
        }
    }

    public void createFileOutResultCsv () {
        ArrayList<String> productList = this.convertCsvToList();
        writeFileResult(productList);
        System.out.println("Arquivo gerado com sucesso!");
    }
}
