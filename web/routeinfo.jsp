<%-- 
    Document   : routeinfo
    Created on : 27 Nov, 2018, 8:42:53 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css">
        <title>JSP Page</title>
        <style>
#boxshadow h3 {
    width: 100%;
    border: 1px solid #8a4419;
    border-style: none;
}
#boxshadow::after {
    content: '';
    position: absolute;
    z-index: -1; /* hide shadow behind image */
    -webkit-box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);
    -moz-box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);
    box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);                
    width: 70%; 
    left: 15%; /* one half of the remaining 30% */
    height: 100px;
    bottom: 0;
}
.text1
{
    font-size:17px;
 color:#006400;
    background-color:white;
    letter-spacing: .05em;
    text-shadow: 
      4px 4px 0px #d5d5d5, 
      7px 7px 0px rgba(0, 0, 0, 0.2);
      }
      
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}
.block {
    display: block;
    width: 1360px;
    border: none;
    background-color: #4CAF50;
    padding: 14px 28px;
    font-size: 16px;
    cursor: pointer;
    text-align: center;
    font-color:white;
}
            

        </style>
        <script type="text/javascript">
                function togglemenu()
                {
                document.getElementById('sidebar').classList.toggle('active');
                }
    </script>    
    </head>
    <body background="aal.jpg">
        <button type="button" class="block">Route Info</button>
         <img src="buss.jpg" width="1360" height="180">
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
    <center> <div id="boxshadow">
         <div class="text1">
        <% ArrayList<String> s=(ArrayList<String>)request.getAttribute("Student");
            %>
        <h3>Username: <%=s.get(0)%></h3> <br/>
        <h3>Routeno.: <%=s.get(1)%> </h3> <br/>
        <h3>Stop point1: <%=s.get(2)%></h3> <br/>
        <h3>Stop point2: <%=s.get(3)%></h3> <br/>
        <h3>Pickup Point: <%=s.get(4)%></h3> <br/>
         </div>
         </div>
         </center>
    </body>
</html>
