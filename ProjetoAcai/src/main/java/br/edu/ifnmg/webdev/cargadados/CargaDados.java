package br.edu.ifnmg.webdev.cargadados;

import br.edu.ifnmg.webdev.acai.Acai;
import br.edu.ifnmg.webdev.acai.AcaiServiceLocal;
import br.edu.ifnmg.webdev.adicional.Adicional;
import br.edu.ifnmg.webdev.adicional.AdicionalServiceLocal;
import br.edu.ifnmg.webdev.credencial.Credencial;
import br.edu.ifnmg.webdev.endereco.Endereco;
import br.edu.ifnmg.webdev.telefone.Telefone;
import br.edu.ifnmg.webdev.usuario.Usuario;
import java.time.LocalDate;
import java.time.Month;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author dayan
 */
@Singleton
@Startup
public class CargaDados implements CargaDadosLocal {

    @Inject
    private AcaiServiceLocal acaiService;
    @Inject
    private AdicionalServiceLocal adicionalService;
//    
//    @Inject
//    private UsuarioServiceLocal  usuarioService;

    @PostConstruct
    @Override

    public void popularBanco() {

        //Açaí 300ml -> R$7,00
        Acai acai1 = new Acai();
        acai1.setTamanho(300L);
        acai1.setValor(7F);

        //Açaí 500ml -> R$12,00
        Acai acai2 = new Acai();
        acai2.setTamanho(500L);
        acai2.setValor(12F);

        //Açaí 700ml -> R$17,00
        Acai acai3 = new Acai();
        acai3.setTamanho(700L);
        acai3.setValor(17F);

        //Açaí 1000ml -> R$24,00
        Acai acai4 = new Acai();
        acai4.setTamanho(1000L);
        acai4.setValor(24F);

        acaiService.save(acai1);
        acaiService.save(acai2);
        acaiService.save(acai3);
        acaiService.save(acai4);

        Adicional adicional1 = new Adicional();
        adicional1.setNome("Banana");
        adicional1.setValor(2F);

        Adicional adicional2 = new Adicional();
        adicional2.setNome("Morango");
        adicional2.setValor(2F);

        Adicional adicional3 = new Adicional();
        adicional3.setNome("Kiwi");
        adicional3.setValor(2F);

        Adicional adicional4 = new Adicional();
        adicional4.setNome("Manga");
        adicional4.setValor(2F);

        Adicional adicional5 = new Adicional();
        adicional5.setNome("Leite condensado");
        adicional5.setValor(2F);

        Adicional adicional6 = new Adicional();
        adicional6.setNome("Leite em pó");
        adicional6.setValor(2F);

        Adicional adicional7 = new Adicional();
        adicional7.setNome("Granola");
        adicional7.setValor(2F);

        adicionalService.save(adicional1);
        adicionalService.save(adicional2);
        adicionalService.save(adicional3);
        adicionalService.save(adicional4);
        adicionalService.save(adicional5);
        adicionalService.save(adicional6);
        adicionalService.save(adicional7);

//        //<editor-fold defaultstate="collapsed" desc="Usuário 1">
//        Endereco endereco1 = new Endereco();
//        endereco1.setBairro("Bairro 1");
//        endereco1.setLodradouro("Rua 1");
//        endereco1.setNumero(111);
//        
//        Telefone telefone1 = new Telefone();
//        telefone1.setDdd((byte)38);
//        telefone1.setNumero(911112222);
//        
//        Usuario usuario1 = new Usuario();
//        usuario1.setNome("Usuario 1");
//        usuario1.setNascimento(LocalDate.of(1999, Month.APRIL, 1));
//        usuario1.setTelefone(telefone1);
//        usuario1.setEndereco(endereco1);
//        
//        Credencial credencial1 = new Credencial();
//        credencial1.setEmail("usuario1@gmail.com");
//        credencial1.setPerfil(Credencial.Perfil.ADMINISTRADOR);
//        credencial1.setSenha("123abc");
//        
//        credencial1.setUsuario(usuario1);
//        usuario1.setCredencial(credencial1);
//        
//        usuarioService.save(usuario1);
        //</editor-fold>
    }

}
