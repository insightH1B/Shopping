package com.shopping.dao;

import com.shopping.entity.Evaluation;

import java.util.List;

/**
 * Created by QIU on Mar, 2019
 */
public interface EvaluationDao {


    public Evaluation getEvaluation(int userId, int productId, String time);

    public void addEvaluation(Evaluation evaluation);

    public boolean deleteEvaluation(int userId,int productId,String time);

    public boolean updateEvaluation(Evaluation evaluation);


    public List<Evaluation> getProductEvaluation(int productId);

    boolean deleteEvaluationByUser(int userId);


    boolean deleteEvaluationByProduct(int productId);

}

