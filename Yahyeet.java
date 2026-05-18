import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Yahyeet
{
    /**
     * Precondition: args[0] is the name of a file and 1 <= args[1] <= 10
     */
    public static void main(String[] args) throws IOException
    {
        if (args.length >= 2)
        {
            System.out.println("You entered\nargs[0]: " + args[0] + "\nargs[1]: " + args[1]);


            // TO DO: Calculate student average scores here
            File avg = new File(args[0]);
            Scanner scan = new Scanner(f);
            int numStudents = Integer.parseInt(arg[1]);
            double avg = 0.0;
            int count = 0;
            for (int i = 0; i <numStudents; i++)
            {
                avg += scan.nextInt();
                count++;
            }
            scan.close();
            System.out.println(avg/count);
        }
        else
        {
            System.out.println("Not enough inputs entered.\nFormat: java Yahyeet filename numValues");
        }
    }
}