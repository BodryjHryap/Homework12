public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев Толстой");
        System.out.println("levTolstoy = " + levTolstoy);

        Author sergeyEsenin = new Author("Сергей Есенин");
        System.out.println("sergeyEsenin = " + sergeyEsenin);

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        System.out.println("warAndPeace = " + warAndPeace);

        Book blackHuman = new Book("Черный человек", sergeyEsenin, 2023);

        //Возвращение значения свойств объекта с помощью метода toString()
        System.out.println("blackHuman = " + blackHuman);

        //Изменение свойства объекта publishingYear с помощью сеттера
        blackHuman.setPublishingYear(1926);

        System.out.println("blackHuman = " + blackHuman);

        //Сравнение разных строк класса Author
        System.out.println("sergeyEsenin.equals(levTolstoy) = " + sergeyEsenin.equals(levTolstoy));

        Author eseninSergey = new Author("Сергей Есенин");
        //Сравнение одинаковых строк класса Author
        System.out.println("sergeyEsenin.equals(eseninSergey) = " + sergeyEsenin.equals(eseninSergey));

        //Сравнение разных строк с именем автора класса Book(Если имя автора совпадает - возвращаем true, иначе false)
        System.out.println("warAndPeace.equals(blackHuman) = " + warAndPeace.equals(blackHuman));

        //Добавление новой книги Л.Н. Толстого
        Book thePowerOfDarkness = new Book("Власть тьмы", levTolstoy, 1886);

        //Сравнение одинаковых строк с именем автора класса Book(Если имя автора совпадает - возвращаем true, иначе false)
        System.out.println("thePowerOfDarkness.equals(warAndPeace) = " + thePowerOfDarkness.equals(warAndPeace));

        //Возращение хеш-кодов объектов класса Author: sergeyEsenin, eseninSergey, levTolstoy
        System.out.println("sergeyEsenin.hashCode() = " + sergeyEsenin.hashCode());
        System.out.println("eseninSergey.hashCode() = " + eseninSergey.hashCode());
        System.out.println("levTolstoy.hashCode() = " + levTolstoy.hashCode());

        //Возращение хеш-кодов объектов класса Book: warAndPeace, blackHuman, thePowerOfDarkness
        System.out.println("warAndPeace.hashCode() = " + warAndPeace.hashCode());
        System.out.println("blackHuman.hashCode() = " + blackHuman.hashCode());
        System.out.println("thePowerOfDarkness.hashCode() = " + thePowerOfDarkness.hashCode());
    }
}