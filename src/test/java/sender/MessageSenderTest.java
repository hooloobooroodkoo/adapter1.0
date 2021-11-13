package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    private MessageSender sender;
    private MyFacebookUser facebookUser;
    private MyTwitterUser twitterUser;
    @BeforeEach
    void setUp() {
        Date date = new Date();
        FacebookUser user1 = new FacebookUser("ababagalamaga@gmail.com", "Ukraine", date);
        facebookUser = new MyFacebookUser(user1);
        sender = new MessageSender();
        sender.send("Hello!", (User) facebookUser, "Ukraine");
        TwitterUser user2 = new TwitterUser("ababagalamaga@gmail.com", "Ukraine", date);
        twitterUser = new MyTwitterUser(user2);
        sender.send("Hello!", (User) twitterUser, "Ukraine");
    }

    @Test
    void send() {
        sender.send("Hello!", (User) facebookUser, "Ukraine");
        assertEquals("Hello!", facebookUser.getMessage());
        sender.send("Hello!", (User) twitterUser, "Ukraine");
        assertEquals("Hello!", twitterUser.getMessage());
    }


}