package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class UNIVERSAL_005fSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
 String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
   String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 
   
  // ResourceBundle bundle = ResourceBundle.getBundle("smartsearch");
  // String iConnectURL=bundle.getString("iConnectURL");
  String schema = request.getScheme();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String contextPath = request.getContextPath();
		String iConnectURL = schema + "://" + serverName + ":" + serverPort + contextPath;
		//System.out.println("iConnectURL:::"+iConnectURL);


      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Artificial Intelligence - Search</title>\r\n");
      out.write("<link href=\"");
      out.print(cssDirPath);
      out.write("/UNIVERSAL_Search_Style.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(cssDirPath);
      out.write("/ui.base.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.print(cssDirPath);
      out.write("/ui.theme.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.print(cssDirPath);
      out.write("/jquery.autocomplete.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.pagination.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.dotdotdot.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/search.js\"></script>\r\n");
      out.write("<link href=\"");
      out.print(cssDirPath);
      out.write("/UNIVERSAL_Search_pagination_new.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var context = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("loc = String(window.location);\r\n");
      out.write("var urlAppl = loc.substr(0,loc.indexOf(context));\r\n");
      out.write("var home = '");
      out.print(iConnectURL);
      out.write("';\r\n");
      out.write("var usrLocation = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.location}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var searchText=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.subject}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var ticketID=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ticketID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var menuID=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.menuID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${backToSrch}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" == \"true\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\t    $('#textfield').css('color' , '#666666');\r\n");
      out.write("\t\t\t$('#textfield').val(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.srchTxt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t\t\tsubmitTxt();\r\n");
      out.write("\t}\r\n");
      out.write("\t$('#textfield').click(function(event){\r\n");
      out.write("\t\t event.stopPropagation(); \r\n");
      out.write("\t\t if($(this).val() == 'Search Your Query')\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t\t $(this).val('');\r\n");
      out.write("\t\t\t $(this).css('color' , '#000000');\r\n");
      out.write("\t\t }\r\n");
      out.write("\t});\r\n");
      out.write("\t$('#button').click(function(event){\r\n");
      out.write("\t\t event.stopPropagation(); \r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$('#tagTable').click(function(event){\r\n");
      out.write("\t\t event.stopPropagation(); \r\n");
      out.write("\t});\r\n");
      out.write("\t$(document).mouseup(function (e){\r\n");
      out.write("\t    var container = $('#container').find('ul');\r\n");
      out.write("\t    if (container.has(e.target).length === 0){\r\n");
      out.write("\t        container.hide();\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("$(\"#textfieldContainer\").keyup(function(event){\r\n");
      out.write("switch(event.keyCode) {\r\n");
      out.write("\tcase 33:\r\n");
      out.write("\t\tmovePrevOption();\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\tcase 34:\r\n");
      out.write("\t\tmoveNextOption();\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\tcase 38:\r\n");
      out.write("\t\tmovePrevOption();\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\tcase 40:\r\n");
      out.write("\t\tmoveNextOption();\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\tcase 13:\r\n");
      out.write("\t\tif($('li').hasClass('ui-state-hover'))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\"#textfield\").val($('#selectedOption').text());\r\n");
      out.write("\t\t\t$('#container').find('ul').remove();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('#container').find('ul').remove();\r\n");
      out.write("\t\t\tsubmitTxt();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\tdefault:\r\n");
      out.write("\t\tshowSuggestions();\r\n");
      out.write("\t\tbreak;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#searchTip\").show();\r\n");
      out.write("\t$(\"#onResultNotFound\").hide();\r\n");
      out.write("\t$(\"#onResultFound\").hide();\r\n");
      out.write("\t$('#textfield').val(searchText.replace(/%22/g,\" \"));\r\n");
      out.write("\tsubmitTxt();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("var docArrLength = 0;\r\n");
      out.write("var start =0 ;\r\n");
      out.write("function setSubjectFlag(){\r\n");
      out.write("\t$(\"#isSaveSubjectReqd\").val('1');\r\n");
      out.write("}\r\n");
      out.write("function downloadAttachment(url){\r\n");
      out.write("\tlocation.href=url;\r\n");
      out.write("}\r\n");
      out.write("function pageselectCallback(page_index, jq) {\r\n");
      out.write("\tstart = (page_index * 10)+1;\r\n");
      out.write("\tvar newcontent = ' ';\r\n");
      out.write("\tif (docArrLength > 10) {\r\n");
      out.write("\t\tend = (page_index * 10) + 10 ;\r\n");
      out.write("\t\tif(docArrLength > end )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t  $(\"#totalCont\").text(\"Showing \"+start+\" to \"+end+\" of \"+docArrLength+\" results \"  );\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t  $(\"#totalCont\").text(\"Showing \"+start+\" to \"+docArrLength+\" of \"+docArrLength+\" results \"  );\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t $(\"#totalCont\").text(\"Showing \"+start+\" to \"+docArrLength+\" of \"+docArrLength+\" results \"  );\r\n");
      out.write("\t}\r\n");
      out.write("\tif (page_index == 0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tstart = 0;\r\n");
      out.write("\t} else\r\n");
      out.write("\t{\r\n");
      out.write("\t\tstart =start -1;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar string =$(\"#textfield\").val();\r\n");
      out.write("\tvar count = string.split(\" \");\r\n");
      out.write("\tif(count.length == 1 || count.length == 2)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tmm =1;\r\n");
      out.write("\t}else\r\n");
      out.write("\t{\r\n");
      out.write("\t\tmm =1;\r\n");
      out.write("\t}\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t  type: 'GET',\r\n");
      out.write("\t\t\turl :  home+'/select?q='\r\n");
      out.write("\t\t\t+ $(\"#textfield\").val() + '&mm='+mm+'&wt=json&start='+start+'&timSt'+new Date(),\r\n");
      out.write("\t\t  dataType: \"json\",\r\n");
      out.write("\t\t  success: function(xml){\r\n");
      out.write("\t\t  docArrLength = xml.response.numFound;\r\n");
      out.write("\t    if(docArrLength == 0)\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t    //Changed by Mohit to show the proper image as per result\r\n");
      out.write("\t \t\t  $(\"#Pagination\").hide();\r\n");
      out.write("\t \t\t  //$(\"#totalCont\").text(\"No result Found\");\r\n");
      out.write("\t \t\t  $('#Searchresult').html('');\r\n");
      out.write("\t \t\t $(\"#searchTip\").hide();\r\n");
      out.write("\t \t\t$(\"#onResultNotFound\").show();\r\n");
      out.write("\t \t\t$(\"#onResultFound\").hide();\r\n");
      out.write("\r\n");
      out.write("\t    }\r\n");
      out.write("\t    else{\r\n");
      out.write("\t    \t  $(\"#searchTip\").hide();\r\n");
      out.write("\t\t \t  $(\"#onResultNotFound\").hide();\r\n");
      out.write("\t\t \t $(\"#onResultFound\").show();\r\n");
      out.write("\t  \t\t  var docArr = xml.response.docs;\r\n");
      out.write("\t\t\t  var link = \"\";\r\n");
      out.write("\t\t\t  var id = \"\";\r\n");
      out.write("\t          var isTag = false;\r\n");
      out.write("\t          var isPolicyDoc = false;\r\n");
      out.write("           \t  var imgSrc = \"\";\r\n");
      out.write("              var alt = \"\";\r\n");
      out.write("              var type=\"\";\r\n");
      out.write("              var downloadFileType=\"doc|docx|ppt|pptx|xls|xlsx\"\r\n");
      out.write("\t\t\t  for (count = 0; count < docArr.length; count++) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tid = docArr[count].id;\r\n");
      out.write("\t\t\t\t\tif(docArr[count].id.indexOf('TG') != -1)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tisTag = true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse if(docArr[count].id.indexOf('DC') != -1)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tlink = docArr[count].srch_links ;\r\n");
      out.write("\t\t\t\t\t\timgSrc=\"images/searchAI/Doc.png\";\r\n");
      out.write("\t\t\t\t\t\talt=\"Document\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse if(docArr[count].id.indexOf('PD_') != -1)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tisPolicyDoc = true;\r\n");
      out.write("\t\t\t\t\t\tlink = docArr[count].srch_links ;\r\n");
      out.write("\t\t\t\t\t\timgSrc=\"images/searchAI/Doc.png\";\r\n");
      out.write("\t\t\t\t\t\talt=\"Policy Document\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tlink = \"\";\r\n");
      out.write("\t\t\t\t\t\timgSrc=\"images/searchAI/ticket.png\";\r\n");
      out.write("\t\t\t\t\t\talt=\"IConnect Ticket\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t  if(isTag)\r\n");
      out.write("\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t \t  newcontent +=\"<div class=\\\"result\\\">\";\r\n");
      out.write("\t\t\t\t\t\t  newcontent += \"<a href=\\\"#\\\" onclick=\\\"onclick=updateUsageCount('\"+id+\"');OpenPopup('\"+link+\"','\"+id+\"','\"+$('#textfield').val()+\"','\"+isTag+\"');\\\"><img src=\\\"images/searchAI/User.png\\\" alt=\\\"User Solution\\\"/>\"+docArr[count].srch_links_name+\"</a>\";\r\n");
      out.write("\t\t\t\t\t\t  newcontent +=\"<span>\"+docArr[count].srch_summary+\"</span><span></span>\";\r\n");
      out.write("\t\t\t\t\t\t  newcontent +=\"</div>\";\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t  }else if(isPolicyDoc)\r\n");
      out.write("\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t \t  newcontent +=\"<div class=\\\"result\\\">\"\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<a onmouseover=\\\"document.getElementById('div_name').style.display='';showAddInfo('\"+docArr[count].srch_func+\"', '\"+docArr[count].srch_catg+\"','\"+docArr[count].srch_sub_catg+\"')\\\" \";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"onmouseout=\\\"document.getElementById('div_name').style.display='none';\\\"  \";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  link = String(link);\r\n");
      out.write("                              \tif( link.indexOf('html') !=-1 && link.indexOf('htm') !=-1 && link.indexOf('pdf')!=-1 )\r\n");
      out.write("                                 {\r\n");
      out.write("                                \t newcontent +=\"href=\\\"\"+link+\"\\\" onclick=updateUsageCount('\"+id+\"')\\\"><img src=\\\"\"+imgSrc+\"\\\" alt=\\\"\"+alt+\"\\\"/> \"+docArr[count].srch_links_name+\"</a>\";\r\n");
      out.write("                                 }else\r\n");
      out.write("                                 {\r\n");
      out.write("                                \t newcontent +=\"href=\\\"#\\\" onclick=\\\"window.open('\"+link+\"');updateUsageCount('\"+id+\"')\\\"><img src=\\\"\"+imgSrc+\"\\\" alt=\\\"\"+alt+\"\\\"/> \"+docArr[count].srch_links_name+\"</a>\";\r\n");
      out.write("                                 }\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<span>  \"+docArr[count].srch_summary+\"</span><span></span>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"</div>\";\t\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t  if(link != \"\")\r\n");
      out.write("\t\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t\t  if ( ticketID !=\"\" && (menuID==13 || menuID==46)){\t\r\n");
      out.write("\t\t\t\t\t\t \t  newcontent +=\"<div class=\\\"result\\\">\"\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<div class='linkhref'><a href='#' onclick=\\\"updateUsageCount('\"+id+\"');downloadAttachment('DownloadAttachmentForAI.htm?docLink=\"+link+\"')\\\"><img src=\\\"\"+imgSrc+\"\\\" alt=\\\"\"+alt+\"\\\"/> \"+docArr[count].srch_links_name+\"</a></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<div class='attach'><img src=\\\"images/searchAI/attachment-icon.png\\\" style=\\\"cursor: pointer\\\" onclick=\\\"updateAttachmentToTicket('\"+ticketID+\"','\"+link+\"')\\\"alt=\\\"Attachment\\\"/ title=\\\"Link to Ticket\\\"/><img src=\\\"images/searchAI/attachment-remove.png\\\" style=\\\"cursor: pointer\\\" onclick=\\\"inactivateAttachmentFromTicket('\"+ticketID+\"','\"+link+\"')\\\"alt=\\\"Remove Attachment\\\"/ title=\\\"Remove from Ticket\\\"/></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<div style='clear:both'></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<span>  \"+docArr[count].srch_summary+\"</span><span></span>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"</div>\";\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t newcontent +=\"<div class=\\\"result\\\">\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  newcontent +=\"<div class='linkhref'><a href='#' onclick=\\\"updateUsageCount('\"+id+\"');downloadAttachment('DownloadAttachmentForAI.htm?docLink=\"+link+\"')\\\"><img src=\\\"\"+imgSrc+\"\\\" alt=\\\"\"+alt+\"\\\"/> \"+docArr[count].srch_links_name+\"</a></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t // newcontent +=\"<div class='attach'><img src=\\\"images/searchAI/attachment-icon.png\\\" style=\\\"cursor: pointer\\\" onclick=\\\"updateAttachmentToTicket('\"+ticketID+\"','\"+link+\"')\\\"alt=\\\"Attachment\\\"/ title=\\\"Link to Ticket\\\"/><img src=\\\"images/searchAI/attachment-remove.png\\\" style=\\\"cursor: pointer\\\" onclick=\\\"inactivateAttachmentFromTicket('\"+ticketID+\"','\"+link+\"')\\\"alt=\\\"Remove Attachment\\\"/ title=\\\"Remove from Ticket\\\"/></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  newcontent +=\"<div style='clear:both'></div>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  newcontent +=\"<span>  \"+docArr[count].srch_summary+\"</span><span></span>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  newcontent +=\"</div>\";\r\n");
      out.write("\t\t\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t\t  else\r\n");
      out.write("\t\t\t\t\t\t  {\r\n");
      out.write("\t\t\t\t\t\t \t  newcontent +=\"<div class=\\\"result\\\">\"\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<a href=\\\"#\\\" onclick=\\\"updateUsageCount('\"+id+\"');OpenPopup('\"+link+\"','\"+id+\"','\"+$('#textfield').val()+\"','\"+isTag+\"')\\\"><img src=\\\"\"+imgSrc+\"\\\" alt=\\\"\"+alt+\"\\\"/> \"+docArr[count].srch_links_name+\"</a>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"<span>  \"+docArr[count].srch_summary+\"</span><span></span>\";\r\n");
      out.write("\t\t\t\t\t\t\t  newcontent +=\"</div>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t   }\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t  isTag = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t  $('#Searchresult').html(newcontent);\r\n");
      out.write("\t\t\t  $(\"#Pagination\").show();\r\n");
      out.write("\t\t\t    $(\".result\").dotdotdot({\r\n");
      out.write("\t\t\t \t    ellipsis        : '... ',\r\n");
      out.write("\t\t\t        wrap            : 'word',\r\n");
      out.write("\t\t\t        after           : null,\r\n");
      out.write("\t\t\t        watch           : false,\r\n");
      out.write("\t\t\t        height          : null,\r\n");
      out.write("\t\t\t        tolerance       : 0,\r\n");
      out.write("\t\t        callback        : function( isTruncated, orgContent ) {},\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t        lastCharacter   : {\r\n");
      out.write("\t\t\t            remove          : [ ' ', ',', ';', '.', '!', '?' ],\r\n");
      out.write("\t\t\t            noEllipsis      : []\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t\t  }   \r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("function getOptionsFromForm() {\r\n");
      out.write("\tvar opt = {\r\n");
      out.write("\t\tcallback : pageselectCallback\r\n");
      out.write("\t};\r\n");
      out.write("\topt.prev_text = \"Prev\";\r\n");
      out.write("\topt.next_text = \"Next\";\r\n");
      out.write("\t$(\"input:text\")\r\n");
      out.write("\t\t\t.each(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\topt[this.name] = this.className.match(/numeric/) ? parseInt(this.value)\r\n");
      out.write("\t\t\t\t\t\t\t\t: this.value;\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\tvar htmlspecialchars ={ \"&\":\"&amp;\", \"<\":\"&lt;\", \">\":\"&gt;\", '\"':\"&quot;\"}\r\n");
      out.write("\t$.each(htmlspecialchars, function(k,v){\r\n");
      out.write("\topt.prev_text = opt.prev_text.replace(k,v);\r\n");
      out.write("\topt.next_text = opt.next_text.replace(k,v);\r\n");
      out.write("\t})\r\n");
      out.write("\treturn opt;\r\n");
      out.write("}\r\n");
      out.write("$(document).keypress(function(event\t) {\r\n");
      out.write("\tif(event.which == 13)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tsubmitTxt();\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("function showAddInfo(funcName, categ, subCateg ,t)\r\n");
      out.write("{\r\n");
      out.write("\tvar txt = \r\n");
      out.write("\"<ul class=\\\"addInfoContent\\\"><li>Function Name : \"+funcName+\"</li><li>Category : \"+categ+\"</li><li>Sub Category : \"+subCateg+\"</li></ul>\";\r\n");
      out.write("    $('#div_name').html(txt);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 String token = null; 
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("   <!-- <td colspan=\"3\" align=\"center\" valign=\"top\" class=\"headerLine\" >\r\n");
      out.write("    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"header_bg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"15%\" align=\"left\" valign=\"middle\"><img src=\"images/iConnect_Logo.png\" width=\"205\" height=\"60\" /></td>\r\n");
      out.write("        <td width=\"70%\" align=\"center\"><img src=\"images/header.png\" /></td>\r\n");
      out.write("        <td width=\"15%\" align=\"right\" valign=\"middle\"><img src=\"images/Capgemini_Search_Logo.png\" width=\"150\" height=\"73\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  -->\r\n");
      out.write("  <!--<tr>\r\n");
      out.write("    <td width=\"15%\" height=\"69\" align=\"center\" valign=\"top\"><table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("        \t<div class=\"board\">\r\n");
      out.write("          \t\t<div><strong>Bulletin Board</strong></div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("    <div class=\"helpdesk\">\r\n");
      out.write("          \t\t<div><strong>Helpdesk - iConnect</strong></div>\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><a>Raise New Ticket</a></li>\r\n");
      out.write("                <li><a>View Existing Ticket</a></li>\r\n");
      out.write("                <li><a>Waiting For My Approval</a></li>\r\n");
      out.write("                <li><a>Approved By Me</a></li>\r\n");
      out.write("                <li><a>Rejected By Me</a></li>\r\n");
      out.write("                <li><a>HelpDesk & Escalations</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                \r\n");
      out.write("        \t</div>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("   </table></td> -->\r\n");
      out.write("\t\t<td width=\"70%\" align=\"center\" valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"98%\" border=\"0\" align=\"center\" cellpadding=\"0\"\r\n");
      out.write("\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<!--  width=\"350\"=width=\"800\"      -->\r\n");
      out.write("\t\t\t\t<td height=\"85\" align=\"center\" valign=\"middle\">\r\n");
      out.write("\t\t\t\t<table width=\"350\" border=\"0\" align=\"center\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("<!-- Changed by Mohit(816452) for enhacement in UI -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"80\" align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"textfieldContainer\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100%\" class=\"search\" align=\"left\"><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"textfield\" type=\"text\" id=\"textfield\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Search Your Query\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonfocus=\"if(this.value != '') {this.value='';this.style.color='#000';}\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonblur=\"if(this.value == '') {this.value='Search Your Query';this.style.color='#aaa';}\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"><input style=\"margin-left: -30px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"image\" name=\"button\" id=\"button\" value=\"Search\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"setSubjectFlag();submitTxt()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images//searchAI/SearchbtnRaise.png\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"hidden\" id='isSaveSubjectReqd' value='0'></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"85%\" id=\"container\" align=\"left\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("<!-- End of changed by Mohit(816452) for enhacement in UI -->\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div id=\"searchTip\" class=\"searchTip\"><img width=\"90%\"\r\n");
      out.write("\t\t\t\t\tsrc=\"images//searchAI/OnLoadTip.png\" /></div>\r\n");
      out.write("\t\t\t\t<div id=\"onResultFound\" class=\"searchTip\"><img width=\"90%\"\r\n");
      out.write("\t\t\t\t\tsrc=\"images//searchAI/OnResFound.png\" /></div>\r\n");
      out.write("\t\t\t\t<div id=\"onResultNotFound\" class=\"searchTip\"><img width=\"90%\"\r\n");
      out.write("\t\t\t\t\tsrc=\"images//searchAI/OnResNotFound.png\" /></div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"102\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<div id=\"Searchresult\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"Pagination\" class=\"pagination\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<span class=\"current prev\">Prev</span> <span class=\"current\">1</span>\r\n");
      out.write("\t\t\t\t<a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">5</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\">6</a> <a href=\"#\">7</a> <a href=\"#\">8</a> <a href=\"#\">9</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\">10</a> <span>...</span> <a href=\"#\">60</a> <a href=\"#\">61</a>\r\n");
      out.write("\t\t\t\t<a class=\"next\" href=\"#\">Next</a></div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td width=\"15%\" align=\"center\" valign=\"top\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<!--\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"3\" align=\"center\" valign=\"middle\" class=\"footer\">Copyrights &copy;IGATE All Rights Reserved.</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("-->\r\n");
      out.write("</table>\r\n");
 token = (String)request.getSession().getAttribute("OWASP_CSRFTOKEN"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"OWASP_CSRFTOKEN\" value=\"");
      out.print( token );
      out.write("\" />\r\n");
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
