import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DashB extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String un= request.getParameter("username");
            String req= request.getParameter("req");
        try  
        {
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true","root","AasthaSood"); 
            
            ArrayList<String> al=new ArrayList<String>();
            if(req.equals("r"))
            {
                 RequestDispatcher rd=request.getRequestDispatcher("routeinfo.jsp");
                   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Route c LEFT JOIN studentlogin o ON c.UserName = o.UserName WHERE o.UserName=?"); 
               stmt.setString(1,un);
                  ResultSet rs = stmt.executeQuery();
               
               while(rs.next())
               {
                    String s=rs.getString("UserName");
                    al.add(s);
                    s=rs.getString("routeid");
                    al.add(s);
                    s=rs.getString("mid1");
                    al.add(s);
                    s=rs.getString("mid2");
                    al.add(s);
                    s=rs.getString("Pick");
                    al.add(s);
               }
                
                request.setAttribute("Student", al);
               rd.forward(request, response);
              
              
            }
            else
            {
                if(req.equals("i"))
                {
                     RequestDispatcher rd=request.getRequestDispatcher("businfo.jsp");
                   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Bus c LEFT JOIN studentlogin o ON c.Busid = o.Busid WHERE UserName=?"); 
               stmt.setString(1,un);
                  ResultSet rs = stmt.executeQuery();
               
               while(rs.next())
               {
                    String s=rs.getString("Busid");
                    al.add(s);
                    s=rs.getString("DriverN");
                    al.add(s);
                    s=rs.getString("routeid");
                    al.add(s);
                    s=rs.getString("Busno");
                    al.add(s);
               }
                
                request.setAttribute("Student", al);
               rd.forward(request, response);
                }
                else
                {
                    if(req.equals("p"))
                    {
                        RequestDispatcher rd=request.getRequestDispatcher("Gatepass.jsp");
                   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Route c LEFT JOIN studentlogin o ON c.UserName = o.UserName WHERE o.UserName=?"); 
               stmt.setString(1,un);
                  ResultSet rs = stmt.executeQuery();
               
               while(rs.next())
               {
                    String s=rs.getString("UserName");
                    al.add(s);
                    s=rs.getString("Nam");
                    al.add(s);
                    s=rs.getString("Busid");
                    al.add(s);
                    s=rs.getString("routeid");
                    al.add(s);
                     s=rs.getString("Pick");
                    al.add(s);
               }
                
                request.setAttribute("Student", al);
               rd.forward(request, response); 
                    }
                    else
                    {
                        if(req.equals("f"))
                        {
                            response.sendRedirect("fine.jsp");
                        }
                    }
                }
            }
            //conn.close();  
             
        }
        catch(Exception e)
    {
        System.out.println(e);
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


