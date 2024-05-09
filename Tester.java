
/**
 * @author Preston Guinto
 * @version 9 May 2024
 */
public class Tester
{
    public static void main(String[] args)
    {
        Textbook biologyBasics = new Textbook("Biology Basics", 25.50, 1);
        Textbook chemistryEssentials = new Textbook("Chemistry Essentials", 30.75, 3);
        Textbook mathematicsFundamentals = new Textbook("Mathematics Fundamentals", 22.99, 2);
        Textbook englishLiteratureAnthology = new Textbook("English Literature Anthology", 18.95, 4);
        Textbook historyAncientCivilizations = new Textbook("History: Ancient Civilizations", 35.20, 1);
        Textbook computerSciencePrinciples = new Textbook("Computer Science Principles", 28.60, 2);
        Textbook economicsMicroMacro = new Textbook("Economics: Micro and Macro", 32.00, 3);
        Textbook psychologyUnderstandingMind = new Textbook("Psychology: Understanding the Mind", 29.99, 1);
        Textbook sociologyContemporaryPerspectives = new Textbook("Sociology: Contemporary Perspectives", 27.75, 2);
        Textbook artHistoryRenaissanceModern = new Textbook("Art History: Renaissance to Modern", 24.50, 1);
        Textbook economicsMicroMacro4 = new Textbook("Economics: Micro and Macro", 32.00, 4);
        Textbook chemistryEssentials2 = new Textbook("Chemistry Essentials", 30.75, 2);
        Textbook biologyBasics5 = new Textbook("Biology Basics", 25.50, 5);
        System.out.println("mathematicsFundamentals.getEdition() should return '2', your code returns: " + mathematicsFundamentals.getEdition());
        System.out.println("biologyBasics.getBookInfo() should return 'Biology Basics-25.5-1', your code returns: " + biologyBasics.getBookInfo());
        System.out.println("chemistryEssentials.canSubstituteFor(chemistryEssentials2) should return 'true', your code returns: " +  chemistryEssentials.canSubstituteFor(chemistryEssentials2));
        System.out.println("economicsMicroMacro.canSubstituteFor(economicsMicroMacro4) should return 'false', your code returns: " +  economicsMicroMacro.canSubstituteFor(economicsMicroMacro4));
        System.out.println("biologyBasics.canSubstituteFor(biologyBasics5) should return 'false', your code returns: " +  biologyBasics.canSubstituteFor(biologyBasics5));
    }
}
