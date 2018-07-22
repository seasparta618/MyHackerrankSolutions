package au.leon.hacherrank.solution.compete.Jul21AllWomen;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CheckInDesk {

	static int solve(int m, List<List<Integer>> desks) {
        int largestMinute = 0;
        for(List<Integer> desk : desks) {
            
            int minuteAtThisDesk = desk.get(1)/desk.get(0);
            if(desk.get(1)%desk.get(0) > 0) {
                minuteAtThisDesk = minuteAtThisDesk +1;
            }
            if(minuteAtThisDesk > largestMinute) {
                largestMinute = minuteAtThisDesk;
            }
        }
        
        int firstLeft = 0;
        int totalProcess = 0;
        for(List<Integer> desk : desks) {
            firstLeft =firstLeft + (desk.get(0) * largestMinute) - desk.get(1);
            totalProcess = totalProcess + desk.get(0);
        }
        
        if(firstLeft >= m) {
            return largestMinute;
        }else{
            largestMinute = largestMinute +(int)((m-firstLeft)/totalProcess)+
                    ((m-firstLeft)%totalProcess==0?0:1);
        }
        
        return largestMinute;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        List<List<Integer>> desks = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                desks.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = solve(m, desks);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
