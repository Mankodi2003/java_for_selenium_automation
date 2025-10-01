// A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

// A regular expression can be a single character, or a more complicated pattern.

// Regular expressions can be used to perform all types of text search and text replace operations.

// Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

/*
Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
*/



// Example.
// Search for the word "w3schools" in the string "Visit W3Schools!".

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d_RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // output: Match found
    }
}

// In the example above, we imported the Pattern and Matcher classes from the java.util.regex package. We then created a Pattern object, using the compile() method, to search for the string "w3schools" in a case-insensitive manner. We then created a Matcher object, using the matcher() method, to search for the pattern in the string "Visit W3Schools!". Finally, we used the find() method to check if the pattern was found in the string, and printed the result.






// Flags :-

// => Flags in the compile() method chenge how the search is performed. Here are some of the most used flags:

// Pattern.CASE_INSENSITIVE - Case insensitive search
// Pattern.LITERAL - Literal search
// Pattern.UNICODE_CASE - Unicode case insensitive









// Regular Expression Patterns :-


// The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for. Here are some of the most used patterns:


/*

Expression :- [abc]
Description :- Find one character from the options between the brackets

Expression :- [^abc]
Description :- Find one character NOT between the brackets

Expression :- [0-9]
Description :- Find one character from the range 0 to 9

*/









// Metacharacters :-


// Metacharacters are characters with a special meaning:


/*

Metacharacter :- |
Description :- Find a match for any one of the patterns separated by | (OR operator)

Metacharacter :- .
Description :- Find just one instance of any character

Metacharacter :- ^
Description :- Find a match at the beginning of a string

Metacharacter :- $
Description :- Find a match at the end of a string

Metacharacter :- \d
Description :- Find a digit (0-9)

Metacharacter :- \s
Description :- Find a whitespace character

Metacharacter :- \b
Description :- Find a match at the beginning or end of a word

Metacharacter :- \ uxxxx
Description :- Find the Unicode character specified by the hexadecimal number xxxx

*/









// Quantifiers :-

// Quantifiers define quantities:


/*

Quantifier :- n+
Description :- Find n (or more) occurrences of the preceding element

Quantifier :- n*
Description :- Find n (or more) occurrences of the preceding element

Quantifier :- n?
Description :- Find n (or zero) occurrences of the preceding element

Quantifier :- n{X}
Description :- Find exactly X occurrences of the preceding element

Quantifier :- n{X,Y}
Description :- Find X to Y occurrences of the preceding element

Quantifier :- n{X,}
Description :- Find X (or more) occurrences of the preceding element

*/