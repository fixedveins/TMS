public class Unit1Task3 {
    public static void main(String[] args) {
        int Number = -124;
        if (Number>0) {
            Number += 1;
        } else if (Number<0) {
            Number -= 2;
        } else Number = 10;
        System.out.println(Number);
    }
}
//        Дано целое число. Если оно является положительным, то прибавить к нему 1.
//        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//        10. Вывести полученное число.
