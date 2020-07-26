public class SimpleArray {
    public static void main(String[] args) {
        String[] favoriteCountries = new String[5];
        favoriteCountries[0] = "Kenia";
        favoriteCountries[1] = "Cypr";
        favoriteCountries[2] = "Kuba";
        favoriteCountries[3] = "Meksyk";
        favoriteCountries[4] = "Turcja";
        System.out.println (favoriteCountries[2]);

        int numberOfElements = favoriteCountries.length;
        System.out.println(numberOfElements);
    }
}