package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.igate.iconnect.BO.COMMON_Menu;
import com.igate.iconnect.BO.WORKFLOW_Role;
import com.igate.iconnect.BO.User;
import java.util.List;

public final class UserHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/view/UserHeader.jsp");
    _jspx_dependants.add("/WEB-INF/view/UNIVERSAL_EastPanel.jsp");
    _jspx_dependants.add("/WEB-INF/view/UNIVERSAL_CenterPanel.jsp");
    _jspx_dependants.add("/WEB-INF/view/UNIVERSAL_Footer.jsp");
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


String modname=(String)request.getParameter("modname");

      out.write('\r');
      out.write('\n');
 String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
   String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 
   String id=request.getParameter("id");
   String SSOFlag = "NA";
   int gradeLevel=0;
   String empIde = (String) request.getSession().getAttribute(
   "userLoginId");
   User userObject = (User) request.getSession().getAttribute(
           empIde);
   if(userObject.getWorkSpacePlanning_Grade_Level()!=null){
   	gradeLevel= Integer.parseInt(userObject.getWorkSpacePlanning_Grade_Level());
   }
 
   int gradeAccess=userObject.getWorkSpacePlanning_Access();

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>IConnect : Unified Service Desk for Life & Health</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery-ui.css\"  />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery.treeview.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/layout-default-latest.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/iconnect.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/jbar_style.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/user.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.layout-latest.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.tabs.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.treeview.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/demo.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/debug.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/json.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.session.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/requiredfunctions.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/ADMIN_WorkFlow.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Header.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.bar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Security.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.blockUI.js\"></script>  \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("if(top.location.href.substring(0, top.location.href.lastIndexOf(\"/\")+1)!=window.location.href.substring(0, window.location.href.lastIndexOf(\"/\")+1)){\r\n");
      out.write("\ttop.location=window.location;\r\n");
      out.write("}\r\n");
      out.write("var ssoFlag =\"");
      out.print(SSOFlag);
      out.write("\";\r\n");
      out.write("var gradeLevel=");
      out.print(gradeLevel);
      out.write(";\r\n");
      out.write("var gradeAccess=");
      out.print(gradeAccess);
      out.write(";\r\n");
      out.write("$('document').ready(function(){\r\n");
      out.write("\tvar moduleName=$.session(\"modname1\");\r\n");
      out.write("\t$(\"#UserConnect\").show();\r\n");
      out.write("\t$(\"#UserHome\").hide();\r\n");
      out.write("\t$(\"#\"+moduleName).addClass('selected');\r\n");
      out.write("\t$(\"#centeriframe\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\r\n");
      out.write("\tvar html_SearchWindow=getSearchHtml_SearchWindow();\r\n");
      out.write("\t//Commented the below line for Unified Self Service\r\n");
      out.write("\t//\t$('#myAccordion_searchWindow', window.parent.document).html(html_SearchWindow);\t\r\n");
      out.write("\t$('#myAccordion_searchWindow').html(html_SearchWindow);\t\r\n");
      out.write("\t$(\"#lastframe\").attr(\"src\",\"UNIVERSAL_Searchh.htm\");\r\n");
      out.write("\tif(parseInt(gradeLevel,10)>=8 && parseInt(gradeAccess,10)>0){\r\n");
      out.write("\t\t$(\"#WorkspacePlanning\").attr('style','display:block');\r\n");
      out.write("\t\t$(\"#WorkspacePlanning\").show();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#WorkspacePlanning\").attr('style','display:none');\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("function invalidateSess(){\r\n");
      out.write("\t  window.location.href='Logout.htm';\r\n");
      out.write("}\r\n");
      out.write("function getSearchHtml_SearchWindow(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar html=\"<div class='sub_tab_bg'><iframe name='lastframe' id='lastframe' width='100%'  scrolling='no' frameborder='0' onload='javascript:resizeIframes(this);'/></div>\";\r\n");
      out.write("\treturn html;\t\r\n");
      out.write("}\r\n");
      out.write("function resizeIframes(obj) {\t\r\n");
      out.write("\t\tobj.style.height = 1100+ 'px';\r\n");
      out.write("}\r\n");
      out.write("function loadPage(id){\r\n");
      out.write("\t var centerhref = centeriframe.location.href;\r\n");
      out.write("\t if(centerhref.indexOf(\"HELPDESK_Edit.htm\") != -1 && window.frames[\"centeriframe\"].inEditMode){\r\n");
      out.write("\t\t if(confirm(\"Do you want to continue with out updating the ticket?\")){\r\n");
      out.write("\t\t\t var detailTicketId = window.frames[\"centeriframe\"].document.getElementById(\"TICKET_ID\").value;\r\n");
      out.write("\t\t\t releaseTicket(detailTicketId,1);\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("\t//Updated parent.myLayout.close('east') to myLayout.close('east') for Unified Self Service\r\n");
      out.write("\tvar url = \"\";\r\n");
      out.write("\tif(id==\"RaiseNewTicket\"){\r\n");
      out.write("\t\turl = \"HELPDESK_Create.htm\";\t\r\n");
      out.write("\t}else if(id==\"ExistingTickets\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\turl = \"UNIVERSAL_ListPage.htm?menuId=38&parentMenuId=1&menuName=Existing Tickets&parentMenuName=HelpDesk\";\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"WaitingForApproval\"){\r\n");
      out.write("\t\turl = \"UNIVERSAL_ListPage.htm?menuId=51&parentMenuId=1&menuName=Waiting For My Approval&parentMenuName=HelpDesk\";\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}else if(id==\"ApprovedByMe\"){\r\n");
      out.write("\t\turl = \"UNIVERSAL_ListPage.htm?menuId=94&parentMenuId=1&menuName=Approved by me&parentMenuName=HelpDesk\";\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"RejectedByMe\"){\r\n");
      out.write("\t\turl = \"UNIVERSAL_ListPage.htm?menuId=95&parentMenuId=1&menuName=Rejected by me&parentMenuName=HelpDesk\";\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"ContactInfo\"){\r\n");
      out.write("\t\turl = \"CONTACTUS_HelpDeskAndEscalation.htm\";\t\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"ViewAssetDetail\"){\r\n");
      out.write("\t\t//ASSET TAB: Added to display the Asset tab for all Users(Added by 716302)\r\n");
      out.write("\t\turl = \"HELPDESK_AssetAllDetail.htm\";\t\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"Home\"){\r\n");
      out.write("\t\t//parent.window.location.href=\"User.htm?\";\r\n");
      out.write("\t\twindow.location.href=\"goSearchHome.htm\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else if(id==\"CreateMasterTicket\")  {\r\n");
      out.write("\t\turl = \"MASTER_Create.htm\";\t\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}else if(id==\"ViewMasterTicket\")  {\r\n");
      out.write("\t\turl = \"UNIVERSAL_ListPage.htm?menuId=114&parentMenuId=114&menuName=View Master Ticket&parentMenuName=Helpdesk\";\t\r\n");
      out.write("\t\tmyLayout.close('east');\r\n");
      out.write("\t}\r\n");
      out.write("\t$('.topmenu a').removeClass('selected');\r\n");
      out.write("\t$('#'+id).addClass('selected');\r\n");
      out.write("\t blockUI();\r\n");
      out.write("\t$(\"#centeriframe\").attr(\"src\",url);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function jbarOnSuccess(message){\r\n");
      out.write("\t$(\"#jbarmessage\").bar({\r\n");
      out.write("\t\tcolor \t\t\t : 'BLACK',\r\n");
      out.write("\t\tbackground_color : '#C8DD9C',\r\n");
      out.write("\t\tposition\t\t : 'bottom',\r\n");
      out.write("\t\tremovebutton     : true,\r\n");
      out.write("\t\tmessage\t\t\t : message,\r\n");
      out.write("\t\ttime\t\t\t : 4000\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("function jbarOnFailure(message){\r\n");
      out.write("\t$(\"#jbarmessage\").bar({\r\n");
      out.write("\t\tcolor \t\t\t : 'BLACK',\r\n");
      out.write("\t\tbackground_color : 'RED',\r\n");
      out.write("\t\tposition\t\t : 'bottom',\r\n");
      out.write("\t\tremovebutton     : true\t,\r\n");
      out.write("\t\tmessage\t\t\t : message,\r\n");
      out.write("\t\ttime\t\t\t : 4000\r\n");
      out.write("\t});\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function ticketUnlocking(){\r\n");
      out.write("\t var centerhref = centeriframe.location.href;\r\n");
      out.write("\t if(centerhref.indexOf(\"HELPDESK_Edit.htm\") != -1 && window.frames[\"centeriframe\"].inEditMode){\r\n");
      out.write("\t\t\t var detailTicketId = window.frames[\"centeriframe\"].document.getElementById(\"TICKET_ID\").value;\r\n");
      out.write("\t\t\t releaseTicket(detailTicketId,1);\r\n");
      out.write("\t  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function releaseTicket(ticketId,menuId){\r\n");
      out.write("\t\r\n");
      out.write("\tvar jsonobj = '{\"JSONARRAY\":['+'{\"TICKET_ID\":\"'+ticketId+'\",\"MENU_ID\":\"'+menuId+'\"}'+']}';\r\n");
      out.write("\t\r\n");
      out.write("\t$.getJSON('unlockTickets.htm', {json:jsonobj}, function(data) {\r\n");
      out.write("\t\tif(data.status==\"Success\"){\r\n");
      out.write("\t\t \t window.frames[\"centeriframe\"].inEditMode = false;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t});\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function iConnectLogOut(){\r\n");
      out.write("\t var centerhref = centeriframe.location.href;\r\n");
      out.write("\t if(centerhref.indexOf(\"HELPDESK_Edit.htm\") != -1 && window.frames[\"centeriframe\"].inEditMode){\r\n");
      out.write("\t\t if(confirm(\"Do you want to continue with out updating the ticket?\")){\r\n");
      out.write("\t\t\t var detailTicketId = window.frames[\"centeriframe\"].document.getElementById(\"TICKET_ID\").value;\r\n");
      out.write("\t\t\t releaseTicket(detailTicketId,1);\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("\twindow.location.href='Logout.htm';\r\n");
      out.write("}\r\n");
      out.write("function blockUI(){\r\n");
      out.write("\t$('.ui-layout-center').block({ css: {   \r\n");
      out.write("        border: 'none', \r\n");
      out.write("        padding: '15px', \r\n");
      out.write("        backgroundColor: '#000', \r\n");
      out.write("        '-webkit-border-radius': '10px', \r\n");
      out.write("        '-moz-border-radius': '10px', \r\n");
      out.write("        opacity: .5, \r\n");
      out.write("        color: '#fff' \r\n");
      out.write("    } });\r\n");
      out.write("}\r\n");
      out.write("function unblockUI(){\r\n");
      out.write("\t$('.ui-layout-center').unblock();  \r\n");
      out.write("}   \r\n");
      out.write("</script>\r\n");
      out.write("<!-- Header Menu -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"ui-layout-north\" style=\"padding: 0px;\">\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("<div style=\"text-align: right;\">\r\n");
  String empId = (String) request.getSession().getAttribute(
"userLoginId");
User userObj = (User) request.getSession().getAttribute(
        empId);
String empName = userObj.getUserName();
String currentUserRole = userObj.getUserRole();
List<WORKFLOW_Role> userRoleList = userObj.getUserRoleList();


long currentUserRoleID = 0;


      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("if(top.location.href.substring(0, top.location.href.lastIndexOf(\"/\")+1)!=window.location.href.substring(0, window.location.href.lastIndexOf(\"/\")+1)){\r\n");
      out.write("\ttop.location=window.location;\r\n");
      out.write("}\r\n");
      out.write("\t\t\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("\tif(parseInt(gradeLevel,10)>=8 && parseInt(gradeAccess,10)>0){\r\n");
      out.write("\t\t$(\"#WorkspacePlanning\").attr('style','display:block');\r\n");
      out.write("\t\t$(\"#WorkspacePlanning\").show();\r\n");
      out.write("\t}\r\n");
      out.write("  });\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"topnav\" class=\"topnav\">\r\n");
      out.write("\t<div style=\"text-align:right;\"> \r\n");
      out.write("        Welcome <strong>");
      out.print(empName );
      out.write("</strong><a href=\"login\" class=\"signin\"><img src=\"images/profile.png\" alt=\"My Profile\" title=\"My Profile\"/></a><a href=\"#\" onclick=\"iConnectLogOut();\"><img src=\"images/logout.png\" alt=\"Logout\" title=\"Logout\"/></a><img src=\"images/Capgemini_Header_Logo.png\"/>\r\n");
      out.write("                \t<br/>\t            \t\r\n");
      out.write("   \t</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<fieldset id=\"signin_menu\">\r\n");
      out.write("\t<form id = \"changeRole\" action=\"/iconnect/RoleChanged.htm\" method=\"POST\">\r\n");
      out.write("\t<select name = \"userRoleId\" id = \"userRoleId\" onchange=\"isChange()\">\r\n");
      out.write("\t");

		for(int i = 0; i < userRoleList.size(); i++){
			WORKFLOW_Role role = userRoleList.get(i);
			if(currentUserRole.equalsIgnoreCase(role.getRoleName())){
				currentUserRoleID = role.getRoleId();
		
      out.write("\r\n");
      out.write("\t\t<option value=\"");
      out.print( role.getRoleId());
      out.write("\" selected = \"selected\">");
      out.print( role.getRoleName());
      out.write("</option>\r\n");
      out.write("\t\t");

			}else{
		
      out.write("\r\n");
      out.write("\t\t<option value=\"");
      out.print( role.getRoleId());
      out.write('"');
      out.write('>');
      out.print( role.getRoleName());
      out.write("</option>\r\n");
      out.write("\t\t");

			}
	}
		
		
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\t  </select>\r\n");
      out.write("\t  </form>\r\n");
      out.write("      \r\n");
      out.write("  </fieldset>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<span class=\"title\"><img src=\"images/iConnect_Logo.png\" title=\"Logo\"/></span><br />\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"topmenu\" id=\"UserHome\"> \r\n");
      out.write("<a href=\"User.htm?\" id=\"HomeScreen\" class = \"selected\">Home</a>&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"topmenu\" id=\"UserConnect\" style=\"display:none;\"> \r\n");
      out.write("<a href=\"#\" id=\"Home\" onclick=\"loadPage(this.id)\"  title=\"Self Help\">Home&nbsp;</a>\r\n");
      out.write(" <a href=\"#\" id=\"RaiseNewTicket\" onclick=\"loadPage(this.id)\"  title=\"Raise New Ticket\">New</a>\r\n");
      out.write(" <a href=\"#\" id=\"ExistingTickets\" onclick=\"loadPage(this.id)\"  title=\"View Existing Ticket\">View</a>\r\n");
      out.write(" <a href=\"#\" id=\"WaitingForApproval\" onclick=\"loadPage(this.id)\"  title=\"Waiting For My Approval\">Waiting for Approval</a>\r\n");
      out.write(" <a href=\"#\" id=\"ApprovedByMe\" onclick=\"loadPage(this.id)\"  title=\"Approved By Me\">Approved By Me</a>\r\n");
      out.write(" <a href=\"#\" id=\"RejectedByMe\" onclick=\"loadPage(this.id)\"  title=\"Rejected By Me\">Rejected By Me</a>\r\n");
      out.write("<!--  <a href=\"#\" id=\"CreateServiceTicket\" onclick=\"loadPage(this.id)\" title=\"Create Service Ticket\">Create Service Ticket</a> \r\n");
      out.write(" <a href=\"#\" id=\"ViewServiceTicket\" onclick=\"loadPage(this.id)\" title=\"View Service Ticket\">View Service Ticket</a>  -->\r\n");
      out.write(" <!-- <a href=\"#\" id=\"ViewAssetDetail\" onclick=\"loadPage(this.id)\"  title=\"View-Asset\">View-Asset</a> -->\r\n");
      out.write(" <a href=\"#\" id=\"ContactInfo\" onclick=\"loadPage(this.id)\" title=\"Esclations & Contact Info\">Contact Info</a> \r\n");
      out.write("<!--  <a href=\"#\" id=\"WorkspacePlanning\" onclick=\"loadPage(this.id)\" title=\"Workspace Planning\" style=\"display:none\" >Workspace Planning</a> -->\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- End of Header Menu -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"ui-layout-east\">\r\n");
      out.write("<div id=\"myAccordion_searchWindow\">\r\n");
      out.write("</div>\r\n");
      out.write(" <div id=\"myAccordion_serviceWindow\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Center Panel -->\r\n");
      out.write("<div class=\"ui-layout-center\" style=\"padding:0px; margin:0px; background-color:#ffffff;overflow-x: scroll; !important\"> \r\n");
      out.write("\t<iframe id=\"centeriframe\" name=\"centeriframe\" width=\"99%\" height=\"98%\"></iframe>\t \r\n");
      out.write(" </div> \r\n");
      out.write("\r\n");
      out.write("<!-- End of Center Panel -->\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<div class=\"ui-layout-south\"> \r\n");
      out.write("\tCopyright &copy; IGATE. All Rights Reserved.\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<!-- End of Footer -->\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("<input type=\"hidden\" id=\"jbarmessage\" name=\"jbarmessage\"></input>\r\n");
      out.write("</div>\r\n");
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
