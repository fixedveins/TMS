public class Unit1Task3 {
    public static void main(String[] args) {

//Имя переменной всегда начинается с маленькой буквы.
        int number = -234;
        if (number>0) {
            number += 1;
        } else if (number<0) {
            number -= 2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
//        Дано целое число. Если оно является положительным, то прибавить к нему 1.
//        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//        10. Вывести полученное число.
