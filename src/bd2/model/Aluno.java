package bd2.model;

import javax.persistence.*;
import java.util.Date;

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Long idAluno;

    @Column(name = "nome_aluno", length = 100)
    private String nomeAluno;

    @Column(name = "data_Nascimento")
    @Temporal(value = TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "cidade_natal", length = 50)
    private String cidadeNatal;

    //Getters e Setters

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
