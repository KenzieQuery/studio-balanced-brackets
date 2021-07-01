public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        //toCharArray() method: string method that splits a string into an array of characters
        // if out input string / "[][]}, then str.toCHarArray() = ["[","]","[","]"];
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++; //add onto brackets, brackets = brackets + 1
            } else if (ch == ']') {
                brackets--; //decrement brackets, brackets = brackets - 1
                //added conditional to help testClosingThenOpeningBracket() to pass.
                if(brackets < 0){
                    return false;
                }
            }
        }
        return brackets == 0;
    }
}
