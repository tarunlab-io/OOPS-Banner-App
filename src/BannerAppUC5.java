public class BannerAppUC5 {

    public static void main(String[] args) {
        printOOPSBanner();
    }

    // UC5: Array declaration + initialization in one statement
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