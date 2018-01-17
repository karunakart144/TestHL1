package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.igate.iconnect.BO.User;
import com.igate.iconnect.BO.WORKFLOW_Role;

public final class HELPDESK_005fEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonKeyDown_005fmaxlength_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fstyle_005fpath_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftitle_005fsize_005fpath_005fonclick_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonKeyDown_005fmaxlength_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fstyle_005fpath_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftitle_005fsize_005fpath_005fonclick_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonKeyDown_005fmaxlength_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.release();
    _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fstyle_005fpath_005fid.release();
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftitle_005fsize_005fpath_005fonclick_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String loginUser = (String)request.getSession().getAttribute("userLoginId");
User userObj = (User) request.getSession().getAttribute(loginUser);
String loginrole=userObj.getUserRole();
String id=request.getParameter("id");
List<WORKFLOW_Role> userRoleList=userObj.getUserRoleList();
int roleListSize=userRoleList.size();
String empName = userObj.getUserName();
String role = (String)userObj.getUserRole();
String subject=request.getParameter("subject");
String approvalExceptionFlag = userObj.getApprovalExceptionFlag();
/*if(subject.toString().contains("\"")){
	subject=subject.toString().replace("\"", "&#34;");
}*/
subject=URLEncoder.encode(subject.toString(), "UTF-8");
String category=request.getParameter("category");
String subcategory=request.getParameter("subcategory");
String function=request.getParameter("function");
String todoAction=request.getParameter("toDOAction"); // To Know whether the user clicked on View or Edit.

String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 
ResourceBundle bundle = ResourceBundle.getBundle("iconnect");
String AI_search_URL=bundle.getString("AISearchURL");
/* ResourceBundle uninstallationCategory = ResourceBundle.getBundle("unistallation_category");
String categories=uninstallationCategory.getString("category_id"); */


      out.write("\r\n");
      out.write("\r\n");

String menuId=(String)session.getAttribute("menuId");
String parentMenuId=(String)session.getAttribute("parentMenuId");
String menuName=(String)session.getAttribute("menuName");
String parentMenuName=(String)session.getAttribute("parentMenuName");


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>IConnect : Unified Service Desk for Life & Health</title>\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/validationEngine.jquery.css\"\r\n");
      out.write("\tmedia=\"screen\" rel=\"stylesheet\" />\r\n");
      out.write("\t      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/iconnect.css\" />\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/ui.all.css\" />\r\n");
      out.write("      <link media = \"screen\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/colorbox.css\" />    \r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery.checkboxtree.css\"/> \r\n");
      out.write("      <link type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery.bt.css\" media=\"screen\"\r\n");
      out.write("\trel=\"stylesheet\" />    \r\n");
      out.write("\t \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/tab_style.css\"/> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/example.css\"/> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.print(cssDirPath);
      out.write("/jmesa.css\"></link>\r\n");
      out.write("\t <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/user.css\" />\r\n");
      out.write("\t <style>\r\n");
      out.write("\t\t#ORCH_MSG_TR,#ASSET_MSG_TR{\r\n");
      out.write("\t\t font-weight: bold;\r\n");
      out.write("\t\ttext-decoration:blink;\r\n");
      out.write("\t\tpadding:5px;\r\n");
      out.write("\t\tdisplay:block;\r\n");
      out.write("\t\tborder:1px solid #00a1e4;\r\n");
      out.write("\t\tbackground: #eee;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.tabnavi, .tabnavi ul{\r\n");
      out.write("\t\twidth:auto !important;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>  \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("if(top.location.href.substring(0, top.location.href.lastIndexOf(\"/\")+1)!=window.location.href.substring(0, window.location.href.lastIndexOf(\"/\")+1)){\r\n");
      out.write("\ttop.location=window.location;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 String token = null; 
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"left\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t<div id=\"hdEditMain\" class=\"tabnavi\">\r\n");
      out.write("\t\t\t\t\t<ul> \r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"HELPDESK_Edit.htm?id=");
      out.print(id);
      out.write("&subject=");
      out.print(subject);
      out.write("&category=");
      out.print(category);
      out.write("&subcategory=");
      out.print(subcategory);
      out.write("&function=");
      out.print(function);
      out.write("\" title=\"Details\" class=\"selected\">Details</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Attachment-Div\" title=\"Attachments\" onclick=\"getAttachments(");
      out.print(id);
      out.write(")\">Attachments</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Approver-Data\" title=\"Approver\" onclick=\"getApproversList(");
      out.print(id);
      out.write(")\">Approver</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Similar-Tickets\" title=\"Similar Tickets\" onclick=\"getSimilarTicketsData()\">Similar Tickets</a></li>\r\n");
      out.write("\t\t\t\t\t<!-- \t<li><a href=\"#Asset-Data\" title=\"Asset Data\" onclick=\"getAssetData()\">Asset Data</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Related-Mails\" onclick=\"getRelatedMails()\" title=\"Related Mails\">Related Mails</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Master-Ticket\" title=\"Master-Ticket\" onclick=\"getMasterTicket()\">Master Ticket</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#Audit-Log\" title=\"Audit-Log\" onclick=\"getAuditList(");
      out.print(id);
      out.write(",1)\">Audit-Log</a></li>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table><br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("helpDeskObj");
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setId("ticketdetailsform");
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("HELPDESK_Edit.htm");
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setName("ticketdetailsform");
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/view/HELPDESK_Edit.jsp(109,1) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<table width=\"80%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\t\t\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t<td width=\"80%\" align=\"center\" valign=\"middle\">\r\n");
            out.write("\t\t\t\t\t<div style=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editbuttonaccess}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" id=\"editAccess\">\r\n");
            out.write("\t\t\t\t\t\t<input type=\"button\" id=\"Feedback\" value=\"Feedback\"\tonclick=\"getFeedbackPopUp()\" style=\"display:none\" class=\"feedbackPopup\"/> \r\n");
            out.write("\t\t\t\t\t\t<input type=\"button\" id=\"Edit\" value=\"Edit\"\tonclick=\"LockTicket()\"/> \r\n");
            out.write("\t\t\t\t\t\t<input type=\"button\" id=\"Link\" value=\"Link\"\tclass=\"colorboxpopupWindow\" onclick=\"LockTicket1()\"/>\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t<input type=\"button\" id=\"Update\" value=\"Update\" onclick=\"UpdateIHDTicket()\" />\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t<input type=\"button\" id=\"DeLink\" value=\"DeLink\" onclick=\"DeLinkTicket()\" style=\"display:none\"/>\t\t\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td colspan=\"2\">\r\n");
            out.write("\t\t\t\t\t<span id=\"ORCH_MSG_TR\" class=\"blinkText\" style=\"display:none\">Computer Name which is provided in ticket is not in IGATE network. Please connect the computer to IGATE network and change the ticket status to Responded to Processed with Software Installation.</span>\t\r\n");
            out.write("\t\t\t\t\t<span id=\"ASSET_MSG_TR\" class=\"blinkClass\" style=\"display:none\">Kindly update the Asset for the Requestor in Asset Portal to get the \"Resolved/Closed\" status for this ticket.</span>\r\n");
            out.write("\t\t\t\t<table class=\"createTable\" id=\"editTable\" border=\"0\" cellspacing=\"0\" cellpadding=\"3\"\r\n");
            out.write("\t\t\t\t\t\twidth=\"100%\" align=\"center\">\r\n");
            out.write("\t\t\t\t\t\t<tr class='none'>\r\n");
            out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><span class=\"containerBlock1\">Ticket Information\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"premium\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${helpDeskObj.PREMIUM}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"/>\r\n");
            out.write("\t\t\t\t\t\t\t</span></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"TICKET_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Ticket ID</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
 if(loginrole.equalsIgnoreCase("user")){
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ADDITIONAL_INFO_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Additional Info</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('ADDITIONAL_INFO')\"></a>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"colorboxpopup\" id=\"Edit\" value=\"Add Additional Info\" onClick=\"appendnotes('ADDITIONAL_INFO')\"/>\r\n");
            out.write("\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
 }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"WORKFLOW_STATE_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Status</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fselect_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"FUNCTION_ID_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Function</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f1 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(160,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setPath("FUNCTION_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(160,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f1.setId("FUNCTION_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(160,11) null
            _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f1 = _jspx_th_form_005fselect_005f1.doStartTag();
              if (_jspx_eval_form_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(161,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(161,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f0 = _jspx_th_form_005foption_005f0.doStartTag();
                    if (_jspx_th_form_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f0.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f0);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(162,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FUNCTION}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(162,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f0.setVar("FUNCTION");
                  int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f1 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f1.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(163,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FUNCTION.CATEGORY_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f1 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f1 = _jspx_th_form_005foption_005f1.doStartTag();
                          if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f1[0]++;
                              _jspx_th_form_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f1.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FUNCTION.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f1.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f1[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f1[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f1.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f1.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f1);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f0.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f1);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CATEGORY_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Category</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f2 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(169,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f2.setPath("CATEGORY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(169,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f2.setId("CATEGORY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(169,11) null
            _jspx_th_form_005fselect_005f2.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f2 = _jspx_th_form_005fselect_005f2.doStartTag();
              if (_jspx_eval_form_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f2 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f2);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(170,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f2.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(170,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f2.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f2 = _jspx_th_form_005foption_005f2.doStartTag();
                    if (_jspx_th_form_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f2.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f2);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f2);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(171,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CATEGORY}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(171,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f1.setVar("CATEGORY");
                  int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f3 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f3.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(172,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CATEGORY.CATEGORY_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f3 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f3 = _jspx_th_form_005foption_005f3.doStartTag();
                          if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f3[0]++;
                              _jspx_th_form_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f3.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CATEGORY.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f3.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f3[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f3[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f3.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f3.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f3);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f1.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f2.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f2);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"SUB_CATEGORY_ID_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Sub Category</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f3 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(178,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f3.setPath("SUB_CATEGORY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(178,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f3.setId("SUB_CATEGORY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(178,11) null
            _jspx_th_form_005fselect_005f3.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f3 = _jspx_th_form_005fselect_005f3.doStartTag();
              if (_jspx_eval_form_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f4 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f3);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(179,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f4.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(179,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f4.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f4 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f4 = _jspx_th_form_005foption_005f4.doStartTag();
                    if (_jspx_th_form_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f4[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f4.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f4.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f4);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f3);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(180,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SUBCATEGORY}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(180,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setVar("SUBCATEGORY");
                  int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f5 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f5.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(181,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SUBCATEGORY.CATEGORY_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f5 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f5 = _jspx_th_form_005foption_005f5.doStartTag();
                          if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f5[0]++;
                              _jspx_th_form_005foption_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f5.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SUBCATEGORY.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f5.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f5[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f5[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f5.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f5.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f5);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f2.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f3.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f3);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr> \r\n");
            out.write("\t\t\t\t\t\t<tr id=\"DEPT_ID_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Requestor Department</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td id=\"deptTD\">\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f4 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fstyle_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f4.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(190,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f4.setPath("DEPT_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(190,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f4.setId("DEPT_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(190,8) null
            _jspx_th_form_005fselect_005f4.setDynamicAttribute(null, "style", new String("display:none"));
            int[] _jspx_push_body_count_form_005fselect_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f4 = _jspx_th_form_005fselect_005f4.doStartTag();
              if (_jspx_eval_form_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f6 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f4);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(191,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f6.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(191,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f6.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f6 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f6 = _jspx_th_form_005foption_005f6.doStartTag();
                    if (_jspx_th_form_005foption_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f6[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f6.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f6.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f6);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f4);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(192,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DEPARTMENTS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(192,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f3.setVar("DEPARTMENTS");
                  int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f7 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f7.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(193,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DEPARTMENTS.DEPT_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f7 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f7 = _jspx_th_form_005foption_005f7.doStartTag();
                          if (_jspx_eval_form_005foption_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f7[0]++;
                              _jspx_th_form_005foption_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f7.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DEPARTMENTS.DEPT_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f7.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f7[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f7[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f7.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f7.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f7);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f3.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f4.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fstyle_005fpath_005fid.reuse(_jspx_th_form_005fselect_005f4);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr> \r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"PRIORITY_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Priority</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f5 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f5.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(204,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f5.setPath("PRIORITY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(204,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f5.setId("PRIORITY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(204,11) null
            _jspx_th_form_005fselect_005f5.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f5 = _jspx_th_form_005fselect_005f5.doStartTag();
              if (_jspx_eval_form_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f8 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f5);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(205,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f8.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(205,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f8.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f8 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f8 = _jspx_th_form_005foption_005f8.doStartTag();
                    if (_jspx_th_form_005foption_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f8[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f8.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f8.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f8);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f5);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(206,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PRIORITYLIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(206,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f4.setVar("PRIORITYLIST");
                  int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t<!-- Added to remove Low priority for Premium users -->\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f9 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005fid.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f9.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(216,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f9.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PRIORITYLIST.PRIORITYID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                        // /WEB-INF/view/HELPDESK_Edit.jsp(216,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PRIORITYLIST.PRIORITYID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f9 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f9 = _jspx_th_form_005foption_005f9.doStartTag();
                          if (_jspx_eval_form_005foption_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f9[0]++;
                              _jspx_th_form_005foption_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f9.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PRIORITYLIST.DESCRIPTION}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f9.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f9[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f9[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f9.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f9.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005fid.reuse(_jspx_th_form_005foption_005f9);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f4.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f5.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f5);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"SUBJECT_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Subject</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"DESCRIPTION_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Description</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td >");
            if (_jspx_meth_form_005ftextarea_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\t\r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\t\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"LOCATION_ID_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Location</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f6 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(234,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setPath("LOCATION_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(234,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f6.setId("LOCATION_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(234,11) null
            _jspx_th_form_005fselect_005f6.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f6 = _jspx_th_form_005fselect_005f6.doStartTag();
              if (_jspx_eval_form_005fselect_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f10 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f6);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(235,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f10.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(235,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f10.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f10 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f10 = _jspx_th_form_005foption_005f10.doStartTag();
                    if (_jspx_th_form_005foption_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f10[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f10.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f10.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f10);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f6);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(236,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(236,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f5.setVar("LOCATION");
                  int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f11 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f11.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(237,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION.LOCATION_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f11 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f11 = _jspx_th_form_005foption_005f11.doStartTag();
                          if (_jspx_eval_form_005foption_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f11[0]++;
                              _jspx_th_form_005foption_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f11.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              if (_jspx_meth_c_005fout_005f0(_jspx_th_form_005foption_005f11, _jspx_page_context, _jspx_push_body_count_form_005foption_005f11))
                              return;
                              int evalDoAfterBody = _jspx_th_form_005foption_005f11.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f11[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f11[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f11.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f11.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f11);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f5.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f6.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f6);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr> \r\n");
            out.write("\t\t\t\t\t\t<tr id=\"LOC_DET_ID_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Location Detail ID</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CUBICLE_CODE_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Cubicle Code</td> \r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"COPY_TO_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">CC to (EmailID) :</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"SOURCE_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Source</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f7 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f7.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(284,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setPath("SOURCE");
            // /WEB-INF/view/HELPDESK_Edit.jsp(284,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f7.setId("SOURCE");
            // /WEB-INF/view/HELPDESK_Edit.jsp(284,11) null
            _jspx_th_form_005fselect_005f7.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f7 = _jspx_th_form_005fselect_005f7.doStartTag();
              if (_jspx_eval_form_005fselect_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f12 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(285,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f12.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(285,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f12.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f12 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f12 = _jspx_th_form_005foption_005f12.doStartTag();
                    if (_jspx_th_form_005foption_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f12[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f12.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f12.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f12);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f13 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(286,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f13.setValue(new String("Web"));
                  int[] _jspx_push_body_count_form_005foption_005f13 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f13 = _jspx_th_form_005foption_005f13.doStartTag();
                    if (_jspx_eval_form_005foption_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f13[0]++;
                        _jspx_th_form_005foption_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f13.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write('W');
                        out.write('e');
                        out.write('b');
                        int evalDoAfterBody = _jspx_th_form_005foption_005f13.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f13[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f13[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f13.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f13.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f13);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f14 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(287,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f14.setValue(new String("Email"));
                  int[] _jspx_push_body_count_form_005foption_005f14 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f14 = _jspx_th_form_005foption_005f14.doStartTag();
                    if (_jspx_eval_form_005foption_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f14[0]++;
                        _jspx_th_form_005foption_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f14.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("Email");
                        int evalDoAfterBody = _jspx_th_form_005foption_005f14.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f14[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f14[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f14.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f14.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f14);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f15 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(288,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f15.setValue(new String("Phone"));
                  int[] _jspx_push_body_count_form_005foption_005f15 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f15 = _jspx_th_form_005foption_005f15.doStartTag();
                    if (_jspx_eval_form_005foption_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f15[0]++;
                        _jspx_th_form_005foption_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f15.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("Phone");
                        int evalDoAfterBody = _jspx_th_form_005foption_005f15.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f15[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f15[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f15.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f15.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f15);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f16 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(289,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f16.setValue(new String("Walk-In"));
                  int[] _jspx_push_body_count_form_005foption_005f16 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f16 = _jspx_th_form_005foption_005f16.doStartTag();
                    if (_jspx_eval_form_005foption_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f16[0]++;
                        _jspx_th_form_005foption_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f16.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("Walk-In");
                        int evalDoAfterBody = _jspx_th_form_005foption_005f16.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f16[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f16[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f16.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f16.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f16);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f17 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(290,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f17.setValue(new String("Mobile"));
                  int[] _jspx_push_body_count_form_005foption_005f17 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f17 = _jspx_th_form_005foption_005f17.doStartTag();
                    if (_jspx_eval_form_005foption_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f17[0]++;
                        _jspx_th_form_005foption_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f17.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("Mobile");
                        int evalDoAfterBody = _jspx_th_form_005foption_005f17.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f17[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f17[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f17.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f17.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f17);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f18 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f7);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(291,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f18.setValue(new String("iTrack"));
                  int[] _jspx_push_body_count_form_005foption_005f18 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f18 = _jspx_th_form_005foption_005f18.doStartTag();
                    if (_jspx_eval_form_005foption_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object value = null;
                      java.lang.String displayValue = null;
                      if (_jspx_eval_form_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.pushBody();
                        _jspx_push_body_count_form_005foption_005f18[0]++;
                        _jspx_th_form_005foption_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                        _jspx_th_form_005foption_005f18.doInitBody();
                      }
                      value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                      displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                      do {
                        out.write("iTrack");
                        int evalDoAfterBody = _jspx_th_form_005foption_005f18.doAfterBody();
                        value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                        displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_form_005foption_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                        _jspx_push_body_count_form_005foption_005f18[0]--;
                      }
                    }
                    if (_jspx_th_form_005foption_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f18[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f18.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f18.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f18);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f7.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f7);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"SEVERITY_ID_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Severity</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f8 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f8.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(296,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setPath("SEVERITY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(296,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f8.setId("SEVERITY_ID");
            // /WEB-INF/view/HELPDESK_Edit.jsp(296,11) null
            _jspx_th_form_005fselect_005f8.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f8 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f8 = _jspx_th_form_005fselect_005f8.doStartTag();
              if (_jspx_eval_form_005fselect_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f19 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f19.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f8);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(297,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f19.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(297,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f19.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f19 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f19 = _jspx_th_form_005foption_005f19.doStartTag();
                    if (_jspx_th_form_005foption_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f19[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f19.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f19.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f19);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f8);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(298,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SEVERITYLIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(298,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f6.setVar("SEVERITY");
                  int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f20 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f20.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(299,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SEVERITY.SEVERITY_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f20 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f20 = _jspx_th_form_005foption_005f20.doStartTag();
                          if (_jspx_eval_form_005foption_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f20[0]++;
                              _jspx_th_form_005foption_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f20.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SEVERITY.DESCRIPTION}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f20.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f20[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f20[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f20.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f20.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f20);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f6.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f8[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f8.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f8.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f8);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"FILTER_GROUP_LOCATION_TR\" style=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filterlocationDisplay}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Filter Groups By Location</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f9 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f9.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(305,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f9.setPath("FILTER_GROUP_LOCATION");
            // /WEB-INF/view/HELPDESK_Edit.jsp(305,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f9.setId("FILTER_GROUP_LOCATION");
            int[] _jspx_push_body_count_form_005fselect_005f9 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f9 = _jspx_th_form_005fselect_005f9.doStartTag();
              if (_jspx_eval_form_005fselect_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f9);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(306,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(306,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f7.setVar("LOCATION");
                  int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f21 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f21.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(307,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION.LOCATION_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f21 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f21 = _jspx_th_form_005foption_005f21.doStartTag();
                          if (_jspx_eval_form_005foption_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f21[0]++;
                              _jspx_th_form_005foption_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f21.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              if (_jspx_meth_c_005fout_005f1(_jspx_th_form_005foption_005f21, _jspx_page_context, _jspx_push_body_count_form_005foption_005f21))
                              return;
                              int evalDoAfterBody = _jspx_th_form_005foption_005f21.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f21[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f21[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f21.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f21.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f21);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f7.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f9[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f9.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f9.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.reuse(_jspx_th_form_005fselect_005f9);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ASSIGNED_GROUP_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Assigned Group</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f10 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f10.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(313,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f10.setPath("ASSIGNED_GROUP");
            // /WEB-INF/view/HELPDESK_Edit.jsp(313,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f10.setId("ASSIGNED_GROUP");
            // /WEB-INF/view/HELPDESK_Edit.jsp(313,11) null
            _jspx_th_form_005fselect_005f10.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f10 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f10 = _jspx_th_form_005fselect_005f10.doStartTag();
              if (_jspx_eval_form_005fselect_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f22 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f22.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f10);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(314,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f22.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(314,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f22.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f22 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f22 = _jspx_th_form_005foption_005f22.doStartTag();
                    if (_jspx_th_form_005foption_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f22[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f22.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f22.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f22);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f10);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(315,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ASSIGNEDGROUPLIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(315,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f8.setVar("GROUP");
                  int[] _jspx_push_body_count_c_005fforEach_005f8 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f8 = _jspx_th_c_005fforEach_005f8.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f23 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f23.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f8);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(316,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${GROUP.GROUP_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f23 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f23 = _jspx_th_form_005foption_005f23.doStartTag();
                          if (_jspx_eval_form_005foption_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f23[0]++;
                              _jspx_th_form_005foption_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f23.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${GROUP.GROUP_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f23.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f23[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f23[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f23.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f23.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f23);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f8.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f8[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f8.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f8.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f8);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f10[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f10.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f10.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f10);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ASSIGNED_TO_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Assigned To</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f11 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f11.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(322,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f11.setPath("ASSIGNED_TO");
            // /WEB-INF/view/HELPDESK_Edit.jsp(322,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f11.setId("ASSIGNED_TO");
            // /WEB-INF/view/HELPDESK_Edit.jsp(322,11) null
            _jspx_th_form_005fselect_005f11.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f11 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f11 = _jspx_th_form_005fselect_005f11.doStartTag();
              if (_jspx_eval_form_005fselect_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f24 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f24.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f11);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(323,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f24.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(323,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f24.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f24 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f24 = _jspx_th_form_005foption_005f24.doStartTag();
                    if (_jspx_th_form_005foption_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f24[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f24.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f24.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f24);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f11);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(324,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ASSIGNEDTO}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(324,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f9.setVar("ASSIGNEDTO");
                  int[] _jspx_push_body_count_c_005fforEach_005f9 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f9 = _jspx_th_c_005fforEach_005f9.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f25 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f25.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f9);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(325,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ASSIGNEDTO.member_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f25 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f25 = _jspx_th_form_005foption_005f25.doStartTag();
                          if (_jspx_eval_form_005foption_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f25[0]++;
                              _jspx_th_form_005foption_005f25.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f25.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ASSIGNEDTO.member_name_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f25.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f25 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f25[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f25[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f25.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f25.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f25);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f9.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f9[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f9.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f9.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f9);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f11[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f11.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f11.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f11);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"FILTERLOGGEDINUSERS\" name=\"FILTERLOGGEDINUSERS\" onclick=\"getGroupMembers('checkbox')\" checked>All</input> \r\n");
            out.write("\t\t\t\t\t\t\t</td> \r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CREATED_DATE_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Created Date</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f6(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CREATED_DATE_STORAGE_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Created Date Storage</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f7(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<!-- Modified by Sali -->\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CHANGED_DATE_STORAGE_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Changed Date Storage</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f8(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"IS_CHANGE_REQUEST_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Changed Date Storage</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f9(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"IS_MASTER_LINK_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td></td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f10(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\t\t\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<!-- eND OF CHANGE -->\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ECT_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Expected Completion Time</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f11(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ECT_STORAGE_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">ECT Storage</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f12(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"TOTAL_SLA_TIME_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Total SLA Time</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f13(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"TIME_REMAINING_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Time Remaining</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f14(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"SLA_STATUS_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">SLA Status</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f15(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"USERS_IMPACTED_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Impacted Users</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f16(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CREATED_BY_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Created By</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f17(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr class='none' id=\"Emergency_Det\">\r\n");
            out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><span class=\"containerBlock1\">Deployment Activity</span></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr class='none'>\r\n");
            out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><span class=\"containerBlock1\">User\r\n");
            out.write("\t\t\t\t\t\t\tInformation</span></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"REQUESTED_BY_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Requested By</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f18(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ON_BEHALF_OF_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">On Behalf Of(EmployeeID)</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f19(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a id=\"validateEmployee\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\thref=\"javascript:ValidateEmpId(document.getElementById('ON_BEHALF_OF').value)\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\tclass=\"label\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\ttitle=\"Confirm the existence of active Employee in Organization.\" style=\"display:none\"><u>Validate</u>&nbsp;\r\n");
            out.write("\t\t\t\t\t\t\t\t</a>\r\n");
            out.write("\t\t\t\t\t\t\t\t<span\r\n");
            out.write("\t\t\t\t\t\t\t\t\tid=\"empResultMessage\" class=\"invalid_text\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</span>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"PROJECT_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Project</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005finput_005f20(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"MASTER_PROJECT_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Master Project</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f21(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"LEVEL2_PROJECT_ID_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Level 2 Project</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f22(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"LEVEL3_PROJECT_ID_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Level 3 Project</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f23(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"MANAGER_ID_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Project/Process Manager</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f24(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CUSTOMER_NAME_TR\"> \r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Customer Name</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"CUSTOMER_NAME\" style=\"width:284px\" disabled\r\n");
            out.write("\t\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REQUESTOR.CUSTOMER_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" /></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"DEPARTMENT_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Department</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"DEPARTMENT\" style=\"width:284px\" disabled\r\n");
            out.write("\t\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REQUESTOR.DU_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" /></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<!--<tr id=\"ORGANIZATION_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Organization</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"ORGANIZATION\" disabled\r\n");
            out.write("\t\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REQUESTOR.ORGANIZATION}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" /></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>-->\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CONTACT_NO_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Contact Number(Primary)</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f25(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ALTERNATE_CONTACT_NO_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Alternate Contact Number</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f26(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"USER_LOCATION_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">User Location</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"USER_LOCATION\" style=\"width:284px\" disabled\r\n");
            out.write("\t\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REQUESTOR.CITY}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"></input></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr class='none'>\r\n");
            out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><span class=\"containerBlock1\">Response\r\n");
            out.write("\t\t\t\t\t\t\tInformation</span></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
 if(!loginrole.equalsIgnoreCase("user")){
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ADDITIONAL_INFO_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Additional Info</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('ADDITIONAL_INFO')\"></a>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"colorboxpopup\" id=\"Edit\" value=\"Add Additional Info\" onClick=\"appendnotes('ADDITIONAL_INFO')\"/>\r\n");
            out.write("\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
 }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"RESOLUTION_STATUS_TR\" style=\"display:none;\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Resolution Status</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f12 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f12.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(535,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f12.setPath("RESOLUTION_STATUS");
            // /WEB-INF/view/HELPDESK_Edit.jsp(535,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f12.setId("RESOLUTION_STATUS");
            int[] _jspx_push_body_count_form_005fselect_005f12 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f12 = _jspx_th_form_005fselect_005f12.doStartTag();
              if (_jspx_eval_form_005fselect_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f26 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f26.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f12);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(536,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f26.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(536,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f26.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f26 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f26 = _jspx_th_form_005foption_005f26.doStartTag();
                    if (_jspx_th_form_005foption_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f26[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f26.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f26.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f26);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f12);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(537,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RESOLUTIONSTATUS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(537,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f10.setVar("RESOLUTIONSTATUS");
                  int[] _jspx_push_body_count_c_005fforEach_005f10 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f10 = _jspx_th_c_005fforEach_005f10.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f27 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f27.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(538,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RESOLUTIONSTATUS.REASON_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f27 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f27 = _jspx_th_form_005foption_005f27.doStartTag();
                          if (_jspx_eval_form_005foption_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f27[0]++;
                              _jspx_th_form_005foption_005f27.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f27.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RESOLUTIONSTATUS.DESCRIPTION}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f27.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f27 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f27[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f27[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f27.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f27.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f27);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f10.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f10[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f10.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f10.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f10);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f12[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f12.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f12.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.reuse(_jspx_th_form_005fselect_005f12);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"RESOLUTION_COMMENTS_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Resolution Comments</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('RESOLUTION_COMMENTS')\">\r\n");
            out.write("\t\t\t\t\t\t\t</a></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"PRIVATE_NOTES_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Private Notes</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('PRIVATE_NOTES')\"></a>\r\n");
            out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"colorboxpopup\" id=\"Edit\" value=\"Add Private Notes\" onClick=\"appendnotes('PRIVATE_NOTES')\"/> \r\n");
            out.write("\t\t\t\t\t\t\t</td> \r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"OUT_OF_SLA_REASON_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Out of SLA Reason</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f13 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f13.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(560,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f13.setPath("OUT_OF_SLA_REASON");
            // /WEB-INF/view/HELPDESK_Edit.jsp(560,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f13.setId("OUT_OF_SLA_REASON");
            // /WEB-INF/view/HELPDESK_Edit.jsp(560,11) null
            _jspx_th_form_005fselect_005f13.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
            int[] _jspx_push_body_count_form_005fselect_005f13 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f13 = _jspx_th_form_005fselect_005f13.doStartTag();
              if (_jspx_eval_form_005fselect_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f28 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f28.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f13);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(561,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f28.setValue(new String(""));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(561,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f28.setLabel("--Please Select--");
                  int[] _jspx_push_body_count_form_005foption_005f28 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f28 = _jspx_th_form_005foption_005f28.doStartTag();
                    if (_jspx_th_form_005foption_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f28[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f28.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f28.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f28);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f13);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(562,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f11.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SLAREASONS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(562,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f11.setVar("SLAREASONS");
                  int[] _jspx_push_body_count_c_005fforEach_005f11 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f11 = _jspx_th_c_005fforEach_005f11.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f29 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_005foption_005f29.setPageContext(_jspx_page_context);
                        _jspx_th_form_005foption_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f11);
                        // /WEB-INF/view/HELPDESK_Edit.jsp(563,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_form_005foption_005f29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SLAREASONS.REASON_ID}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                        int[] _jspx_push_body_count_form_005foption_005f29 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_005foption_005f29 = _jspx_th_form_005foption_005f29.doStartTag();
                          if (_jspx_eval_form_005foption_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object value = null;
                            java.lang.String displayValue = null;
                            if (_jspx_eval_form_005foption_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f29[0]++;
                              _jspx_th_form_005foption_005f29.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f29.doInitBody();
                            }
                            value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                            displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SLAREASONS.DESCRIPTION}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f29.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_005foption_005f29 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f29[0]--;
                            }
                          }
                          if (_jspx_th_form_005foption_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_005foption_005f29[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_005foption_005f29.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_005foption_005f29.doFinally();
                          _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f29);
                        }
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f11.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f11[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f11.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f11.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f11);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f13[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f13.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f13.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f13);
            }
            out.write("</td> \r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"OUT_OF_SLA_COMMENTS_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Out of SLA Comments</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('OUT_OF_SLA_COMMENTS')\">\r\n");
            out.write("\t\t\t\t\t\t\t</a></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"CLOSED_DATE_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Closed Date</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f27(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"ONHOLD_COMMENTS_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">OnHold Comments</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f6(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('ONHOLD_COMMENTS')\">\r\n");
            out.write("\t\t\t\t\t\t\t</a></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"REMINDER_DATE_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Reminder Date</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f28(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"FEEDBACK_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">FeedBack</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<!--");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f14 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f14.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/HELPDESK_Edit.jsp(592,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f14.setPath("FEEDBACK");
            // /WEB-INF/view/HELPDESK_Edit.jsp(592,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f14.setId("FEEDBACK");
            int[] _jspx_push_body_count_form_005fselect_005f14 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f14 = _jspx_th_form_005fselect_005f14.doStartTag();
              if (_jspx_eval_form_005fselect_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f30 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f30.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f14);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(593,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f30.setValue(new String("None"));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(593,9) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f30.setLabel("None");
                  int[] _jspx_push_body_count_form_005foption_005f30 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f30 = _jspx_th_form_005foption_005f30.doStartTag();
                    if (_jspx_th_form_005foption_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f30[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f30.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f30.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f30);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f31 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f31.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f14);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(594,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f31.setValue(new String("Good"));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(594,9) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f31.setLabel("Good");
                  int[] _jspx_push_body_count_form_005foption_005f31 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f31 = _jspx_th_form_005foption_005f31.doStartTag();
                    if (_jspx_th_form_005foption_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f31[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f31.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f31.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f31);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f32 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f32.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f14);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(595,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f32.setValue(new String("Average"));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(595,9) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f32.setLabel("Average");
                  int[] _jspx_push_body_count_form_005foption_005f32 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f32 = _jspx_th_form_005foption_005f32.doStartTag();
                    if (_jspx_th_form_005foption_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f32[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f32.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f32.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f32);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f33 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f33.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f14);
                  // /WEB-INF/view/HELPDESK_Edit.jsp(596,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f33.setValue(new String("Bad"));
                  // /WEB-INF/view/HELPDESK_Edit.jsp(596,9) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f33.setLabel("Bad");
                  int[] _jspx_push_body_count_form_005foption_005f33 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f33 = _jspx_th_form_005foption_005f33.doStartTag();
                    if (_jspx_th_form_005foption_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f33[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f33.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f33.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f33);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f14[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f14.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f14.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.reuse(_jspx_th_form_005fselect_005f14);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t-->");
            if (_jspx_meth_form_005finput_005f29(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"FEEDBACK_COMMENTS_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">FeedBack Comments</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005ftextarea_005f7(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"REOPEN_COMMENTS_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Reopen Comments</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f8(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"replaceSpecialCharacters('REOPEN_COMMENTS')\">\r\n");
            out.write("\t\t\t\t\t\t\t</a></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t");
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"VERSION_NO_TR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Version No</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f30(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<!-- Modified by Sali -->\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"OS_DETAILS_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Os Details</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input name=\"OS_DETAILS\" id=\"OS_DETAILS\" /></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr id=\"BROWSER_DETAILS_TR\" style=\"display:none\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Browser Details</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td><input name=\"BROWSER_DETAILS\" id=\"BROWSER_DETAILS\" /></td> \r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t<!-- eND OF CHANGE -->\r\n");
            out.write("\t\t\t\t        <!-- Modified by Sankari(712836) -->\r\n");
            out.write("\t\t\t\t         <tr id=\"SEARCH_REFERENCE_TR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"label\">Search Reference</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\t\t\r\n");
            out.write("\t\t\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t\t\t\t<td><input id=\"selectInput\" class=\"myTextInput\"></input></td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t  </table>\r\n");
            out.write("\t\t\r\n");
            out.write("\t\t\r\n");
            out.write("\t\t \t\t </td>\r\n");
            out.write("\t\t   </tr>\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t       \t<td align=\"center\" id=\"UpdateButtonTd\" style=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editbuttonaccess}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"> \r\n");
            out.write("\t\t       \t\t<input type=\"button\" id=\"Update\" value=\"Update\" onclick=\"UpdateIHDTicket()\" />\t\t\r\n");
            out.write("\t\t       \t</td>\r\n");
            out.write("\t\t    </tr>\r\n");
            out.write("\t</table>\r\n");
            out.write("\t<input type=\"hidden\" id=\"SUB_PROJECT_ID\" name=\"SUB_PROJECT_ID\"></input>\r\n");
            out.write("\t");
            if (_jspx_meth_form_005finput_005f31(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f32(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f33(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f34(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f35(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f36(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            if (_jspx_meth_form_005finput_005f37(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write('\r');
            out.write('\n');
            out.write('	');
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
 token = (String)request.getSession().getAttribute("OWASP_CSRFTOKEN"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"OWASP_CSRFTOKEN\" value=\"");
      out.print( token );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("            <div id=\"Audit-Log\" style=\"display:none\" class=\"tabLiner\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" class=\"myDataTable\" id=\"auditLog\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">History ID</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"13%\">Previous State</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\">Current State</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\">Changed By</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"25%\">Changed Date</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"22%\">Action</th>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t<table width=\"100%\" id=\"auditLogDetails\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t<tr><td width=\"15%\" align = \"left\"><input type=\"button\" value=\"Back to List\" onclick=\"DisplayDivs('auditLog','auditLogDetails')\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">Field</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"13%\">Old Value</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\">New Value</th>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("            </div>          \r\n");
      out.write("            <div id=\"Attachment-Div\" style=\"display:none\" class=\"tabLiner\"><br>\r\n");
      out.write("            \t<table border=\"0\" id=\"attachment_field\" cellspacing=\"5\" cellpadding=\"5\" width=\"80%\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th> Attachment Type </th>\r\n");
      out.write("\t\t\t\t\t\t<th>Attachment Name</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--<div id=\"Asset-Data\">\r\n");
      out.write("            \tNo Data\r\n");
      out.write("            </div>-->\r\n");
      out.write("            <div id=\"Approver-Data\" style=\"display:none\" class=\"tabLiner\"><br>\r\n");
      out.write("   \t\t\t\t<table width=\"100%\" class=\"myDataTable\" id=\"ApproverLog\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t</table>\t\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"Asset-Data\" style=\"display:none\" class=\"tabLiner\"><br>\r\n");
      out.write("            \t<table width=\"100%\" class=\"myDataTable\" id=\"ticketAssetLink\" cellpadding=\"0\" cellspacing=\"0\">\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"Similar-Tickets\" style=\"display:none\" class=\"tabLiner\"><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"Related-Mails\" style=\"display:none\" class=\"tabLiner\"><br>\r\n");
      out.write("            </div>\r\n");
      out.write("              <div id=\"Master-Ticket\"  style=\"display:none\" class=\"tabLiner\">\r\n");
      out.write("\t\t\t<table width=\"100%\" id=\"masterTicketDett\" class=\"myDataTable\"  cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Master Ticket ID</th>\r\n");
      out.write("\t\t\t\t\t<th>Workflow Status</th>\r\n");
      out.write("\t\t\t\t\t<th>Subject</th>\r\n");
      out.write("\t\t\t\t\t<th>Description</th>\r\n");
      out.write("\t\t\t\t\t<th>ECT</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("           \r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.accordion.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.client.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/HELPDESK_Edit.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/Orchestration.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(jsDirPath);
      out.write("/jquery.validationEngine-en.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.validationEngine.js\"></script>\r\n");
      out.write("\t  <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.colorbox.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.form.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.print(jsDirPath);
      out.write("/json.min.js\"></script>\r\n");
      out.write("      <script src=\"");
      out.print(jsDirPath);
      out.write("/custom/HELPDESK_AuditLog.js\"></script>  \r\n");
      out.write("      <script src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Attachment.js\"></script> \r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Security.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.popupWindow.js\"></script>  \r\n");
      out.write("      <!--[if IE]><script src=\"");
      out.print(jsDirPath);
      out.write("/excanvas.compiled.js\" type=\"text/javascript\" charset=\"utf-8\"></script><![endif]--> \r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.bt.min.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.blockUI.js\"></script>\r\n");
      out.write("      <script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/HELPDESK_AssetInformation.js\"></script> \r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar logged_user_role = \"");
      out.print(loginrole);
      out.write("\";\r\n");
      out.write("\tvar looged_user_id = \"");
      out.print(loginUser);
      out.write("\";\r\n");
      out.write("\tvar search_URL=\"");
      out.print(AI_search_URL);
      out.write("\";\r\n");
      out.write("\tvar roleListSize=\"");
      out.print(roleListSize);
      out.write("\";\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvar menuID = '");
      out.print(menuId);
      out.write("';\r\n");
      out.write("\tvar parentMenuId = '");
      out.print(parentMenuId);
      out.write("';\r\n");
      out.write("\tvar menuName = '");
      out.print(menuName);
      out.write("';\r\n");
      out.write("\tvar parentMenuName = '");
      out.print(parentMenuName);
      out.write("';\r\n");
      out.write("\tvar approvalFlag =\"0\";\r\n");
      out.write("\r\n");
      out.write("/********************AUTO ASSIGNMENT*********************************************/\r\n");
      out.write(" \r\n");
      out.write(" var priorityChangeFlag=0;\r\n");
      out.write(" var statusChangeFlag=0;\r\n");
      out.write(" var assignedToChangeFlag=0;\r\n");
      out.write(" var oldPriority='';\r\n");
      out.write(" var newPriority='';\r\n");
      out.write(" var oldStatus='';\r\n");
      out.write(" var newStatus='';\r\n");
      out.write(" var oldAssignedTo='';\r\n");
      out.write(" var newAssignedTo='';\r\n");
      out.write("var assignedGroupChangeFlag=0;\r\n");
      out.write("var isAutoAssignmentActiveArray=new Array();\r\n");
      out.write("var isAutoAssignmentReqdFlag=0;\r\n");
      out.write("\r\n");
      out.write("var approvalExceptionFlag=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${helpDeskObj.IS_APPROVAL_REQUIRED}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("/********************AUTO ASSIGNMENT*********************************************/\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar isMasterTicketLinked=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${helpDeskObj.IS_MASTER_LINK}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\tvar viewmap = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${viewpermissionmap}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tviewmap = viewmap.substring(1,viewmap.length-1);\r\n");
      out.write("\tvar viewmaparray = new Array();\r\n");
      out.write("\t\tif(viewmap!=\"\"){\r\n");
      out.write("\t\t\tviewmaparray = viewmap.split(\",\")\r\n");
      out.write("\t\t}\r\n");
      out.write("\tvar editmap = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editpermissionmap}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\teditmap = editmap.substring(1,editmap.length-1);\r\n");
      out.write("\tvar editmaparray = new Array();\r\n");
      out.write("\t\tif(editmap!=\"\"){\r\n");
      out.write("\t\t\teditmaparray = editmap.split(\",\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\tvar nonemap = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nonepermissionmap}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tnonemap = nonemap.substring(1,nonemap.length-1);\r\n");
      out.write("\tvar nonemaparray = new Array();\r\n");
      out.write("\t\tif(nonemap!=\"\"){\r\n");
      out.write("\t\t\tnonemaparray = nonemap.split(\",\");\r\n");
      out.write("\t\t} \r\n");
      out.write("\r\n");
      out.write("\t\tvar roleListForRestriction = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rolesToRestrictTheUpdateTicket}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\troleListForRestriction = roleListForRestriction.substring(1,roleListForRestriction.length-1);\r\n");
      out.write("\tvar roleListForRestrictionarray = new Array();\r\n");
      out.write("\t\tif(roleListForRestriction!=\"\"){\r\n");
      out.write("\t\t\troleListForRestrictionarray = roleListForRestriction.split(\",\");\r\n");
      out.write("\t\t\tvar temp = new Array();\r\n");
      out.write("\t\t\tfor(var i=0;i<roleListForRestrictionarray.length;i++){\r\n");
      out.write("\t\t\t\ttemp.push(jQuery.trim(roleListForRestrictionarray[i]));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\troleListForRestrictionarray = new Array();\r\n");
      out.write("\t\t\troleListForRestrictionarray = temp;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t$('textarea[maxlength],input[maxlength]').live('keyup blur', function() {\r\n");
      out.write("        // Store the maxlength and value of the field.\r\n");
      out.write("        var maxlength = $(this).attr('maxlength');\r\n");
      out.write("        var val = $(this).val();\r\n");
      out.write("\r\n");
      out.write("        // Trim the field if it has content over the maxlength.\r\n");
      out.write("        if (val.length > maxlength) {\r\n");
      out.write("            $(this).val(val.slice(0, maxlength));\r\n");
      out.write("        }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$('.blink').each(function() {\r\n");
      out.write("\t\t\t\t\t\t\t    var elem = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t    setInterval(function() {\r\n");
      out.write("\t\t\t\t\t\t\t        if (elem.css('visibility') == 'hidden') {\r\n");
      out.write("\t\t\t\t\t\t\t            elem.css('visibility', 'visible');\r\n");
      out.write("\t\t\t\t\t\t\t        } else {\r\n");
      out.write("\t\t\t\t\t\t\t            elem.css('visibility', 'hidden');\r\n");
      out.write("\t\t\t\t\t\t\t        }    \r\n");
      out.write("\t\t\t\t\t\t\t    }, 500);\r\n");
      out.write("\t\t\t\t\t\t\t}); \r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("            function getApproversList(ticketID){\r\n");
      out.write("\r\n");
      out.write("            \tif(inEditMode){\r\n");
      out.write("            \t\tif(confirm(\"Do you want to continue with out updating the ticket?\")){\r\n");
      out.write("            \t    \tinEditMode = false;\r\n");
      out.write("            \t\t  \tunlockTheTicket($(\"#TICKET_ID\").val(),1);\r\n");
      out.write("            \t      }else{\r\n");
      out.write("            \t\t\t\treturn false;\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t}\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").removeClass(\"selected\");\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").eq(\"2\").addClass(\"selected\");\r\n");
      out.write("                        \t\r\n");
      out.write("            \tblockUI();\r\n");
      out.write("\t            \t$.getJSON(\"hdAppRejListforTicket.htm\",{ticketNo:ticketID},function(data){\t\t\r\n");
      out.write("\r\n");
      out.write("\t    \t\t\t\t$(\"#Audit-Log\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#ticketdetailsform\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#Attachment-Div\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#Approver-Data\").show();\r\n");
      out.write("\t    \t\t\t\t$(\"#Asset-Data\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#Similar-Tickets\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#Related-Mails\").hide();\r\n");
      out.write("\t    \t\t\t\t$(\"#Master-Ticket\").hide();\r\n");
      out.write("\t    \t\t\t\t\r\n");
      out.write("\t            \t\t            \t\r\n");
      out.write("\t            \t\tvar attachmentHtml = \"\";\r\n");
      out.write("\t            \t\t\tattachmentHtml +=\"<tr><th>Ticket ID</th><th>Comments</th><th>Exception Approval</th><th>Exception Approval Start Dt</th><th>Exception Approval End Dt</th><th>Action</th><th>Action By</th><th>Action Date</th></tr>\";\r\n");
      out.write("\t            \t\tif(data.length!=0)\r\n");
      out.write("\t            \t\t\t{\t\r\n");
      out.write("\t            \t\t\t\t for(var i=0;i<data.length;i++) \r\n");
      out.write("\t            \t\t\t\t {\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<tr>\";\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].ticket_ID+\"</td>\";\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].comments+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].is_EXCEPTIONAL_APPROVAL+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t if(data[i].exception_START_DATE!=null)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tattachmentHtml +=\"<td>\"+data[i].exception_START_DATE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t else\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tattachmentHtml +=\"<td>\"+'-'+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t if(data[i].exception_END_DATE!=null)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tattachmentHtml +=\"<td>\"+data[i].exception_END_DATE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t else\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tattachmentHtml +=\"<td>\"+'-'+\"</td>\";\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].status+\"</td>\";\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].created_NAME+\"( \"+data[i].created_BY+\" )</td>\";\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"<td>\"+data[i].created_DATE+\"</td>\";\r\n");
      out.write("\t            \t\t\t\t\t attachmentHtml +=\"</tr>\";\t\t\r\n");
      out.write("\t            \t\t\t\t}\t\t\r\n");
      out.write("\t            \t\t\t\t $(\"#ApproverLog\").html(attachmentHtml)\t;\t\r\n");
      out.write("\t            \t\t\t}\t\t\r\n");
      out.write("\t            \t\telse{\r\n");
      out.write("\t            \t\t\t$(\"#ApproverLog\").html(\"<b>No Data.</b>\")\r\n");
      out.write("\t            \t\t}\r\n");
      out.write("\t            \t\tunblockUI();\r\n");
      out.write("\t            \t});\r\n");
      out.write("\r\n");
      out.write("            \t\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            function getSimilarTicketsData(){ \r\n");
      out.write("\r\n");
      out.write("            \tif(inEditMode){\r\n");
      out.write("            \t\tif(confirm(\"Do you want to continue with out updating the ticket?\")){\r\n");
      out.write("            \t    \tinEditMode = false;\r\n");
      out.write("            \t\t  \tunlockTheTicket($(\"#TICKET_ID\").val(),1);\r\n");
      out.write("            \t      }else{\r\n");
      out.write("            \t\t\t\treturn false;\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t}\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").removeClass(\"selected\");\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").eq(\"3\").addClass(\"selected\");\r\n");
      out.write("            \tblockUI();            \t          \t\r\n");
      out.write("            \t\tvar catId=$('#CATEGORY_ID option:selected').val();\r\n");
      out.write("            \tvar subCatId=$('#SUB_CATEGORY_ID option:selected').val();\r\n");
      out.write("            \tvar similrTicketsURL = \"HELPDESK_SimilarTicketslistPage.htm?menuId=0&parentMenuId=1&menuName=Closed Request&parentMenuName=HelpDesk&subject=");
      out.print(subject);
      out.write("&category=\"+catId+\"&subcategory=\"+subCatId;\r\n");
      out.write("            \t $.ajaxSetup({ cache: false });\r\n");
      out.write("           \t  $.getJSON(similrTicketsURL,{},function(data) {\t\r\n");
      out.write("           \t\t \r\n");
      out.write("        \t\t$(\"#Audit-Log\").hide();\r\n");
      out.write("\t\t\t\t$(\"#ticketdetailsform\").hide();\r\n");
      out.write("\t\t\t\t$(\"#Attachment-Div\").hide();\r\n");
      out.write("\t\t\t\t$(\"#Approver-Data\").hide();\r\n");
      out.write("\t\t\t\t$(\"#Asset-Data\").hide();\r\n");
      out.write("\t\t\t\t$(\"#Similar-Tickets\").show();\r\n");
      out.write("\t\t\t\t$(\"#Similar-Tickets\").html(data);\r\n");
      out.write("\t\t\t\t$(\"#Related-Mails\").hide();\r\n");
      out.write("\t\t\t\t$(\"#Master-Ticket\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#Similar-Tickets div.jmesa\").find(\"tr.toolbar\").hide();\r\n");
      out.write("            \t$(\"#Similar-Tickets div.jmesa\").find(\"tr.filter\").hide();\r\n");
      out.write("            \tunblockUI();\r\n");
      out.write("           \t  });\r\n");
      out.write("            }\r\n");
      out.write(" \r\n");
      out.write("            function getRelatedMails(){\r\n");
      out.write("\r\n");
      out.write("            \tif(inEditMode){\r\n");
      out.write("            \t\tif(confirm(\"Do you want to continue with out updating the ticket?\")){\r\n");
      out.write("            \t    \tinEditMode = false;\r\n");
      out.write("            \t\t  \tunlockTheTicket($(\"#TICKET_ID\").val(),1);\r\n");
      out.write("            \t      }else{\r\n");
      out.write("            \t\t\t\treturn false;\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t}\r\n");
      out.write("            \t\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").removeClass(\"selected\");\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").eq(\"5\").addClass(\"selected\");\r\n");
      out.write("            \tblockUI();\r\n");
      out.write("            \tvar relatedMailsURL=null;\r\n");
      out.write("                var fucntion = $(\"#FUNCTION_ID :selected\").text(); \r\n");
      out.write("            \tif(fucntion==\"HR\"){\r\n");
      out.write("            \t relatedMailsURL = \"HELPDESK_RelatedMailslistPage_HR.htm?menuId=0&functionName=HR&parentMenuId=4&menuName=RelatedMails&parentMenuName=Mail-Tracker&ticketid=");
      out.print(id);
      out.write("\";\r\n");
      out.write("            \t}else{\r\n");
      out.write("            \t\trelatedMailsURL = \"HELPDESK_RelatedMailslistPage.htm?menuId=0&parentMenuId=4&menuName=RelatedMails&parentMenuName=Mail-Tracker&ticketid=");
      out.print(id);
      out.write("\";                \t\r\n");
      out.write("            \t}\r\n");
      out.write("             \t $.ajaxSetup({ cache: false });\r\n");
      out.write("            \t  $.getJSON(relatedMailsURL,{},function(data) {\t\r\n");
      out.write("\r\n");
      out.write("              \t\t$(\"#Audit-Log\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#ticketdetailsform\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#Attachment-Div\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#Approver-Data\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#Asset-Data\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#Similar-Tickets\").hide();\r\n");
      out.write("      \t\t\t\t$(\"#Master-Ticket\").hide();\r\n");
      out.write("\r\n");
      out.write("      \t\t\t\t$(\"#Related-Mails\").html(data); \r\n");
      out.write("      \t\t\t\t$(\"#Related-Mails\").show();\r\n");
      out.write("      \t\t\t\t \r\n");
      out.write("    \t\t\t\t$(\"#Related-Mails div.jmesa\").find(\"tr.toolbar\").hide(); \r\n");
      out.write("                \t$(\"#Related-Mails div.jmesa\").find(\"tr.filter\").hide();\r\n");
      out.write("                \tunblockUI();\r\n");
      out.write("            \t  });\r\n");
      out.write("               }\r\n");
      out.write("            \r\n");
      out.write("            var userid = \"");
      out.print(loginUser);
      out.write("\";\r\n");
      out.write("            var username =\"");
      out.print(empName);
      out.write("\";\r\n");
      out.write("            var loginrole = \"");
      out.print(role);
      out.write("\";\r\n");
      out.write("            var fucntion = \"");
      out.print(function);
      out.write("\"; \r\n");
      out.write("            var todoAction = \"");
      out.print(todoAction);
      out.write("\";\r\n");
      out.write("            var subjectVal_Search=\"");
      out.print(subject);
      out.write("\";\r\n");
      out.write("            var id=\"");
      out.print(id);
      out.write("\";\r\n");
      out.write("           \tvar hd_url=\"HELPDESK_Edit.htm?id=");
      out.print(id);
      out.write("&subject=");
      out.print(subject);
      out.write("&category=");
      out.print(category);
      out.write("&subcategory=");
      out.print(subcategory);
      out.write("&function=");
      out.print(function);
      out.write("\";\r\n");
      out.write("            var previous_Url=\"UNIVERSAL_ListPage.htm?menuId=");
      out.print(menuId);
      out.write("&parentMenuId=");
      out.print(parentMenuId);
      out.write("&menuName=");
      out.print(menuName);
      out.write("&parentMenuName=");
      out.print(parentMenuName);
      out.write("\";\r\n");
      out.write("            //var previous_Url=\"UNIVERSAL_ListPage.htm?menuId=13&parentMenuId=1&menuName=Open Request&parentMenuName=Helpdesk\";\r\n");
      out.write("         if(loginrole==\"User\"){\r\n");
      out.write("      //      \t$(\"#hdEditMain\").find(\"li\").eq(\"2\").hide();\r\n");
      out.write("            \t$(\"#hdEditMain\").find(\"li\").eq(\"3\").hide();\r\n");
      out.write("            \t//$(\"#hdEditMain\").find(\"li\").eq(\"4\").hide();\r\n");
      out.write("            \t$(\"#hdEditMain\").find(\"li\").eq(\"4\").hide();\r\n");
      out.write("            \t$(\"#hdEditMain\").find(\"li\").eq(\"5\").hide();\r\n");
      out.write("            }else if(fucntion!=\"Information Systems\" && fucntion!=\"IT Infrastructure Management\"){\r\n");
      out.write("            \t$(\"#hdEditMain\").find(\"li\").eq(\"3\").hide();\r\n");
      out.write("            \t$(\"#hdEditMain\").find(\"li\").eq(\"4\").hide();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("            \t$(\"#hdEditMain ul li a\").eq(\"0\").click(function(){\r\n");
      out.write("            \t\tblockUI(); \r\n");
      out.write("                 });\r\n");
      out.write("            });\r\n");
      out.write("            function blockUI(){\r\n");
      out.write("            \t$.blockUI({ css: { \r\n");
      out.write("                    border: 'none', \r\n");
      out.write("                    padding: '15px', \r\n");
      out.write("                    backgroundColor: '#000', \r\n");
      out.write("                    '-webkit-border-radius': '10px', \r\n");
      out.write("                    '-moz-border-radius': '10px', \r\n");
      out.write("                    opacity: .5, \r\n");
      out.write("                    color: '#fff' \r\n");
      out.write("                } });\r\n");
      out.write("            }\r\n");
      out.write("            function unblockUI(){\r\n");
      out.write("            \t$.unblockUI(); \r\n");
      out.write("            }     \r\n");
      out.write("            var menuId='");
      out.print(menuId);
      out.write("';\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("</script>\t   \r\n");
      out.write(" <div style=\"display:none\" id=\"commentsHTML\"></div>  \r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(132,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${helpDeskObj.PREMIUM =='Yes'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<img src=\"images/Premium.gif\"/><span class=\"blink\"><font color=\"red\">Premium</font></span>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(140,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("TICKET_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(140,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("TICKET_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(140,11) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "maxlength", new String("500"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("ADDITIONAL_INFO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("ADDITIONAL_INFO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(145,11) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(154,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setPath("WORKFLOW_STATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(154,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setId("WORKFLOW_STATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(154,11) null
    _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "class", new String("myTextInputForEditPage"));
    int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
      if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005foptions_005f0(_jspx_th_form_005fselect_005f0, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fselect_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f0 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(155,8) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${WORKFLOW}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_form_005foptions_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f0 = _jspx_th_form_005foptions_005f0.doStartTag();
      if (_jspx_th_form_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fnobody.reuse(_jspx_th_form_005foptions_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(188,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("DEPT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(188,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setId("DEPT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(188,8) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(222,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("SUBJECT");
    // /WEB-INF/view/HELPDESK_Edit.jsp(222,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setId("SUBJECT");
    // /WEB-INF/view/HELPDESK_Edit.jsp(222,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setMaxlength("100");
    // /WEB-INF/view/HELPDESK_Edit.jsp(222,11) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f1 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setPath("DESCRIPTION");
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setId("DESCRIPTION");
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(227,12) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f1 = _jspx_th_form_005ftextarea_005f1.doStartTag();
      if (_jspx_th_form_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005foption_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005foption_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005foption_005f11);
    // /WEB-INF/view/HELPDESK_Edit.jsp(237,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION.CITY}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(243,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("LOC_DET_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(243,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setId("LOC_DET_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(243,11) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(266,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setPath("CUBICLE_CODE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(266,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setId("CUBICLE_CODE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(266,11) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f4 = _jspx_th_form_005finput_005f4.doStartTag();
      if (_jspx_th_form_005finput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(280,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setPath("COPY_TO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(280,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setId("COPY_TO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(280,11) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(280,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setMaxlength("500");
    int[] _jspx_push_body_count_form_005finput_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f5 = _jspx_th_form_005finput_005f5.doStartTag();
      if (_jspx_th_form_005finput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005foption_005f21, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005foption_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005foption_005f21);
    // /WEB-INF/view/HELPDESK_Edit.jsp(307,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOCATION.CITY}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f6 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(333,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f6.setPath("CREATED_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(333,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f6.setId("CREATED_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(333,11) null
    _jspx_th_form_005finput_005f6.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f6 = _jspx_th_form_005finput_005f6.doStartTag();
      if (_jspx_th_form_005finput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f6.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f7 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(337,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f7.setPath("CREATED_DATE_STORAGE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(337,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f7.setId("CREATED_DATE_STORAGE");
    int[] _jspx_push_body_count_form_005finput_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f7 = _jspx_th_form_005finput_005f7.doStartTag();
      if (_jspx_th_form_005finput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f7.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f8 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(342,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f8.setPath("CHANGED_DATE_STORAGE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(342,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f8.setId("CHANGED_DATE_STORAGE");
    int[] _jspx_push_body_count_form_005finput_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f8 = _jspx_th_form_005finput_005f8.doStartTag();
      if (_jspx_th_form_005finput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f8.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f9 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(346,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f9.setPath("IS_CHANGE_REQUEST");
    // /WEB-INF/view/HELPDESK_Edit.jsp(346,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f9.setId("IS_CHANGE_REQUEST");
    int[] _jspx_push_body_count_form_005finput_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f9 = _jspx_th_form_005finput_005f9.doStartTag();
      if (_jspx_th_form_005finput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f9.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f10 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(350,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f10.setPath("IS_MASTER_LINK");
    // /WEB-INF/view/HELPDESK_Edit.jsp(350,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f10.setId("IS_MASTER_LINK");
    int[] _jspx_push_body_count_form_005finput_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f10 = _jspx_th_form_005finput_005f10.doStartTag();
      if (_jspx_th_form_005finput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f10.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f11 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f11.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(355,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f11.setPath("ECT");
    // /WEB-INF/view/HELPDESK_Edit.jsp(355,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f11.setId("ECT");
    // /WEB-INF/view/HELPDESK_Edit.jsp(355,11) null
    _jspx_th_form_005finput_005f11.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f11 = _jspx_th_form_005finput_005f11.doStartTag();
      if (_jspx_th_form_005finput_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f11.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f12 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f12.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(359,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f12.setPath("ECT_STORAGE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(359,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f12.setId("ECT_STORAGE");
    int[] _jspx_push_body_count_form_005finput_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f12 = _jspx_th_form_005finput_005f12.doStartTag();
      if (_jspx_th_form_005finput_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f12.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f13 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f13.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(363,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f13.setPath("TOTAL_SLA_TIME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(363,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f13.setId("TOTAL_SLA_TIME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(363,11) null
    _jspx_th_form_005finput_005f13.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f13 = _jspx_th_form_005finput_005f13.doStartTag();
      if (_jspx_th_form_005finput_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f13.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f14 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f14.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(367,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f14.setPath("TIME_REMAINING");
    // /WEB-INF/view/HELPDESK_Edit.jsp(367,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f14.setId("TIME_REMAINING");
    // /WEB-INF/view/HELPDESK_Edit.jsp(367,11) null
    _jspx_th_form_005finput_005f14.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f14 = _jspx_th_form_005finput_005f14.doStartTag();
      if (_jspx_th_form_005finput_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f14.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f15 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f15.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(371,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f15.setPath("SLA_STATUS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(371,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f15.setId("SLA_STATUS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(371,11) null
    _jspx_th_form_005finput_005f15.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f15 = _jspx_th_form_005finput_005f15.doStartTag();
      if (_jspx_th_form_005finput_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f15.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f16 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f16.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(375,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f16.setPath("USERS_IMPACTED");
    // /WEB-INF/view/HELPDESK_Edit.jsp(375,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f16.setId("USERS_IMPACTED");
    // /WEB-INF/view/HELPDESK_Edit.jsp(375,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f16.setMaxlength("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(375,11) null
    _jspx_th_form_005finput_005f16.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f16 = _jspx_th_form_005finput_005f16.doStartTag();
      if (_jspx_th_form_005finput_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f16.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f17 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f17.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(379,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f17.setPath("CREATED_BY");
    // /WEB-INF/view/HELPDESK_Edit.jsp(379,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f17.setId("CREATED_BY");
    // /WEB-INF/view/HELPDESK_Edit.jsp(379,11) null
    _jspx_th_form_005finput_005f17.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f17 = _jspx_th_form_005finput_005f17.doStartTag();
      if (_jspx_th_form_005finput_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f17.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f18 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f18.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(443,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f18.setPath("REQUESTED_BY");
    // /WEB-INF/view/HELPDESK_Edit.jsp(443,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f18.setId("REQUESTED_BY");
    // /WEB-INF/view/HELPDESK_Edit.jsp(443,11) null
    _jspx_th_form_005finput_005f18.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f18 = _jspx_th_form_005finput_005f18.doStartTag();
      if (_jspx_th_form_005finput_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f18.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f19 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f19.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(447,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f19.setPath("ON_BEHALF_OF");
    // /WEB-INF/view/HELPDESK_Edit.jsp(447,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f19.setId("ON_BEHALF_OF");
    // /WEB-INF/view/HELPDESK_Edit.jsp(447,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f19.setMaxlength("10");
    // /WEB-INF/view/HELPDESK_Edit.jsp(447,11) null
    _jspx_th_form_005finput_005f19.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f19 = _jspx_th_form_005finput_005f19.doStartTag();
      if (_jspx_th_form_005finput_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f19.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f20 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f20.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(470,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f20.setPath("PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(470,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f20.setId("PROJECT_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(470,7) null
    _jspx_th_form_005finput_005f20.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f20 = _jspx_th_form_005finput_005f20.doStartTag();
      if (_jspx_th_form_005finput_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f20.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f21 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f21.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(475,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f21.setPath("PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(475,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f21.setId("PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(475,11) null
    _jspx_th_form_005finput_005f21.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f21 = _jspx_th_form_005finput_005f21.doStartTag();
      if (_jspx_th_form_005finput_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f21.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f22 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f22.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(479,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f22.setPath("LEVEL_2_PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(479,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f22.setId("LEVEL_2_PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(479,11) null
    _jspx_th_form_005finput_005f22.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f22 = _jspx_th_form_005finput_005f22.doStartTag();
      if (_jspx_th_form_005finput_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f22.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f23 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f23.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(483,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f23.setPath("LEVEL_3_PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(483,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f23.setId("LEVEL_3_PROJECT_NAME");
    // /WEB-INF/view/HELPDESK_Edit.jsp(483,11) null
    _jspx_th_form_005finput_005f23.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f23 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f23 = _jspx_th_form_005finput_005f23.doStartTag();
      if (_jspx_th_form_005finput_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f23.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f23);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f24 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f24.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(487,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f24.setPath("MANAGER_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(487,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f24.setId("MANAGER_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(487,11) null
    _jspx_th_form_005finput_005f24.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f24 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f24 = _jspx_th_form_005finput_005f24.doStartTag();
      if (_jspx_th_form_005finput_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f24.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f24);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f25 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f25.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(506,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f25.setPath("CONTACT_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(506,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f25.setId("CONTACT_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(506,11) null
    _jspx_th_form_005finput_005f25.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(506,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f25.setMaxlength("15");
    int[] _jspx_push_body_count_form_005finput_005f25 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f25 = _jspx_th_form_005finput_005f25.doStartTag();
      if (_jspx_th_form_005finput_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f25[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f25.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f25.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f25);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f26 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f26.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(510,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f26.setPath("ALTERNATE_CONTACT_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(510,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f26.setId("ALTERNATE_CONTACT_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(510,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f26.setMaxlength("15");
    // /WEB-INF/view/HELPDESK_Edit.jsp(510,11) null
    _jspx_th_form_005finput_005f26.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f26 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f26 = _jspx_th_form_005finput_005f26.doStartTag();
      if (_jspx_th_form_005finput_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f26[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f26.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f26.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f26);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f2 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f2.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) null
    _jspx_th_form_005ftextarea_005f2.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) null
    _jspx_th_form_005ftextarea_005f2.setDynamicAttribute(null, "maxlength", new String("500"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f2.setPath("ADDITIONAL_INFO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f2.setId("ADDITIONAL_INFO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f2.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(525,11) null
    _jspx_th_form_005ftextarea_005f2.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f2 = _jspx_th_form_005ftextarea_005f2.doStartTag();
      if (_jspx_th_form_005ftextarea_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f3 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f3.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) null
    _jspx_th_form_005ftextarea_005f3.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) null
    _jspx_th_form_005ftextarea_005f3.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f3.setPath("RESOLUTION_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f3.setId("RESOLUTION_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f3.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(545,11) null
    _jspx_th_form_005ftextarea_005f3.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f3 = _jspx_th_form_005ftextarea_005f3.doStartTag();
      if (_jspx_th_form_005ftextarea_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f4 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f4.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) null
    _jspx_th_form_005ftextarea_005f4.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f4.setPath("PRIVATE_NOTES");
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f4.setId("PRIVATE_NOTES");
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) null
    _jspx_th_form_005ftextarea_005f4.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f4.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(552,11) null
    _jspx_th_form_005ftextarea_005f4.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f4 = _jspx_th_form_005ftextarea_005f4.doStartTag();
      if (_jspx_th_form_005ftextarea_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f4.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f5 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f5.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) null
    _jspx_th_form_005ftextarea_005f5.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f5.setPath("OUT_OF_SLA_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f5.setId("OUT_OF_SLA_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) null
    _jspx_th_form_005ftextarea_005f5.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f5.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(569,11) null
    _jspx_th_form_005ftextarea_005f5.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f5 = _jspx_th_form_005ftextarea_005f5.doStartTag();
      if (_jspx_th_form_005ftextarea_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f5.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f27 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f27.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(576,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f27.setPath("CLOSED_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(576,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f27.setId("CLOSED_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(576,11) null
    _jspx_th_form_005finput_005f27.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f27 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f27 = _jspx_th_form_005finput_005f27.doStartTag();
      if (_jspx_th_form_005finput_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f27[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f27.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f27.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f27);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f6 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f6.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f6.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) null
    _jspx_th_form_005ftextarea_005f6.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f6.setPath("ONHOLD_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f6.setId("ONHOLD_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) null
    _jspx_th_form_005ftextarea_005f6.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f6.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(580,11) null
    _jspx_th_form_005ftextarea_005f6.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f6 = _jspx_th_form_005ftextarea_005f6.doStartTag();
      if (_jspx_th_form_005ftextarea_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f6.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f28 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f28.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(587,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f28.setPath("REMINDER_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(587,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f28.setId("REMINDER_DATE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(587,11) null
    _jspx_th_form_005finput_005f28.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f28 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f28 = _jspx_th_form_005finput_005f28.doStartTag();
      if (_jspx_th_form_005finput_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f28[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f28.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f28.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f28);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f29 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f29.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(598,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f29.setPath("FEEDBACK");
    // /WEB-INF/view/HELPDESK_Edit.jsp(598,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f29.setId("FEEDBACK");
    // /WEB-INF/view/HELPDESK_Edit.jsp(598,10) null
    _jspx_th_form_005finput_005f29.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f29 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f29 = _jspx_th_form_005finput_005f29.doStartTag();
      if (_jspx_th_form_005finput_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f29[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f29.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f29.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f29);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f7 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f7.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f7.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) null
    _jspx_th_form_005ftextarea_005f7.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f7.setPath("FEEDBACK_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f7.setId("FEEDBACK_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) null
    _jspx_th_form_005ftextarea_005f7.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f7.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(603,7) null
    _jspx_th_form_005ftextarea_005f7.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f7 = _jspx_th_form_005ftextarea_005f7.doStartTag();
      if (_jspx_th_form_005ftextarea_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f7.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f8 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f8.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f8.setRows("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) null
    _jspx_th_form_005ftextarea_005f8.setDynamicAttribute(null, "style", new String("width:284px"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f8.setPath("REOPEN_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f8.setId("REOPEN_COMMENTS");
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) null
    _jspx_th_form_005ftextarea_005f8.setDynamicAttribute(null, "maxlength", new String("999"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f8.setOnmouseover("getDescVal1(this.id)");
    // /WEB-INF/view/HELPDESK_Edit.jsp(609,11) null
    _jspx_th_form_005ftextarea_005f8.setDynamicAttribute(null, "onKeyDown", new String("return onKeyDown()"));
    int[] _jspx_push_body_count_form_005ftextarea_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f8 = _jspx_th_form_005ftextarea_005f8.doStartTag();
      if (_jspx_th_form_005ftextarea_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f8.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fonmouseover_005fonKeyDown_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f30 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f30.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(624,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f30.setPath("VERSION_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(624,11) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f30.setId("VERSION_NO");
    // /WEB-INF/view/HELPDESK_Edit.jsp(624,11) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f30.setMaxlength("5");
    // /WEB-INF/view/HELPDESK_Edit.jsp(624,11) null
    _jspx_th_form_005finput_005f30.setDynamicAttribute(null, "style", new String("width:284px"));
    int[] _jspx_push_body_count_form_005finput_005f30 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f30 = _jspx_th_form_005finput_005f30.doStartTag();
      if (_jspx_th_form_005finput_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f30[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f30.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f30.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fstyle_005fpath_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f30);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(636,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("REFERENCE_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(636,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setId("REFERENCE_ID");
    int[] _jspx_push_body_count_form_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f0 = _jspx_th_form_005fhidden_005f0.doStartTag();
      if (_jspx_th_form_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftitle_005fsize_005fpath_005fonclick_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(642,24) null
    _jspx_th_form_005fcheckbox_005f0.setDynamicAttribute(null, "size", new String("80"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(642,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setId("SEARCH_REFERENCE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(642,24) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("SEARCH_REFERENCE");
    // /WEB-INF/view/HELPDESK_Edit.jsp(642,24) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setOnclick("$(this).val($(this).attr('checked'))");
    // /WEB-INF/view/HELPDESK_Edit.jsp(642,24) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setTitle("If you want to provide this resolution comments for search page, check this box.");
    int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftitle_005fsize_005fpath_005fonclick_005fid_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f31 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f31.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(662,1) null
    _jspx_th_form_005finput_005f31.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(662,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f31.setId("LEVEL_2_PROJECT_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(662,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f31.setPath("LEVEL_2_PROJECT_ID");
    int[] _jspx_push_body_count_form_005finput_005f31 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f31 = _jspx_th_form_005finput_005f31.doStartTag();
      if (_jspx_th_form_005finput_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f31[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f31.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f31.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f31);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f32 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f32.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(663,1) null
    _jspx_th_form_005finput_005f32.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(663,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f32.setId("LEVEL_3_PROJECT_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(663,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f32.setPath("LEVEL_3_PROJECT_ID");
    int[] _jspx_push_body_count_form_005finput_005f32 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f32 = _jspx_th_form_005finput_005f32.doStartTag();
      if (_jspx_th_form_005finput_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f32[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f32.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f32.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f32);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f33 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f33.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(664,1) null
    _jspx_th_form_005finput_005f33.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(664,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f33.setId("LEVEL_3_PROJECT_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(664,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f33.setPath("LEVEL_3_PROJECT_ID");
    int[] _jspx_push_body_count_form_005finput_005f33 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f33 = _jspx_th_form_005finput_005f33.doStartTag();
      if (_jspx_th_form_005finput_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f33[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f33.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f33.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f33);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f34 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f34.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(665,1) null
    _jspx_th_form_005finput_005f34.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(665,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f34.setId("IS_AUTOMATION_REQUIRED");
    // /WEB-INF/view/HELPDESK_Edit.jsp(665,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f34.setPath("IS_AUTOMATION_REQUIRED");
    int[] _jspx_push_body_count_form_005finput_005f34 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f34 = _jspx_th_form_005finput_005f34.doStartTag();
      if (_jspx_th_form_005finput_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f34[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f34.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f34.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f34);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f35 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f35.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(666,1) null
    _jspx_th_form_005finput_005f35.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(666,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f35.setId("IS_ORCH_REQUIRED");
    // /WEB-INF/view/HELPDESK_Edit.jsp(666,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f35.setPath("IS_ORCH_REQUIRED");
    int[] _jspx_push_body_count_form_005finput_005f35 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f35 = _jspx_th_form_005finput_005f35.doStartTag();
      if (_jspx_th_form_005finput_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f35[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f35.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f35.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f35);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f36 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f36.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(667,1) null
    _jspx_th_form_005finput_005f36.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(667,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f36.setId("CORE_ID");
    // /WEB-INF/view/HELPDESK_Edit.jsp(667,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f36.setPath("CORE_ID");
    int[] _jspx_push_body_count_form_005finput_005f36 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f36 = _jspx_th_form_005finput_005f36.doStartTag();
      if (_jspx_th_form_005finput_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f36[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f36.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f36.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f36);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f37 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f37.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Edit.jsp(668,1) null
    _jspx_th_form_005finput_005f37.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Edit.jsp(668,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f37.setId("ALLOW_CLOSEABLE_FLAG");
    // /WEB-INF/view/HELPDESK_Edit.jsp(668,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f37.setPath("ALLOW_CLOSEABLE_FLAG");
    int[] _jspx_push_body_count_form_005finput_005f37 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f37 = _jspx_th_form_005finput_005f37.doStartTag();
      if (_jspx_th_form_005finput_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f37[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f37.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f37.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f37);
    }
    return false;
  }
}
