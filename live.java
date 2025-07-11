import java.util.Random;

public class live {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100); // random number between 0-99
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        String randomWord = words[rand.nextInt(words.length)];
        System.out.println("Random number: " + randomNumber);
        System.out.println("Random word: " + randomWord);
    }
}
