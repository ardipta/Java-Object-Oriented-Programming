
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        BookLibrary obj=new BookLibrary();
        System.out.println("Enter Book Name:");
        String name= input.nextLine();
        System.out.println("Enter Book Author:");
        String author=input.nextLine();
        System.out.println("Enter number of Books:");
        int noOfBook=input.nextInt();
        System.out.println("Enter book ID:");
        int bookID=input.nextInt();
        obj.bookPrice(bookID, noOfBook);
    }
}
