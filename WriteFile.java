import java.io.FileWriter;

class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("example.txt");
      writer.write("Hello, this is Java file handling!");
      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
  }
}
