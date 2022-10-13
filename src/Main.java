public class Main {
    public static void main(String[] args) {

        // TODO on CodeWars 8kyu
       /*
        8kyu - Grasshopper - Messi goals function
        Messi goals function

        Messi is a soccer player with goals in three leagues:
        LaLiga
        Copa del Rey
        Champions

        Complete the function to return his total number of goals in all three leagues.

        Note: the input will always be valid.

        For example:
        5, 10, 2  -->  17

        */

        public class Goals {
            public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
                // your code here

                int goals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
                return goals;
            }
        }



        /*
           8 kyu - Calculate BMI
           DESCRIPTION:

           Write function bmi that calculates body mass index (bmi = weight / height2).

           if bmi <= 18.5 return "Underweight"

           if bmi <= 25.0 return "Normal"

           if bmi <= 30.0 return "Overweight"

           if bmi > 30 return "Obese"
        */

        public class Calculate {
            public static String bmi(double weight, double height) {

                double bmi=weight/(height*height);

                if (bmi <=18.5){
                    return "Underweight";
                } else if (bmi <=25.0){
                    return "Normal";
                } else if (bmi <=30.0){
                    return "Overweight";
                } else
                    return "Obese";
            }
        }

       /*
       8 kyu - Beginner Series #2 Cloc

       DESCRIPTION:
       Clock shows h hours, m minutes and s seconds after midnight.

       Your task is to write a function which returns the time since midnight in milliseconds.

        Example:
        h = 0
        m = 1
        s = 1

        result = 61000

        Input constraints:
        0 <= h <= 23
        0 <= m <= 59
        0 <= s <= 59

        */
        public class Clock
        {
            public static int Past(int h, int m, int s) {

                return (h * 60 * 60 * 1000) + (m * 60 * 1000) + (s *1000);
            }
        }

        /*
        8 kyu - Quarter of the year

        DESCRIPTION:
        Given a month as an integer from 1 to 12,
        return to which quarter of the year it belongs as an integer number.

        For example:
        month 2 (February), is part of the first quarter;
        month 6 (June), is part of the second quarter;
        and month 11 (November), is part of the fourth quarter.
         */

        public class Kata {
            public static int quarterOf(int month) {
                // Your code here
                if (month < 4){
                    return 1;
                } else if (month < 7 ){
                    return 2;
                } else if (month < 10){
                    return 3;
                }else
                    return 4;
            }
        }

        /*
        8 kyu - L1: Set Alarm

        DESCRIPTION:
        Write a function named setAlarm which receives two parameters.
        The first parameter, employed, is true whenever you are employed
        and the second parameter, vacation is true whenever you are on vacation.

        The function should return true if you are employed and not on vacation
        (because these are the circumstances under which you need to set an alarm).
        It should return false otherwise.

        Examples:
        setAlarm(true, true) -> false
        setAlarm(false, true) -> false
        setAlarm(false, false) -> false
        setAlarm(true, false) -> true
         */

        public class Alarm {

            public static boolean setAlarm(boolean employed, boolean vacation) {
                // Your code here...

                if (employed && vacation){
                    return false;
                } else if (!employed && vacation){
                    return false;
                } else if (!employed && !vacation){
                    return false;
                } else if (employed && !vacation){
                    return true;
                } else
                    return false;
            }

        }



    }
}