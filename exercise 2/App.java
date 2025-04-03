import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    private static String username_from_input;

    public static void main(String[] args) throws Exception {

        // System.out.println("enter your username:");

        //  Scanner loginScanner = new Scanner(System.in);

        // username_from_input = loginScanner.nextLine();

        // System.out.println("enter your password:");

        // String password_from_input = loginScanner.nextLine();

        // User me = new User(username_from_input, password_from_input);

        // System.out.println("your username is:" + username_from_input);
        // System.out.println("your password is:" + password_from_input);
        

        // File myfile = new File("account.txt");

        // if (myfile.exists()) {
        //     System.out.println("File exist");
        // }


        // Scanner fileScanner = new Scanner(myfile);

        // boolean accountexist  = false;
        // while(fileScanner.hasNextLine()) {

        //     String filedata = fileScanner.nextLine();
        //     System.out.println(filedata);


        //     String username_from_file = filedata.split(",")[0];
        //     System.out.println(username_from_file);
            
        //     String password_from_file = filedata.split(",")[1];
        //     System.out.println(password_from_file);


        //    if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
        //     //System.out.println("login successful!");
        //     accountexist= true;
        //     break;
        //    }
        // }

        // if (accountexist) {
        //     System.out.println("login successful, Hello:\n" + me.getUsername());
        // }
        // else{
        //     System.out.println("account does not exist");

        //     fileScanner.close();


            DataScientist dataScientist1= new DataScientist("John", null, null);
            
            //System.out.println(dataScientist1.name);
            System.out.println("my name is:" + dataScientist1.name);
            System.out.println("His Job is:" + dataScientist1.getWork());
            System.out.println("He Earns:" + dataScientist1.getSalary());


            Researcher researcher1= new Researcher("Jane", null, null);

            System.out.println("my name is:" + researcher1.name);
            System.out.println("Her Job is:" + researcher1.getWork());
            System.out.println("She Earns:" + researcher1.getSalary());

            
        }
    }
