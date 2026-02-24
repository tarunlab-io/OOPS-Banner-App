public class BannerAppUC3 {

    public static void main(String[] args) {
        printOOPSBanner();
    }

    // Static method improves reusability and memory efficiency
    static void printOOPSBanner() {

        String line1 = String.join("", "*", "*", "*", "*", "*", "*", "*", "*");
        String line2 = String.join("", "*", " ", "O", "O", "P", "S", " ", "*");
        String line3 = String.join("", "*", " ", "O", "O", "P", "S", " ", "*");
        String line4 = String.join("", "*", "*", "*", "*", "*", "*", "*", "*");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}