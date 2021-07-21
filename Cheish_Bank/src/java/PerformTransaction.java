/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class PerformTransaction extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            int int_DBbalance=0;
            String str_Remark="";
            String str_Sender=request.getParameter("sender")+"";
            String str_Reciever=request.getParameter("reciever")+"";
            System.out.println("Sender "+str_Sender);
            System.out.println("Reciever "+str_Reciever);
            
            String str_Amount=request.getParameter("amount");
            System.out.println("Amount "+str_Amount);
            int int_EnteredAmount=Integer.parseInt(str_Amount);
            Connection con=DB_Connection.connect();
            
            String str_SelectSenderBalance="Select balance from customerdetails";
            PreparedStatement pst_SelectSenderBalance=con.prepareStatement(str_SelectSenderBalance);
            ResultSet rs_SelectSenderBalance=pst_SelectSenderBalance.executeQuery();
            if(rs_SelectSenderBalance.next()){
                int_DBbalance=rs_SelectSenderBalance.getInt("balance");
            }
            
            
            //check balance
            if(int_DBbalance<int_EnteredAmount){
                str_Remark="Insufficient Balance";
                Helper.InsertFailureDebitTransactionRecord(con,str_Sender,str_Reciever,int_DBbalance,int_EnteredAmount);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Insufficient Balance,Transaction failed');");
                out.println("location='New_PerformTransaction.jsp';");
                out.println("</script>");
            }else
            {
                Helper.InsertDebitTransactionRecord(con,str_Sender,str_Reciever,int_DBbalance,int_EnteredAmount);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Transaction Successfull');");
                out.println("location='New_PerformTransaction.jsp';");
                out.println("</script>");
            
            }
            

//            
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet PerformTransaction</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet PerformTransaction at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        } catch (Exception ex) {
            Logger.getLogger(PerformTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
