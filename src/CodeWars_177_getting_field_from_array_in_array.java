public class CodeWars_177_getting_field_from_array_in_array {
    public static String duckDuckGoose(Player[] players, int goose) {
    return players[(goose - 1) % players.length].name;
    }

    }