/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-14 13:31:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class permission_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common.jsp", Long.valueOf(1499851484000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>权限管理</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/js/jquery-easyui/themes/default/easyui.css\"><!-- 样式包 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/js/jquery-easyui/themes/icon.css\"><!-- 图标的样式 -->   \r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/jquery-easyui/jquery.min.js\"></script><!-- jQuery核心包 -->   \r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/jquery-easyui/jquery.easyui.min.js\"></script><!-- EaysUI核心包 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/jquery-easyui/locale/easyui-lang-zh_CN.js\"></script><!-- 中文包 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/jquery-easyui/base.js\"></script><!-- 补丁包 -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/views/permission.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 数据表格 -->\r\n");
      out.write("\t<table id=\"permission_datagrid\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'name',width:1,align:'center'\">名称</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'resource',width:1,align:'center'\">表达式</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<!-- 新增编辑对话框 -->\r\n");
      out.write("\t<div id=\"permission_dialog\">\r\n");
      out.write("\t\t<form id=\"permission_form\" method=\"post\">\r\n");
      out.write("\t\t<table align=\"center\" style=\"margin-top: 15px;\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>表达式</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"resource\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>名称</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 数据表格CRUD按钮 -->\r\n");
      out.write("\t<div id=\"permission_datagrid_tb\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-reload\" plain=\"true\" data-cmd=\"load\">加载权限</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 对话框保存取消按钮-->\r\n");
      out.write("\t<div id=\"permission_dialog_bt\">\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\" data-cmd=\"save\">保存</a>\r\n");
      out.write("\t\t<a class=\"easyui-linkbutton\" iconCls=\"icon-cancel\" plain=\"true\" data-cmd=\"cancel\">取消</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}