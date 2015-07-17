package org.jnit.basic;

import java.util.Arrays;

public class HelloWorldWithArgs {

	public static void main(String[] args) {
		if (args.length > 0) {
			Arrays.stream(args).forEach(System.out::println);
		}

	}

}
