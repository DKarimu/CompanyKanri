package Entity;

import company1.Tools;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Workon implements MainData {

    private int EmpNo;
    private int ProjNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public int getProjNo() {
        return ProjNo;
    }

    public void setProjNo(int ProjNo) {
        this.ProjNo = ProjNo;
    }

    @Override
    public void Add() {
        String strInsert = "insert into workon values("
                + EmpNo + ","
                + ProjNo + ")";
        boolean isAdd = DB.Go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Workon is Add");
        }
    }

    @Override
    public void Update() {
        Tools.msgBox("Update Method In workon is Not Working");
    }

    @Override
    public void Delete() {
        String strDelete = "delete from Workon where EMPNO=" + EmpNo;
        boolean isDelet = DB.Go.runNonQuery(strDelete);
        if (isDelet) {
            Tools.msgBox("Workon is Delete");
        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msgBox("Update Method In workon is Not Working");
        return "";
    }

    @Override
    public void getAllRoes(JTable table) {
        DB.Go.fillToJTable("workon_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from workon_data where"
                + " EMPLOYEE_NO= " + EmpNo
                + " and"
                + " PROJECT_NO= " + ProjNo;
        DB.Go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustemRows(String statment, JTable table) {
        DB.Go.fillToJTable(statment, table);
    }
    public void getCustemRowsAndShowLeb(String stetment,JTable table, JLabel leb){
        DB.Go.fillToJTableAndLabel(stetment, table, leb);
    }
    @Override
    public String getValueByNumber(String name) {
        Tools.msgBox("getValueByNumber Method In workon is Not Working");
        return "";
    }

    @Override
    public String getValueByName(String Number) {
        Tools.msgBox("getValueByName Method In workon is Not Working");
        return "";
    }
}
