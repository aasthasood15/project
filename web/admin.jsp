<%-- 
    Document   : admin
    Created on : 2 Dec, 2018, 2:25:40 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <style>

* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}
            body, html {
  height: 100%;
  margin: 0;
  font-family: sans-serif;
}

/* Style tab links */
.tablink {
  background-color: #555;
  color: white;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  font-size: 17px;
  width: 25%;
}

.tablink:hover {
  background-color: #777;
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
  color: white;
  display: none;
  padding: 100px 20px;
  height: 100%;
}

#Home {background-color: white;}
#News {background-color: white;}
#Contact {background-color: white;}
#About {background-color:white;}
</style>
        <script>
        function openPage(pageName, elmnt, color) {
    // Hide all elements with class="tabcontent" by default */
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Remove the background color of all tablinks/buttons
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }

    // Show the specific tab content
    document.getElementById(pageName).style.display = "block";

    // Add the specific color to the button used to open the tab content
    elmnt.style.backgroundColor = color;
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click(); 
        </script>
    </head>
    <body>
        <div class="container">
        <button class="tablink" onclick="openPage('Home', this,'green')">Add Bus</button>
<button class="tablink" onclick="openPage('News', this, 'green')" id="defaultOpen">Delete Bus</button>
<button class="tablink" onclick="openPage('Contact', this,'green')">Add Route</button>
<button class="tablink" onclick="openPage('About', this,'green')">Delete Route</button>

<div id="Home" class="tabcontent">
    <form action="Reg?what=ab" method="post">
  <label for="busid"><b>BusId</b></label>
    <input type="text" placeholder="Enter Busid" name="busid" required>
    <label for="drivername"><b>Driver Name</b></label>
    <input type="text" placeholder="Enter Driver Name" name="drivername" required>
    <label for="rno"><b>RouteId</b></label>
    <input type="text" placeholder="Enter Route Id" name="rno" required>
    <label for="busno"><b>Bus No</b></label>
    <input type="text" placeholder="Enter BusNo" name="bno" required>
    <input type="submit">
    </form>
</div>

<div id="News" class="tabcontent">
  <form action="Reg?what=db" method="post">
  <label for="busid"><b>BusId</b></label>
   <input type="text" placeholder="Enter Busid" name="busid" required>
    <input type="submit">
    </form>
</div>

<div id="Contact" class="tabcontent">
  <form action="Reg?what=ar" method="post">
  <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    <label for="routeid"><b>Route Id</b></label>
    <input type="text" placeholder="Enter Route Id" name="rid" required>
    <label for="mid1"><b>Mid1</b></label>
    <input type="text" placeholder="Enter Mid point" name="mid1" required>
    <label for="mid2"><b>Mid2</b></label>
    <input type="text" placeholder="Enter Mid point" name="mid2" required>
    <label for="pick"><b>Pick Up</b></label>
    <input type="text" placeholder="Enter Pickup point" name="pick" required>
    <input type="submit">
    </form>
</div>

<div id="About" class="tabcontent">
    <form action="Reg?what=dr" method="post">
  <label for="bi"><b>Bus Id</b></label>
    <input type="text" placeholder="Enter BusId" name="bi" required>
    <input type="submit">
    </form>
</div>
        </div>
        </body>
</html>
