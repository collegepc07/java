import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        List<String[]> data = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(new File("Students.csv"))) {
            // Read header
            if (scanner.hasNextLine()) {
                String[] header = scanner.nextLine().split(",");
                data.add(header);
            }
            
            // Read data rows
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Simple CSV split - assumes no commas within fields
                String[] row = line.split(",");
                data.add(row);
            }
            
            // Convert to 2D array
            String[][] dataArray = data.toArray(new String[0][]);
            
            // Print the array
            for (int i = 0; i < dataArray.length; i++) {
                System.out.println("\nRecord " + (i) + ":");
                for (int j = 0; j < dataArray[i].length; j++) {
                    System.out.println("  " + dataArray[0][j] + ": " + dataArray[i][j]);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
