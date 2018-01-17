package org.apache.jsp.WEB_002dINF.view;

import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.igate.iconnect.BO.User;

public final class UNIVERSAL_005fListPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/UNIVERSAL_Include.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String menuId=request.getParameter("menuId");
	String parentMenuId=request.getParameter("parentMenuId");
	String menuName=request.getParameter("menuName");
	String parentMenuName = request.getParameter("parentMenuName");
	String id=request.getParameter("id");
	String loginUser = (String)request.getSession().getAttribute("userLoginId");
	User userObj = (User) request.getSession().getAttribute(loginUser);
	String role = (String)userObj.getUserRole();
	
	session.setAttribute("menuId", menuId);
	session.setAttribute("parentMenuId",parentMenuId);
	session.setAttribute("menuName",menuName);
	session.setAttribute("parentMenuName",parentMenuName);

      out.write('\r');
      out.write('\n');
 String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
   String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/jmesa.css\"></link>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/example.css\"></link>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/bp/custom_screen.css\" media=\"screen, projection\"/>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/bp/print.css\" media=\"print\"/>\r\n");
      out.write("<!--[if lt IE 8]><link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/bp/ie.css\" media=\"screen, projection\"/><![endif]-->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/bp/fancy-type/screen.css\" media=\"screen, projection\"/>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/colorbox.css\" media = \"screen\"/>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/common.css\" /> \r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/ui.all.css\" /> \r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/ui.multiselect.css\" />\r\n");
      out.write("\r\n");
      out.write("<title>IConnect : Unified Service Desk for Life & Health</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* if(top.location.href.substring(0, top.location.href.lastIndexOf(\"/\")+1) != window.location.href.substring(0, window.location.href.lastIndexOf(\"/\")+1)){\r\n");
      out.write("\ttop.location=window.location;\r\n");
      out.write("} */\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  .index_datepicker { \r\n");
      out.write("  \tz-index:10000;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(".myDataTable\r\n");
      out.write("{\r\n");
      out.write("    border-left:#a0a0a0 1px solid;\r\n");
      out.write("    background-color:#FFFFFF;    /* TABLE CONTENT BACKGROUND COLOR */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*To use the alternate row style, add class=\" alternaterow\"*/\r\n");
      out.write(".myDataTable tr.alternaterow\r\n");
      out.write("{\r\n");
      out.write("    background-color:#f2fbfd;    /* TABLE ALTERNATE ROW COLOR */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".myDataTable th\r\n");
      out.write("{\r\n");
      out.write("\tbackground:#a9e8fc url(\"../images/blueTableHead.gif\") bottom repeat-x;\r\n");
      out.write("\tpadding:5px;/* 0px 3px 0px;*/\r\n");
      out.write("\tfont-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size:11px;\r\n");
      out.write("\tcolor:#000000;  /* HEADER FONT COLOR */\r\n");
      out.write(" \tborder-right:#a0a0a0 1px solid;\r\n");
      out.write(" \tborder-top:#a0a0a0 1px solid;\t\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".createTable{\r\n");
      out.write("\tcolor:#000000;\r\n");
      out.write("\tborder:#a0a0a0 1px solid;\r\n");
      out.write(" \t\r\n");
      out.write("}\r\n");
      out.write(".myDataTable td\r\n");
      out.write("{\r\n");
      out.write(" \tborder-right:#a0a0a0 1px solid;\r\n");
      out.write(" \tborder-bottom:#a0a0a0 1px solid;\r\n");
      out.write(" \tpadding: 3px;\r\n");
      out.write(" \tfont-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write(" \tfont-size:11px;\r\n");
      out.write(" \tcolor:#000000;    /* TABLE CONTENT FONT COLOR */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myDataTable td.borderlessTextInput\r\n");
      out.write("{\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tfont-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size:11px;\r\n");
      out.write("\tcolor:#1A1A1A;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myDataTable a:link\r\n");
      out.write("{\r\n");
      out.write("\tfont-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size:10px;\r\n");
      out.write("\tcolor:#3057a0;  /* LINKS FONT COLOR */\r\n");
      out.write("\ttext-decoration:underline;\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myDataTable a:hover\r\n");
      out.write("{\r\n");
      out.write("\tfont-family:Verdana, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size:10px;\r\n");
      out.write("\tcolor:#000000;  /* LINKS HOVER FONT COLOR */\r\n");
      out.write("\ttext-decoration:none;\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myDataTable a:visited\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#3057a0;  /* VISITED LINKS HOVER FONT COLOR --> SAME AS NORMAL LINKS */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ticketsTable, .ticketsTable tr, .ticketsTable td\r\n");
      out.write("{\r\n");
      out.write("border: 1px solid black;\r\n");
      out.write(" text-align: center;\r\n");
      out.write(" margin:5px;\r\n");
      out.write("} \r\n");
      out.write("  .red_text\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#FF0000;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#ticketsTable textarea,#ticketsTable input,#ticketsTable select{\r\n");
      out.write("margin:5px;\r\n");
      out.write("}\r\n");
      out.write("#ticketsTable textarea\r\n");
      out.write("{\r\n");
      out.write("height:41px;\r\n");
      out.write("width:242px;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("  .blink\r\n");
      out.write("  {\r\n");
      out.write("  border:2px solid #ff0000;\r\n");
      out.write("  }\r\n");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 String token = null; 
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.jmesa.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jmesa.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/json.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_ListPage.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.colorbox.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Security.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-ui.minCANT4BS2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.ui.datetimepicker.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.multiselect.js\"></script>  \r\n");
      out.write("<form name=\"listForm\" action=\"UNIVERSAL_ListPage.htm\">\r\n");
      out.write("<div id=\"searchResult\"><span class=\"screenHeading\"></span> \r\n");
      out.write("<input type=\"hidden\" name=\"type\" value=\"simplest\"/>\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(menuId );
      out.write("\" name=\"menuId\"></input> \r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(parentMenuId );
      out.write("\" name=\"parentMenuID\"></input>\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(menuName );
      out.write("\" name=\"menuName\"></input>\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(parentMenuName );
      out.write("\" name=\"parentMenuName\"></input>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paginationData}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
 token = (String)request.getSession().getAttribute("OWASP_CSRFTOKEN"); 
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"OWASP_CSRFTOKEN\" value=\"");
      out.print( token );
      out.write("\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var LoginID = '");
      out.print((String) request.getSession().getAttribute(
"userLoginId"));
      out.write("';\r\n");
      out.write("\t\tvar menuID = '");
      out.print(menuId);
      out.write("';\r\n");
      out.write("\t\t var userid = \"");
      out.print(loginUser);
      out.write("\";\r\n");
      out.write("\t\t var role_exception_approval=\"");
      out.print(role);
      out.write("\";\r\n");
      out.write("         <!-- highlight active example based on the parameter passed from request -->\r\n");
      out.write("         $(document).ready(function(){\r\n");
      out.write("        \tif(menuID==8){\r\n");
      out.write(" \t\t\t\tvar timer;\r\n");
      out.write(" \t\t\t\t\tfunction refreshPage(){\r\n");
      out.write(" \t\t\t\t\t\tdocument.location=document.location.href;\r\n");
      out.write(" \t\t\t\t\t}\r\n");
      out.write(" \t\t\t\ttimer=setTimeout(refreshPage,30*1000);\r\n");
      out.write(" \t\t\t }\r\n");
      out.write("            $(\"#btn-\" + \"");
      out.print(request.getParameter("type"));
      out.write("\").removeClass(\"normal\");\r\n");
      out.write("            $(\"#btn-\" + \"");
      out.print(request.getParameter("type"));
      out.write("\").addClass(\"active\");\r\n");
      out.write("\r\n");
      out.write("            if(menuID==0){\r\n");
      out.write("            \t$(\"div.jmesa\").find(\"tr.toolbar\").hide();\r\n");
      out.write("            \t$(\"div.jmesa\").find(\"tr.filter\").hide();\r\n");
      out.write("            }else if(menuID == 114 || menuID == 118  || menuID == 119 || menuID ==120 || menuID==121){\r\n");
      out.write("            \t$(\".customizelistpage\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            $.ajaxSetup({ cache: false });\r\n");
      out.write("            parent.unblockUI();  // For unblocking processing image on load of this page content \r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("\t\t function onInvokeAction(id) {\r\n");
      out.write("                $.jmesa.setExportToLimit(id, '');\r\n");
      out.write("                $.jmesa.createHiddenInputFieldsForLimitAndSubmit(id);\r\n");
      out.write("            }\r\n");
      out.write("         if(menuID=='149'){\r\n");
      out.write("        \t $(\".Core_Id\").hide();\r\n");
      out.write("        \t $(\".Allow_Closeable_Flag\").hide();\r\n");
      out.write("        \t var ticketidIndex=\"\";\r\n");
      out.write("     \t\tvar workflowIndex=\"\";\r\n");
      out.write("     \t\tvar colorCodeIndex=\"\";\r\n");
      out.write("     \t\tvar coreIdIndex=\"\";\r\n");
      out.write("     \t\tvar allowCloseableFlag=\"\";\r\n");
      out.write("     \t\t$(\".jmesa\").find(\".header\").find(\"td\").each(function(j){\r\n");
      out.write("     \t\t\tif($(this).text()==\"C\"){\r\n");
      out.write("     \t\t\t\tcolorCodeIndex=j;\r\n");
      out.write("     \t\t\t}\r\n");
      out.write("     \t\t\tif($(this).text()==\"Ticket #\"){\r\n");
      out.write("     \t\t\t\tticketidIndex=j;\r\n");
      out.write("     \t\t\t}\r\n");
      out.write("     \t\t\tif($(this).text()==\"Status\"){\r\n");
      out.write("     \t\t\t\tworkflowIndex=j;\r\n");
      out.write("     \t\t\t}\r\n");
      out.write("     \t\t\tif($(this).text()==\"Core Id\"){\r\n");
      out.write("     \t\t\t\tcoreIdIndex=j;\r\n");
      out.write("     \t\t\t}\r\n");
      out.write("     \t\t\tif($(this).text()==\"Allow Closeable Flag\"){\r\n");
      out.write("     \t\t\t\tallowCloseableFlag=j;\r\n");
      out.write("     \t\t\t}\r\n");
      out.write("     \t\t});\r\n");
      out.write("     \t\t$(\".jmesa\").find(\"table tbody\").find(\"input\").each(function(){\r\n");
      out.write("     \t\t\tvar obj =  $(this).closest(\"tr\").find(\"td\");\r\n");
      out.write("     \t\t\tvar ticketID =obj.eq(ticketidIndex).text();\r\n");
      out.write("     \t\t\tvar colorCode =obj.eq(workflowIndex).find(\"img\").attr(\"id\");//obj.eq(2).attr();\r\n");
      out.write("     \t\t\t//alert($(obj+\" td:eq(2) img\").attr('id'));\r\n");
      out.write("     \t\t\tvar workflow_status = obj.eq(workflowIndex).text();\r\n");
      out.write("     \t\t\tvar coreId=obj.eq(coreIdIndex).text();\r\n");
      out.write("     \t\t\tvar allowCloseable=obj.eq(allowCloseableFlag).text();\r\n");
      out.write("        \t\t\tvar workflow_status = obj.eq(workflowIndex).text();\r\n");
      out.write("        \t\t\tif(workflow_status!=\"Work In Progress\" && workflow_status!=\"Assigned\" && workflow_status!=\"3rd Party Resolved\"){\r\n");
      out.write("            \t\t\t$(\"#\"+ticketID+\"\").hide();\r\n");
      out.write("\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\tif(coreId!=0 && allowCloseableFlag!=\"Y\"){\r\n");
      out.write("        \t\t\t\t$(\"#\"+ticketID+\"\").hide();\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t});\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
