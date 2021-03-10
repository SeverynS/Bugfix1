package bugs;

import java.util.Date;

/**
 * Необходимо объяснить и решить проблему - почему здесь идет зацикленность;заканчивается память
 */
public class Bug1 {
    public static void main(String[] args) {
        for (byte i = 0; i < 127; i++) { //условие не может быть выполнено, потому как 129 выходит за пределы "byte"
            System.out.println("Current time is " + new Date().getTime());
        }
    }
}
