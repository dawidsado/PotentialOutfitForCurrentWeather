package PotentialOutfitsForParticularSeason;

import Interfaces.MethodsToGeneratePotentialOutfitSets.AutumnOutfit;
import Interfaces.MethodsToGeneratePotentialOutfitSets.SpringOutfit;
import Interfaces.MethodsToGeneratePotentialOutfitSets.SummerOutfit;
import Interfaces.MethodsToGeneratePotentialOutfitSets.WinterOutfit;
import Seasons.SpecificDataAboutCurrentSeason;
import Wardrobe.Accessories;
import Wardrobe.Clothes;
import Wardrobe.Shoes;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Outfits extends SpecificDataAboutCurrentSeason implements SummerOutfit, AutumnOutfit, WinterOutfit, SpringOutfit {
    private SpecificDataAboutCurrentSeason specificDataAboutCurrentSeason = new SpecificDataAboutCurrentSeason();

    public Outfits() throws UnirestException {
    }


    @Override
    public String getPotentialSummerOutfit() {
        specificDataAboutCurrentSeason.getCurrentSeason();
        return "Outfit suggestion: " + Accessories.CAP + " (Optional)" + ", " + Accessories.SUNGLASSES + ", " + Clothes.T_SHIRT + ", " + Clothes.SHORTS + " or" + Clothes.SWIMMERS + " and" + " " + Shoes.SUMMER_SHOES + "/" + Shoes.SLIPPERS;
    }

    @Override
    public String getPotentialAutumnOutfit() {
        specificDataAboutCurrentSeason.getCurrentSeason();
        return "Outfit suggestion: " + Accessories.SCARF + ", " + Accessories.UMBRELLA + " (Optional)" + ", " + Clothes.HOODIE + ", " + Clothes.JACKET + ", " + Clothes.JEANS + " and " + Shoes.SNEAKERS;
    }

    @Override
    public String getPotentialWinterOutfit() {
        specificDataAboutCurrentSeason.getCurrentSeason();
        return "Outfit suggestion: " + Accessories.WINTER_HAT + ", " + Accessories.SCARF + ", " + Clothes.PULLOVER + ", " + Clothes.WINTER_JACKET + ", " + Clothes.JEANS + ", " + Shoes.WINTER_SHOES;
    }

    @Override
    public String getPotentialSpringOutfit() {
        specificDataAboutCurrentSeason.getCurrentSeason();
        return "Outfit suggestion: " + Accessories.CAP + ", " + Clothes.HOODIE + ", " + Clothes.JACKET + ", " + Clothes.JEANS + ", " + Shoes.SNEAKERS;
    }
}
