/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-05-02 14:40:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class politics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>QuadCore News</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"/resources/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"/resources/css/modern-business.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/resources/css/ij-css.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navigation -->\r\n");
      out.write("\t<nav class=\"navbar fixed-top navbar-expand-lg navbar-dark fixed-top\"\r\n");
      out.write("\t\tstyle=\"background-color: #A566FF\">\r\n");
      out.write("\t\t<!-- bg-dark  -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"../.do\">QuadCore News</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler navbar-toggler-right\" type=\"button\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbarResponsive\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"../.do\">Home</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownBlog\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t카테고리 </a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item \" href=\"politics.do\">정치</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"economy.do\">경제</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"society.do\">사회</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"living.do\">생활문화</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"itScience.do\">IT과학</a>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"../tag.do\">태그</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownBlog\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t신문사 </a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"../company/chosun.do\">조선일보</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"../company/joongang.do\">중앙일보</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"../company/donga.do\">동아일보</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"../company/hankyoreh.do\">한겨례</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"../company/yonhap.do\">연합뉴스</a>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Page Content -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Page Heading/Breadcrumbs -->\r\n");
      out.write("\t\t<h1 class=\"mt-4 mb-3\">\r\n");
      out.write("\t\t\t<b>정치</b>\r\n");
      out.write("\t\t\t<!--small>Subheading</small-->\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<!-- <li class=\"breadcrumb-item\">타임라인</li> -->\r\n");
      out.write("\t\t\t<a href=\"tag.html\" class=\"btn btn-primary\">취업</a>\r\n");
      out.write("\t\t\t<a href=\"tag.html\" class=\"btn btn-primary\">북한</a>\r\n");
      out.write("\t\t\t<a href=\"tag.html\" class=\"btn btn-primary\">트럼프</a>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Project One -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> <img class=\"img-fluid rounded mb-3 mb-md-0\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://www.ifm.kr/wp-content/uploads/2018/11/iHY5e-660x330.jpg\"\r\n");
      out.write("\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" style=\"color: black\"><h4>인천 서구, 2019년 제1기\r\n");
      out.write("\t\t\t\t\t\t취업성공디딤돌 청년인턴사업 참여자 모집</h4></a>\r\n");
      out.write("\t\t\t\t<p>청년취업성공 프로젝트 교육생 모집 안내 포스터 = 경기 여주시는 오는 2월 13일까지 ‘2019 여주시\r\n");
      out.write("\t\t\t\t\t청년취업성공 프로젝트’에 참여할 청년층 참여자 15명을 모집한다고 25일 밝혔다.</p>\r\n");
      out.write("\t\t\t\t<!--a class=\"btn btn-primary\" href=\"#\">View Project\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("          </a-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Project Two -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> <img class=\"img-fluid rounded mb-3 mb-md-0\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://image.fnnews.com/resource/media/image/2019/01/25/201901251447439752_l.jpg\"\r\n");
      out.write("\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" style=\"color: black\"><h4>경남도, 경력단절여성 취업지원 전국 최고</h4></a>\r\n");
      out.write("\t\t\t\t<p>경남도가 여성가족부 주관 ‘2018년 새일센터 사업평가’ 결과 2년 연속 최우수 지자체로 선정됐다.경남도는\r\n");
      out.write("\t\t\t\t\t25일 서울 세종문화회관에서 열린 ‘2019 경력단절여성 취업지원 사업 워크숍’에서 여성가족부 장관 표창을 받았다고\r\n");
      out.write("\t\t\t\t\t밝혔다.</p>\r\n");
      out.write("\t\t\t\t<!--a class=\"btn btn-primary\" href=\"#\">View Project\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("          </a-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Project Three -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> <img class=\"img-fluid rounded mb-3 mb-md-0\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://placehold.it/700x300\" alt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<h3>Project Three</h3>\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\r\n");
      out.write("\t\t\t\t\tOmnis, temporibus, dolores, at, praesentium ut unde repudiandae\r\n");
      out.write("\t\t\t\t\tvoluptatum sit ab debitis suscipit fugiat natus velit excepturi\r\n");
      out.write("\t\t\t\t\tamet commodi deleniti alias possimus!</p>\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary\" href=\"#\">View Project <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Project Four -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> <img class=\"img-fluid rounded mb-3 mb-md-0\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://placehold.it/700x300\" alt=\"\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<h3>Project Four</h3>\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\r\n");
      out.write("\t\t\t\t\tExplicabo, quidem, consectetur, officia rem officiis illum aliquam\r\n");
      out.write("\t\t\t\t\tperspiciatis aspernatur quod modi hic nemo qui soluta aut eius\r\n");
      out.write("\t\t\t\t\tfugit quam in suscipit?</p>\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary\" href=\"#\">View Project <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Pagination -->\r\n");
      out.write("\t\t<ul class=\"pagination justify-content-center\">\r\n");
      out.write("\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\"\r\n");
      out.write("\t\t\t\taria-label=\"Previous\"> <span aria-hidden=\"true\">&laquo;</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\"\r\n");
      out.write("\t\t\t\taria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<footer class=\"py-5 bg-dark\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p class=\"m-0 text-center text-white\">Copyright &copy; Your\r\n");
      out.write("\t\t\t\tWebsite 2018</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.container -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("\t<script src=\"/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
