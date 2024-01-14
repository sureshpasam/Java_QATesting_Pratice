package APITesting;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FackerLib_RA7 {


    @Test(priority = 1)
    public void faker() {
        Faker faker = new Faker();
        String FullNa = faker.name().fullName();
        String FNa = faker.name().firstName();
        String LNa = faker.name().lastName();
        String uN = faker.name().username();
        String pwd = faker.internet().password();
        String Ph = faker.phoneNumber().cellPhone();
        String email = faker.internet().safeEmailAddress();
        System.out.println("Faker lib - Generating the dummy data");
        System.out.println("Full name " + FullNa);
        System.out.println("FN " + FNa);
        System.out.println("LNa " + LNa);
        System.out.println("uN " + uN);
        System.out.println("pwd " + pwd);
        System.out.println("ph " + Ph);
        System.out.println("email " + email);


    }


}
