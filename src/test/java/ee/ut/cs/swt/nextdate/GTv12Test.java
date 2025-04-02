package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12Test {

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1874, 1874, 1874);
	    String string0 = nextDate0.run(2, 29, 1874);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1928);
	    assertEquals("1/2/1928", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive19() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2694);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(846, 846, 0);
	    String string0 = nextDate0.run(846, 0, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-20), (-20), (-20));
	    String string0 = nextDate0.run(12, 1, 2021);
	    assertEquals("12/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1945);
	    assertEquals("3/1/1945", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1997);
	    assertEquals("1/1/1998", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 30, 1975);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(2, 10, 1840);
	    assertEquals("2/11/1840", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(11, 12, 1811);
	    assertEquals("11/13/1811", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1973);
	    assertEquals("3/4/1973", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(846, 846, 0);
	    String string0 = nextDate0.run(0, 846, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(7, 18, 2021);
	    assertEquals("7/18/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 31, 1986);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(849, 849, 0);
	    String string0 = nextDate0.run(8, 30, 1840);
	    assertEquals("8/31/1840", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-20), (-20), (-20));
	    String string0 = nextDate0.run(12, 1, 2021);
	    assertEquals("12/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 30, 1998);
	    assertEquals("10/1/1998", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(846, 846, 0);
	    String string0 = nextDate0.run(6, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1975);
	    assertEquals("10/11/1975", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2021);
	    assertEquals("6/7/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1988);
	    assertEquals("5/6/1988", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 31, 1995);
	    assertEquals("9/1/1995", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(1, 523, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate(846, 846, 0);
	    String string0 = nextDate0.run(40, 1, 0);
	    assertEquals("invalid Input Date", string0);
	}

}