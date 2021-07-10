public class Unit1Task7 {
    public static void main(String[] args) {

        int n = 2;
        String text = " программист";
        String Ending1 = "а";
        String Ending2 = "ов";


        if ((n == 1) | (n%10==1) & (n!=11)) {
            System.out.println(n + text);
        } else if ((n % 10 > 1) & (n % 10 < 5)) {
            System.out.println(n + text + Ending1);
        } else if ((n % 10 > 4) | (n % 10 == 0) | (n > 10))  {
            System.out.println(n + text + Ending2);
        }
    }
}
//        (Дополнительно) В переменную записываете количество программистов. В
//        зависимости от количества программистов необходимо вывести правильно
//        окончание. Например:
//        • 2 программиста
//        • 1 программиста
//        • 10 программистов
//        • и т.д.
