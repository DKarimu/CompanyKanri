package DB;

import company1.Tools;
import company1.Tools.Table;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Go {

    private static String url = "";
    private static Connection con;

    private static void setURL() {
        url = "jdbc:mysql://localhost:3306/company"
                + "?useUnicode=true&characterEncooding = UTF-8";
    }

    private static void setConnection() {
        setURL();
        try {
            setURL();
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }

    public static boolean CheckUseasAndPass(String usernames, String password) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck = "select * from USERS where USERNAME='" + usernames + "' and PASS='" + password + "'";

            stmt.executeQuery(strCheck);
            while (stmt.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
        return false;

    }

    public static boolean runNonQuery(String sqlStatment) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sqlStatment);
            con.close();
            return true;
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            Tools.msgBox("  (№キー)が既存有り  ");//ex.getMessage());
            return false;
        }

    }

    public static String getAutoNumber(String ColumnName, String TableName) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "select max(" + ColumnName + ")+1 as AutoNam from " + TableName;
            //select max(department)+1 as 'k' from department_data;

            stmt.executeQuery(strAuto);
            String Num = "";
            while (stmt.getResultSet().next()) {
                Num = stmt.getResultSet().getString("AutoNam");
            }
            con.close();
            if (Num == null || "".equals(Num)) {
                return "1";
            } else {
                return Num;
            }
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return "(String getAutoNumber)Gyu78 ?";
        }

    }

    public static Table getTableData(String statement) {//moraja3a
        Tools t = new Tools();
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statement);

            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();

            Table table = t.new Table(c);//moraja3a

            while (rs.next()) {
                Object row[] = new Object[c];
                for (int i = 0; i < c; i++) {
                    row[i] = rs.getString(i + 1);
                }
                table.AddNewRow(row);
            }
            con.close();
            return table;
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
            return t.new Table(0);
        }

    }

    //242
    public static void fillCombo(String TablName, String columnName, JComboBox combo) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;

            String strSelect = "select " + columnName + " from " + TablName;
            rs = stmt.executeQuery(strSelect);
            rs.last();
            int c = rs.getRow();
            rs.beforeFirst();

            String values[] = new String[c];

            int i = 0;
            while (rs.next()) {
                values[i] = rs.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values));

        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }

    public static void fillToJTable(String tableNameOrSelectStatment, JTable table) {//moraja3a
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;

            String strSelect;
            if ("select ".equals(tableNameOrSelectStatment.substring(0, 7).toLowerCase())) {
                strSelect = tableNameOrSelectStatment;
            } else {
                strSelect = "select * from " + tableNameOrSelectStatment;
            }
            rs = stmt.executeQuery(strSelect);//            

            ResultSetMetaData rsmd = rs.getMetaData();//
            int c = rsmd.getColumnCount();//

            DefaultTableModel model = (DefaultTableModel) table.getModel();//

            Vector row = new Vector();
            model.setRowCount(0);

            while (rs.next()) {

                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if (table.getColumnCount() != c) {
                Tools.msgBox("JTable Columnd Count not Query Columns Conunt \n JTable Columns Count Is : " + table.getColumnCount() + "\n Query Columns Count Is : " + c);
            }
            con.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());//
        }
    }

    public static void fillToJTableAndLabel(String tableNameOrSelectStatment, JTable table, JLabel Labe) {//moraja3a
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;

            String strSelect;
            if ("select ".equals(tableNameOrSelectStatment.substring(0, 7).toLowerCase())) {
                strSelect = tableNameOrSelectStatment;
            } else {
                strSelect = "select * from " + tableNameOrSelectStatment;
            }
            rs = stmt.executeQuery(strSelect);//            

            ResultSetMetaData rsmd = rs.getMetaData();//
            int c = rsmd.getColumnCount();//

            DefaultTableModel model = (DefaultTableModel) table.getModel();//

            Vector row = new Vector();
            model.setRowCount(0);

            while (rs.next()) {

                row = new Vector(c);
                for (int i = 1; i <= c; i++) {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if (!rs.first()) {
                Labe.setOpaque(true);
                Labe.setBackground(Color.red);
                Labe.setForeground(Color.BLACK);
                Labe.setText("データ無-データ無");
            } else {
                Labe.setText("");
            }
            if (table.getColumnCount() != c) {
                Tools.msgBox("JTable Columnd Count not Query Columns Conunt \n JTable Columns Count Is : " + table.getColumnCount() + "\n Query Columns Count Is : " + c);
            }
            con.close();
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());//
        }
    }
}
