public class SimpleArray
{
    public static void main(String[] args)
    {
        String[] letters = new String[]{"A", "B", "C","D","E"};

        String letter = letters[3];

        System.out.println(letter);

        int numberOfElements = letters.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
