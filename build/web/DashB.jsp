<%-- 
    Document   : DashB
    Created on : 25 Nov, 2018, 3:13:23 PM
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css">
        <title>JSP Page</title>
        <script type="text/javascript">
                function togglemenu()
                {
                document.getElementById('sidebar').classList.toggle('active');
                }
    </script>
    </head>
    <body background="aal.jpg">
        
         <%String u=(String)request.getAttribute("StudentData");%>
         <% Class.forName("com.mysql.jdbc.Driver");  %>
           <% Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true","root","AasthaSood"); %>
       
        <%ResultSet rs;
        PreparedStatement stmt = conn.prepareStatement("select * from studentlogin where UserName=?");
        stmt.setString(1,u);
               rs=stmt.executeQuery();
               ArrayList<String> al=new ArrayList<String>();
             while(rs.next())
              {
                   String s=rs.getString("Nam");
                    al.add(s);
                    s=rs.getString("UserName");
                    al.add(s);
                    s=rs.getString("Email");
                    al.add(s);
                    s=rs.getString("City");
                    al.add(s);
                    s=rs.getString("Busid");
                    al.add(s);
        
              }
             
             
        %>
        <img src="buss.jpg" width="1360" height="180">
        <div id="container">
                 <ul>
                     <li><a style="color:white" href="DashB?username=<%=u%>&req=r">Route
                         </a></li>
                         <li><a style="color:white" href="DashB?username=<%=u%>&req=i">Bus info</a> </li>
                     <li><a style="color:white" href="DashB?username=<%=u%>&req=p">Bus pass </a></li>
                     <li><a style="color:white" href="DashB?username=<%=u%>&req=f">Fine </a></li>
            </ul>
            </div>
        <br/>
        <br/>
        <br/>
        <div id="sidebar">
            <div class="toggle-btn" onclick="togglemenu()">
                <span> </span>
                <span> </span>
                <span> </span>
            </div>
            
            <ul>
                <li><a style="color:white" href="index.html">Home</a> </li>
                <li><a style="color:white" href="aboutus.html">About Us</a> </li>
                <li><a style="color:white" href="contactus.html">Contact Us</a> </li>
            </ul>
            
        </div>
        <br/>
        <br/>
        <br/>
        <br/>
    <center><div id="boxshadow">
            <div class="text">
                <h3 >Name: <%=al.get(0)%></h3>
        <br/>
        <h3>  Username:<%=al.get(1)%></h3>
        <br/>
        <h3>  Email:<%=al.get(2)%></h3>
        <br/>
        <h3>City:  <%=al.get(3)%></h3>
        <br/>
         <h3> Buisd:<%=al.get(4)%></h3>
    </center>
        </div>
        </div>
    </body>
</html>
