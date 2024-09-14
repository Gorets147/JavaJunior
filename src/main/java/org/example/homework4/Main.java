package org.example.homework4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", 21);
        Person person2 = new Person("Petr", 22);
        Person person3 = new Person("Vasily", 23);


        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory())
        {
            // Добавление объектов в таблицу:
//            SaveInSession(sessionFactory, person);
//            SaveInSession(sessionFactory, person2);
//            SaveInSession(sessionFactory, person3);

            //Удаление объекта из БД:
//            DeleteInSession(sessionFactory, 2);

            //Обновление объекта
            UpdateInSession(sessionFactory, 4, new Person("dmitriy", 34));

        }

    }


    //Поиск и селект в БД по id
    private static void FindInSession(SessionFactory sessionFactory, int id) {
        try (Session session = sessionFactory.openSession()) {
            org.example.lesson4.project.Person pers = session.find(org.example.lesson4.project.Person.class, id);
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

    //Обновление объекта Person в БД по id
    private static void UpdateInSession(SessionFactory sessionFactory, int id, Person personUpdated) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "from Person where id = :id";
            Query<Person> query = session.createQuery(hql, Person.class);
            query.setParameter("id", id);
            Person person = query.getSingleResult();
            System.out.println(person);
            person.setName(personUpdated.getName());
            person.setAge(personUpdated.getAge());
            session.beginTransaction();
            session.update(person);
            session.getTransaction().commit();
            session.close();
        }
    }
}
