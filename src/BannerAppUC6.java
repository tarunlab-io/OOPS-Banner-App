public class BannerAppUC6 {

    public static void main(String[] args) {
        printBanner();
    }

    // Main banner renderer
    static void printBanner() {

        String[] bannerLines = {
            borderLine(),
            oopsLine(),
            oopsLine(),
            borderLine()
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Static helper methods (UC6 goal)

    static String borderLine() {
        return String.join("", "*", "*", "*", "*", "*", "*", "*", "*");
    }

    static String oopsLine() {
        return String.join("", "*", " ", letterO(), letterO(), letterP(), letterS(), " ", "*");
    }

    static String letterO() {
        return "O";
    }

    static String letterP() {
        return "P";
    }

    static String letterS() {
        return "S";
    }
}