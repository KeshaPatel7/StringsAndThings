package io.zipcoder;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;

        String[] myList = input.split( " ");

        for (int i = 0; i < myList.length; i++) {
            if (myList[i].charAt(myList[i].length() - 1) == 'y' || myList[i].charAt(myList[i].length() - 1) == 'z') {
                count++;
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replace(remove, "");

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        String[] isList = input.split( "is", -1);
        String[] notList = input.split( "not", -1);

        if (isList.length == notList.length) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

//        boolean happy = false;
//
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
//                happy = true;
//            }
//        }
//        return happy;
//    }

        int length = input.length();
        boolean happy = true;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == 'g') {
                if (i > 0 && input.charAt(i - 1) == 'g') {
                    happy = true;
                } else if (i < length - 1 && input.charAt(i + 1) == 'g') {
                    happy = true;

                    //   } else if (input.charAt(i)) == 'g' && input.charAt(i +1) != {

                } else {
                    happy = false;
                }
            }
        }

        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int tripleCount = 0;

        for (int i = 0; i < input.length() - 2; i++) {  // the last two letters won't be tripple(same letter)
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i + 1);
            char nextNextChar = input.charAt(i + 2);

            if (currentChar == nextChar && currentChar == nextNextChar) {
                tripleCount++;
            }
        }
        return tripleCount;
    }
}












