package au.leon.hacherrank.solution.compete.Jul21AllWomen;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BusyDays {

	// Complete the solve function below.
	static String solve(List<List<String>> reservations) {
		HashMap<LocalDate, Integer> dateMap = new HashMap<LocalDate, Integer>();
		String start = "2018-01-01";
		String end = "2020-12-31";
		LocalDate startDate = LocalDate.parse(start);
		LocalDate endDate = LocalDate.parse(end);
		reservations.forEach(reserve -> {
			LocalDate checkInDate = LocalDate.parse(reserve.get(0));
			LocalDate checkOutDate = LocalDate.parse(reserve.get(1));
			while(!checkInDate.isAfter(checkOutDate)) {
				if(dateMap.get(checkInDate) == null) {
					dateMap.put(checkInDate, 1);
				}else {
					dateMap.put(checkInDate, dateMap.get(checkInDate)+1);
				}
				checkInDate = checkInDate.plusDays(1);
			}
		});
		List<Map.Entry<LocalDate,Integer>> list = new ArrayList<Map.Entry<LocalDate,Integer>>(dateMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<LocalDate,Integer>>() {

			@Override
			public int compare(Entry<LocalDate, Integer> o1, Entry<LocalDate, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				}else {
					return o2.getValue()-o1.getValue();
				}
			}
        });
        list.forEach(sss->{System.out.println(sss.getKey() + " "+sss.getValue());});
		return list.get(0).getKey().toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<List<String>> reservations = new ArrayList<>();

				IntStream.range(0, n).forEach(i -> {
					try {
						reservations.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.collect(toList()));
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				String result = solve(reservations);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
