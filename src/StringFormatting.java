/**
 * This class demonstrates various Java string formatting techniques including:
 * - Escape Sequences: such as tab (\t), newline (\n), and others.
 * - Text Blocks: allowing multiline strings as written in code.
 * - % Modifiers: using format specifiers like %d, %f for decimal integers and floating points.
 * - Formatting with printf: using advanced formatting options like width, precision, and conversion.
 *
 * Each section contains detailed examples and explanations of how
 * to use these features in Java.
 *
 * This class is part of my Java Masterclass practice.
 */
public class StringFormatting {
    public static void main (String[]args){
/*        //- - - - - - - - - - Escape Sequences - - - - - - - - - -
        //common escape sequences: \t - insert a tab
        //                         \n - insert a new line
        //                         \" - insert quotation marks
        //                         \\ - insert backslash

        String tab = "\t1\t2\t3\t4";

        String newLine = "Things to do:" +
                         "\n-Homework"   +
                         "\n-Laundry";

        String quotes = "Have you read, \"11/22/63\", by Stephen King?";

        String backslash = "The most common escape sequences are \\t, \\n, \\\", and \\";

        System.out.println(tab);
        System.out.println();
        System.out.println(newLine);
        System.out.println();
        System.out.println(quotes);
        System.out.println();
        System.out.println(backslash);
 */


 /*       //- - - - - - - - - - TextBlock - - - - - - - - - -
        // """ - allows programmer to display text as it is written in code
        String textBlock = """
                Important things to do:
                    -Homework
                        -Math
                        -History
                        -Science
                    -Laundry
                        -Whites
                        -Colors""";

        System.out.println(textBlock);

*/


/*        //- - - - - - - - - - % modifier - - - - - - - - - -
        //%- special indicator called "format specifier"
        //type d - symbol used for formatting a decimal integer
        //type f - symbol used for formatting a floating point
        //type n - line separation, gives a platform specific line separator (mac,windows,linux);
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html - more info

        //when used, it is important to use System.out.printf (format)
        int age = 35;

        System.out.printf("your age is %d%n" , age);
        //output:your age is 35

        //System.out.printf("your age is %f%n" , age); -> illegal format, needs floating number

        System.out.printf("your age is %f%n", (float) age); //(float) allows us to convert the int to a floating num
        //output: your age is 35.000000

        //you can control the amount of decimal places with %.xf (x=amnt of places)
        System.out.printf("your age is %.2f%n", (float) age);
        //output: your age is 35.00
*/


/*        //- - - - - - - - - - Formatting - - - - - - - - - -
        //format specifiers will look something like - %[argument_index$][flags][width][.precision]conversion
        //they start with a percent sign, and end with a conversion symbol

        //printf can be used for formatting

        //no formatting
        for (int i =1; i < 100000; i*=10){
            System.out.println(i);
        }
        //output:
        //1
        //10
        //100
        //1000
        //10000
        //100000

        //"6d" formatting added - tells the code that each number should fill 6 spaces
        for (int i =1; i <= 100000; i*=10){
            System.out.printf("%6d%n",i);
        }
        //output
        //     1
        //    10
        //   100
        //  1000
        // 10000
        //100000
*/

/*        //- - - - - - - - - - Formatting continued - - - - - - - - - -
        //.format can be used from java
        int weight = 180;
        String formattedString = String.format("your weight is %d", weight);

        System.out.println(formattedString);
 */
    }

}
