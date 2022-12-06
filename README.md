# PotentialOutfitForCurrentWeather 🌤🧤

## •	ABOUT 
Using weather API and knowledge about object-oriented programming I developed an app that based on current weather is able to suggest the most suitable outfit for the user. 

I store all clothes in Enums (wardrobe class), then I created methods that are preparing potential outfits with those clothes based on the current season. The season is also described by data returned from API and from the LocalDate class (month actually).
A couple of interfaces were implemented: for unit conversion (Kelvins into Celsius), to get the most valuable data from API, and to generate all potential sets of clothes.

API was from OpenWeatherMap, I used a version with current weather data in the area chosen by me (I picked Warsaw, but it is only an example, location can be changed in the future). 

<br></br>

## •	TECHNOLOGY THAT I USED 🚀
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

<br></br>

## •	What’s next? 🔜
I am planning to extend the app. I want to do unit tests in JUnit.
The main outline of the final app version: 
-	Outfits going to be prepared but in need of a potential trip to other countries
-	The weather forecast will be changed for a longer term, on the date of the potential user trip
-	Forecast will refer to that specific country where the user is heading for holidays
-	Wardrobe might be extended, but it isn’t the most important area of the app
-	At the end-user will receive outfits propositions for his upcoming holidays

<br></br>

## •	WHAT HAD I PRACTICED DURING THAT PROJECT? 🤔
-	Working with API
-	Pulling out the most interesting information from API data (using regex and parsing)
-	Switch expression
-	Storing data in Enums
-	OOP principles
