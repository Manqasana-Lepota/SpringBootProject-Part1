import com.springboot.Model.User;
import com.springboot.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
;

public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUserTest() {
        User user = new User(1,"Manqasana","Lepota");


    }
}
