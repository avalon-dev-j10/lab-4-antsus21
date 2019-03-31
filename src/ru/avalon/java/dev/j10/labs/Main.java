package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"Первый","второй","третий","четвертый","Пятый",
                                "Шестой","Седьмой","Восьмой","девятый","Десятый",
                                "Одиннадцатый","Двенадцатый","тринадцатый",
                                "Четырнадцатый","Пятнадцатый","шеснадцатый",
                                "семнадцатый","восемнадцатый","девятнадцатый","Двадцатый"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[]{
                new Persons("Иван",LocalDate.of(1967, 7, 12)),
                new Persons("Иван",LocalDate.of(1264, 12, 21)),
                new Persons("Олег",LocalDate.of(1984, 3, 12)),
                new Persons("Ольга",LocalDate.of(1995, 5, 25)),
                new Persons("Иван",LocalDate.of(1988, 6, 1)),
                new Persons("Владимир",LocalDate.of(1981, 12, 24)),
                new Persons("Александр",LocalDate.of(1975, 12, 12)),
                new Persons("Иван",LocalDate.of(1955, 5, 3)),
                new Persons("Петр",LocalDate.of(1958, 11, 25)),
                new Persons("Иван",LocalDate.of(1967, 7, 12)),
                new Persons("Иван",LocalDate.of(1264, 12, 21)),
                new Persons("Олег",LocalDate.of(1984, 3, 12)),
                new Persons("Ольга",LocalDate.of(1995, 5, 5)),
                new Persons("Иван",LocalDate.of(1988, 6, 1)),
                new Persons("Владимир",LocalDate.of(1988, 12, 8)),
                new Persons("Александр",LocalDate.of(1981, 9, 30)),
                new Persons("Иван",LocalDate.of(1955, 5, 3)),
                new Persons("Петр",LocalDate.of(1957, 7, 25)),
                new Persons("Владимир",LocalDate.of(1981, 8, 24)),
                new Persons("Александр",LocalDate.of(1974, 8, 8)),
                new Persons("Иван",LocalDate.of(1955, 5, 3)),
                new Persons("Петр",LocalDate.of(1957, 7, 25)),
            };

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new MySort();
        
        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comp = new MyComparator();
        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        
        System.out.println("Массив persons до сортировки"); 
                
        System.out.println(Arrays.toString(persons));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //  сортировка массива persons по возрастанию( по именам в алфавитном порядке. Если имена совпадают, сортировка по дате рождения.)
        sort.sort(persons);
        System.out.println("Массив persons после сортировки"); 
        System.out.println(Arrays.toString(persons));    

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        
        // сортирует массив strings по возрастанию с учетом регистра
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Массив strings до сортировки");
        System.out.println(Arrays.toString(strings));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Массив strings после сортировки");
        sort.sort(strings);
        System.out.println(Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // сортирует массив strings по убыванию с учетом регистра
        System.out.println("Массив strings отсортированный по убыванию");
        sort.sort(strings, comp.reversed() );
        System.out.println(Arrays.toString(strings));
    }
}
