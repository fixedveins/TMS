public class Unit1Task5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int counterPostive = 0; int counterNegative = 0;

        if (x>0) { counterPostive++;
        } else if (x<0) {
            counterNegative++;
        }
        if (y>0) { counterPostive++;
        } else if (y<0) {
            counterNegative++;
        }
        if (z>0) { counterPostive++;
        } else if (z<0) {
            counterNegative++;
        }
        System.out.println("Количество положительных чисел " +counterPostive);
        System.out.println("Количество отрицательных чисел " +counterNegative);
    }
}
//        Даны 3 целых числа. Найти количество положительных
//        и отрицательных чисел в исходном наборе.
