public class Unit1Task1 {
    public static void main(String[] args) {
        int x = -142132;

         if (x < 0) {
            System.out.print(x + " Это отрицательное ");
        } else if (x > 0) {
            System.out.print(x + " Это положительное ");
        } else {
             System.out.print("Это число 0");
         }

        if ((x >-10) && (x < 10)) {
            System.out.print(" однозначное число");
        } else if ((x >-100) && (x < 100)) {
            System.out.print(" двухзначное число ");
        } else {
            System.out.print(" трехзначное или более число ");
        }
    }
}
//        В переменную записываем число. Надо вывести на экран сколько в этом
//        числе цифр и положительное оно или отрицательное. Например, "это
//        однозначное положительное число". Достаточно будет определить, является ли
//        число однозначным, двухзначным или трехзначным и более.