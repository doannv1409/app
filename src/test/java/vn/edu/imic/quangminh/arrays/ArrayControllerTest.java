package vn.edu.imic.quangminh.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayControllerTest {
	private ArrayController controller;
	
	@Before
	public void setUp() {
		//init lop doi tuong muon test
		controller = new ArrayController();
	}
	
	@Test
	public void testSumOfEmptyIntegerArray() {
		int[] input = new int[10];
		int actualResult = controller.sum(input);
		
		assertEquals(0, actualResult);
	}
	
	@Test
	public void testSumOfArrayWithOneValue() {
		int[] input = new int[10];
		input[6] = 25;
		int actualResult = controller.sum(input);
		
		assertEquals(25, actualResult);
	}
	
	@Test
	public void testSumOfArrayWith10Values() {
		int[] input = new int[10];
		for (int i = 0; i < input.length; i++) {
			input[i] = i;
		}
		
		int actualResult = controller.sum(input);
		assertEquals(45, actualResult);
	}
	
	@Test
	public void testSumOfArrayWith3Values() {
		int[] input = new int[3];
		for (int i = 0; i < input.length; i++) {
			input[i] = i;
		}
		
		int actualResult = controller.sum(input);
		assertEquals(3, actualResult);
	}
	
	@Test
	public void findMinOfArray() {
		int[] input = new int[] {1};
		int min = controller.findMin(input);
		assertEquals(1, min);
	}
	
	@Test
	public void findMinOfArray_case2() {
		int[] input = new int[] {1, -2, 0};
		int min = controller.findMin(input);
		assertEquals(-2, min);
	}
	
	@After
	public void teardown() {
		System.out.println("tear down");
	}	
}
