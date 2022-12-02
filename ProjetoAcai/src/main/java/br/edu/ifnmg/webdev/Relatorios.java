package br.edu.ifnmg.webdev;

import br.edu.ifnmg.webdev.acai.AcaiServiceLocal;
import br.edu.ifnmg.webdev.adicional.AdicionalServiceLocal;
import br.edu.ifnmg.webdev.compra.CompraServiceLocal;
import br.edu.ifnmg.webdev.credencial.CredencialServiceLocal;
import br.edu.ifnmg.webdev.endereco.EnderecoServiceLocal;
import br.edu.ifnmg.webdev.item.ItemServiceLocal;
import br.edu.ifnmg.webdev.telefone.TelefoneServiceLocal;
import br.edu.ifnmg.webdev.usuario.UsuarioServiceLocal;
import br.edu.ifnmg.webdev.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author dayan
 */
@Transactional
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class Relatorios extends HttpServlet {

    @Inject
    private AcaiServiceLocal acaiService;

    @Inject
    private AdicionalServiceLocal adicionalService;

    @Inject
    private UsuarioServiceLocal usuarioService;

    @Inject
    private CredencialServiceLocal credencialService;

    @Inject
    private TelefoneServiceLocal telefoneService;

    @Inject
    private EnderecoServiceLocal enderecoService;

    @Inject
    private ItemServiceLocal itemService;

    @Inject
    private CompraServiceLocal compraService;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            StringBuilder sb = new StringBuilder();

            sb.append("<!DOCTYPE html>");
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>Servlet Relatorios</title>");
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<h1> Trabalho de Conclusão de Disciplina - Desenvolvimento Web 2022 </h1>");
            sb.append("<a href=\"index.html\">Voltar</a>");

            sb.append("<h2>Açaís: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(acaiService.showAcais()));
            sb.append("</pre>");

            sb.append("<h2>Adicionais: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(adicionalService.showAdicionais()));
            sb.append("</pre>");

            sb.append("<h2>Usuarios: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(usuarioService.showUsuarios()));
            sb.append("</pre>");

            sb.append("<h2>Credenciais: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(credencialService.showCredenciais()));
            sb.append("</pre>");

            sb.append("<h2>Telefones: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(telefoneService.showTelefones()));
            sb.append("</pre>");

            sb.append("<h2>Endereços: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(enderecoService.showEnderecos()));
            sb.append("</pre>");

            sb.append("<h2>Itens: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(itemService.showItens()));
            sb.append("</pre>");

            sb.append("<h2>Compras: </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(compraService.showCompras()));
            sb.append("</pre>");

            sb.append("<a href=\"index.html\">Voltar</a>");
            sb.append("</body>");
            sb.append("</html>");

            out.print(sb.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
