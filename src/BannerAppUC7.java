import java.util.HashMap;
import java.util.Map;

public class BannerAppUC7 {

    public static void main(String[] args) {
        CharacterPatternMap patternMap = new CharacterPatternMap();
        printBanner("OOPS", patternMap);
    }

    // Banner renderer using stored character patterns
    static void printBanner(String word, CharacterPatternMap map) {

        String topBottom = String.join("", "*", "*", "*", "*", "*", "*", "*", "*");
        System.out.println(topBottom);

        StringBuilder line = new StringBuilder("* ");

        for (char ch : word.toCharArray()) {
            line.append(map.getPattern(ch)).append(" ");
        }

        line.append("*");
        System.out.println(line);

        System.out.println(line);
        System.out.println(topBottom);
    }

    // Static inner class (UC7 requirement)
    static class CharacterPatternMap {

        private final Map<Character, String> patternMap;

        CharacterPatternMap() {
            patternMap = new HashMap<>();
            patternMap.put('O', "O");
            patternMap.put('P', "P");
            patternMap.put('S', "S");
        }

        String getPattern(char ch) {
            return patternMap.getOrDefault(ch, "?");
        }
    }
}