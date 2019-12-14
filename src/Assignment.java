import Database_Classes.Mediaitems;
import org.hibernate.Session;

import java.util.List;

public class Assignment {


    public static void printMediaItems() {
        try {
            Session session = HibernateUtil.currentSession();
            String hqlQuery = "select MI from Mediaitems MI";
            List<Mediaitems> items = session.createQuery(hqlQuery).list();
            for(Mediaitems mi :items) {
                System.out.println(mi.getTitle());
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public static void main(String[] args) {
        printMediaItems();
    }
}
