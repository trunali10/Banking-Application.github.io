
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Helper {

    static void InsertDebitTransactionRecord(Connection conn,String str_Sender, String str_Reciever, int int_DBbalance, int int_EnteredAmount) {
     try{
         int int_AvailableBalance=int_DBbalance-int_EnteredAmount;
            String str_InsertDebitTransactionRecord="insert into transactions (`sender`,`reciever`, `previous_balance`, `transaction_amt`, `transaction_type`, `current_balance`, `remark`) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst_InsertDebitTransactionRecord=conn.prepareStatement(str_InsertDebitTransactionRecord);
            pst_InsertDebitTransactionRecord.setString(1, str_Sender);
            pst_InsertDebitTransactionRecord.setString(2, str_Reciever);
            pst_InsertDebitTransactionRecord.setInt(3, int_DBbalance);
            pst_InsertDebitTransactionRecord.setInt(4, int_EnteredAmount);
            pst_InsertDebitTransactionRecord.setString(5, "Debit");
            pst_InsertDebitTransactionRecord.setInt(6, int_AvailableBalance);
            pst_InsertDebitTransactionRecord.setString(7, "Completed");
            pst_InsertDebitTransactionRecord.execute();
            
            String str_UpdateDebitAmount="update customerdetails set balance=? where name=?";
            PreparedStatement pst_UpdateDebitAmount=conn.prepareStatement(str_UpdateDebitAmount);
            pst_UpdateDebitAmount.setInt(1, int_AvailableBalance);
            pst_UpdateDebitAmount.setString(2, str_Sender);
            
            
            pst_UpdateDebitAmount.executeUpdate();
            
            
            
            str_UpdateDebitAmount=" update customerdetails set balance=balance+? where name=?";
            pst_UpdateDebitAmount=conn.prepareStatement(str_UpdateDebitAmount);
            
            pst_UpdateDebitAmount.setInt(1, int_EnteredAmount);
            pst_UpdateDebitAmount.setString(2, str_Reciever);
            
            pst_UpdateDebitAmount.executeUpdate();
            
     }catch(Exception e){
         System.out.print("Exception  "+e);
     e.printStackTrace();
     }
     }

    static void InsertFailureDebitTransactionRecord(Connection con, String str_Sender, String str_Reciever, int int_DBbalance, int int_EnteredAmount) {
    try{
            String str_InsertFailureDebitTransactionRecord="insert into transactions (`sender`,`reciever`, `previous_balance`, `transaction_amt`, `transaction_type`, `current_balance`, `remark`) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst_InsertFailureDebitTransactionRecord=con.prepareStatement(str_InsertFailureDebitTransactionRecord);
            pst_InsertFailureDebitTransactionRecord.setString(1, str_Sender);
            pst_InsertFailureDebitTransactionRecord.setString(2, str_Reciever);
            pst_InsertFailureDebitTransactionRecord.setInt(3, int_DBbalance);
            pst_InsertFailureDebitTransactionRecord.setInt(4, int_EnteredAmount);
            pst_InsertFailureDebitTransactionRecord.setString(5, "Debit");
            pst_InsertFailureDebitTransactionRecord.setInt(6, int_DBbalance);
            pst_InsertFailureDebitTransactionRecord.setString(7, "Falure ,Insufficient Balance");
            
            
            pst_InsertFailureDebitTransactionRecord.execute();
           
            
        
     }catch(Exception e){
         System.out.print("Exception  "+e);
         e.printStackTrace();
     }
     }
    
}
