package com.Cenima.DAO;

import com.Cenima.Classes.Favorite;
import org.hibernate.Session;

public class FavoriteDAOImp implements FavoriteDAO{
    @Override
    public void addFavorite(Favorite favorite) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(favorite);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteFavorite(int idFavorite) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Favorite favorite = (Favorite) session.get(Favorite.class, idFavorite);
        session.delete(favorite);
        session.getTransaction().commit();
        session.close();
    }
}
