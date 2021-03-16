package Entity;

import javax.swing.JTable;

public interface MainData {
    public void Add();
    
    public void Update();
    
    public void Delete();
    
    public String getAutoNumber();
    
    public void getAllRoes(JTable table);
    
    public void getOneRow(JTable table);
    
    public void getCustemRows(String statment,JTable table);
    
    public String getValueByNumber(String name);
    
    public String getValueByName(String Number );
   
}
