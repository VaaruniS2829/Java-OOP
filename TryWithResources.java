/*The main idea of this program is to read input from the user using BufferedReader, 
convert that input (a string) into an integer, and ensure that the resource (BufferedReader) is properly closed — even if an error (like NumberFormatException) happens.
The program demonstrates how to 
safely take user input using BufferedReader
 handle possible exceptions, and ensure resources are closed properly using a finally block. */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TryWithResources
{
    public static void main(String [] args) throws IOException
    {
         BufferedReader bf=null;
         int num=0;
        try
        {
        //     InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf= new BufferedReader(in);
           bf= new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a number:");
          num = Integer.parseInt(bf.readLine());
            System.out.println("You entered: " + num);
           
        }
        finally{ // used for closing
           System.out.println("Hi (finally block executing)");
            if (bf != null) {
                bf.close();
                System.out.println("BufferedReader closed.");
        }
        // if you dont want catch block , you can use finally
        // finally block prints irrespective of exception
    }
 }
}
//  TryWithResources: if you dont want finally block
// try (BufferedReader bf= new BufferedReader(new InputStreamReader(System.in))){
 
//             int num = Integer.parseInt(bf.readLine());
//            System.out.println(num);
// }
