package multil_line_string_text_blocks_p19;
//String + String + String
//        StringBuilder
//        String.format
//        StringWriter
//        String.join (Java 8)
import java.io.PrintWriter;
import java.io.StringWriter;

public class Multi_Line_Strings_Text_Blocks_M1 {
    public static void main(String[] args) {
//Method1 by using String concatination
        String html = "<html>\n"
                + " <body>\n"
                + "<p>Hello, World</p>\n"
                + "</body>\n"
                + "</html>";
        System.out.println(" html string "+html);
        System.out.println();

        String json = "{\n"
                + " \"name\":\"mkyong\",\n"
                + " \"age\":38\n"
                + "}";

        System.out.println(" json string "+json);
        System.out.println();


//Method 2 by using String Buffer append method
        String html1 = new StringBuilder()
                .append("<html>\n")
                .append(" <body>\n")
                .append(" <p>Hello, World</p>\n")
                .append(" </body>\n")
                .append("</html>")
                .toString();
        System.out.println(" html1 string "+html1);
        System.out.println();


        String json1 = new StringBuilder()
                .append("{\n")
                .append(" \"name\":\"mkyong\",\n")
                .append(" \"age\":38\n")
                .append("}").toString();
        System.out.println(" json1 string "+json1);
        System.out.println();


        //Method 3 by using string.format method
String html2 = String.format("%s\n%s\n%s\n%s\n%s", "<html>" , "<body>" , "<p>Hello,World</p>", "</body>",
        "</html>");
        System.out.println(" html2 string "+html2);
        System.out.println();

        String json2 = String.format("%s\n%s\n%s\n%s" , "{" , " \"name\":\"mkyong\"," , " \"age\":38" , "}");
        System.out.println(" json2 string "+json2);
        System.out.println();


        //Method 4 by using StringWriter
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<p>Hello, World</p>");
        pw.println("</body>");
        pw.println("</html>");
        String html3 = sw.toString();
        System.out.println(" html3 string "+html3);
        System.out.println();


        StringWriter sw2 = new StringWriter();
        PrintWriter pw2 = new PrintWriter(sw2);
        pw2.println("{");
        pw2.println("\"name\":\"mkyong\",");
        pw2.println("\"age\":38");
        pw2.println("}");
        String json3 = sw2.toString();
        System.out.println(" json3 string "+json3);
        System.out.println();

//Method 5 by using String join method
        String html4 = String.join("\n"
                , "<html>"
                , "<body>"
                , "<p>Hello, World</p>"
                , "</body>"
                , "</html>");
        System.out.println(" html4 string "+html4);
        System.out.println();


        String json4 = String.join("\n"
                , "{"
                , "\"name\":\"mkyong\","
                , "\"age\":38"
                , "}");
        System.out.println(" json4 string "+json4);
        System.out.println();

    }
}
