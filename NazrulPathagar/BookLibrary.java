
public class BookLibrary {
    String bookName;
    int bookID;
    String bookAuthor;

public void initialValue(String n, int i, String a){
    bookName=n;
    bookID=i;
    bookAuthor=a;
}

public int bookType(int i){
    if(i>=0 && i<=100){
        System.out.println("Type: Thriler");
        return 1;
    }
    else if(i>=101 && i<=200){
        System.out.println("Type: Action");
        return 2;
    }
    else if(i>200){
        System.out.println("Type: Literature");
    }
    else
        System.out.println("Book not found");
        return 0;
        
}

public double bookPrice(int bookID, int noOfBook){
    int i=bookType(bookID);
    double price;
        switch (i) {
            case 1:
                price=noOfBook*200;
                System.out.println("Total Price:"+price);
                break;
            case 2:
                price=noOfBook*300;
                System.out.println("Total Price:"+price);
                break;
            case 3:
                price=noOfBook*450;
                System.out.println("Total Price:"+price);
                break;
            default:
                break;
        }
    return 0;  
}

}