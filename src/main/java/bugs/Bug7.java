package bugs;

/**
 * Проанализируй почему получается бесконечный цикл, исправь проблему то как видишь, сделай так чтобы вывелся End
 */

public class Bug7 {
    public static void main(String[] args) {
        int i = 0;
        while (i != 0) { //и тут всегда true
            if (i % 2 == 0) continue;

            System.out.println("Start Break");
            break;
        }

        System.out.println("End");
    }
}
