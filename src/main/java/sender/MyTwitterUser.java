package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser user;
    private String message;

    public MyTwitterUser(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActive() {
        return user.getLastActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }
    @Override
    public void message(String text) {
        this.message = text;
    }
    public String getMessage() {
        return this.message;
    }

}
