/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.dao;

import inscricao.faces.entity.Matricula;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Samsung
 */
public class MatriculaDao extends GenericDAO {

    public List<Matricula> listar() {
        em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Matricula> cq = cb.createQuery(Matricula.class);
        Root<Matricula> rt = cq.from(Matricula.class);
        TypedQuery<Matricula> q = em.createQuery(cq);
        return q.getResultList();
    }

}
