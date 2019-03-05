package stringsimilarity;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringSimilarity {

    // Complete the stringSimilarity function below.
    static int stringSimilarity(String s) {
        String str=s;
        int len=s.length();
        int cnt=0;
        int tot=0;
        for(int i=1;i<len;i++)
        {
            cnt=0;
            for(int j=i;j<len;j++)
            {
                if(str.charAt(j-i)==str.charAt(j))
                {
                    cnt++;
                }
                else
                {
                    break;
                }
            }
            tot=tot+cnt;
        }
        return (tot+len);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = stringSimilarity(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
