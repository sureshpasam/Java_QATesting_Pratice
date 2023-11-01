

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sumOfTheDigits {

	static String number ="1578221648498484";
	public static void main(String[] args) {
		Integer sum = IntStream.range(0, number.length())
                .filter(i -> i % 2 == 0)
                .map(number::charAt)
                .sum();
	
		//int sum = Stream.of(number.split("")).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
	
	}
}

