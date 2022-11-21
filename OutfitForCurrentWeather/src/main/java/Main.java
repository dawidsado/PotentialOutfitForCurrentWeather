import FinalClassUser.User;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {
        public static void main (String[]args) throws UnirestException {
            User user = new User();
            user.getSuggestedOutfitForNow();
        }
    }
