package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length)
			return t;
		else
			return u;
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~~", "hello", "Good morning", "반갑습니다^^" };
		System.out.println(Arrays.stream(greetings).reduce(" ", (t, u) -> {
			if (t.getBytes().length >= u.getBytes().length)
				return t;
			else
				return u;
		}));

		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}
