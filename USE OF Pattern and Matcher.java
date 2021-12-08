
// USE OF Pattern and Matcher
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo {
    public static void main(String[] args) {
        String str = "the quick jdbc brown foxx jummps jdbc";
        Pattern p = Pattern.compile("jdbc");   // pattern provided here
        // Pattern p1 = Pattern.compile("",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);   // target string provided here
        int c=0;
        while(m.find())
        {
            System.out.println(m.start() + " -------- "+m.end() +" ----- "+m.group());
            c++;
        }
        System.out.println("number of counts = "+c);
    }
}
