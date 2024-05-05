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
    public List<Object[]> getFavoritesByUserId(int userId) {
        List<Object[]> favorites;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT u.username, " +
                "fa.favoriteTitle, fa.favoriteCategory, fa.favoriteImage " +
                "FROM Favorite fa " +
                "JOIN fa.user u " +
                "WHERE u.userId = :userId " + // Filter by user ID
                "ORDER BY u.username";
        Query<Object[]> query = session.createQuery(hql);
        query.setParameter("userId", userId); // Set the parameter value
        favorites = query.getResultList();

        return favorites;
    }

}
