package Entity;

import company1.Tools;
import javax.swing.JTable;

public class Employee_Phones implements MainData {

    private int Empno;
    private String Phone;

    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int Empno) {
        this.Empno = Empno;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public void Add() {
        String strInsert = "Insert into employee_phones values ("
                + Empno
                + " , " + " '"
                + Phone + "')";//ex : Insert into employee_phones values( 2 , '001')
        boolean isAdd = DB.Go.runNonQuery(strInsert);
        if (isAdd) {
            //Tools.msgBox("Phone is Add");
        }
    }

    @Override
    public void Update() {
        Tools.msgBox("Update Method In Employee_Phone Not Working");
    }

    @Override
    public void Delete() {
        String strDelete = "delete from employee_phones where "
                + " EMPNO= " + Empno
                + " and PHONE= '" + Phone + "'";
        boolean isDelete = DB.Go.runNonQuery(strDelete);
        if (isDelete) {
            //Tools.msgBox("Phone is Delete");
        }

    }

    public void DeleteByEmp() {
        String strDelete = "delete from employee_phones " + "where empNo= " + Empno;
        boolean isDelete = DB.Go.runNonQuery(strDelete);
        if (isDelete) {
            //Tools.msgBox("No" + Empno + "phons is Deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msgBox("Update Method In Employee_Phone Not Working");
        return "";
    }

    @Override
    public void getAllRoes(JTable table) {
        String strSelect = "select phone from employee_phones " + "where empno=" + Empno;
        DB.Go.fillToJTable(strSelect, table);
    }

    @Override
    public void getOneRow(JTable table) {
        Tools.msgBox("getOneRow Method In Employee_Phone Not Working");

    }

    @Override
    public void getCustemRows(String statment, JTable table) {
        Tools.msgBox("getCustemRows Method In Employee_Phone Not Working");

    }

    @Override
    public String getValueByNumber(String name) {
        Tools.msgBox("getValueByNumber Method In Employee_Phone Not Working");
        return "";
    }

    @Override
    public String getValueByName(String Number) {
        Tools.msgBox("getValueByName Method In Employee_Phone Not Working");
        return "";
    }

    public String getEmpnoByPhone(String Phone) {
        String strSelect = "select Empno from employee_phones where phone = '"+Phone+ "'";
        Object row[][] = DB.Go.getTableData(strSelect).Items;
        String strEmpNo="";
        if(row.length>0){
        strEmpNo = (String)row[0][0];
        }else{
        strEmpNo="0";
        }
        return strEmpNo;
    }

}
