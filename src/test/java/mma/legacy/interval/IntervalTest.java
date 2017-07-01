package mma.legacy.interval;

import static org.junit.Assert.*;
import mma.legacy.interval.Interval;
import mma.legacy.interval.IntervalFactory;
import mma.legacy.interval.Opening;

import org.junit.Test;

public class IntervalTest {

	@Test
	public void midPointForPositiveIntervalsTest() {
		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
		assertEquals(5, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointForLeftLimitTest() {
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
		assertNotEquals(4, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void midPointForRightLimitTest() {
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).midPoint(), 0.0);
		assertNotEquals(6, IntervalFactory.getInterval(0, 10, Opening.UNOPENED).midPoint(), 0.0);
	}
	
	@Test
	public void includeValueForBothOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includesValue(-1));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includesValue(5));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includesValue(11));
	}
	
	@Test
	public void includeValueForLeftOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includesValue(-1));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includesValue(11));
	}
	
	@Test
	public void includeValueForRightOpenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includesValue(-1));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includesValue(9));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includesValue(10));
	}
	
	@Test
	public void includeValueUnopenedTest()
	{
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includesValue(-1));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includesValue(0));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includesValue(5));
		assertTrue(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includesValue(10));
		assertFalse(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includesValue(11));
	}

	@Test
	public void includeIntervalTest() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.BOTH_OPENED);
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));
		
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
		
		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.LEFT_OPENED);
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));
		
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
		
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));
		
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
		
		Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.UNOPENED);
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
		
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
		
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));

		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
		assertTrue(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
		assertFalse(unopenedOpenedPivot.includesInterval(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));

	}

	@Test
	public void hasIntersectionTest() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.BOTH_OPENED);

		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));

		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.LEFT_OPENED);

		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
		
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
		
		Interval unopenedPivot = IntervalFactory.getInterval(20, 40, Opening.UNOPENED);
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
	}

	@Test
	public void hasIntersectionTest2() {

		Interval bothOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.BOTH_OPENED);

		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));

		Interval leftOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.LEFT_OPENED);

		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
		Interval rightOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.RIGHT_OPENED);
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
		Interval unopenedPivot = IntervalFactory.getInterval(20, 40, Opening.UNOPENED);
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
		assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
		assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
	}
}