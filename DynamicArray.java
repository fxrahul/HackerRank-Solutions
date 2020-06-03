// https://www.hackerrank.com/challenges/dynamic-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> aList) {
        List<List<Integer>> s = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            List<Integer> s_in = new ArrayList<>();
            s.add(s_in);
            // Use the list further...
        }
        List<Integer> result = new ArrayList<Integer>();
        int lastAnswer = 0;
        for(int i=0;i<aList.size();i++){
//                        for(int j=0;j<aList.get(i).size();j++){
            //int j=0;
            int pos;
            int pos1;
            if(aList.get(i).get(0)==1){  //  || s.get(i).size()==0
                pos = ( (aList.get(i).get(1)^lastAnswer) % n );
                s.get(pos).add(aList.get(i).get(2));
            }else{
                pos = ( (aList.get(i).get(1)^lastAnswer) % n );
                pos1 = (aList.get(i).get(2)) % (s.get(pos).size());
                lastAnswer = s.get(pos).get(pos1);
                result.add(lastAnswer);
            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
