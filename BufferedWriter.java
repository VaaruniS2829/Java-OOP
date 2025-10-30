import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterAutoClose {
    public static void main(String[] args) {
        // try-with-resources automatically closes the writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            bw.write("Java I/O Example");
            bw.newLine();
            bw.write("Using BufferedWriter with try-with-resources.");
            System.out.println("Data written to notes.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
