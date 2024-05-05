package com.Cenima.DAO;

import com.Cenima.Classes.Favorite;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Favorite> getFavoritesByUserId(int userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT fa FROM Favorite fa WHERE fa.user.id = :userId";
        Query<Favorite> query = session.createQuery(hql, Favorite.class);
        query.setParameter("userId", userId);
        return query.getResultList();
    }

}
