package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    private MyFacebookUser user;
    @BeforeEach
    void setUp() {
        Date date = new Date();
        FacebookUser facebookUser = new FacebookUser("ababagalamaga@gmail.com", "Ukraine", date);
        user = new MyFacebookUser(facebookUser);

    }

    @Test
    void getCountry() {
        assertEquals("Ukraine", user.getCountry());
    }

    @Test
    void getLastActive() {
        Date date = new Date();
        assertEquals(date.toString(), user.getLastActive().toString());
    }

    @Test
    void getEmail() {
        assertEquals("ababagalamaga@gmail.com", user.getEmail());
    }
}