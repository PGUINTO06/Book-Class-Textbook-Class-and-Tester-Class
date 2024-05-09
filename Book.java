/**
 * @author Preston Guinto
 * @version 9 May 2024
 */
public class Book{
    private String title;
    private double price;
    public Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }
    public String getTitle(){
        return title;
    }
    public String getBookInfo(){
        return title + "-" + price;
    }
}