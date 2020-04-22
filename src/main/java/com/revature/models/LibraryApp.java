package com.revature.models;

import com.revature.data.GenericDAO;

/**
 * The type Library app.
 * Edward and Multezem
 */
public class LibraryApp {


    /**
     * Instantiates a new Library app.
     */
    public LibraryApp() {
        GenericDAO dao = new GenericDAO();

        dao.create(new Books(GenericDAO.id, "Bible"));
        dao.create(new Books(GenericDAO.id, "Narnia"));
        dao.create(new Books(GenericDAO.id, "Edward"));
        dao.create(new Books(GenericDAO.id, "Mutezem"));
        dao.create(new Books(GenericDAO.id, "Cat in the Hat"));

        for (Object b : dao.getAll()) {
            System.out.println(b);
        }


        dao.delete(3);


        System.out.println();
        for (Object b : dao.getAll()) {
            System.out.println(b);
        }

        dao.update(2, new Books(2, "Anthony"));

        System.out.println();
        for (Object b : dao.getAll()) {
            System.out.println(b);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        LibraryApp main = new LibraryApp();
    }

    /**
     * The type Books.
     */
    public class Books {
        /**
         * The Id.
         */
        int id = 0;
        /**
         * The Name.
         */
        String name;

        /**
         * Instantiates a new Books.
         *
         * @param id   the id
         * @param name the name
         */
        public Books(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}