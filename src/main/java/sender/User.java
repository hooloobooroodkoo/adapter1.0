package sender;

import java.util.Date;

public interface User {
    void message(String text);
    String getCountry();
    Date getLastActive();
    String getEmail();

}
