/*
 * To change this license header, choos    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
e License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.Department;
import Entity.Project;
import company1.Tools;
import controls.JMyCombo;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author owner
 */
public class FRMProject extends javax.swing.JFrame {

    /**
     * Creates new form FRMProject
     */
    public FRMProject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrop = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProjNo = new controls.JTextBox(15);
        txtProjName = new controls.JTextBox(15);
        txtLoca = new controls.JTextBox(15);
        cbxDept = new controls.JMyCombo();
        btnAdd = new controls.JMyButton();
        btnUpdete = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnFind = new controls.JMyButton();
        btnAll = new controls.JMyButton();
        btnClear = new controls.JMyButton();
        jMyButton7 = new controls.JMyButton();
        jLabel6 = new javax.swing.JLabel();
        rdoProjectNo = new javax.swing.JRadioButton();
        rdoProjName = new javax.swing.JRadioButton();
        rdoLocation = new javax.swing.JRadioButton();
        rdoDept = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProject = new javax.swing.JTable();
        btnSearch = new controls.JMyButton();
        txtSearch = new controls.JTextBox(20);
        btnAddDept = new controls.JMyButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EmtLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("PROJECT");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Project No               :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Project Name          :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Location                  :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Depertment            :");

        txtProjNo.setEditable(false);

        txtProjName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProjNameKeyPressed(evt);
            }
        });

        txtLoca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocaKeyPressed(evt);
            }
        });

        cbxDept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxDeptKeyPressed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdete.setText("Update");
        btnUpdete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdeteActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jMyButton7.setText("Back");
        jMyButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMyButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Search By");

        rdoProjectNo.setSelected(true);
        rdoProjectNo.setText("Project No");
        rdoProjectNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoProjectNoActionPerformed(evt);
            }
        });

        rdoProjName.setText("Project Name");
        rdoProjName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoProjNameActionPerformed(evt);
            }
        });

        rdoLocation.setText("Location");
        rdoLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoLocationActionPerformed(evt);
            }
        });

        rdoDept.setText("Department");
        rdoDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDeptActionPerformed(evt);
            }
        });

        tblProject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROJECT No", "PROJECT NAME", "LOCATION", "DEPARTMENT No", "DEPARTMENT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProject.setSurrendersFocusOnKeystroke(true);
        tblProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProjectMouseClicked(evt);
            }
        });
        tblProject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProjectKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProject);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnAddDept.setText("+");
        btnAddDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeptActionPerformed(evt);
            }
        });

        jLabel7.setText("F5: ??????");

        jLabel8.setText("F4: ??????");

        jLabel9.setText("F3: ??????");

        EmtLeb.setText("      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMyButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtProjNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtProjName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(btnUpdete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoProjectNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoProjName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoDept)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmtLeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoProjectNo)
                    .addComponent(rdoProjName)
                    .addComponent(rdoLocation)
                    .addComponent(rdoDept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtProjNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProjName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMyButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(EmtLeb))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdeteActionPerformed
        setValues();
        proj.Update();
        clearData();
        proj.getAllRoes(tblProject);
    }//GEN-LAST:event_btnUpdeteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (Tools.ConfirmMsg("Do you wont to delete ")) {
            setValues();
            proj.Delete();
            clearData();
            proj.getAllRoes(tblProject);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String strProjNo = (String) Tools.InputBox("Enter Project Number");
        int projectNo = Integer.parseInt(strProjNo);

        proj.setProjectNo(projectNo);
        proj.getOneRow(tblProject);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        proj.getAllRoes(tblProject);
    }//GEN-LAST:event_btnAllActionPerformed
    private void clearData() {
        Tools.clearText(this);
        txtProjNo.setText(proj.getAutoNumber());
        btnAdd.setEnabled(true);
        btnUpdete.setEnabled(false);
        btnDelete.setEnabled(false);
        txtProjName.requestFocus();
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jMyButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMyButton7ActionPerformed
        this.dispose();
        Tools.openForm(new FrmMan());
    }//GEN-LAST:event_jMyButton7ActionPerformed

    private void rdoProjectNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoProjectNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoProjectNoActionPerformed

    private void rdoProjNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoProjNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoProjNameActionPerformed

    private void rdoLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoLocationActionPerformed

    private void rdoDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoDeptActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String strSelect = "select * from project_data where";
        if (rdoProjectNo.isSelected()) {
            strSelect += " PROJECT_NO";
        } else if (rdoProjName.isSelected()) {
            strSelect += " PROJECT_NAME";
        } else if (rdoLocation.isSelected()) {
            strSelect += " LOCATION";
        } else {
            strSelect += " DEPARTMENT";
        }
        strSelect += " like'%" + txtSearch.getText() + "%'";
        proj.getCustemRows(strSelect, tblProject);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnGrop.add(rdoProjectNo);
        btnGrop.add(rdoProjName);
        btnGrop.add(rdoLocation);
        btnGrop.add(rdoDept);

        proj.getAllRoes(tblProject);
        DB.Go.fillCombo("department", "DEPARTNAME", cbxDept);

        clearData();
        EmtLeb.setText("-----");
    }//GEN-LAST:event_formWindowOpened
    private void setValues() {

        int ProjectNo = Integer.parseInt(txtProjNo.getText());
        String ProjectName = txtProjName.getText();
        String Location = txtLoca.getText();

        String DeptName = cbxDept.getSelectedItem().toString();

        int DeptNo = Integer.parseInt(dept.getValueByName(DeptName));//Moraja3a

        proj.setProjectNo(ProjectNo);
        proj.setProjectName(ProjectName);
        proj.setLocation(Location);
        proj.setDeptNo(DeptNo);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValues();
        proj.Add();
        clearData();
        proj.getAllRoes(tblProject);
    }//GEN-LAST:event_btnAddActionPerformed
    Department dept = new Department();
    Project proj = new Project();
    private void btnAddDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeptActionPerformed
        int DeptNo = Integer.parseInt(dept.getAutoNumber());
        String Deptname = (String) Tools.InputBox("Enter Depart Name");
        String Location = (String) Tools.InputBox("Enter Location");

        dept.setDeptno(DeptNo);
        dept.setDeptName(Deptname);
        dept.setLocation(Location);
        dept.Add();

        DB.Go.fillCombo("department", "DEPARTNAME", cbxDept);
    }//GEN-LAST:event_btnAddDeptActionPerformed

    private void tblProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProjectMouseClicked
        try {
            int row = tblProject.getSelectedRow();

            String ProjNo = tblProject.getValueAt(row, 0).toString();
            String ProjNam = tblProject.getValueAt(row, 1).toString();
            String Loca = tblProject.getValueAt(row, 2).toString();
            //String DeptNo = tblProject.getValueAt(row, 3).toString();
            String DeptNam = tblProject.getValueAt(row, 4).toString();

            txtProjNo.setText(ProjNo);
            txtProjName.setText(ProjNam);
            txtLoca.setText(Loca);
            cbxDept.setSelectedItem(DeptNam);

            btnAdd.setEnabled(false);
            btnUpdete.setEnabled(true);
            btnDelete.setEnabled(true);

        } catch (Exception ex) {
            Tools.msgBox(ex.getMessage());
        }
    }//GEN-LAST:event_tblProjectMouseClicked
    private void PressKeyBtnToUpDeteAndADdEx(KeyEvent evt, JTextField JTxt) {

        String EmtVal = JTxt.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTxt.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            if ("".equals(EmtVal)) {
                Tools.msgBox("deta irete");
            } else {
                setValues();
                proj.Add();
                clearData();
                proj.getAllRoes(tblProject);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            setValues();
            proj.Update();
            clearData();
            proj.getAllRoes(tblProject);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            if (Tools.ConfirmMsg("Do you wont to delete ")) {
                setValues();
                proj.Delete();
                clearData();
                proj.getAllRoes(tblProject);
            }
        }
    }
    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String strSelect = "select * from project_data where";
            if (rdoProjectNo.isSelected()) {
                strSelect += " PROJECT_NO";
            } else if (rdoProjName.isSelected()) {
                strSelect += " PROJECT_NAME";
            } else if (rdoLocation.isSelected()) {
                strSelect += " LOCATION";
            } else {
                strSelect += " DEPARTMENT";
            }
            strSelect += " like'%" + txtSearch.getText() + "%'";
            proj.getCustmerRoesAndShowJLeb(strSelect, tblProject, EmtLeb);
        }
    }//GEN-LAST:event_txtSearchKeyPressed
    private void txtProjNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProjNameKeyPressed
        PressKeyBtnToUpDeteAndADdEx(evt, txtLoca);
    }//GEN-LAST:event_txtProjNameKeyPressed

    private void txtLocaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocaKeyPressed
        String EmtVal = txtLoca.getText();
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxDept.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            if ("".equals(EmtVal)) {
                Tools.msgBox("deta irete");
            } else {
                setValues();
                proj.Add();
                clearData();
                proj.getAllRoes(tblProject);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            setValues();
            proj.Update();
            clearData();
            proj.getAllRoes(tblProject);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            if (Tools.ConfirmMsg("????????????")) {
                setValues();
                proj.Delete();
                clearData();
                proj.getAllRoes(tblProject);
            }
        }
    }//GEN-LAST:event_txtLocaKeyPressed

    private void cbxDeptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxDeptKeyPressed
        PressKeyBtnToUpDeteAndADdEx(evt, txtProjName);
    }//GEN-LAST:event_cbxDeptKeyPressed

    private void tblProjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProjectKeyPressed
        PressKeyBtnToUpDeteAndADdEx(evt, txtProjName);
    }//GEN-LAST:event_tblProjectKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmtLeb;
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAddDept;
    private controls.JMyButton btnAll;
    private controls.JMyButton btnClear;
    private controls.JMyButton btnDelete;
    private controls.JMyButton btnFind;
    private javax.swing.ButtonGroup btnGrop;
    private controls.JMyButton btnSearch;
    private controls.JMyButton btnUpdete;
    private controls.JMyCombo cbxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private controls.JMyButton jMyButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDept;
    private javax.swing.JRadioButton rdoLocation;
    private javax.swing.JRadioButton rdoProjName;
    private javax.swing.JRadioButton rdoProjectNo;
    private javax.swing.JTable tblProject;
    private javax.swing.JTextField txtLoca;
    private javax.swing.JTextField txtProjName;
    private javax.swing.JTextField txtProjNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
