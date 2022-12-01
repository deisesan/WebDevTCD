package br.edu.ifnmg.webdev.cargadados;

import br.edu.ifnmg.webdev.acai.AcaiService;
import br.edu.ifnmg.webdev.adicional.AdicionalService;
import br.edu.ifnmg.webdev.compra.CompraService;
import br.edu.ifnmg.webdev.credencial.CredencialService;
import br.edu.ifnmg.webdev.usuario.UsuarioService;
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
    private AcaiService acaiService;

    @Inject
    private AdicionalService adicionalService;

    @Inject
    private UsuarioService usuarioService;

    @Inject
    private CompraService compraService;

    @Inject
    private CredencialService credencialService;

    @PostConstruct
    @Override
    public void popularBanco() {

    }

}
