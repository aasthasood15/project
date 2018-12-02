import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String un = request.getParameter("username");
            String pw = request.getParameter("psw");
            String nm = request.getParameter("name");
            String em = request.getParameter("email");
            String ci= request.getParameter("city");
            String pi= request.getParameter("pi");
        try  
        {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&allowPublicKeyRetrieval=true","root","AasthaSood");
            PreparedStatement stmt = conn.prepareStatement("insert into studentlogin values(?,?,?,?,?,?)");  
            out.println(un);
            stmt.setString(1,un);  
            stmt.setString(2,pw);
            stmt.setString(3,nm);
            stmt.setString(4,em);
            stmt.setString(5,ci);
            if(ci.equals("chandigarh"))
            {
            stmt.setString(6,"b1");
            }
            if(ci.equals("punchkula"))
            {
            stmt.setString(6,"b2");
            }
            if(ci.equals("dhakoli"))
            {
            stmt.setString(6,"b3");
            }
            if(ci.equals("pinjore"))
            {
            stmt.setString(6,"b4");
            }
            stmt.executeUpdate();
            out.println(" records inserted"); 
             PreparedStatement stm = conn.prepareStatement("insert into Route values(?,?,?,?,?)");
            stm.setString(1,un);  
            if(ci.equals("chandigarh"))
            {
            stm.setString(2,"r1");
            stm.setString(3,"mullanpur");
            stm.setString(4,"sector17");
            stm.setString(5,pi);
            }
            if(ci.equals("punchkula"))
            {
            stm.setString(2,"r2");
            stm.setString(3,"pinjore");
            stm.setString(4,"oldpchk");
            stm.setString(5,pi);
            }
            if(ci.equals("dhakoli"))
            {
            stm.setString(2,"r3");
            stm.setString(3,"pinjore");
            stm.setString(4,"zirakpur");
            stm.setString(5,pi);
            }
            if(ci.equals("pinjore"))
            {
            stm.setString(2,"r4");
            stm.setString(3,"nanakpur");
            stm.setString(4,"kiratpur");
            stm.setString(5,pi);
            }

stm.executeUpdate();
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