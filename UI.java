import java.util.Scanner;
public class UI implements Interactable
{
    String info;
    String input;
    public UI()
    {

    }
    public String getUserInput()
    {
        // create scanner to read user input
        Scanner scan = new Scanner(System.in);
        // send inputted information to local variable String input
        input = scan.nextLine();
        // set info for getLastEvent to return when called
        info = "getUserInput" + "user inputted: " + input;
        // return user input
        return input;
    }
    public String getLastEvent()
    {
        // return info set by other methods
        return info;
    }
}