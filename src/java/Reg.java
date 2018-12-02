import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Reg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String what = request.getParameter("what");
            String un="";
            String dn="";
            String ri="";
            String bn="";
            String pw ="";
        try  
        {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true","root","AasthaSood");
            if(what.equals("ab"))
            {
                 un = request.getParameter("busid");
                 dn=request.getParameter("drivername");
                  ri=request.getParameter("rno");
                   bn=request.getParameter("bno");
               PreparedStatement stmt = conn.prepareStatement("insert into Bus values(?,?,?,?)");     
            out.println(un);
            stmt.setString(1,un);  
            stmt.setString(2,dn);
            stmt.setString(3,ri);
            stmt.setString(4,bn);
            stmt.executeUpdate();
            }
            if(what.equals("ar"))
            {
                 un = request.getParameter("username");
                  ri=request.getParameter("rid");
                  dn=request.getParameter("mid1");
                   bn=request.getParameter("mid2");
                   pw = request.getParameter("pick");
               PreparedStatement stmt = conn.prepareStatement("insert into Route values(?,?,?,?,?)");
            out.println(un);
            stmt.setString(1,un);  
            stmt.setString(2,ri);
            stmt.setString(3,dn);
            stmt.setString(4,bn);
            stmt.setString(5,pw);
            stmt.executeUpdate();
            }
            if(what.equals("dr"))
            {
                 un = request.getParameter("bi");
                  
               PreparedStatement stmt = conn.prepareStatement("delete from Route where UserName=?");
            stmt.setString(1,un);
            stmt.executeUpdate();
            }
            if(what.equals("db"))
            {
                 un = request.getParameter("busid");
                  
               PreparedStatement stmt = conn.prepareStatement("delete from Bus where Busid=?");
            
            stmt.setString(1,un);
            stmt.executeUpdate();
            }
             
            response.sendRedirect("index.html"); 
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