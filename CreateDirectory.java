import java.io.IOException;
import java.io.File;  
public class CreateDirectory{
    public static void main(String[] args)
    {
        String path="C:\\Users\\VAARUNI\\Desktop\\java";
        File file = new File(path);
        file.mkdir(); // creates new directory in the same path
        String[] myFiles = file.list();
        for(String myFile:myFiles)
        {
            System.out.println(myFile);
        }
        // file.delete(); it deletes the directory
    }
}
// the output is empty , because there is no files inside the directory
