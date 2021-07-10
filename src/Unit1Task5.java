public class Unit1Task5 {
    public static void main(String[] args) {
        int x = -511;
        int y = -156;
        int z = -412;
        int counterPostive = 0; int counterNegative = 0;

        if (x>0) { counterPostive++;
        } else counterNegative++;
        if (y>0) { counterPostive++;
        } else counterNegative++;
        if (z>0) { counterPostive++;
        } else counterNegative++;
        System.out.println("Количество положительных чисел " +counterPostive);
        System.out.println("Количество отрицательных чисел " +counterNegative);
    }
}

//        Даны 3 целых числа. Найти количество положительных
//        и отрицательных чисел в исходном наборе.
