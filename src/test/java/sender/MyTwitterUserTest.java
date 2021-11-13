package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    private MyTwitterUser user;
    @BeforeEach
    void setUp() {
        Date date = new Date();
        TwitterUser twitterUser = new TwitterUser("ababagalamaga@gmail.com", "Ukraine", date);
        user = new MyTwitterUser(twitterUser);

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