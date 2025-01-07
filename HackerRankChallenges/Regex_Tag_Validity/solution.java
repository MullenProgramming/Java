import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>"); // Explanation at the bottom.
        
        while(n-- > 0){
            String line = br.readLine().trim();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            
            if (!found) {
                System.out.println("None");
            }
        }
        br.close();
    }
}

/**
EXPLANATION:
Beginning of regex: <([^>]+)>
  1) "<" — Matches a literal <.
  2) ([^>]+) — This is capturing group 1, which matches one or more characters that are not >. 
          Essentially, it captures the tag name (like h1 or SA premium).
  3) ">" — Matches a literal > to close the opening tag.
Middle: ([^<]+)
  1) ([^<]+) — This is capturing group 2, which matches one or more characters that are not <. 
          It represents the text content inside the tag (and by not allowing <, we ensure there's no nested tag in this portion).
End: </\\1>
  1) "</\\"** + 1 + ">" — Matches the closing tag, which must:
      a) start with </ literally...
      b) contain the exact same text captured in group 1 (this is the \1 backreference)...
      c) end with > literally.

In simpler terms:
  1) ([^>]+) captures the tag name right after <.
  2) ([^<]+) captures the text in between.
  3) </\1> ensures the end tag matches the same name as the start tag.
  
The \\1 in the string means you’re escaping the backslash for Java’s string literal, 
so effectively, the regex engine sees \1, which is a backreference to group 1.
*/
