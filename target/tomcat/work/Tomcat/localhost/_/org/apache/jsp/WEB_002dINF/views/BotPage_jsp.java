/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-03 04:03:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BotPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/css/style.css", Long.valueOf(1578024210793L));
    _jspx_dependants.put("/WEB-INF/js/fileInput.js", Long.valueOf(1577971317789L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<style>");
      out.write("@font-face {\r\n");
      out.write("    font-family: unisans;\r\n");
      out.write("    font-style: light;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    src: url(https://discordapp.com/assets/6c6374bad0b0b6d204d8d6dc4a18d820.woff) format(\"woff\")\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("\tfont-family: \"unisans\";\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tbackground-color: #7289da;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".botTagText{\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tfont-weight: 600;\r\n");
      out.write("\tpadding-left: 15px;\r\n");
      out.write("\tpadding-right: 15px;\r\n");
      out.write("\tbackground-color: #7289da;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content{\r\n");
      out.write("\tbackground-color: #282c34;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".titleHeader{\r\n");
      out.write("\tpadding: 30px;\r\n");
      out.write("\tfont-size: 90px;\r\n");
      out.write("}\r\n");
      out.write(".header1{\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write(".header{\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tfont-size: 45px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-weight: 800;\r\n");
      out.write("}\r\n");
      out.write(".fakeEmbedWrapper{\r\n");
      out.write("\tpadding:  20px;\r\n");
      out.write("\tbackground-color: #36393e;\r\n");
      out.write("\tcolor:  white;\r\n");
      out.write("}\r\n");
      out.write(".fakeEmbed{\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tborder: 2px solid #313337;\r\n");
      out.write("\tborder-left: 4px solid #7289da;\r\n");
      out.write("\twidth: 15%;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write(".fakeEmbedText{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tpadding-bottom:0px;\r\n");
      out.write("}\r\n");
      out.write(".fakeEmbedAuthor{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("}\r\n");
      out.write(".codeLine{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding:15px;\r\n");
      out.write("}\r\n");
      out.write(".codeBlock{\r\n");
      out.write("\tbackground-color: #1d1e21;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write(".smcontent{\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputfile + label{\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tcolor: #7289da;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".buttonDeco {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".buttonDeco + label{\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tfont-weight: 600;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tcolor: #7289da;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputfile{\r\n");
      out.write("\twidth: 0.1px;\r\n");
      out.write("\theight: 0.1px;\r\n");
      out.write("\topacity: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: -1;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("\t<title>𝓦𝓲𝓵𝓼𝓸𝓷</title>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction sendMessage(){\r\n");
      out.write("\t\tvar hashParams = window.location.hash.substr(1).split('&');\r\n");
      out.write("\t\tvar name = hashParams[0].split('=')[1];\r\n");
      out.write("\t\tvar channel = hashParams[1].split('=')[1];\r\n");
      out.write("\t\tvar files = document.getElementById('file_upload').files;\r\n");
      out.write("\t\tif(files.length >= 1){\r\n");
      out.write("\t\t\tsendFile(name, channel, files);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<div class=\"titleHeader\">𝓦𝓲𝓵𝓼𝓸𝓷 <span class=\"botTagText\">BOT</span></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"header\">Nitro is for nerds</div>\r\n");
      out.write("\t\t<div class=\"smContent\">\r\n");
      out.write("\t\t<div class=\"header1\">Upload below</div>\r\n");
      out.write("\t\t<form action=\"\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<input type=\"file\" multiple=\"false\" class=\"inputfile\" name=\"fileToUpload\" id=\"fileToUpload\" accept=\"video/*\" data-multiple-caption=\"{count} files selected\" multiple/>\r\n");
      out.write("\t\t\t<label for=\"fileToUpload\"><span>Select file</span></label>\r\n");
      out.write("\t\t\t<input class=\"buttondeco\" id=\"submit_button\" type=submit value=\"Upload\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\tDiscord Nitro is for fucking Nerds, Wilson does not like nerds. <br> \r\n");
      out.write("\t\t©Go Fuck Yourself Inc. 1969 (Nice)\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<script>");
      out.write("'use strict';\r\n");
      out.write("\r\n");
      out.write(";( function ( document, window, index )\r\n");
      out.write("{\r\n");
      out.write("\tvar inputs = document.querySelectorAll( '.inputfile' );\r\n");
      out.write("\tArray.prototype.forEach.call( inputs, function( input )\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar label\t = input.nextElementSibling,\r\n");
      out.write("\t\t\tlabelVal = label.innerHTML;\r\n");
      out.write("\r\n");
      out.write("\t\tinput.addEventListener( 'change', function( e )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar fileName = '';\r\n");
      out.write("\t\t\tif( this.files && this.files.length > 1 )\r\n");
      out.write("\t\t\t\tfileName = ( this.getAttribute( 'data-multiple-caption' ) || '' ).replace( '{count}', this.files.length );\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tfileName = e.target.value.split( '\\\\' ).pop();\r\n");
      out.write("\r\n");
      out.write("\t\t\tif( fileName )\r\n");
      out.write("\t\t\t\tlabel.querySelector( 'span' ).innerHTML = fileName;\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tlabel.innerHTML = labelVal;\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// Firefox bug fix\r\n");
      out.write("\t\tinput.addEventListener( 'focus', function(){ input.classList.add( 'has-focus' ); });\r\n");
      out.write("\t\tinput.addEventListener( 'blur', function(){ input.classList.remove( 'has-focus' ); });\r\n");
      out.write("\t});\r\n");
      out.write("}( document, window, 0 ));");
      out.write("</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
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
