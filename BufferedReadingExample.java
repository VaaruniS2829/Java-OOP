mport java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader; 

class BufferReader{
    public static void main(String[] args) throws  IOException
    {
        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);

        // int num = bf.readLine(); it prints only string
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        // buffer reader can take input from anywher not only from keyboard
        // it takes from keyboard , file , network...
        // buffer reader whenever we are using ,it is a resource  , why?
        //because , lets say u r try to read from file , ofcourse file is a resource and when you open the file ,  it is ur responsible to
        // close the file , close the network , close the databse connectivity.
        bf.close(); // close it , other wise , it leaks the data

    }
}
