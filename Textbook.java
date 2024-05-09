/**
 * @author Preston Guinto
 * @version 9 May 2024
 */
public class Textbook extends Book
{
    //You will write a class 'Textbook', which is a subclass of 'Book'
    //A 'Textbook' has an edition number, which is a positive niteger used to indentify different versions of the
    //book. The 'getBookInfo' method, when called on a 'Textbook', returns a string that also includes the
    //edition information, as shown in the example.
    
    //Information about the book title and price must be maintained in the 'Book' class. Information about the
    //edition must be maintained in the 'Textbook' class.
    
    //The 'Textbook' class contains an additional method, 'canSubstituteFor', which returns 'true' if 
    //a 'Textbook' is a valid substitute for another 'Textbook' and returns 'false' otherwise. The current
    //'Textbook' is a valid substitute for the 'Textbook' referenced by the parameter of the
    //'canSubstituteFor' method if the two 'Textbook' objects have the same title and if the edtion of the
    //current 'Textbook' is greater than or equal to the edition of the parameter.
}