package bd2.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MatriculaService {

    private EntityManager entityManager;

    public Long countAlunosMatriculados() {
        String jpql = "SELECT COUNT(m)" +
                      "FROM Matricula m";
        Query query = entityManager.createQuery(jpql, Long.class);
        return (Long) query.getSingleResult();
    }
}
