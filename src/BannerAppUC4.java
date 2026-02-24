public class BannerAppUC4 {

    public static void main(String[] args) {
        printOOPSBanner();
    }

    // UC4: Using Array + Loop for better modularity
    static void printOOPSBanner() {

        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", "O", "O", "P", "S", " ", "*"),
            String.join("", "*", " ", "O", "O", "P", "S", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}