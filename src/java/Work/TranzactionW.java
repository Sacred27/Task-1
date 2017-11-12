

package Work;

import Baza.Product;
import Baza.Store;
import Baza.Tranzaction;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import util.HibernateUtil;
import javax.swing.*;
import org.hibernate.Session;


public class TranzactionW {

  public void addTranzaction(Tranzaction tranzaction) throws SQLException {
    Session session = null;
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.save(tranzaction);
      session.getTransaction().commit();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
    } finally {
      if (session != null && session.isOpen()) {

        session.close();
      }
    }
  }

  public void updateTranzaction(Long id, Tranzaction tranzaction) throws SQLException {
    Session session = null;
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.update(tranzaction);
      session.getTransaction().commit();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
    } finally {
      if (session != null && session.isOpen()) {
        session.close();
      }
    }
  }

  public Tranzaction getTranzactionById(Long id) throws SQLException {
    Session session = null;
    Tranzaction tranzaction = null;
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      tranzaction = (Tranzaction) session.load(Tranzaction.class, id);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
    } finally {
      if (session != null && session.isOpen()) {
        session.close();
      }
    }
    return tranzaction;
  }

  public Collection getAllTranzaction() throws SQLException {
    Session session = null;
    List tranzaction = new ArrayList<Store>();
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      tranzaction = session.createCriteria(Tranzaction.class).list();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
    } finally {
      if (session != null && session.isOpen()) {
        session.close();
      }
    }
    return tranzaction;
  }
  
  public void deleteTranzaction(Product product) throws SQLException {
    Session session = null;
    try {
      session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      session.delete(product);
      session.getTransaction().commit();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
    } finally {
      if (session != null && session.isOpen()) {
        session.close();
      }
    }
  }
 
}
