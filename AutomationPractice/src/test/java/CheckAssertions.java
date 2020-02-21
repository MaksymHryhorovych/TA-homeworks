import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertions {
    String string1 = "string";
    String string2 = "string";
    String string3 = "String";

    @Test
    public void test1() {
        Assert.assertEquals(string1, string2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(string1, string3);
    }

    @Test
    public void test3() {
        Assert.assertTrue(4 == 4);
    }

    @Test
    public void test4() {
        Assert.assertTrue(4 == 2);
    }

    @Test
    public void test5() {
        Assert.assertFalse(4 == 2);
    }

    @Test
    public void test6() {
        Assert.assertFalse(4 == 4);
    }
}
