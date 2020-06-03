// https://www.hackerrank.com/challenges/crush/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int ql= queries.length;
        long[] ar = new long[n];
        for (int d=0;d<n;d++){
            ar[d]=0;
        }

        for(int k=0;k<ql;k++){
            int m=0;
            int a=queries[k][m++];
            int b=queries[k][m++];
            long z = queries [k][m++];

            ar[a-1] = ar[a-1]+z;
            if(b<=(ar.length-1)){
                ar[b] = ar[b]-z;
            }

        }

        for (int u=1;u<ar.length;u++){
            ar[u] = ar[u-1]+ar[u];
        }

        long max=0;
        for (int k=0;k<ar.length;k++){
            if(ar[k]>max){
                max = ar[k];
            }
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
