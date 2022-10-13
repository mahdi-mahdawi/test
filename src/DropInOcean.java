

    /*
     *Given two strings Candidate and Position,
     * return the index of the first occurrence of Drop in Ocean,
     * or -1 if Drop is not part of Ocean.
     *
     * Expected outputs: 22    -1    0
     *
     */



    public class DropInOcean {
public static void main(String[] args) {
            String position = "The Java Developer is Smriti";
            String candidate = "Smriti";
            System.out.println(strStr(position, candidate));
            String position2 = "The Java Developer is Smriti";
            String candidate2 = "Joe";
            System.out.println(strStr(position2, candidate2));
            String position3 = "TheJavaDeveloper";
            String candidate3 = "TheJavaDeveloper";
            System.out.println(strStr(position3, candidate3));
        }


        public static int strStr(String position, String candidate) {
           if (position == null || candidate == null) return -1;

            // length of the Candidate
            int dropLength = candidate.length();

            // Special case
            if (position.equals(candidate)) return 0;


            // Loop through the position and slide the window
            for (int i = 0; i < position.length() - dropLength + 1; i++) {
                // Check if the substring equals to the candidate
                if (position.substring(i, i + dropLength).equals(candidate)) return i;

            }
            return -1;
        }



}
