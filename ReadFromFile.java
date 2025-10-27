import java.io.File;
import java.util.Scanner;

class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File("example.txt");
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) {
        System.out.println(reader.nextLine());
      }
      reader.close();
    } catch (Exception e) {
      System.out.println("An error occurred.");
    }
  }
}
