/**
 * OOPSBannerApp UC1 OOPS Banner Display Application
 * * This class demonstrates a simple Java application that displays the Object
 * Oriented Programming System OOPS acronym to the console.
 * * @author Sukanya
 * @version 1.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        // Step 1: Create Map for storing character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Define patterns

        patternMap.put('O', new String[]{
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        });

        patternMap.put('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[]{
                " **** ",
                "*     ",
                " **** ",
                "     *",
                " **** "
        });

        // Step 3: Word to print
        String word = "OOPS";

        // Step 4: Print banner using nested loops
        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int patternHeight = 5;

        for (int i = 0; i < patternHeight; i++) {

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }
}