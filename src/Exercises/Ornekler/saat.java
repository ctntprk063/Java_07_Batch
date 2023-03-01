package Exercises.Ornekler;

import java.text.DecimalFormat;

public class saat {

    public static void main(String[] args)
    {
        //Always show two digits.
        DecimalFormat formatter = new DecimalFormat("00");

        // Simulate the clock.
        for (int hours = 1; hours <= 12; hours++)
        {
            for (int minutes = 0; minutes <= 59; minutes++)
            {
                for (int seconds = 0; seconds <= 59; seconds++)
                {
                    System.out.println(formatter.format(hours) + ":" +
                            formatter.format(minutes) + ":" +
                            formatter.format(seconds));
                }
            }
        }
    }
}
