package org.demo.core.test;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author clx 2017年11月11日 下午7:48:36
 */
public class Test {

	public static void main(String[] args) {
		Double[] array = new Double[] { 1.2, 3.1, 2.3, 0.2 };
		List<Double> sortedVals = new ArrayList<>(Arrays.asList(array)).stream().filter(Objects::nonNull).sorted()
				.collect(toList());
		sortedVals.forEach(System.out::println);
	}
}
