package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa implements Serializable {

    @Length(max = 11, min = 11, message = "A inscrição estadual deve possuir {max} caracteres.")
    @NotBlank(message = "Informe a IE.")
    @Column(name = "ie", length = 11, nullable = false)
    private String ie;

    @CNPJ(message = "CNPJ inválido!")
    @Length(max = 18, min = 18, message = "O CNPJ deve possuir {max} caracteres.")
    @NotBlank(message = "Informe o CNPJ.")
    @Column(name = "cnpj", length = 18, nullable = false)
    private String cnpj;

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
    }

}
