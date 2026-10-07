import java.io.*;
import java.util.*;
class Hobby{
public static void main(String []arg){
  
Scanner book=new Scanner(System.in);
System.out.println("Enter your Favorite Book");
String fav=book.nextLine();
System.out.println("Enter Author");
String author=book.nextLine();
System.out.println("Enter a Release Date");
int date=book.nextInt();

System.out.println("Book Name: "+ fav);
System.out.println("Author Name: "+ author);
System.out.println("Release Date: "+ date);


System.out.println("Enter the Principle Amount");
int principle=book.nextInt();

System.out.println("Enter the Principle year");
int year=book.nextInt();

System.out.println("Enter the Principle Interst");
int rate=book.nextInt();

int amount=(principle*year*rate)/100;
System.out.println("Total Amount is "+amount);
}

}