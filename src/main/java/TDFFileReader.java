import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {

    private String fileName;

    public TDFFileReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Cyclist> readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Cyclist> cyclists = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            String name = parts[1];
            String team = parts[2];

            cyclists.add(new Cyclist(name, team));
        }
        scanner.close();

        return cyclists;
    }
}
