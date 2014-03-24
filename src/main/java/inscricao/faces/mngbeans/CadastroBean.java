/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.faces.dao.MatriculaDao;
import inscricao.faces.entity.Matricula;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Samsung
 */
@ManagedBean
@SessionScoped
public class CadastroBean extends PageBean {

    private Matricula matricula = new Matricula();

    private MatriculaDao matriculaDao = new MatriculaDao();

    private List<Matricula> matriculas = this.matriculaDao.listar();

    public MatriculaDao getMatriculaDao() {
        return matriculaDao;
    }

    public void setMatriculaDao(MatriculaDao matriculaDao) {
        this.matriculaDao = matriculaDao;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public int getCpfPesquisa() {
        return cpfPesquisa;
    }

    public void setCpfPesquisa(int cpfPesquisa) {
        this.cpfPesquisa = cpfPesquisa;
    }

    private int cpfPesquisa;

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String pesquisarMatricula() {
        this.matricula = (Matricula) this.matriculaDao.pesquisar(Matricula.class, cpfPesquisa);
        return "";
    }

    public String pesquisarMatriculas(int cpf) {
        this.matricula = (Matricula) this.matriculaDao.pesquisar(Matricula.class, cpf);
        return "cadastro";
    }

}
