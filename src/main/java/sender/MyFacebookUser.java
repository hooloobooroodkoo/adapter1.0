package sender;

import facebook.FacebookUser;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter @Getter
public class MyFacebookUser implements User{
    private FacebookUser user;
    private String message;

    public MyFacebookUser(FacebookUser user) {
        this.user = user;
    }
    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActive() {
        return user.getUserActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
    @Override
    public void message(String text) {
        this.message = text;
    }
    public String getMessage() {
        return this.message;
    }
}
