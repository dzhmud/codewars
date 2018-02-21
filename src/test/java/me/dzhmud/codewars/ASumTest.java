package me.dzhmud.codewars;
import static org.junit.Assert.*;

import org.junit.Test;


public class ASumTest {

	@Test
	public void test0() {
		assertEquals(0, ASum.findNb(0));
	}
	@Test
	public void test01() {
		assertEquals(1, ASum.findNb(1));
	}
	@Test
	public void test02() {
		assertEquals(2, ASum.findNb(9));
	}
	@Test
	public void testNegative() {
		assertEquals(-1, ASum.findNb(-9));
	}
	@Test
	public void test1() {
		assertEquals(2022, ASum.findNb(4183059834009L));
	}
	@Test
	public void test2() {
		assertEquals(-1, ASum.findNb(24723578342962L));
	}
	@Test
	public void test3() {
		assertEquals(4824, ASum.findNb(135440716410000L));
	}
	@Test
	public void test4() {
		assertEquals(3568, ASum.findNb(40539911473216L));
	}

}

