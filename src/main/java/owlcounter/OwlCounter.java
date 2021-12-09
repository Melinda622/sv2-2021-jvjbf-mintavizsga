package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OwlCounter {

    Path path = Paths.get("src/test/resources/owls.txt");

    public List<String> readFromFile(Path path) {
        List<String> owls;
        try {
            owls = Files.readAllLines(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
        return owls;
    }


    public String[][] splitText(Path path) {
        String[][] output = new String[readFromFile(path).size()][2];
        for (int i = 0; i < readFromFile(path).size(); i++) {
            output[i] = readFromFile(path).get(i).split("=");
        }

        return output;
    }

    public int getNumberOfOwls(String county) {
        String[][] input = splitText(path);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i][0].equalsIgnoreCase(county)) {
                sum = Integer.parseInt(input[i][1]);
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return sum;
    }

    public int getNumberOfAllOwls() {
        String[][] input = splitText(path);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i][1]);

        }
        return sum;
    }
}
