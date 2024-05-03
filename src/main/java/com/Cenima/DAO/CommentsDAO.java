package com.Cenima.DAO;

import com.Cenima.Classes.Comments;

public interface CommentsDAO {
    void createComment(Comments comment);
    //Comments getCommentById(int commentId);
   // void updateComment(Comments updatedComment);
    void deleteComment(int commentId);
}
