package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class Gtv2Test {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 1984, 100);
	    String string0 = nextDate0.run(6, 1, 1984);
	    assertEquals("6/2/1984", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2829, 2829, 2829);
	    String string0 = nextDate0.run(2, 29, 2019);
	    assertEquals("2/29/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, (-1587), 2021);
	    String string0 = nextDate0.run(1, 1, 1801);
	    assertEquals("1/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1851), (-1851), (-1851));
	    String string0 = nextDate0.run(2, 2, 1832);
	    assertEquals("2/3/1832", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 31, 1913);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2794, 2794, 2794);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2295, 2295, 2295);
	    String string0 = nextDate0.run(7, 31, 1818);
	    assertEquals("7/31/1818", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 1984, 100);
	    String string0 = nextDate0.run(6, 1, 1984);
	    assertEquals("6/2/1984", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(2829, 2829, 2829);
	    String string0 = nextDate0.run((-2402), (-545), (-1933));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(2829, 2829, 2829);
	    String string0 = nextDate0.run(0, 3542, (-251));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1912);
	    assertEquals("10/11/1912", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(2850, 2850, 2850);
	    String string0 = nextDate0.run(4, 1801, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1926), 515, (-1926));
	    String string0 = nextDate0.run(4, 1, 1801);
	    assertEquals("4/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 2986);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 30, 1910);
	    assertEquals("10/1/1910", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1867), (-1867), (-1867));
	    String string0 = nextDate0.run(5, 1, 1832);
	    assertEquals("5/2/1832", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(2829, 2829, 2829);
	    String string0 = nextDate0.run(260, 33, 2829);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(2829, 2829, 2829);
	    String string0 = nextDate0.run(12, 5, 2007);
	    assertEquals("12/6/2007", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2794, 2794, 2794);
	    String string0 = nextDate0.run(12, 31, 1984);
	    assertEquals("1/1/1985", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2850, 2850, 2850);
	    String string0 = nextDate0.run(2, 29, 1984);
	    assertEquals("3/1/1984", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2824, 2824, 2824);
	    String string0 = nextDate0.run(11, 31, 1984);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 31, 1807);
	    assertEquals("4/1/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1835, 1835);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1867), (-1867), (-1867));
	    String string0 = nextDate0.run(8, 8, 1801);
	    assertEquals("8/9/1801", string0);
	}

}