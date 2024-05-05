package com.Cenima.DAO;

import com.Cenima.Classes.Comments;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommentsDAOImp implements CommentsDAO {



    @Override
    public void createComment(Comments comment) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        session.save(comment);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteComment(int commentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Comments comment = session.get(Comments.class, commentId);
        if (comment != null) {
            session.delete(comment);
        }
        transaction.commit();
        session.close();
    }
}
