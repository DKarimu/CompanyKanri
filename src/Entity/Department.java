package Entity;

import company1.Tools;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Department implements MainData {

    private int Deptno;
    private String DeptName;
    private String Location;

    public int getDeptno() {
        return Deptno;
    }

    public void setDeptno(int Deptno) {
        this.Deptno = Deptno;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void Add() {
        String strInsert = "insert into department values("
                + Deptno + ","
                + "'" + DeptName + "',"
                + "'" + Location + "')";
        boolean isAdd = DB.Go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Department is Addad");
        }

    }

    @Override
    public void Update() {
        String strUpDate = "update department set DEPARTNAME= '" + DeptName + "' , LOCATION='" + Location + "' where DEPTNO =" + Deptno;
        boolean isUpdate = DB.Go.runNonQuery(strUpDate);
        if (isUpdate) {
            Tools.msgBox("Department is Updated");
        }
    }

    @Override
    public void Delete() {
        String strDelete = "delete from department"
                + " where DeptNo=" + Deptno;
        boolean isDelete = DB.Go.runNonQuery(strDelete);
        if (isDelete) {
            Tools.msgBox("Department is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return DB.Go.getAutoNumber("DEPTNO", "department");
    }

    @Override
    public void getAllRoes(JTable table) {
        DB.Go.fillToJTable("department_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from department_data "
                + "where DEPARTMENT_NO= " + Deptno;
        DB.Go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustemRows(String statment, JTable table) {
        DB.Go.fillToJTable(statment, table);
    }
     public void getCustemRowAndShowLabel(String statment, JTable table,JLabel lab){
         DB.Go.fillToJTableAndLabel(statment, table, lab);
     }

    @Override
    public String getValueByNumber(String Number) {
        String strSelect = "select DEPARTNAME from department "
                + "where deptno=" + Number;
        String strName = (String) DB.Go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public String getValueByName(String Name) {
        String strSelect = "select deptno from department "
                + " where DEPARTNAME='" + Name + "';";
        String strVal = (String) DB.Go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

}
