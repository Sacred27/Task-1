package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>База</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action = \"getParam\" method = \"GET\">\n");
      out.write("           <table>\n");
      out.write("               <caption>Данные</caption>\n");
      out.write("               <tr><td>id<input type = \"number\" name = \"x1\"\n");
      out.write("            value = \"1\" min=\"0\" max=\"100\" step=\"0.1\"/></td>\n");
      out.write("               <td>Продукт\\Адрес\\Количество<input type = \"text\" name = \"x2\"\n");
      out.write("            value = \"3\"/></td>\n");
      out.write("               <td>Цена\\.\\Стоимость<input type = \"number\" name = \"x3\"\n");
      out.write("            value = \"4\" min=\"0\" max=\"100\" step=\"1\"/></td>\n");
      out.write("               <td>.\\.\\id магазина <input type = \"number\" name = \"x4\"\n");
      out.write("            value = \"4\" min=\"0\" max=\"100\" step=\"1\"/></td>\n");
      out.write("               <td>.\\.\\id продукта <input type = \"number\" name = \"x5\"\n");
      out.write("            value = \"6\" min=\"0\" max=\"100\" step=\"1\"/></td>\n");
      out.write("              <td> <select name=\"table\">\n");
      out.write("                        <option>Product</option>\n");
      out.write("                        <option selected>Store</option>\n");
      out.write("                        <option>Tranzaction</option>\n");
      out.write("              </select> </td>\n");
      out.write("              <td> <select name=\"operation\">\n");
      out.write("                        <option>insert</option>\n");
      out.write("                        <option selected>delete</option>\n");
      out.write("                        <option>output</option>\n");
      out.write("              </select> </td>\n");
      out.write("               </tr>   \n");
      out.write("               <tr>\n");
      out.write("                <td><button>Do</button> </td>\n");
      out.write("               </tr>\n");
      out.write("           </table>  \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
