package br.edu.ifnmg.webdev.cargadados;

import br.edu.ifnmg.webdev.acai.Acai;
import br.edu.ifnmg.webdev.acai.AcaiServiceLocal;
import br.edu.ifnmg.webdev.adicional.Adicional;
import br.edu.ifnmg.webdev.adicional.AdicionalServiceLocal;
import br.edu.ifnmg.webdev.compra.Compra;
import br.edu.ifnmg.webdev.compra.CompraServiceLocal;
import br.edu.ifnmg.webdev.credencial.Credencial;
import br.edu.ifnmg.webdev.credencial.CredencialServiceLocal;
import br.edu.ifnmg.webdev.endereco.Endereco;
import br.edu.ifnmg.webdev.endereco.EnderecoServiceLocal;
import br.edu.ifnmg.webdev.item.Item;
import br.edu.ifnmg.webdev.item.ItemServiceLocal;
import br.edu.ifnmg.webdev.telefone.Telefone;
import br.edu.ifnmg.webdev.telefone.TelefoneServiceLocal;
import br.edu.ifnmg.webdev.usuario.Usuario;
import br.edu.ifnmg.webdev.usuario.UsuarioServiceLocal;
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

    @Inject
    private UsuarioServiceLocal usuarioService;

    @Inject
    private CredencialServiceLocal credencialService;

    @Inject
    private EnderecoServiceLocal enderecoService;

    @Inject
    private TelefoneServiceLocal telefoneService;

    @Inject
    private ItemServiceLocal itemService;

    @Inject
    private CompraServiceLocal compraService;

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

        //<editor-fold defaultstate="collapsed" desc="adicionais">
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

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Endereços">
        Endereco endereco1 = new Endereco();
        endereco1.setBairro("Bairro 1");
        endereco1.setLodradouro("Rua 1");
        endereco1.setNumero(111);

        Endereco endereco2 = new Endereco();
        endereco2.setBairro("Bairro 2");
        endereco2.setLodradouro("Rua 2");
        endereco2.setNumero(222);

        Endereco endereco3 = new Endereco();
        endereco3.setBairro("Bairro 3");
        endereco3.setLodradouro("Rua 3");
        endereco3.setNumero(333);

        enderecoService.save(endereco1);
        enderecoService.save(endereco2);
        enderecoService.save(endereco3);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Telefones">
        Telefone telefone1 = new Telefone();
        telefone1.setDdd((byte) 11);
        telefone1.setNumero(11111111);

        Telefone telefone2 = new Telefone();
        telefone2.setDdd((byte) 12);
        telefone2.setNumero(22222222);

        Telefone telefone3 = new Telefone();
        telefone3.setDdd((byte) 13);
        telefone3.setNumero(33333333);

        telefoneService.save(telefone1);
        telefoneService.save(telefone2);
        telefoneService.save(telefone3);
        //</editor-fold>

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Usuario 1");
        usuario1.setNascimento(LocalDate.of(1999, Month.APRIL, 1));
        usuario1.setTelefone(telefone1);
        usuario1.setEndereco(endereco1);

        Credencial credencial1 = new Credencial();
        credencial1.setEmail("usuario1@gmail.com");
        credencial1.setPerfil(Credencial.Perfil.ADMINISTRADOR);
        credencial1.setSenha("senha1");

        credencial1.setUsuario(usuario1);
        usuario1.setCredencial(credencial1);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Usuario 2");
        usuario2.setNascimento(LocalDate.of(1998, Month.DECEMBER, 13));
        usuario2.setTelefone(telefone2);
        usuario2.setEndereco(endereco2);

        Credencial credencial2 = new Credencial();
        credencial2.setEmail("usuario2@gmail.com");
        credencial2.setPerfil(Credencial.Perfil.FUNCIONARIO);
        credencial2.setSenha("senha2");

        credencial2.setUsuario(usuario2);
        usuario2.setCredencial(credencial2);

        Usuario usuario3 = new Usuario();
        usuario3.setNome("Usuario 3");
        usuario3.setNascimento(LocalDate.of(1997, Month.JULY, 21));
        usuario3.setTelefone(telefone3);
        usuario3.setEndereco(endereco3);

        Credencial credencial3 = new Credencial();
        credencial3.setEmail("usuario3@gmail.com");
        credencial3.setPerfil(Credencial.Perfil.CLIENTE);
        credencial3.setSenha("senha3");

        credencial3.setUsuario(usuario3);
        usuario3.setCredencial(credencial3);

        Item item1 = new Item();
        item1.setAcai(acai1);
        item1.getAdicionais().add(adicional1);
        item1.getAdicionais().add(adicional2);
        item1.getAdicionais().add(adicional3);
        item1.getAdicionais().add(adicional4);

        item1.setQuantidade(2);

        Item item2 = new Item();
        item2.setAcai(acai2);
        item2.getAdicionais().add(adicional1);
        item2.getAdicionais().add(adicional5);
        item2.getAdicionais().add(adicional6);
        item2.getAdicionais().add(adicional7);

        item2.setQuantidade(1);

        Compra compra1 = new Compra();
        compra1.setCliente(usuario3);
        compra1.getItens().add(item1);
        compra1.getItens().add(item2);

        item1.setCompra(compra1);
        item2.setCompra(compra1);

        usuario3.getCompras().add(compra1);

        itemService.save(item1);
        itemService.save(item2);
        compraService.save(compra1);

        credencialService.save(credencial1);
        credencialService.save(credencial2);
        credencialService.save(credencial3);

        usuarioService.save(usuario1);
        usuarioService.save(usuario2);
        usuarioService.save(usuario3);

    }

}
