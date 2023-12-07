package bd2.service;

import bd2.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class AlunoService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Aluno> selectByNomeData(String nome, Date data) {
        String jpql = "SELECT a FROM Aluno a " +
                      "WHERE a.nomeAluno = :nome " +
                      "AND a.dataNascimento = :data";

        Query query = entityManager.createQuery(jpql, Aluno.class);
        query.setParameter("nome", nome);
        query.setParameter("dataNascimento", data);

        List resultList = query.getResultList();
        return resultList;
    }
}
