public class Conditionals {
    public static void main (String[] args){
        // if else

        boolean isRaining = false;
        boolean isSnowing = false;

        // I want to bring an umbrella. ONLY IF it is raining
        //SYNTAX: if: ( [condition] ) {}
        // to compare primitive data types, you use ==
        if (isRaining == true) {
            // if statement block of code
            System.out.println("You should bring an umbrella");
        } else if (isSnowing == true) {
            System.out.println("Bring a jacket");
        }else {
            System.out.println("It is neither raining nor snowing");
        }

        // you need 20 points to pass, 30 to get a sticker

        int yamnaScore = 30;

        if (yamnaScore > 20) {
            System.out.println("Congrats, you passed!");
        } else if (yamnaScore < 20) {
            System.out.println("Sorry, you failed");
        }

        // if you want to check just 1 condition, use pipeline ///

        if (yamnaScore > 20 && yamnaScore > 30){
            System.out.println("You passed with a sticker!");}
            else {
                System.out.println("Your score is weird.");


            }
        }
    }
}

