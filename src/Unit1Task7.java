public class Unit1Task7 {
    public static void main(String[] args) {
        int n = 11;
        String programmer = " программист";
        String endOfWord;
        if (n % 10 == 1) {
                endOfWord = "";
            if (n == 11 || n % 100 == 11) {
                endOfWord = "ов";
            }
        } else if (n % 10 > 1 && n % 10 < 5) {
                endOfWord = "а";
            } else {
                endOfWord = "ов";
            }
        System.out.println(n + programmer + endOfWord);
    }
}
//        (Дополнительно) В переменную записываете количество программистов. В
//        зависимости от количества программистов необходимо вывести правильно
//        окончание.
