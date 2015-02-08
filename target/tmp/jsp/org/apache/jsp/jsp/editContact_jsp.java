package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Edit contact</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Edit contact:</h1>\n");
      out.write("\t<form action=\"contact\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"edit\"> <input type=\"hidden\"\n");
      out.write("\t\t\tname=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>name: <input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\t\t<li>street: <input type=\"text\" name=\"street\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.address.street}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\t\t<li>city: <input type=\"text\" name=\"city\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.address.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\t\t<li>state: <input type=\"text\" name=\"state\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.address.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\t\t<li>zip: <input type=\"text\" name=\"zip\"\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.address.zip}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<input type=\"submit\" value=\"save\">\n");
      out.write("\t</form>\n");
      out.write("\t<form action=\"contact\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"delete\"> <input type=\"hidden\"\n");
      out.write("\t\t\tname=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <input type=\"submit\"\n");
      out.write("\t\t\tvalue=\"delete\">\n");
      out.write("\t</form>\n");
      out.write("\t<a href=\"contacts\">back to contact list</a>\n");
      out.write("</body>\n");
      out.write("</html>");
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
