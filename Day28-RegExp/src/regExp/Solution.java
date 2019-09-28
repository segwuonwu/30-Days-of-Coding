package regExp;

import java.util.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Matcher matcher = pattern.matcher(emailID);
            if(matcher.find())
                list.add(firstName);
        }

        Collections.sort(list);
        for(String name : list){
            System.out.println(name);
        }
        scanner.close();
    }
}
