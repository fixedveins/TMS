public class Unit1Task0 {
    public static void main(String[] args) {

        Integer month = 5;
        Integer day = 15;

        System.out.println("Арифметические операторы: ");
            System.out.println("month + day = " + (month + day));  // Сложение
            System.out.println("month - day = " + (month - day));  // Вычитание
            System.out.println("month * day = " + (month * day));  // Умножение
            System.out.println("month-- = " + month--); // Декремент
            System.out.println("month ++ = " + month++); // Инкремент
            System.out.println("month / day = " + ((double) month / day));  // Деление
            System.out.println("month % day = " + (month % day));  // Остаток от деления
            System.out.println("month %= day = " + (month %= day));  // Остаток от деления с присваиванием
            System.out.println("month *= day = " + (month *= day)); // Умножение с присваиванием
            System.out.println("month /= day = " + (month /= day));  // Деление с присваиванием
            System.out.println("month += day = " + (month += day));  // Сложение с присваиванием
            System.out.println("month -= day = " + (month -= day));  // Отрицание с присваиванием

        System.out.println("Битовые операторы:");

            System.out.println("month | day = " + (month | day));  // ИЛИ
            System.out.println("month |= day = " + (month |= day)); // ИЛИ с присваиванием
            System.out.println("month & day = " + (month & day)); //  И
            System.out.println("month &= day = " + (month &= day)); // И с присваиванием
            System.out.println("month ^ day = " + (month ^ day)); // исключающее ИЛИ
            System.out.println("month ^= day = " +(month ^= day)); // исключающеее ИЛИ с присваиванием

            System.out.println("month >> day = " +(month >> day));  // сдвиг вправо
            System.out.println("month >>> day = " +(month >>> day)); // сдвиг вправо с появлением нулей
            System.out.println("month >>= day = " + (month >>= day)); // сдвиг вправо  с присваиванием
            System.out.println("month >>>= day = " +(month >>>= day)); // сдвиг вправо с появлением нулей и присваиванием

            System.out.println("month << day = " +(month << day));  // сдвиг влево
            System.out.println("month <<= day = " +(month <<= day)); // сдвиг влево с присваиванием

        System.out.println("Операторы сравнения:");
            System.out.println("month > day = " + (month > day));  //  больше
            System.out.println("month < day = " + (month < day));  //  меньше
            System.out.println("month >= day = " + (month >= day));  //  больше  либо равно
            System.out.println("month <= day = " + (month <= day));  //  меньше либо равно

        //       Логические операторы  - действия над числами применить не получилось :(
        //           System.out.println("month || day = ") (month || day)); //   или
        //           System.out.println("month && day = " (month && day)); //   и
        //           System.out.println("month ! day = " (month ! day)); //  унарное отрицание
    }

}

//        Даны 2 числа. Первое - ваш месяц рождения, второе - день.
//        Вывести все возможные действия над числами используя операторы
//        JAVA(Арифмитические, Битовые, Логические и Сравнения)
//        Пример результата, который должен выводиться на экран:
//        month + day = 3
//        month - day = -1
//        и т.д.
