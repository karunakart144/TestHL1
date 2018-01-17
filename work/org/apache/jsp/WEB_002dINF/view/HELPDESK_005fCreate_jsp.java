package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.igate.iconnect.BO.User;
import com.igate.iconnect.BO.WORKFLOW_Role;

public final class HELPDESK_005fCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fname_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonchange_005fonblur_005fmaxlength_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftitle_005fstyle_005frows_005fpath_005fonblur_005fmaxlength_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonBlur_005fmaxlength_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fname_005fmaxlength_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fid_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fname_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonchange_005fonblur_005fmaxlength_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftitle_005fstyle_005frows_005fpath_005fonblur_005fmaxlength_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonBlur_005fmaxlength_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fname_005fmaxlength_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass.release();
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fname_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonchange_005fonblur_005fmaxlength_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftitle_005fstyle_005frows_005fpath_005fonblur_005fmaxlength_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonBlur_005fmaxlength_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fname_005fmaxlength_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fid_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fclass_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String loginUser = (String) request.getSession().getAttribute(
			"userLoginId");
	User userObj = (User) request.getSession().getAttribute(
			loginUser);
	String empName = userObj.getUserName();
	String mobileno = userObj.getMobile();
	String extnno = userObj.getExtension();
	String loginrole = userObj.getUserRole();
	String approvalExceptionFlag = userObj.getApprovalExceptionFlag();
	String subject="";
	List<WORKFLOW_Role> userRoleList=userObj.getUserRoleList();
	int roleListSize=userRoleList.size();

      out.write(' ');
      out.write('\r');
      out.write('\n');
 String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
   String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>IConnect : Unified Service Desk for Life & Health</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery.ui.all.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/iconnect.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/ui.all.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/validationEngine.jquery.css\" media=\"screen\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/jquery.bt.latest.css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!--[if gte IE 9]>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.ui-autocomplete\r\n");
      out.write("\t{\r\n");
      out.write("\tleft: 261px !important;\r\n");
      out.write("    top: -44px !important;\r\n");
      out.write("    position:relative;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<style>\t\r\n");
      out.write("\t\t.ui-autocomplete {\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 489px;\r\n");
      out.write("\t\t\tleft: 362px;\r\n");
      out.write("\t\t\tcursor: default;\r\n");
      out.write("\t\t\theight: 150px;\r\n");
      out.write("\t\t\toverflow: auto;\r\n");
      out.write("\t\t\twidth: 219px !important;\r\n");
      out.write("\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("if(top.location.href.substring(0, top.location.href.lastIndexOf(\"/\")+1)!=window.location.href.substring(0, window.location.href.lastIndexOf(\"/\")+1)){\r\n");
      out.write("\ttop.location=window.location;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 String token = null; 
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.7.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-migrate-1.2.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-ui-custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.validationEngine-en.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.validationEngine.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/json.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.bgiframe.min.js\"></script>\r\n");
      out.write("<!--[if IE]><script src=\"");
      out.print(jsDirPath);
      out.write("/excanvas.compiled.js\" type=\"text/javascript\" charset=\"utf-8\"></script><![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.bt.latest.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Security.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery.client.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/HELPDESK_Create.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmodelAttribute_005fmethod_005fid_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("CreateHelpdeskBean");
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setId("createhelpdeskticket");
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("HELPDESK_Create.htm");
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setName("createhelpdeskticket");
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/view/HELPDESK_Create.jsp(87,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<br></br>\r\n");
            out.write("\t<table border=\"0\" id=\"ticketcreationtable\" cellspacing=\"0\"\r\n");
            out.write("\t\tcellpadding=\"3\" width=\"80%\" align=\"center\" class=\"createTable\">\r\n");
            out.write("\t\t<tr class='none'>\r\n");
            out.write("\t\t\t<td colspan=\"2\"><span class=\"containerBlock1\">New Ticket\r\n");
            out.write("\t\t\tCreation</span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("<!--Added by gk820877 on 5/19/2015 -->\r\n");
            out.write("\t\t");
            //  c:choose
            org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
            _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
            _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
            if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n");
                out.write("  ");
                //  c:when
                org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                // /WEB-INF/view/HELPDESK_Create.jsp(99,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sourceValue}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("  \t<tr style=\"display: none\" id=\"sourceTR\" class=\"creationScreenAlternateTR\">\r\n");
                    out.write("\t\t\t<td class=\"label\">Source<span class=\"red_text\">*</span></td>\r\n");
                    out.write("\t\t\t<td align=\"left\">");
                    //  form:select
                    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                    _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                    // /WEB-INF/view/HELPDESK_Create.jsp(102,20) null
                    _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "width", new String("100%"));
                    // /WEB-INF/view/HELPDESK_Create.jsp(102,20) null
                    _jspx_th_form_005fselect_005f0.setDynamicAttribute(null, "class", new String("myTextInput"));
                    // /WEB-INF/view/HELPDESK_Create.jsp(102,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_form_005fselect_005f0.setId("source");
                    // /WEB-INF/view/HELPDESK_Create.jsp(102,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_form_005fselect_005f0.setPath("source");
                    int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
                    try {
                      int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
                      if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  form:option
                          org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                          _jspx_th_form_005foption_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_form_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                          // /WEB-INF/view/HELPDESK_Create.jsp(104,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_form_005foption_005f0.setValue(new String("Web"));
                          int[] _jspx_push_body_count_form_005foption_005f0 = new int[] { 0 };
                          try {
                            int _jspx_eval_form_005foption_005f0 = _jspx_th_form_005foption_005f0.doStartTag();
                            if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f0[0]++;
                              _jspx_th_form_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f0.doInitBody();
                              }
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              do {
                              out.write('W');
                              out.write('e');
                              out.write('b');
                              int evalDoAfterBody = _jspx_th_form_005foption_005f0.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_form_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f0[0]--;
                              }
                            }
                            if (_jspx_th_form_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                            }
                          } catch (Throwable _jspx_exception) {
                            while (_jspx_push_body_count_form_005foption_005f0[0]-- > 0)
                              out = _jspx_page_context.popBody();
                            _jspx_th_form_005foption_005f0.doCatch(_jspx_exception);
                          } finally {
                            _jspx_th_form_005foption_005f0.doFinally();
                            _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f0);
                          }
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  form:option
                          org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f1 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                          _jspx_th_form_005foption_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_form_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                          // /WEB-INF/view/HELPDESK_Create.jsp(105,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_form_005foption_005f1.setValue(new String("Email"));
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
                              out.write("Email");
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
                          out.write("\t\t\t\t");
                          //  form:option
                          org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f2 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                          _jspx_th_form_005foption_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_form_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                          // /WEB-INF/view/HELPDESK_Create.jsp(106,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_form_005foption_005f2.setValue(new String("Phone"));
                          int[] _jspx_push_body_count_form_005foption_005f2 = new int[] { 0 };
                          try {
                            int _jspx_eval_form_005foption_005f2 = _jspx_th_form_005foption_005f2.doStartTag();
                            if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f2[0]++;
                              _jspx_th_form_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f2.doInitBody();
                              }
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              do {
                              out.write("Phone");
                              int evalDoAfterBody = _jspx_th_form_005foption_005f2.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_form_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f2[0]--;
                              }
                            }
                            if (_jspx_th_form_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                            }
                          } catch (Throwable _jspx_exception) {
                            while (_jspx_push_body_count_form_005foption_005f2[0]-- > 0)
                              out = _jspx_page_context.popBody();
                            _jspx_th_form_005foption_005f2.doCatch(_jspx_exception);
                          } finally {
                            _jspx_th_form_005foption_005f2.doFinally();
                            _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f2);
                          }
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  form:option
                          org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f3 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                          _jspx_th_form_005foption_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_form_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                          // /WEB-INF/view/HELPDESK_Create.jsp(107,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_form_005foption_005f3.setValue(new String("Walk-In"));
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
                              out.write("Walk-In");
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
                          out.write("\t\t\t");
                          int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        return;
                      }
                    } catch (Throwable _jspx_exception) {
                      while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
                        out = _jspx_page_context.popBody();
                      _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
                    } finally {
                      _jspx_th_form_005fselect_005f0.doFinally();
                      _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f0);
                    }
                    out.write("</td>\r\n");
                    out.write("\t\t</tr>\r\n");
                    out.write("  ");
                    int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                out.write("\r\n");
                out.write("  ");
                //  c:otherwise
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("    <tr style=\"display: none\" id=\"sourceTR\">\r\n");
                    out.write("\t\t\t<td class=\"label\">Source<span class=\"red_text\">*</span></td>\r\n");
                    out.write("\t\t\t<td align=\"left\">");
                    //  form:select
                    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f1 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                    _jspx_th_form_005fselect_005f1.setPageContext(_jspx_page_context);
                    _jspx_th_form_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                    // /WEB-INF/view/HELPDESK_Create.jsp(114,20) null
                    _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "width", new String("100%"));
                    // /WEB-INF/view/HELPDESK_Create.jsp(114,20) null
                    _jspx_th_form_005fselect_005f1.setDynamicAttribute(null, "class", new String("myTextInput"));
                    // /WEB-INF/view/HELPDESK_Create.jsp(114,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_form_005fselect_005f1.setId("source");
                    // /WEB-INF/view/HELPDESK_Create.jsp(114,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_form_005fselect_005f1.setPath("source");
                    int[] _jspx_push_body_count_form_005fselect_005f1 = new int[] { 0 };
                    try {
                      int _jspx_eval_form_005fselect_005f1 = _jspx_th_form_005fselect_005f1.doStartTag();
                      if (_jspx_eval_form_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t");
                          //  form:option
                          org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f4 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                          _jspx_th_form_005foption_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_form_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f1);
                          // /WEB-INF/view/HELPDESK_Create.jsp(116,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_form_005foption_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sourceValue}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                          int[] _jspx_push_body_count_form_005foption_005f4 = new int[] { 0 };
                          try {
                            int _jspx_eval_form_005foption_005f4 = _jspx_th_form_005foption_005f4.doStartTag();
                            if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_005foption_005f4[0]++;
                              _jspx_th_form_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_005foption_005f4.doInitBody();
                              }
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sourceValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              int evalDoAfterBody = _jspx_th_form_005foption_005f4.doAfterBody();
                              value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                              displayValue = (java.lang.String) _jspx_page_context.findAttribute("displayValue");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_form_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_005foption_005f4[0]--;
                              }
                            }
                            if (_jspx_th_form_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                            }
                          } catch (Throwable _jspx_exception) {
                            while (_jspx_push_body_count_form_005foption_005f4[0]-- > 0)
                              out = _jspx_page_context.popBody();
                            _jspx_th_form_005foption_005f4.doCatch(_jspx_exception);
                          } finally {
                            _jspx_th_form_005foption_005f4.doFinally();
                            _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue.reuse(_jspx_th_form_005foption_005f4);
                          }
                          out.write("\r\n");
                          out.write("\t\t\t");
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
                      _005fjspx_005ftagPool_005fform_005fselect_0026_005fwidth_005fpath_005fid_005fclass.reuse(_jspx_th_form_005fselect_005f1);
                    }
                    out.write("</td>\r\n");
                    out.write("\t\t</tr>\r\n");
                    out.write("  ");
                    int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                out.write('\r');
                out.write('\n');
                int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t<td class=\"label\">Function<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select class=\"myTextInput\" id=\"function\" name=\"function\"\r\n");
            out.write("\t\t\t\tonChange=\"GetCategories(this,'category');loadSearchPageFunc()\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory , Select the function that your problem or request is related.\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Category<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select class=\"myTextInput\" id=\"category\"\r\n");
            out.write("\t\t\t\tname=\"category\" onChange=\"GetCategories(this,'subcategory');loadSearchPageCategry();\"\r\n");
            out.write("\t\t\t\ttitle=\"Category is the service, technology or application to which your problem may be related to. Select appropriate category.\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"SUB_CATEGORY_ID_TR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Sub Category<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select\r\n");
            out.write("\t\t\t\tclass=\"myTextInput\" id=\"subcategory\" name=\"subcategory\"\r\n");
            out.write("\t\t\t\tonChange=\"ShowApprovalAttachment(this);loadSearchPageSubCategry();showPriority(this);\"\r\n");
            out.write("\t\t\t\ttitle=\"Select the sub category that defines your problem accurately.\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</select>\r\n");
            out.write("\t\t\t<table>\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td id=\"formlinktoixchange\"></td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t</table>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"departmentTR\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\" id=\"reqDeptName\">Requestor Department<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\" id=\"deptTD\"><!--<select class=\"myTextInput\" id=\"department\"\r\n");
            out.write("\t\t\t\tname=\"department\" onChange=\"\"\r\n");
            out.write("\t\t\t\ttitle=\"Select the department that you are belongs to.\">\r\n");
            out.write("\t\t\t</select>-->\t\r\n");
            out.write("\t\t\t\r\n");
            out.write("\t\t\t");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\t\t\t\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"priorityTR\" class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Priority<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\">\r\n");
            out.write("\t\t\t\t<select class=\"myTextInput\" id=\"priority\" onchange=\"showwarnmessage()\" name=\"priority\">\r\n");
            out.write("\t\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t\t</select>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"subjectlistTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Subject<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><span id=\"subjectselect\" style=\"display: none\">\r\n");
            out.write("\t\t\t<select class=\"myTextInput\" id=\"subjectlist\" name=\"subjectlist\"\r\n");
            out.write("\t\t\t\tonChange=\"addSubject(this)\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory, Write your problem statement (100 characters).\">\r\n");
            out.write("\t\t\t</select> </span> <span id=\"subjectinput\">");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</span>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\" valign=\"top\">Description<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"attachmentSelect\" style=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachmentselect}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("\t\t\t<td class=\"label\">");
            if (_jspx_meth_form_005flabel_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t<td align=\"left\" id=\"problemattachTD\">");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(" &nbsp; <a href=\"#\" class=\"label\"\r\n");
            out.write("\t\t\t\tonclick=\"clearproblemattachment()\">Clear Attachment</a></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"attachmentDisplay\" style=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachmentdisplay}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">\r\n");
            out.write("\t\t\t<td class=\"label\">");
            if (_jspx_meth_form_005flabel_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005fhidden_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(' ');
            if (_jspx_meth_form_005fhidden_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(" <a href=\"#\"\r\n");
            out.write("\t\t\t\tid=\"showAttachInfo\"\r\n");
            out.write("\t\t\t\tonclick=\"downloadAttachment('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CreateHelpdeskBean.attachmentPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CreateHelpdeskBean.attachmentName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("')\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CreateHelpdeskBean.attachmentName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a>\r\n");
            out.write("\t\t\t<input type=\"button\" value=\"Remove\" onclick=\"showAttachmentSelect()\"></input>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr id=\"ApprovalAttachmentTR\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\">");
            if (_jspx_meth_form_005flabel_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t<td align=\"left\" id=\"approverattachTD\">");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(" &nbsp; <a href=\"#\" class=\"label\"\r\n");
            out.write("\t\t\t\tonclick=\"clearapproveattachment()\">Clear Approver Attachment</a></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr style=\"display: none\" id=\"isEXEmployeeCheckTR\">\r\n");
            out.write("\t\t<td class=\"label\">Is Ex Employee </td>\r\n");
            out.write("\t\t<td><input type=\"checkbox\" size=\"80\" path=\"isEXEmployeeCheck\"\r\n");
            out.write("\t\t\t\tid=\"isEXEmployeeCheck\" name=\"isEXEmployeeCheck\"\r\n");
            out.write("\t\t\t\tonclick=\"\" checked=\"checked\"\r\n");
            out.write("\t\t\t\ttitle=\"Uncheck the box if the requestor is not an active employee\" /><span\r\n");
            out.write("\t\t\t\tid=\"isEXEmployeerror\"\r\n");
            out.write("\t\t\t\tstyle=\"display: none; color: red; font-size: 12px; font-family: Trebuchet MS, Arial, Helvetica, \r\n");
            out.write("\t\t\t\tsans-serif; font-style: italic\"></span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">On Behalf of(EmployeeID)</td>\r\n");
            out.write("\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005finput_005f4(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t&nbsp;<a id=\"validateEmployee\"\r\n");
            out.write("\t\t\t\thref=\"javascript:ValidateEmpId(document.getElementById('onbeofEmpId').value)\"\r\n");
            out.write("\t\t\t\tclass=\"label\"\r\n");
            out.write("\t\t\t\ttitle=\"Confirm the existence of active Employee in Organization.\"><u>Validate</u>&nbsp;</a><span\r\n");
            out.write("\t\t\t\tid=\"empResultMessage\" class=\"invalid_text\"></span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td class=\"label\" id=\"locationHeaderTd\">Current Location<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td><select id=\"locationId\" name=\"locationId\"\r\n");
            out.write("\t\t\t\tclass=\"myTextInput\" onChange=\"GetBuildings()\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory , Select your current work location\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select function--</option>\r\n");
            out.write("\t\t\t<!--\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t-->\r\n");
            out.write("\t\t\t\t</select>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr style=\"display: none\" id=\"buildingTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Building<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td><select id=\"buildingId\" name=\"buildingId\"\r\n");
            out.write("\t\t\t\tclass=\"myTextInputForSelect\" onChange=\"GetFloors();getODCS();\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory , Select the building you are currently operating from\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr style=\"display: none\" id=\"floorTR\">\r\n");
            out.write("\t\t\t<td id=\"floorTD\" class=\"label\">Floor<span class=\"red_text\">*&nbsp;</span>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t\t<td id=\"floorselectTD\"><select name=\"floor\" id=\"floor\"\r\n");
            out.write("\t\t\t\tclass=\"myTextInputForSelect\" width=\"100%\"\r\n");
            out.write("\t\t\t\tonchange=\"GenerateCubicalCodes(this.options[this.selectedIndex].value)\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory , Select the floor that you are currently operating from\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"\">--Please Select--</option>\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<!-- <tr style=\"display: none\" id=\"cubicalTR\">\r\n");
            out.write("\t\t\t<td class=\"label\" id=\"cubicalTD\"><span id=\"cubicallabel\">Cubicle\r\n");
            out.write("\t\t\tCode</span><span class=\"red_text\">*&nbsp;</span></td>\r\n");
            out.write("\t\t\t<td><span id=\"cubicalselectTD\" style=\"display: none\"> <select\r\n");
            out.write("\t\t\t\tname=\"cubicalselcode\" id=\"cubicalselcode\" class=\"myTextInput\"\r\n");
            out.write("\t\t\t\tonChange=\"$('#cubicalcode').val($(this).val())\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory, Provide your cubicle/Workstation number.\">\r\n");
            out.write("\t\t\t\t<option selected=\"selected\" value=\"0\">--Please Select--</option>\r\n");
            out.write("\t\t\t</select> </span> <span id=\"cubicalinputTD\"><input type=\"text\"\r\n");
            out.write("\t\t\t\tid=\"cubicalcode\" maxlength=\"70\" title=\"Cubical Code\"\r\n");
            out.write("\t\t\t\tname=\"cubicalcode\" /></span>&nbsp;&nbsp;<a id=\"cubicleCodeEdit\" style=\"display:none;\"\r\n");
            out.write("\t\t\t\thref=\"javascript:cubicleCodeEdit()\"\r\n");
            out.write("\t\t\t\tclass=\"label\"><u>Edit</u>&nbsp;</a></td>\r\n");
            out.write("\t\t</tr> -->\r\n");
            out.write("\t\t<tr id=\"odcTR\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\">ODC<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select class=\"myTextInput\" id=\"odc\"\r\n");
            out.write("\t\t\t\tname=\"odc\" \r\n");
            out.write("\t\t\t\ttitle=\"Select the ODC that you are belongs to.\">\r\n");
            out.write("\t\t\t\t<option value=\"\">Please Select the Building</option>\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Contact Number(Primary)<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select class=\"myTextInput\" id=\"phoneoption\"\r\n");
            out.write("\t\t\t\tname=\"phoneoption\" onchange=\"updatecontactnumber()\">\r\n");
            out.write("\t\t\t\t<option>Mobile</option>\r\n");
            out.write("\t\t\t\t<option selected=\"selected\">Extn</option>\r\n");
            out.write("\t\t\t</select>\r\n");
            out.write("\t\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\"><span></span></td>\r\n");
            out.write("\t\t\t<td>\r\n");
            out.write("\t\t\t <input type=\"text\" class=\"myTextInput\" maxlength=\"15\"\r\n");
            out.write("\t\t\t\tid=\"phonenumber\" name=\"phonenumber\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory, Either provide Cell No( Format:{Country Code}{Cell No} e.g. 919123456789) OR Office Extension No.\" /><span\r\n");
            out.write("\t\t\t\tid=\"phoneerror\"\r\n");
            out.write("\t\t\t\tstyle=\"display: none; color: red; font-size: 12px; font-family: Trebuchet MS, Arial, Helvetica, sans-serif; font-style: italic\">*\r\n");
            out.write("\t\t\tMandatory</span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td class=\"label\">Alternate Contact Number</td>\r\n");
            out.write("\t\t\t<td align=\"left\"><input type=\"text\" class=\"myTextInput\"\r\n");
            out.write("\t\t\t\tid=\"altcontactnumber\" title=\"Alternate Contact Number\"\r\n");
            out.write("\t\t\t\tmaxlength=\"15\" name=\"altcontactnumber\" /><span id=\"altphoneerror\"\r\n");
            out.write("\t\t\t\tstyle=\"display: none; color: red; font-size: 12px; font-family: Trebuchet MS, Arial, Helvetica, sans-serif; font-style: italic\">\r\n");
            out.write("\t\t\t* Mandatory</span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<!-- L2:3186 the below field class has been changed to disply the full content of project -->\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Project<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><select class=\"myTextInput\"\r\n");
            out.write("\t\t\t\tid=\"EmpProject\" name=\"EmpProject\"\r\n");
            out.write("\t\t\t\ttitle=\"Mandatory, Allocated Project.\">\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fchoose_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</select></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td class=\"label\">CC to (EmailID)</td>\r\n");
            out.write("\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005finput_005f5(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("<span\r\n");
            out.write("\t\t\t\tid=\"erroremail\" style=\"display: none\">Enter a valid email\r\n");
            out.write("\t\t\taddress.</span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td class=\"label\">Multiple users/systems impacted</td>\r\n");
            out.write("\t\t\t<td align=\"left\"><input type=\"checkbox\" size=\"80\"\r\n");
            out.write("\t\t\t\tid=\"impactusercheck\" name=\"impactusercheck\"\r\n");
            out.write("\t\t\t\tonclick=\"showImpactedUserField(this,'impactUserCounttr')\"\r\n");
            out.write("\t\t\t\ttitle=\"If the problem you are raising impacts multiple users/systems, check this box.\"></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t<tr style=\"visibility: hidden\" id=\"impactUserCounttr\">\r\n");
            out.write("\t\t\t<td class=\"label\">Approx. number of users/systems affected by\r\n");
            out.write("\t\t\tthis incident<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\"><input type=\"text\" name=\"impactusercount\"\r\n");
            out.write("\t\t\t\tmaxlength=\"10\" id=\"impactusercount\" class=\"myTextInput\"\r\n");
            out.write("\t\t\t\ttitle=\"Provide the number of users/systems impacted by the problem you are raising. By default this count is taken as one.\">\r\n");
            out.write("\t\t\t<span id=\"errorimpactusers\"\r\n");
            out.write("\t\t\t\tstyle=\"display: none; color: red; font-size: 12px; font-family: Trebuchet MS, Arial, Helvetica, sans-serif; font-style: italic\">Please\r\n");
            out.write("\t\t\tEnter the count of users.</span></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\">Created Date<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005finput_005f6(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(' ');
            if (_jspx_meth_form_005finput_005f7(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            if (_jspx_meth_form_005finput_005f8(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\">OsBrowser Details<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005finput_005f9(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(' ');
            if (_jspx_meth_form_005finput_005f10(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            if (_jspx_meth_form_005finput_005f11(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t\t<td class=\"label\">buildingID<span class=\"red_text\">*</span></td>\r\n");
            out.write("\t\t\t<td align=\"left\">");
            if (_jspx_meth_form_005finput_005f12(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td> \r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t<td>");
            if (_jspx_meth_form_005finput_005f13(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f14(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f15(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t<td>");
            if (_jspx_meth_form_005finput_005f16(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f17(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f18(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f19(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t<td>");
            if (_jspx_meth_form_005finput_005f20(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"none\" style=\"display: none\">\r\n");
            out.write("\t\t<td><input id=\"selectInput\" class=\"myTextInput\"></input></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr class=\"creationScreenAlternateTR\">\r\n");
            out.write("\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
            out.write("\t\t\t\tid=\"ticketsubmit\" value=\"Submit\"></input></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t");
            if (_jspx_meth_form_005finput_005f21(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t</table>\r\n");
            out.write("\t\r\n");
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
      out.write("<div id=\"output1\" style=\"display: none\"></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var LoginID = '");
      out.print((String) request.getSession().getAttribute(
							"userLoginId"));
      out.write("';\r\n");
      out.write("var mobilenumber = '");
      out.print(mobileno);
      out.write("';\r\n");
      out.write("var extensionnumber = '");
      out.print(extnno);
      out.write("';\r\n");
      out.write("var loginrole = '");
      out.print(loginrole);
      out.write("';\r\n");
      out.write("var isExEmpCheck=false;\r\n");
      out.write("var logged_user_role = \"");
      out.print(loginrole);
      out.write("\";\r\n");
      out.write("var roleListSize=\"");
      out.print(roleListSize);
      out.write("\";\r\n");
      out.write("var username =\"");
      out.print(empName);
      out.write("\";\r\n");
      out.write("var approvalFlag =\"0\";\r\n");
      out.write("var orchFlag = false;\r\n");
      out.write("var ticketID=\"\";\r\n");
      out.write("$(\"#approvalFlag\").val(approvalFlag);\r\n");
      out.write("//Added for Orchestration\r\n");
      out.write("var orchArray = new Array();\r\n");
      out.write("var automationFlag = false;\r\n");
      out.write("\r\n");
      out.write("function loadSearchPage(){\r\n");
      out.write("\tvar subjectText=$(\"#subject\").val();\r\n");
      out.write("\tparent.document.getElementById(\"lastframe\").src = \"UNIVERSAL_Searchh.htm?subject=\"+subjectText+\"&userName=\" + username + \"&empid=\" + LoginID+ \"&ticketID=\" + ticketID;\r\n");
      out.write("}\r\n");
      out.write("/*Added by Mohit(816452) to filter the result on the basis of selection of Function/Category/Sub-Category */\r\n");
      out.write("function loadSearchPageFunc(){\r\n");
      out.write("\tvar functionText=$(\"#function option:selected\").text();\r\n");
      out.write("\tif(functionText != \"--Please Select--\"){\r\n");
      out.write("\tparent.document.getElementById(\"lastframe\").src = \"UNIVERSAL_Searchh.htm?subject=\"+functionText+\"&userName=\" + username + \"&empid=\" + LoginID+ \"&ticketID=\" + ticketID;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function loadSearchPageCategry(){\r\n");
      out.write("\tvar categoryText=$(\"#category option:selected\").text();\r\n");
      out.write("\tif(categoryText != \"--Please Select--\"){\r\n");
      out.write("\tparent.document.getElementById(\"lastframe\").src = \"UNIVERSAL_Searchh.htm?subject=\"+categoryText+\"&userName=\" + username + \"&empid=\" + LoginID+ \"&ticketID=\" + ticketID;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function loadSearchPageSubCategry(){\r\n");
      out.write("\tvar categoryText=$(\"#category option:selected\").text();\r\n");
      out.write("\tvar subCategoryText=$(\"#subcategory option:selected\").text();\r\n");
      out.write("\tif(subCategoryText != \"--Please Select--\"){\r\n");
      out.write("\tparent.document.getElementById(\"lastframe\").src = \"UNIVERSAL_Searchh.htm?subject=\"+categoryText+\"_\"+subCategoryText+\"&userName=\" + username + \"&empid=\" + LoginID+ \"&ticketID=\" + ticketID;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("/*Change of added by Mohit(816452) to filter the result on the basis of selection of Function/Category/Sub-Category */\r\n");
      out.write("</script>\r\n");
 token = (String)request.getSession().getAttribute("OWASP_CSRFTOKEN"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"OWASP_CSRFTOKEN\" value=\"");
      out.print( token );
      out.write("\" />\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(127,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/HELPDESK_Create.jsp(127,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.CATEGORY_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(138,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/HELPDESK_Create.jsp(138,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("category");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.CATEGORY_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(150,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subcategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/HELPDESK_Create.jsp(150,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("subcategory");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subcategory.CATEGORY_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subcategory.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fname_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(168,3) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("department");
    // /WEB-INF/view/HELPDESK_Create.jsp(168,3) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("department");
    // /WEB-INF/view/HELPDESK_Create.jsp(168,3) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", new String("department"));
    // /WEB-INF/view/HELPDESK_Create.jsp(168,3) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fname_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonchange_005fonblur_005fmaxlength_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setMaxlength("100");
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("subject");
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setId("subject");
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", new String("myTextInput"));
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setOnchange("loadSearchPage()");
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setTitle("Mandatory, Write your problem statement (100 characters).");
    // /WEB-INF/view/HELPDESK_Create.jsp(185,45) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setOnblur("replaceMSWordCharacters(this)");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonchange_005fonblur_005fmaxlength_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftitle_005fstyle_005frows_005fpath_005fonblur_005fmaxlength_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setRows("6");
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("description");
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("description");
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "style", new String("width:270px"));
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "maxlength", new String("2000"));
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setTitle("Mandatory , Describe your problem in detail. Provide all details that will help the engineers resolve your problem quicker.\r\n        Please mention your PC Host Name/Computer Name for faster resolution");
    // /WEB-INF/view/HELPDESK_Create.jsp(192,7) name = onblur type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setOnblur("replaceMSWordCharacters(this)");
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
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftitle_005fstyle_005frows_005fpath_005fonblur_005fmaxlength_005fid_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f0 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(199,21) name = for type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f0.setFor("problemfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(199,21) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f0.setPath("problemfile");
    int[] _jspx_push_body_count_form_005flabel_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f0 = _jspx_th_form_005flabel_005f0.doStartTag();
      if (_jspx_eval_form_005flabel_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Attachment");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.reuse(_jspx_th_form_005flabel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(201,41) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("problemfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(201,41) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setId("problemfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(201,41) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setTitle("Attach supporting document related to your problem. (Screen shots, Image, Documents)");
    // /WEB-INF/view/HELPDESK_Create.jsp(201,41) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", new String("file"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f1 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(208,21) name = for type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f1.setFor("problemfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(208,21) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f1.setPath("problemfile");
    int[] _jspx_push_body_count_form_005flabel_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f1 = _jspx_th_form_005flabel_005f1.doStartTag();
      if (_jspx_eval_form_005flabel_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Attachment");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.reuse(_jspx_th_form_005flabel_005f1);
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
    // /WEB-INF/view/HELPDESK_Create.jsp(210,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setPath("attachmentName");
    // /WEB-INF/view/HELPDESK_Create.jsp(210,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f0.setId("attachmentName");
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

  private boolean _jspx_meth_form_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_005fhidden_005f1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(210,65) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f1.setPath("attachmentPath");
    // /WEB-INF/view/HELPDESK_Create.jsp(210,65) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fhidden_005f1.setId("attachmentPath");
    int[] _jspx_push_body_count_form_005fhidden_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fhidden_005f1 = _jspx_th_form_005fhidden_005f1.doStartTag();
      if (_jspx_th_form_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fhidden_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fhidden_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fhidden_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fhidden_0026_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005fhidden_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005flabel_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_005flabel_005f2 = (org.springframework.web.servlet.tags.form.LabelTag) _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_005flabel_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005flabel_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(218,21) name = for type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f2.setFor("approvalfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(218,21) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005flabel_005f2.setPath("approvalfile");
    int[] _jspx_push_body_count_form_005flabel_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005flabel_005f2 = _jspx_th_form_005flabel_005f2.doStartTag();
      if (_jspx_eval_form_005flabel_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Approver Attachment");
          int evalDoAfterBody = _jspx_th_form_005flabel_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005flabel_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005flabel_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005flabel_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005flabel_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005flabel_0026_005fpath_005ffor.reuse(_jspx_th_form_005flabel_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(220,42) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("approvalfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(220,42) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setId("approvalfile");
    // /WEB-INF/view/HELPDESK_Create.jsp(220,42) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setTitle("Attach email or other documents from your approving manager approving your request");
    // /WEB-INF/view/HELPDESK_Create.jsp(220,42) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", new String("file"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f4 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonBlur_005fmaxlength_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f4.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "class", new String("myTextInput"));
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setId("onbeofEmpId");
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) null
    _jspx_th_form_005finput_005f4.setDynamicAttribute(null, "onBlur", new String("checkempid()"));
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setMaxlength("25");
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setPath("onbeofEmpId");
    // /WEB-INF/view/HELPDESK_Create.jsp(238,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f4.setTitle("If you are raising this ticket for someone else, provide his/her employee ID for validation");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftitle_005fpath_005fonBlur_005fmaxlength_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(256,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${locations}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/HELPDESK_Create.jsp(256,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("locations");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${locations.LOCATION_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/view/HELPDESK_Create.jsp(257,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${locations.CITY}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/view/HELPDESK_Create.jsp(339,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${projectsSize eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<option value=\"0\">None</option>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fotherwise_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/view/HELPDESK_Create.jsp(343,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${projects}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/HELPDESK_Create.jsp(343,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("projects");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${projects.PROJECT_VALUE}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${projects.DISPLAY_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f5 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fname_005fmaxlength_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f5.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "class", new String("myTextInput"));
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setId("CCEmailID");
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setMaxlength("500");
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) null
    _jspx_th_form_005finput_005f5.setDynamicAttribute(null, "name", new String("CCEmailID"));
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setPath("CCEmailID");
    // /WEB-INF/view/HELPDESK_Create.jsp(352,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f5.setTitle("Employees marked in CC(Use Comma(,) as seperator for multiple entries) will be notified on status change via an Email.");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005ftitle_005fpath_005fname_005fmaxlength_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f6 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f6.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(378,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f6.setPath("createddate");
    // /WEB-INF/view/HELPDESK_Create.jsp(378,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f6.setId("createddate");
    // /WEB-INF/view/HELPDESK_Create.jsp(378,20) null
    _jspx_th_form_005finput_005f6.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f7 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f7.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(379,27) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f7.setPath("mailid");
    // /WEB-INF/view/HELPDESK_Create.jsp(379,27) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f7.setId("mailid");
    // /WEB-INF/view/HELPDESK_Create.jsp(379,27) null
    _jspx_th_form_005finput_005f7.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f8 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f8.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(380,26) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f8.setPath("mailTrackerType");
    // /WEB-INF/view/HELPDESK_Create.jsp(380,26) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f8.setId("mailTrackerType");
    // /WEB-INF/view/HELPDESK_Create.jsp(380,26) null
    _jspx_th_form_005finput_005f8.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f9 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f9.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(385,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f9.setPath("osdetails");
    // /WEB-INF/view/HELPDESK_Create.jsp(385,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f9.setId("osdetails");
    // /WEB-INF/view/HELPDESK_Create.jsp(385,20) null
    _jspx_th_form_005finput_005f9.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f10 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f10.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(386,27) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f10.setPath("browserdetails");
    // /WEB-INF/view/HELPDESK_Create.jsp(386,27) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f10.setId("browserdetails");
    // /WEB-INF/view/HELPDESK_Create.jsp(386,27) null
    _jspx_th_form_005finput_005f10.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f11 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f11.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(387,26) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f11.setPath("projectname");
    // /WEB-INF/view/HELPDESK_Create.jsp(387,26) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f11.setId("projectname");
    // /WEB-INF/view/HELPDESK_Create.jsp(387,26) null
    _jspx_th_form_005finput_005f11.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f12 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f12.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(392,20) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f12.setPath("building");
    // /WEB-INF/view/HELPDESK_Create.jsp(392,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f12.setId("building");
    // /WEB-INF/view/HELPDESK_Create.jsp(392,20) null
    _jspx_th_form_005finput_005f12.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f13 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f13.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(396,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f13.setPath("toAddressMailId");
    // /WEB-INF/view/HELPDESK_Create.jsp(396,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f13.setId("toAddressMailId");
    // /WEB-INF/view/HELPDESK_Create.jsp(396,6) null
    _jspx_th_form_005finput_005f13.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f14 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f14.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(398,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f14.setPath("isEXEmp_Value");
    // /WEB-INF/view/HELPDESK_Create.jsp(398,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f14.setId("isEXEmp_Value");
    // /WEB-INF/view/HELPDESK_Create.jsp(398,2) null
    _jspx_th_form_005finput_005f14.setDynamicAttribute(null, "class", new String("myTextInput"));
    // /WEB-INF/view/HELPDESK_Create.jsp(398,2) null
    _jspx_th_form_005finput_005f14.setDynamicAttribute(null, "value", new String("0"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f15 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f15.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(399,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f15.setPath("fromAddress");
    // /WEB-INF/view/HELPDESK_Create.jsp(399,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f15.setId("fromAddress");
    // /WEB-INF/view/HELPDESK_Create.jsp(399,2) null
    _jspx_th_form_005finput_005f15.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f16 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f16.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(403,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f16.setPath("function");
    // /WEB-INF/view/HELPDESK_Create.jsp(403,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f16.setId("function");
    // /WEB-INF/view/HELPDESK_Create.jsp(403,6) null
    _jspx_th_form_005finput_005f16.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f17 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f17.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(404,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f17.setPath("category");
    // /WEB-INF/view/HELPDESK_Create.jsp(404,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f17.setId("category");
    // /WEB-INF/view/HELPDESK_Create.jsp(404,2) null
    _jspx_th_form_005finput_005f17.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f18 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f18.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(405,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f18.setPath("subcategory");
    // /WEB-INF/view/HELPDESK_Create.jsp(405,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f18.setId("function");
    // /WEB-INF/view/HELPDESK_Create.jsp(405,2) null
    _jspx_th_form_005finput_005f18.setDynamicAttribute(null, "class", new String("subcategory"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f19 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f19.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(406,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f19.setPath("locationId");
    // /WEB-INF/view/HELPDESK_Create.jsp(406,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f19.setId("function");
    // /WEB-INF/view/HELPDESK_Create.jsp(406,2) null
    _jspx_th_form_005finput_005f19.setDynamicAttribute(null, "class", new String("locationId"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f20 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f20.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(410,6) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f20.setPath("orchestrationInput1");
    // /WEB-INF/view/HELPDESK_Create.jsp(410,6) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f20.setId("orchestrationInput1");
    // /WEB-INF/view/HELPDESK_Create.jsp(410,6) null
    _jspx_th_form_005finput_005f20.setDynamicAttribute(null, "class", new String("myTextInput"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f21 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f21.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/HELPDESK_Create.jsp(420,2) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f21.setPath("approvalFlag");
    // /WEB-INF/view/HELPDESK_Create.jsp(420,2) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f21.setId("approvalFlag");
    // /WEB-INF/view/HELPDESK_Create.jsp(420,2) null
    _jspx_th_form_005finput_005f21.setDynamicAttribute(null, "type", new String("hidden"));
    // /WEB-INF/view/HELPDESK_Create.jsp(420,2) null
    _jspx_th_form_005finput_005f21.setDynamicAttribute(null, "class", new String("approvalFlag"));
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fpath_005fid_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f21);
    }
    return false;
  }
}
