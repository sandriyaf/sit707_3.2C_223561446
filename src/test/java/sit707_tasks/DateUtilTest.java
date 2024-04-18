package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223561446";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Sandriya Fernandes";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testIncrementDay_D1() {
		DateUtil date = new DateUtil(1, 1, 2024); // January 1, 2024
		System.out.println("testIncrementDay_D1 > " + date);
		date.increment();
		System.out.println(date);
        Assert.assertEquals(2,date.getDay());
        Assert.assertEquals(1,date.getMonth());
	}
	@Test
	public void testIncrementDay_D2() {
		DateUtil date = new DateUtil(29, 2, 2024); 
		System.out.println("testIncrementDay_D2 > " + date);
		date.increment();
		System.out.println(date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(3,date.getMonth());
	}
	@Test
	public void testIncrementDay_D3() {
		DateUtil date = new DateUtil(30, 4, 2021); 
		System.out.println("testIncrementDay_D3 > " + date);
		date.increment();
		System.out.println(date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(5,date.getMonth());
	}
	@Test
	public void testIncrementDay_D4() {
		DateUtil date = new DateUtil(31, 12, 2000); 
		System.out.println("testIncrementDay_D4 > " + date);
		date.increment();
		System.out.println(date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(1,date.getMonth());     
	}
	
	@Test
	public void testDecrementDay_D1() {
		DateUtil date = new DateUtil(1, 1, 2024); 
		System.out.println("testDecrementDay_D1 > " + date);
		date.decrement();
		System.out.println(date);
        Assert.assertEquals(31,date.getDay());
        Assert.assertEquals(12,date.getMonth());
	}
	
	@Test
	public void testDecrementDay_D2() {
		DateUtil date = new DateUtil(29, 2, 2024); // February 29, 2024
		System.out.println("testDecrementDay_D2 > " + date);
		date.decrement();
		System.out.println(date);
        Assert.assertEquals(28,date.getDay());
        Assert.assertEquals(2,date.getMonth());
	}
	
	@Test
	public void testDecrementDay_D3() {
		DateUtil date = new DateUtil(30, 4, 2021); 
		System.out.println("testDecrementDay_D3 > " + date);
		date.decrement();
		System.out.println(date);
        Assert.assertEquals(29,date.getDay());
        Assert.assertEquals(4,date.getMonth());
	}
	
	@Test
	public void testDecrementDay_D4() {
		DateUtil date = new DateUtil(31, 12, 2000); 
		System.out.println("testDecrementDay_D4 > " + date);
		date.decrement();
		System.out.println(date);
        Assert.assertEquals(30,date.getDay());
        Assert.assertEquals(12,date.getMonth());
	}
	@Test
	public void testIncrementMonth_D1() {
		DateUtil date = new DateUtil(31, 5, 1770); 
		System.out.println("testIncrementMonth_D1 > " + date);
		date.increment();
		System.out.println(date);
        Assert.assertEquals(1,date.getDay());
        Assert.assertEquals(6,date.getMonth());
	}

	@Test
	public void testDecrementMonth_D2() {
		DateUtil date = new DateUtil(1, 12, 1990); 
		System.out.println("testDecrementMonth_D2 > " + date);
		date.decrement();
		System.out.println(date);
        Assert.assertEquals(30,date.getDay());
        Assert.assertEquals(11,date.getMonth());
	}

}

