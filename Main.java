import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("input.txt");  // this is your problem input as a File object
    Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object


    int answer = 0;
    while (sc.hasNext())  // as long as the Scanner has more lines to read from the file...
    {
      String line = sc.nextLine();  // gets the next line of input.  This is like "R802"

      // TODO: Write code that gets the turning direction from the line.  This should be "L" or "R"
String direction = line.substring(0, 1);

      // TODO: Write code that gets a substring of the line that contains only the numbers
      // For R802, this would be a String variable with the value "802"
String number = line.substring(1);

      // TODO: Using the parseInt method from the Integer class, convert the String "802" into an int
     // int x = integer.parseInt("802");
        int distance = Integer.parseInt(number);
      // TODO: Now that you have the turning direction, and the turning amount, see if the turn results in a 0
      int startposition = 50;

      if(direction.equalsto("L"))
      {
        position - distance;
      }

    }

    System.out.println("The password is " + answer);
    sc.close();
  }
}
