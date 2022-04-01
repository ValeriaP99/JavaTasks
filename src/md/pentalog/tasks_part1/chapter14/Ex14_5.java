package md.pentalog.tasks_part1.chapter14;

// Random Sentences
// article - noun - verb - preposition - article - noun
import java.security.SecureRandom;
import java.util.Locale;

public class Ex14_5 {
    public static final String[] articles = {"the", "a", "one", "some", "any"};
    public static final String[] nouns = {"boy", "girl", "dog", "town", "car"};
    public static final String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    public static final String[] prepositions = {"to", "from", "over", "under", "on"};

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String sentence = new String();

        for(int i = 0; i < 20; i++){
            int indexArticle = random.nextInt(4);
            int indexNoun = random.nextInt(4);
            int indexVerb = random.nextInt(4);
            int indexPreposition = random.nextInt(4);

            System.out.print(" "+sentence.concat((getFormatWord(articles[indexArticle]))).concat(" ")
                    .concat(nouns[indexNoun]).concat(" ").concat(verbs[indexVerb]).concat(" ")
                    .concat(prepositions[indexPreposition]).concat(" ").concat(articles[indexArticle])
                    .concat(" ").concat(nouns[indexNoun]));
            if(i == 19){
                System.out.print(".");
            }
            System.out.println();

        }
    }

    public static String getFormatWord(String word){
        String format;
        String firstWord = String.valueOf(word.charAt(0));
        String lastWords = word.substring(1);
        format = firstWord.toUpperCase(Locale.ROOT) + lastWords;

        return format;
    }
}
