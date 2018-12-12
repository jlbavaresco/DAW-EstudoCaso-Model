package br.edu.ifsul.util.relatorios;

import br.edu.ifsul.modelo.Cidade;
import br.edu.ifsul.modelo.Endereco;
import br.edu.ifsul.modelo.Pais;
import br.edu.ifsul.modelo.PessoaFisica;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
/**
 * Classe utilizada para testar os relatórios no JasperStudio
 * @author jorge
 */
public class FabricaObjetos {
    
    public static List<Pais> carregarPaises(){
        List<Pais> lista = new ArrayList<>();
        Pais p1 = new Pais();
        p1.setId(1);
        p1.setNome("Brasil");
        p1.setIso("BRA");
        lista.add(p1);
        Pais p2 = new Pais();
        p2.setId(2);
        p2.setNome("Uruguai");
        p2.setIso("URU");
        lista.add(p2);
        Pais p3 = new Pais();
        p3.setId(3);
        p3.setNome("Chile");
        p3.setIso("CHI");
        lista.add(p3);        
        return lista;
    }
    
    public static List<PessoaFisica> carregaPessoas(){
        List<PessoaFisica> lista = new ArrayList<>();
        PessoaFisica obj = new PessoaFisica();
        lista.add(obj);
        obj.setCpf("879.852.698-78");
        obj.setEmail("jorge.bavaresco@gmail.com");
        obj.setId(1);
        obj.setNascimento(Calendar.getInstance());
        obj.setNome("Jorge Bavaresco");
        obj.setRg("7498632547");
        obj.setTelefone("(54)99874-0987");
        Cidade c = new Cidade();
        c.setNome("Passo Fundo");
        Endereco e = new Endereco();
        e.setCidade(c);
        e.setBairro("Centro");
        e.setCep("96855-987");
        e.setComplemento("Ap 500");
        e.setEndereco("Avenida Brasil");
        e.setNickname("Casa");
        e.setNumero("200");
        e.setReferencia("Perto Mercado");
        obj.adicionarEndereco(e);
        return lista;        
    }

}
