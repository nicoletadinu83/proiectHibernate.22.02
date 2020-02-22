package dao;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.security.auth.login.AppConfigurationEntry;

import java.util.Properties;

public class UserDao {
    SessionFactory sessionFactory;

    public UserDao() {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/taskmanagement");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "JAVA");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.put(Environment.SHOW_SQL, "true");//
        properties.put(Environment.HBM2DDL_AUTO, "update");
        configuration.setProperties(properties);


        //se inregistreaza clasele in hibernate
        //pt a putea crea tabelele trebuie sa adaugam clasele
        configuration.addAnnotatedClass(UserModel.class);
        configuration.addAnnotatedClass(ProjectModel.class);
        configuration.addAnnotatedClass(StatusModel.class);
        configuration.addAnnotatedClass(SubTaskModel.class);
        configuration.addAnnotatedClass(TaskModel.class);
        sessionFactory = configuration.buildSessionFactory();


    }

    public void addUser(UserModel userModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(userModel);
        transaction.commit();
    }

}
