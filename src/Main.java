import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		List<Integer> primes = 
		    numbers.stream()
		           .filter(n -> {
		                    System.out.println("filtering " + n);
		                    int count = 0;
		                    for(int i=1; i<=n; i++)
		                    	if(n % i == 0)
		                    		count++;
		                    return count == 2;
		                  })
		           .map(n -> {
		                    System.out.println(n + " IS A PRIME!");
		                    return n;
		                  })
		           .limit(2)
		           .collect(Collectors.toList());
	}

}
