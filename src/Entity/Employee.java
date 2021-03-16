package Entity;

import company1.Tools;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Employee implements MainData {

    private int EmpNo;
    private String EmpName;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String BirthDate;
    private int DeptNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void Add() {
        String strInsert = "insert into employee values("
                + EmpNo + ","
                + "'" + EmpName + "',"
                + "'" + Address + "',"
                + Salary + ","
                + "'" + HiringDate + "',"
                + "'" + BirthDate + "',"
                + DeptNo + ")";
        //ex : insert into employee values(1 ,'krimo','maroc',2000,'1989-10-23','1989-03-03',1)
        boolean isAdd = DB.Go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Employee is Addad");
        }
    }

    @Override
    public void Update() {
        String strUpDate = "update employee set empname='" + EmpName
                + "', Address='" + Address
                + "', Salary=" + Salary
                + ", HiringDate='" + HiringDate
                + "', BirthDate='" + BirthDate
                + "', DEPTNO =" + DeptNo
                + " where Empno=" + EmpNo;
        //ex :  update employee set empname='Krimo2',address='casa',Salary=40000,HiringDate = '2020-03-04',BirthDate='2010-03-05',DEPTNO=1 where Empno=1
        boolean isUpdate = DB.Go.runNonQuery(strUpDate);
        if (isUpdate) {
            Tools.msgBox("Employee is Updated");
        }
    }

    @Override
    public void Delete() {
        String strDelete = "delete from employee"
                + " where empno=" + EmpNo;
        boolean isDelete = DB.Go.runNonQuery(strDelete);
        if (isDelete) {
            Tools.msgBox("Employee is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return DB.Go.getAutoNumber("empno", "employee");
    }

    @Override
    public void getAllRoes(JTable table) {
        DB.Go.fillToJTable("employee_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from employee_data"
                + " where NUMBER = " + EmpNo;
        DB.Go.fillToJTable(strSelect, table);//
    }

    @Override
    public void getCustemRows(String statment, JTable table) {
        DB.Go.fillToJTable(statment, table);
    }
    public void getCustemRowAndShowLabel(String statment,JTable table,JLabel leb){
        DB.Go.fillToJTableAndLabel(statment, table, leb);
    }

    @Override
    public String getValueByName(String Name) {
        String strSelect = "select EMPNO from employee"
                + " where EMPNAME = '" + Name + "'";
        String strVal = DB.Go.getTableData(strSelect).Items[0][0].toString();
        return strVal;

    }

    @Override
    public String getValueByNumber(String Number) {
        String strSelect = " select EMPNAME from employee " + "where EMPNO =" + Number;
        String strNumber = DB.Go.getTableData(strSelect).Items[0][0].toString();
        return strNumber;

    }

}
