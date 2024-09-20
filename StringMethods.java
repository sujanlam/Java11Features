package strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = " Hello World";
        String str2 = "Hello World ";
        String textBlock = """
                This is a text block.
                    The second line is indented.
                The third line has less indentation.
                """;
        System.out.println(str.isBlank()+ " " + str2.isBlank());
        System.out.println(str.lines());
        System.out.println(str.stripTrailing());
        System.out.println(str.stripLeading());
        System.out.println(str.stripIndent());
        System.out.println(textBlock);
        String newStr = textBlock.stripIndent();
        System.out.println(newStr);
    }
}
