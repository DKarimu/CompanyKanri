package Entity;

import company1.Tools;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Project implements MainData {

    private int ProjectNo;
    private String ProjectName;
    private String Location;
    private int DeptNo;

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void Add() {
        String strInsert = "insert into Project values("
                + ProjectNo + ","
                + "'" + ProjectName + "',"
                + "'" + Location + "',"
                + DeptNo + ")";
        boolean isAdd = DB.Go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Project is Add");
        }
    }

    @Override
    public void Update() {
        String strUpdate = "update Project set ProjectName= '" + ProjectName + "',"
                + " Location= '" + Location + "',"
                + " DeptNo= " + DeptNo
                + " where ProjectNo= " + ProjectNo;
        boolean isUpDate = DB.Go.runNonQuery(strUpdate);
        if (isUpDate) {
            Tools.msgBox("is UpDate");
        }
    }

    @Override
    public void Delete() {
        String strDelete = "delete from Project "
                + "where ProjectNo = " + ProjectNo;
        boolean isDelete = DB.Go.runNonQuery(strDelete);
        if (isDelete) {
            Tools.msgBox("Project is Delete");
        }
    }

    @Override
    public String getAutoNumber() {
        return DB.Go.getAutoNumber("ProjectNo", "Project");

    }

    @Override
    public void getAllRoes(JTable table) {
        DB.Go.fillToJTable("project_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from project_data "
                + "where PROJECT_NO= " + ProjectNo;
        DB.Go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustemRows(String statment, JTable table) {
        DB.Go.fillToJTable(statment, table);
    }
    
    public void getCustmerRoesAndShowJLeb(String statment, JTable table,JLabel leb){
        DB.Go.fillToJTableAndLabel(statment, table, leb);
    }

    @Override
    public String getValueByNumber(String name) {
        String strSelect = "select PROJECTNO from project"
                + " where PROJECTNAME = '" + name + "'";
        String strVal = (String) DB.Go.getTableData(strSelect).Items[0][0];
        return strVal;//select ProjectNo from project where ProjectName = 'se Devlopt_OQpp'
    }

    @Override
    public String getValueByName(String Number) {
        String strSelect = "select ProjectName from Project "
                + "where ProjectNo= " + Number;
        String strName = (String) DB.Go.getTableData(strSelect).Items[0][0];
        return strName;
    }
}
