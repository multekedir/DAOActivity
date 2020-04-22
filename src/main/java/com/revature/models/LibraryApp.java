package com.revature.models;

import com.revature.data.GenericDAO;

public class LibraryApp {


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

    public static void main(String[] args) {

        LibraryApp main = new LibraryApp();
    }

    public class Books {
        int id = 0;
        String name;

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