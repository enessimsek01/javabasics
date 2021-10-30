package java_basics;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry=true;

        if(hungry) {
            System.out.println("I'm starving");
        }else {
            System.out.println("I'm not hnugry");
        }

        int hungerRating=5;
        if(hungerRating<6) {
            System.out.println("I'm not hungry");
        }else {
            System.out.println("I'm starving...");
        }

        int favoriteTemp=75;
        int currentTemp=60;
        String opinion;

        if(currentTemp<favoriteTemp-30) {
            opinion="It's pretty darn cold";
        }else if(currentTemp<favoriteTemp-20) {
            opinion="It's kinda cold out";
        }else if(currentTemp>favoriteTemp+10) {
            opinion="It's hot out";
        }else {
            opinion="It's beautiful day";
        }

        System.out.println(opinion);


        int month=6;
        String monthString;

        switch(month) {
            case 1: monthString="January";
                break;
            case 2: monthString="February";
                break;
            case 3: monthString="March";
                break;
            case 4: monthString="April";
                break;
            default: monthString="Unknown Month";
                break;
        }
        System.out.println(monthString);
    }

}
