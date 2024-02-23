package homework_8;

public class MainForAppData {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 222, 123},
                {300, 400, 500},
                {600, 555, 777},
        };
        String filePath = "D:\\05 Programming\\aqa\\lesson7.csv";

        AppData appData = new AppData(header, data);

        appData.save(filePath);

        appData.load(filePath);
    }
}
