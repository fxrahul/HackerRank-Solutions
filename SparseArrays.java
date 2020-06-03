// https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] a, String[] q) {
        // int [] count  = new int[queries.length];
        // for(int i=0;i<queries.length;i++){
        //     int countMatch=0;
        //     for(int j=0;j<strings.length;j++){

        //         if(queries[i].equals(strings[j])){
        //             countMatch++;
        //         }
        //     }
        //     count[i] = countMatch;
        // }
        // return count;

        //optimised code with hashmap

        int[] count = new int[q.length];
        HashMap<String,Integer> map = new HashMap<>();

        for(int i =0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],(map.get(a[i]))+1);
            }else{
                map.put(a[i],1);
            }
        }



        for(int j=0;j<q.length;j++){
            if(map.get(q[j])==null){
                count[j]=0;
            }else{
                count[j] = (int) map.get(q[j]);
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
