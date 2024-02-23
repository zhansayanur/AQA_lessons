package homework_8;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i < header.length - 1) {
                    writer.write(";");
                }
            }
            writer.newLine();

            for (int[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    writer.write(String.valueOf(row[i]));
                    if (i < row.length - 1) {
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            header = headerLine.split(";");

            long rowCount = reader.lines().count() + 1;
            data = new int[(int) rowCount][header.length];

            try (BufferedReader dataReader = new BufferedReader(new FileReader(filePath))) {
                dataReader.readLine();
                String line;
                int rowIndex = 0;
                while ((line = dataReader.readLine()) != null) {
                    String[] values = line.split(";");
                    for (int i = 0; i < values.length; i++) {
                        data[rowIndex][i] = Integer.parseInt(values[i]);
                    }
                    rowIndex++;
                }
            }

            System.out.println("Содержимое файла:");
            for (String column : header) {
                System.out.print(column + "\t");
            }
            System.out.println();
            for (int[] row : data) {
                for (int value : row) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
