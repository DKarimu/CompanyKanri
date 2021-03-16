package Forms;

import Entity.Department;
import Entity.Employee;
import Entity.Project;
import Entity.Workon;
import company1.Tools;
import controls.JMyCombo;
import java.awt.event.KeyEvent;

public class FRMWorkon extends javax.swing.JFrame {

    public FRMWorkon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new controls.JMyButton();
        btnDelete = new controls.JMyButton();
        btnFind = new controls.JMyButton();
        btnAll = new controls.JMyButton();
        btnBack = new controls.JMyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorckon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rdoProjNo = new javax.swing.JRadioButton();
        rdoEmpNo = new javax.swing.JRadioButton();
        txtSearch = new controls.JTextBox(15);
        btnSearch = new controls.JMyButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxProj = new controls.JMyCombo();
        cbxEmp = new controls.JMyCombo();
        rdoProjName = new javax.swing.JRadioButton();
        rdoEmpName = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmtLeb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("WORKON");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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
        btnAll.setDefaultCapable(false);
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblWorckon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE No", "EMPLOYEE Name", "PROJECT No", "PROJECT Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorckon.setAutoscrolls(false);
        tblWorckon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorckonMouseClicked(evt);
            }
        });
        tblWorckon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblWorckonKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorckon);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Search");

        rdoProjNo.setText("Project No");

        rdoEmpNo.setSelected(true);
        rdoEmpNo.setText("Employee No");
        rdoEmpNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEmpNoActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Project      :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Employee  :");

        cbxProj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxProjKeyPressed(evt);
            }
        });

        cbxEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxEmpKeyPressed(evt);
            }
        });

        rdoProjName.setText("Project Name");
        rdoProjName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoProjNameActionPerformed(evt);
            }
        });

        rdoEmpName.setText("Employee Name");

        jLabel8.setText("F3: 削除");

        jLabel6.setText("F5: 追加");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxProj, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(cbxEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoEmpNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoEmpName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoProjNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoProjName)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmtLeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoEmpNo)
                        .addComponent(rdoEmpName)
                        .addComponent(rdoProjNo)
                        .addComponent(rdoProjName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addComponent(EmtLeb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Workon work = new Workon();
    Department dept = new Department();
    Employee Emp = new Employee();
    Project proj = new Project();
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        boolean isConfirm = Tools.ConfirmMsg("do you wont to delete");
        if (isConfirm) {
            setValiues();
            work.Delete();
            work.getAllRoes(tblWorckon);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String strEmpNo = Tools.InputBox("Enter Eployee Number").toString();
        String strProjNo = (String) Tools.InputBox("Enter ProjectNumber");

        int EmpNo = Integer.parseInt(strEmpNo);
        int ProjNo = Integer.parseInt(strProjNo);

        work.setEmpNo(EmpNo);
        work.setProjNo(ProjNo);
        work.getOneRow(tblWorckon);
    }//GEN-LAST:event_btnFindActionPerformed
    private void setValiues() {
        String EmpName = cbxEmp.getSelectedItem().toString();
        String ProjName = cbxProj.getSelectedItem().toString();

        String strEmoNo = Emp.getValueByName(EmpName);
        String strProjNo = proj.getValueByNumber(ProjName);

        int EmpNo = Integer.parseInt(strEmoNo);
        int ProjNo = Integer.parseInt(strProjNo);

        work.setEmpNo(EmpNo);
        work.setProjNo(ProjNo);
    }
    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        work.getAllRoes(tblWorckon);
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Tools.openForm(new FrmMan());
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String strSearch = "select * from workon_data where ";

        if (rdoProjNo.isSelected()) {
            strSearch += " PROJECT_NO";
        } else if (rdoProjName.isSelected()) {
            strSearch += " PROJECT_NAME";
        } else if (rdoEmpNo.isSelected()) {
            strSearch += " EMPLOYEE_NO";
        } else {
            strSearch += " EMPLOYEE_NAME";
        }
        strSearch += " like '%" + txtSearch.getText() + "%'";

        work.getCustemRows(strSearch, tblWorckon);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdoProjNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoProjNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoProjNameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnGroup.add(rdoProjNo);
        btnGroup.add(rdoProjName);
        btnGroup.add(rdoEmpNo);
        btnGroup.add(rdoEmpName);

        DB.Go.fillCombo("project", "PROJECTNAME", cbxProj);//a ameliorait
        DB.Go.fillCombo("employee", "EMPNAME", cbxEmp);//a ameliorait

        tblWorckon.getTableHeader().setReorderingAllowed(false);
        cbxProj.requestFocus();

        work.getAllRoes(tblWorckon);
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValiues();
        work.Add();
        work.getAllRoes(tblWorckon);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblWorckonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorckonMouseClicked
        try {
            int row = tblWorckon.getSelectedRow();

            String EmpName = tblWorckon.getValueAt(row, 1).toString();
            String ProjName = tblWorckon.getValueAt(row, 3).toString();

            cbxEmp.setSelectedItem(EmpName);
            cbxProj.setSelectedItem(ProjName);

        } catch (Exception ex) {
            Tools.msgBox(ex.getMessage());
        }
    }//GEN-LAST:event_tblWorckonMouseClicked

    private void rdoEmpNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoEmpNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoEmpNoActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String strSearch = "select * from workon_data where ";

            if (rdoProjNo.isSelected()) {
                strSearch += " PROJECT_NO";
            } else if (rdoProjName.isSelected()) {
                strSearch += " PROJECT_NAME";
            } else if (rdoEmpNo.isSelected()) {
                strSearch += " EMPLOYEE_NO";
            } else {
                strSearch += " EMPLOYEE_NAME";
            }
            strSearch += " like '%" + txtSearch.getText() + "%'";

            work.getCustemRowsAndShowLeb(strSearch, tblWorckon, EmtLeb);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void cbxProjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxProjKeyPressed
        PresseBtnTo(evt, cbxEmp);
    }//GEN-LAST:event_cbxProjKeyPressed

    private void cbxEmpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxEmpKeyPressed
        PresseBtnTo(evt, cbxProj);
    }//GEN-LAST:event_cbxEmpKeyPressed
    private void PresseBtnTo(KeyEvent evt, JMyCombo combo) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combo.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            setValiues();
            work.Add();
            work.getAllRoes(tblWorckon);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            boolean isConfirm = Tools.ConfirmMsg("do you wont to delete");
            if (isConfirm) {
                setValiues();
                work.Delete();
                work.getAllRoes(tblWorckon);
            }
        }
    }

    private void tblWorckonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblWorckonKeyPressed
        PresseBtnTo(evt, cbxEmp);
    }//GEN-LAST:event_tblWorckonKeyPressed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMWorkon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMWorkon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMWorkon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMWorkon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMWorkon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmtLeb;
    private controls.JMyButton btnAdd;
    private controls.JMyButton btnAll;
    private controls.JMyButton btnBack;
    private controls.JMyButton btnDelete;
    private controls.JMyButton btnFind;
    private javax.swing.ButtonGroup btnGroup;
    private controls.JMyButton btnSearch;
    private controls.JMyCombo cbxEmp;
    private controls.JMyCombo cbxProj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoEmpName;
    private javax.swing.JRadioButton rdoEmpNo;
    private javax.swing.JRadioButton rdoProjName;
    private javax.swing.JRadioButton rdoProjNo;
    private javax.swing.JTable tblWorckon;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
