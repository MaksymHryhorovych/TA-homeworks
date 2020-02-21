import org.testng.Assert;
import org.testng.annotations.*;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "invalidEmails")
    public static Object[] invalidEmails() {
        return new Object[] {"zsdfe@asf2.c2", "ks@adv.bs"};
    }

    @Test(dataProvider = "invalidEmails")
    public void test(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);
    }
}
