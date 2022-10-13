
/*
*Given two strings Drop and Ocean,
* return the index of the first occurrence of Drop in Ocean,
* or -1 if Drop is not part of Ocean.
*
* Expected outputs: 4    0    -1
*
*/


public class Quiz {
    public static void main(String[] args) {
        String ocean = "Kingfish";
         String drop = "fish";
        System.out.println(strStr(ocean, drop));
        String ocean2 = "Habtom";
        String drop2 = "Habtom";
        System.out.println(strStr(ocean2, drop2));
        String ocean3 = "Habtom";
        String drop3 = "Gebre";
        System.out.println(strStr(ocean3, drop3));


    }


        public static int strStr(String ocean, String drop) {
            if (ocean == null || drop == null) {
                return -1;
            }
            // Special case
            if (ocean.equals(drop)) {
                return 0;
            }
            // length of the needle
            int dropLength = drop.length();
            // Loop through the haystack and slide the window
            for (int i = 0; i < ocean.length() - dropLength + 1; i++) {
                // Check if the substring equals to the drop
                if (ocean.substring(i, i + dropLength).equals(drop)) {
                    return i;
                }
            }
            return -1;
        }

}
