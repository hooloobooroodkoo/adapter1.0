package twitter;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

}
