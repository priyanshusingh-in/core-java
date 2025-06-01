package com.priyanshusingh.corejava.datatypes;

public class LogicalOpeartor {
    public static void main(String[] args) {
        System.out.println(1 != 2 && 22 == 34);
        System.out.println(3 != 2 || 22 == 34);
        System.out.println(!(3 != 2));

        boolean isSunny = true;
        boolean isWarm = true;

        //AND operator
        boolean isGoodBeachDay = isSunny && isWarm;
        System.out.println("Is good beach day? " + isGoodBeachDay);

        //OR operator
        boolean isRaining = false;
        boolean isSnowing = true;
        boolean isBadWeather = isRaining || isSnowing;
        System.out.println("Is good day? " + isBadWeather);

        //NOT operator
        boolean isHomeworkDone = false;
        boolean canPlayGames = !isHomeworkDone;
        System.out.println("Can I play games? " + canPlayGames);
    }
}
