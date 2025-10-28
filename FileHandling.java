import java.io.File;

public class FileHandling
    {
    public static void main(String[] args)
    {
        String path="C:\\Users\\VAARUNI\\Desktop\\data.txt";
        File file = new File(path);
       System.out.println(file.exists()); // checks if file exists or not
       System.out.println(file.canRead());// checks whether we can read or not
       System.out.println(file.canWrite()); // checks whether we can write or not
       System.out.println(file.getName()); // it prints the name of file
       System.out.println(file.getParent()); // it prints the path of parent folder
       System.out.println(file.getAbsolutePath()); // it is used to get complete path or directory , i.e.., it return only string
       System.out.println(file.getAbsoluteFile()); // (format is change) returns a file object i.e.., we'll get actuall file
       System.out.println(file.isFile()); // it checks if it is file or directory
       System.out.println(file.isDirectory()); // it checks if it is file or directory
    }
}
