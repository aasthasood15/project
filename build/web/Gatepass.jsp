<%-- 
    Document   : Gatepass
    Created on : 26 Nov, 2018, 7:50:55 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="styles.css">
        <title>Gatepass</title>
        <style>
        #rcorners2 
 {
    border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 450px;
    height: 300px; 
    background:url('../images/gatepass.jpg') no-repeat;
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
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}
.text1
{
    font-size:17px;
 color:#006400;
    letter-spacing: .05em;
    text-shadow: 
      4px 4px 0px #d5d5d5, 
      7px 7px 0px rgba(0, 0, 0, 0.2);
      }
      #boxshadow h1 {
    width: 100%;
    border: 1px solid #8a4419;
    border-style: none;
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
        <button type="button" class="block">Bus Pass</button>
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
    <br/><center>
        <div id="rcorners2">
            <div class="text1">
        <% ArrayList<String> s=(ArrayList<String>)request.getAttribute("Student");
            %>
            <h1> Username: <%=s.get(0)%></h1><br>
        <h1>Name: <%=s.get(1)%> </h1><br>
        <h1>Bus id: <%=s.get(2)%></h1><br>
        <h1>Route id: <%=s.get(3)%></h1><br>
        <h1>Pick Up<%=s.get(4)%></h1><br>
        </div>
        </div>
    </center>
    </body>
</html>
