package bugs;

/**
 * Исправь NPE(NullPointerException - чисто логически, проанализируй кусочек кода и скажи почему эта ошибка появляется
 * <p>
 * ее смысл заключается в том - что ты обращаешься к объекту которого в памяти нет, а есть только название
 * так называемая "пустая" ссылка(ссылка на пустоту) - важно понимать что эта ошибка относиться только к объектам(ссылочные типы данных), а не к примитивам
 * <p>
 * пример
 * String name = null;//память не выделена, есть только пустая ссылка; в качестве заглушки используется null
 * <p>
 * System.out.println(name.toUpperCase());// здесь даст NPE так как у тебя нет объекта по факту, есть просто назввание ссылки без объекта
 * *
 */
public class Bug5 {

    private static String value;

    {
        System.out.println(value.length());
    }

    public static void main(String[] args) {
        /**
         * 1 case
         */
        String name = "";
        System.out.println(name.toUpperCase());//ситуация из описания :)

        /**
         * 2 case
         */
        Integer number = 2;
        System.out.println(number.intValue()); //и здесь объект "пустой"

        /**
         * 3 case
         */
        String value = "123";
        System.out.println(value.substring(0, 1));//а здесь его вообще небыло, соответственно получить подстроку неоткуда
    }
}
