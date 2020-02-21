import org.testng.Assert;
import org.testng.annotations.*;

public class CheckEmailHappyPath {

    @DataProvider(name = "validEmails")
    public static Object[] validEmails() {
        return new Object[] {"zsdfe_!@asf2.cc", "ks1234_!@adv.bs"};
    }

    @Test(dataProvider = "validEmails")
    public void test(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
