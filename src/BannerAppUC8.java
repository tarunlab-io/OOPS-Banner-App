import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }

    // Step 1: Build character pattern map
    static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " O ",
                "O O",
                " O "
        });

        map.put('P', new String[]{
                "PP ",
                "PP ",
                "P  "
        });

        map.put('S', new String[]{
                " SS",
                "S  ",
                " SS"
        });

        return map;
    }

    // Step 2: Render banner using map + loops
    static void renderBanner(String word, Map<Character, String[]> patternMap) {

        String border = String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");
        System.out.println(border);

        int height = patternMap.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder("* ");

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append(" ");
            }

            line.append("*");
            System.out.println(line);
        }

        System.out.println(border);
    }
}