/*Complete the solution so that it strips all text that follows any of a set of comment
        markers passed in. Any whitespace at the end of the line should also be stripped out.

        Example:
        Given an input string of:

        apples, pears # and bananas
        grapes
        bananas !apples
        The output expected would be:

        apples, pears
        grapes
        bananas*/

public class CodeWars_152_regex_with_variable_in_it_hard_regex {
    public static String stripComments(String text, String[] commentSymbols) {
        return text.replaceAll("(?m)\\h*([" + String.join("",commentSymbols) + "].*)?$", "");

        //аналог того, что выше, но без использования аргумента
      //  return text.replaceAll("(?m)\\h*([#!].*)?$", "");
//(?m) multi line. Causes ^(симмвол начала строки) and $(символ конца строки)
// to match the begin/end of each line (not only begin/end of string)
// .join() method concatenates the given elements with the delimiter and returns the concatenated string
    }
}
