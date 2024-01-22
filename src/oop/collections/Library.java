package oop.collections;
//
//import fileworks.DataImport;
//
//import java.util.ArrayList;
//
///**
// * @author Honza.Boh
// * @version 11-01-2024
// * Trida reprezentujici knihovnu pro praci s kolekci List pro tridu {@link Book}
// */
//
//public class Library {
//
//    /**
//     * Kolekce vsech knih, automaticky inicializovana pri vytvoreni instance knihovny.
//     * Uklada instance Book {@link Book}
//     */
//    ArrayList<Book> books = new ArrayList<>();
//
//    /**
//     * Nacte vsechny instance knih ze souboru a ulozi do listu books.
//     * Akceptovany format: NazevKnihy;JmenoAutora;rokVydani
//     *
//     * @param filePath cesta k souboru
//     */
//    void loadBooks(String filePath) {
//        DataImport di = new DataImport(filePath);
//        String line;
//        String[] params;
//        while (di.hasNext()) {
//            line = di.readLine();
//            params = line.split(";");
//            books.add(new Book(params[0], params[1], Integer.parseInt(params[2])));
//        }
//
//    }
//
//    /**
//     * Zkontroluje, zda se v kodu vyskytuje alespon jedna kniha daneho autora
//     *
//     * @param authorName jmeno autora
//     * @return {@code true}, pouze pokud je v kolekci kniha napsana autorem ze vstupu
//     */
//    boolean containsAuthor(String authorName) {
//        for (Book helpy :
//                books) {
//            if (helpy.author.equals(authorName)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    /**
//     * Odstrani z kolekce vsechny knihy napsane v predanem roce
//     *
//     * @param year rok vydani knih, ktere maji byt z kolekce odstraneny
//     */
//    void removePublishedIn(int year) {
//        Book[] booksArr = books.toArray(new Book[0]);
//        for (int i = 0; i < books.size(); i++) {
//            Book helpy = booksArr[i];
//            if (helpy.yearOfRelease == year) {
//                books.remove(i);
//            }
//        }
//
//    }
//
//    /**
//     * Zkontroluje, zda se v kolekci knih predana kniha nachazi *prave* jednou
//     *
//     * @param toCheck reference na knihu
//     * @return {@code true}, pouze pokud je v kolekci kniha vickrat nez jednou
//     */
//    boolean multiples(Book toCheck) {
//        int count = 0;
//        for (Book helpy :books) {
//            if (toCheck == helpy) {
//                count++;
//            }
//            if (count >= 2) {
//                return true;
//            }
//        }if (count == 1) {
//            System.out.println("Book is there just once");
//            return false;
//        }
//        return true;
//    }
//
//    /**
//     * Vypise vsechny knihy, ktere napsal predany autor.
//     *
//     * @param authorName jmeno autora
//     */
//    void listWrittenBy(String authorName) {
//        ArrayList<Book> byHim = new ArrayList<>();
//        for (Book helpy :
//                books) {
//            if (helpy.author.equals(authorName)) {
//                byHim.add(helpy);
//            }
//        }
//        System.out.println(byHim.toString());
//    }
//
//    /**
//     * Vrati vsechny knihy v listu, ktere byly napsany v danem obdobi
//     *
//     * @param start pocatecni datum
//     * @param end   koncove datum
//     * @return list vsech knih napsane v obdobi od zacatecniho data do koncoveho
//     */
//    ArrayList<Book> booksIn(int start, int end) {
//        ArrayList<Book> booksOut = new ArrayList<>();
//        for (Book helpy :
//                books) {
//            if (start <= helpy.yearOfRelease && end >= helpy.yearOfRelease) {
//                booksOut.add(helpy);
//            }
//        }
//        return booksOut;
//    }
//
//
//    public static void main(String[] args) {
//        Library library = new Library();
//        library.loadBooks("books.txt");
//        //Jsou nactene?
//        //System.out.println(library.books);
//
//        //booksIn
//        System.out.println(library.booksIn(-900, 1900));
//        //listWrittenBy
//        library.listWrittenBy("Jane Austen");
//        //multiples
//        library.multiples(new Book("The Shining", "Stephen King", 1977));
//        //removedPublish
//        library.removePublishedIn(1960);
//        //contains author
//        //System.out.println(library.containsAuthor("Homer"));
//        System.out.println(library.books);
//    }
//}
//
///**
// * Trida reprezentujici knihu
// */
//class Book {
//    /**
//     * datum vydani knihy
//     */
//    int yearOfRelease;
//    /**
//     * Jmeno autora knihy ci pseudonym
//     */
//    String author;
//    /**
//     * Nazev knihy
//     */
//    String title;
//
//    /**
//     * Metoda pro vytvoreni instance knihy
//     */
//    public Book(String title, String author, int yearOfRelease) {
//        this.yearOfRelease = yearOfRelease;
//        this.author = author;
//        this.title = title;
//    }
//
//    /**
//     * Metoda pro vypis knihy. Vypis je oddelen tabulatory a automatickym odradkovanim
//     *
//     * @return String ve formatu nazevKnihy by autor in rokVydani
//     */
//    @Override
//    public String toString() {
//        return title + "\n\t\t\tby" + author + "\t\t\tin" + yearOfRelease;
//    }
//}

