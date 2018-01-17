package org.apache.jsp.WEB_002dINF.view;

import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/UNIVERSAL_Include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fcommandName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_0026_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fitemValue_005fitemLabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fitemValue_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fcommandName.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.release();
    _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fitemValue_005fitemLabel_005fnobody.release();
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
 String jsDirPath = (String)getServletContext().getInitParameter("jsDirPath");  
   String cssDirPath = (String)getServletContext().getInitParameter("cssDirPath"); 

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>IConnect : Unified Service Desk for Life & Health</title>\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(cssDirPath);
      out.write("/login_style.css\" />\r\n");
      out.write("  <style id=\"antiClickjack\">body{display:none;}</style>\r\n");
      out.write("                                \r\n");
      out.write("                                <script type=\"text/javascript\">\r\n");
      out.write("                                if (self === top) {\r\n");
      out.write("                                \r\n");
      out.write("                 var antiClickjack = document.getElementById(\"antiClickjack\");\r\n");
      out.write("                                antiClickjack.parentNode.removeChild(antiClickjack);\r\n");
      out.write("                                }                              \r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 String token = null; 
      out.write("\r\n");
      out.write("<div class=\"main_container\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"inner_container\">\r\n");
      out.write("\t\t<div class=\"login_header_bg\">Welcome</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("    <div>&nbsp;</div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"inner_container\">\r\n");
      out.write("    \r\n");
      out.write("    \t<!-- ============================ Left Panel Starts ================================ -->\r\n");
      out.write("    \r\n");
      out.write("    \t<div class=\"left_panel\">\r\n");
      out.write("    \t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/Logo.png\" /><br />   \t\r\n");
      out.write("    \t</div>\r\n");
      out.write("         \r\n");
      out.write("\t\t<!-- ============================ Left Panel Ends ================================ -->\r\n");
      out.write("        \r\n");
      out.write("      \t<div class=\"right\">\r\n");
      out.write("        \r\n");
      out.write("        \t<!-- ============================ Middle Panel Starts ================================ -->  \r\n");
      out.write("        \r\n");
      out.write("\t        <div class=\"middle_panel\">\r\n");
      out.write("            \r\n");
      out.write("            \t<div class=\"inner_container\">\r\n");
      out.write("                \r\n");
      out.write("                \t<div class=\"login\">\r\n");
      out.write("                \t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/Login.jsp(54,17) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/view/Login.jsp(54,17) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("UserBean");
      // /WEB-INF/view/Login.jsp(54,17) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setId("login");
      // /WEB-INF/view/Login.jsp(54,17) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setName("form");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t            <table cellspacing=\"0\" cellpadding=\"15\" align=\"center\">\r\n");
            out.write("\t\t\t            <tr>\r\n");
            out.write("\t\t\t\t\t\t\t<td align=\"left\" valign=\"middle\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"5\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: #FFFFFF; font-size: 13px;\" id = \"lockImageTable\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
            out.write("\t\t\t\t\t        \t\t\t\t<p><img src=\"");
            out.print(request.getContextPath());
            out.write("/images/key.jpg\" /></p>\r\n");
            out.write("\t\t\t\t\t        \t\t\t\t<p class=\"button\">Fill in your User ID and Password</p><br />\r\n");
            out.write("\t\t        \t\t\t\t\t\t</td>\r\n");
            out.write("\t\t        \t\t\t\t\t</tr>\r\n");
            out.write("\t\t        \t\t\t\t</table >\r\n");
            out.write("\t\t        \t\t\t\t<table cellspacing=\"0\" cellpadding=\"8\" id = \"loginTable\">\r\n");
            out.write("   \t\t\t\t\t\t\t\t\t<tr align=\"center\">\r\n");
            out.write("   \t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/Login.jsp(70,11) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("loginId");
            // /WEB-INF/view/Login.jsp(70,11) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setCssClass("error bodytext");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/Login.jsp(71,11) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("password");
            // /WEB-INF/view/Login.jsp(71,11) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setCssClass("error bodytext");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t        \t\t\t\t\t<tr id = \"loginIdTR\">\r\n");
            out.write("\t\t        \t\t\t\t\t\t<td class=\"labels\">\r\n");
            out.write("\t\t\t\t\t\t        \t\t\tUser ID: </td>\r\n");
            out.write("\t\t\t\t\t\t            \t<td>\r\n");
            out.write("\t\t\t\t\t\t            \t\t\t\t");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t            \t\t\t</td>\r\n");
            out.write("\t\t\t        \t\t\t\t</tr>\r\n");
            out.write("\t\t\t        \t\t\t\t<tr id = \"passwordTR\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"labels\">Password: </td>\r\n");
            out.write("\t\t\t\t\t\t            \t\t\t<td>");
            if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t      \t\t\t\t\t</td>\r\n");
            out.write("\t\t\t        \t\t\t\t</tr>\r\n");
            out.write("\t\t\t        \t\t\t\t<tr id = \"domainTR\" style=\"display:none\">\r\n");
            out.write("\t\t\t        \t\t\t\t\t<td class=\"labels\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<td><input id=\"roleListSize\" type=\"hidden\"\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleListSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"/>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t        \t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input class=\"button\" TYPE=\"IMAGE\" src=\"");
            out.print(request.getContextPath());
            out.write("/images/login_button.jpg\" name=\"login\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"login\" value=\"Login\"/><input id=\"buttonName\" name = \"buttonName\"type=\"hidden\"\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${button}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\"/></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t      \t\t\t\t</table>\r\n");
            out.write("\t\t\t      \t\t\t<table id=\"roleSelectionTable\" width=\"80%\" cellspacing=\"0\" cellpadding=\"5\" style=\"color: #FFFFFF; font-size: 13px;\">\r\n");
            out.write("\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("                                    </td>\r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t <img src=\"");
            out.print(request.getContextPath());
            out.write("/images/login_success.jpg\" />\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\" class=\"message\">Authentication was Success! Please Select a Role to Continue</td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td width=\"5%\" align=\"right\" class=\"button\">Role:</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" colspan=\"2\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_form_005fselect_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\" width=\"10%\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"login1\" TYPE=\"IMAGE\" src=\"");
            out.print(request.getContextPath());
            out.write("/images/continue_button.jpg\" id=\"login1\" value=\"Continue\" onclick = \"javascript:continueLogin();\"/>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"logoutButton\" align=\"left\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"iConnectLogOut();\"><img src=\"images/logout.png\" alt=\"Logout\" title=\"Logout\"/></a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("                                    </td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("\t\t\t\t\t\t\t</table>\t\r\n");
            out.write("\t\t\t      \t\t\t</td>\r\n");
            out.write("\t\t      \t\t\t</tr>\r\n");
            out.write("\t      \t\t\t</table>\t\r\n");
            out.write("\t\t\t\t\t");
 token = (String)request.getSession().getAttribute("OWASP_CSRFTOKEN"); 
            out.write("\r\n");
            out.write("\t\t\t\t\t<input type=\"hidden\" name=\"OWASP_CSRFTOKEN\" value=\"");
            out.print( token );
            out.write("\" />\r\n");
            out.write("\t      \t\t\t");
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
        _005fjspx_005ftagPool_005fform_005fform_0026_005fname_005fmethod_005fid_005fcommandName.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("            \t\t</div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("</div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- ============================ Middle Panel ends ================================ -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- ============================ Right Panel Starts ================================ -->  \r\n");
      out.write("            \r\n");
      out.write("    \t    <div class=\"right_panel\">\r\n");
      out.write("            \r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("        \t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/Capgemini_Login_Logo.png\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("        \t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"stcikyDivId\" class=\"board\">\t\r\n");
      out.write("\t\t\t\t\t<div id='bulletinBoard'><center><font color=\"white\">Bulletin Board</font></center></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t           \r\n");
      out.write("            <!-- ============================ Right Panel Ends ================================ -->  \r\n");
      out.write("            \r\n");
      out.write("       \t</div>\r\n");
      out.write("        \r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"contact\">\r\n");
      out.write("\t\t\t\t<div class=\"contact_info\"><span>Helpdesk Hotline:</span> 1234 &nbsp; | &nbsp; <span>Helpdesk Phone:</span> +91 80 41041234 &nbsp; | &nbsp; <span>USA, Canada:</span> +1800 670 0199 (Toll Free) / +1 978 964 9062  &nbsp; | &nbsp; <span>EUROPE, UK:</span> +44 208 283 2310 (Toll Free) &nbsp; | &nbsp;<span>Australia:</span> 61-353353050 &nbsp; | &nbsp;<span>Email:</span> <a href=\"mailto:LH.Helpdesk@igate.com\">LH.Helpdesk@igate.com</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</div><!--\r\n");
      out.write("   <div class=\"empty_div\">&nbsp;</div>\r\n");
      out.write("\t<div id=\"copy\">Copyright &copy; IGATE All Rights Reserved.</div>\r\n");
      out.write("   -->\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer_info\" align='center'>Copyright &copy; IGATE. All Rights Reserved.</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/jquery-1.4.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/ui.core.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/Login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(jsDirPath);
      out.write("/custom/UNIVERSAL_Security.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("if(parent.location != window.location){\r\n");
      out.write("\tparent.iConnectLogOut();\r\n");
      out.write("}\r\n");
      out.write("function iConnectLogOut(){\r\n");
      out.write("\twindow.location.href='Logout.htm';\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fautocomplete_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/Login.jsp(78,22) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("loginId");
    // /WEB-INF/view/Login.jsp(78,22) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setAutocomplete("off");
    // /WEB-INF/view/Login.jsp(78,22) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("loginId");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fid_005fautocomplete_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/Login.jsp(83,25) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setPath("password");
    // /WEB-INF/view/Login.jsp(83,25) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setAutocomplete("off");
    // /WEB-INF/view/Login.jsp(83,25) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setId("passWordId");
    // /WEB-INF/view/Login.jsp(83,25) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setCssClass("bodytext");
    int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
      if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/Login.jsp(115,10) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setPath("userRoleId");
    // /WEB-INF/view/Login.jsp(115,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fselect_005f0.setId("userRoleId");
    int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
      if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_form_005foptions_005f0(_jspx_th_form_005fselect_005f0, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath_005fid.reuse(_jspx_th_form_005fselect_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f0 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fitemValue_005fitemLabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
    // /WEB-INF/view/Login.jsp(116,11) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userRoleList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/Login.jsp(116,11) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItemValue("roleId");
    // /WEB-INF/view/Login.jsp(116,11) name = itemLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItemLabel("roleName");
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
      _005fjspx_005ftagPool_005fform_005foptions_0026_005fitems_005fitemValue_005fitemLabel_005fnobody.reuse(_jspx_th_form_005foptions_005f0);
    }
    return false;
  }
}
