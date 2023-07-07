public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев Толстой");
        System.out.println("levNikolaevichTolstoy.getAuthorName() = " + levTolstoy.getAuthorName());

        Author sergeyEsenin = new Author("Сергей Есенин");
        System.out.println("sergeyEsenin.getAuthorFirstName() = " + sergeyEsenin.getAuthorName());

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        Book blackHuman = new Book("Черный человек", sergeyEsenin, 2023);
        System.out.println("blackHuman.getBookName() = " + blackHuman.getBookName());
        System.out.println("blackHuman.getAuthorName() = " + blackHuman.getAuthorName());
        System.out.println("blackHuman.getPublishingYear() = " + blackHuman.getPublishingYear());
        blackHuman.setPublishingYear(1926);
        System.out.println("blackHuman.getPublishingYear() = " + blackHuman.getPublishingYear());
    }
}