package mma.legacy.interval;

import static org.junit.Assert.*;
import mma.legacy.interval.Interval;
import mma.legacy.interval.IntervalFactory;
import mma.legacy.interval.IntervalType;

import org.junit.Test;

public class IntervalTest {

	@Test
	public void midPointPositiveNumbersTest() {
		assertEquals(5, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void rightLimitMidPointPositiveNumbersTest() {
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void leftLimitMidPointPositiveNumbersTest() {
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointNegativeNumbersTest() {
		assertEquals(-10, IntervalFactory.getInterval(-15, -5, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertEquals(-10, IntervalFactory.getInterval(-15, -5, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertEquals(-10, IntervalFactory.getInterval(-15, -5, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertEquals(-10, IntervalFactory.getInterval(-15, -5, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void rightLimitMidPointNegativeNumbersTest() {
		assertNotEquals(-9, IntervalFactory.getInterval(-15, -5, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(-9, IntervalFactory.getInterval(-15, -5, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-9, IntervalFactory.getInterval(-15, -5, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-9, IntervalFactory.getInterval(-15, -5, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void leftLimitMidPointPoNegativeNumbersTest() {
		assertNotEquals(-11, IntervalFactory.getInterval(-15, -5, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(-11, IntervalFactory.getInterval(-15, -5, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-11, IntervalFactory.getInterval(-15, -5, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-11, IntervalFactory.getInterval(-15, -5, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointTestPositiveNegativeNumbers() {
		assertEquals(0, IntervalFactory.getInterval(-10, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertEquals(0, IntervalFactory.getInterval(-10, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertEquals(0, IntervalFactory.getInterval(-10, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertEquals(0, IntervalFactory.getInterval(-10, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void rightLimitMidPointTestPositiveNegativeNumbers() {
		assertNotEquals(1, IntervalFactory.getInterval(-10, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(1, IntervalFactory.getInterval(-10, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(1, IntervalFactory.getInterval(-10, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(1, IntervalFactory.getInterval(-10, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void leftLimitMidPointTestPositiveNegativeNumbers() {
		assertNotEquals(-1, IntervalFactory.getInterval(-10, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
//		assertNotEquals(-1, IntervalFactory.getInterval(-10, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-1, IntervalFactory.getInterval(-10, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
//		assertNotEquals(-1, IntervalFactory.getInterval(-10, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointForPositiveIntervalsTest() {
		assertEquals(5, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointForLeftLimitTest() {
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointForRightLimitTest() {
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void includeValueForBothOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).includesValue(-1));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).includesValue(5));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.BOTH_OPENED).includesValue(11));
	}
	
	@Test
	public void includeValueForLeftOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).includesValue(-1));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.LEFT_OPENED).includesValue(11));
	}
	
	@Test
	public void includeValueForRightOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).includesValue(-1));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).includesValue(9));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.RIGHT_OPENED).includesValue(10));
	}
	
	@Test
	public void includeValueUnopenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).includesValue(-1));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, IntervalType.UNOPENED).includesValue(11));
	}

	@Test
	public void includeIntervalTest() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, IntervalType.BOTH_OPENED);
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.BOTH_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.LEFT_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.RIGHT_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.UNOPENED)));
		
		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, IntervalType.LEFT_OPENED);
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.BOTH_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.LEFT_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.RIGHT_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.UNOPENED)));
		
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, IntervalType.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.BOTH_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.LEFT_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.RIGHT_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.UNOPENED)));
		
		Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, IntervalType.UNOPENED);
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.BOTH_OPENED)));
		
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.LEFT_OPENED)));
		
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.RIGHT_OPENED)));

		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, IntervalType.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, IntervalType.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, IntervalType.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, IntervalType.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, IntervalType.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, IntervalType.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, IntervalType.UNOPENED)));

	}

	@Test
	public void hasIntersectionTest() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.BOTH_OPENED);

		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));

		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.LEFT_OPENED);

		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
		
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
		
		Interval unopenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.UNOPENED);
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
	}

	@Test
	public void hasIntersectionTest2() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.BOTH_OPENED);

		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));

		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.LEFT_OPENED);

		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
		Interval unopenedPivot = IntervalFactory.getInterval(20, 40, IntervalType.UNOPENED);
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, IntervalType.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, IntervalType.UNOPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, IntervalType.UNOPENED)));
	}
}
