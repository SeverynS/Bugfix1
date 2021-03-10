package bugs;

/**
 * Посчитать сумму чисел в строке
 * например "123"=1+2+3=6
 * например "1234"=1+2+3+4=10
 * например "5234"=5+2+3+4=14
 * <p>
 * баг в том что программа считает некорректно;
 * необходимо пофиксить и объяснить
 *
 * дополнительные ресурсы http://developer.alexanderklimov.ru/android/java/types.php#char обрати внимание что char при взятии его как число дает тебе код переменной в таблице Unicode
 * если у тебя винда
 * нажми Пуск -> charmap и увидишь все символы и соответствующие им числа в 16 системе счисления;
 * это сделано для того чтобы правильно визуализировать символы вне зависимости ОС и языка;
 * устранить открытие в виде абрыказябры(как было ранее в старых ОС);
 * именно поэтому строка состоит из символов, каждый из которых может быть представителем кода символа из этой таблицы
 * https://ru.wikipedia.org/wiki/%D0%AE%D0%BD%D0%B8%D0%BA%D0%BE%D0%B4%D0%AE%D0%BD%D0%B8%D0%BA%D0%BE%D0%B4
 */
public class Bug9 {
    public static void main(String[] args) {
        String numberAsString = "5234";
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Character.getNumericValue(numberAsString.charAt(i));
        }

        System.out.println("Sum = " + sum);
    }
}