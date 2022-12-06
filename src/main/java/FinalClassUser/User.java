package FinalClassUser;

import PotentialOutfitsForParticularSeason.Outfits;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.time.LocalDate;

public class User extends Outfits {
    private int currentDate = LocalDate.now().getMonthValue();

    public User() throws UnirestException {
    }

    public void getSuggestedOutfitForNow() {
        switch (currentDate) {
            case 12:
            case 1:
            case 2:
                System.out.println(getPotentialWinterOutfit());
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(getPotentialSpringOutfit());
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(getPotentialSummerOutfit());
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(getPotentialAutumnOutfit());;
                break;
        }
        }
    }


