package org.example.lesson4.project;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory())
        {
            FindInSession(sessionFactory, 1);
        }

    }


    //Поиск и селект в БД по id
    private static void FindInSession(SessionFactory sessionFactory, int id) {
        try (Session session = sessionFactory.openSession()) {
            Person pers = session.find(Person.class, id);
            System.out.println(pers);
            session.close();
        }
    }


    //Добавление объекта Person в БД
    private static void SaveInSession(SessionFactory sessionFactory, Person person) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            session.close();
        }
    }

    //Удаление объекта Person из таблицы БД по id
    private static void DeleteInSession(SessionFactory sessionFactory, int id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(session.get(Person.class, id));
            session.getTransaction().commit();
            session.close();
        }
    }

    //Обновление записи объекта персон в таблице БД
    private static void UpdateInSession(SessionFactory sessionFactory, int id) {
        try (Session session = sessionFactory.openSession()) {

        }
    }


}
