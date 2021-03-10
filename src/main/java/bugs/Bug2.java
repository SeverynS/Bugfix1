package bugs;


/**
 * Смысл программы ниже - к name "приклеить"(сделать concat http://proglang.su/java/strings-concat) цифер от 0 до 10
 * чтобы была строка User1-0-1-2-3-4-5-6...-10
 */
public class Bug2 {
    public static void main(String[] args) {
        String name = "User1";
        /*for (int i = 0; i < 10; i++) {
            name.concat("-" + i);
        }*/
        System.out.print(name);//почему User1? а не User1-0-1-2-3-4-5-6...-10
        //потому что в переменной "name" так и остается значение "User1", immutable
        for (int i = 0; i <= 10; i++) {
            System.out.print("-" + i); //вот так будет работать правильно
        }
    }
}
