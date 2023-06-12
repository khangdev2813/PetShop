/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uitpet;

import ClassModel.*;
import javax.swing.JOptionPane;
import DAOmodel.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Quoc Bao
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    String code="", name="", bd="",address="", email="", phone="",date="", role="", user="", pw="", rePw="",accountId="";
    int salary;
    boolean isUpdate = false;
    int row;
    public Object[] getRow() {
        return new Object[] { code,name,bd,address,email,phone,date, salary};
    }

    public RegisterFrame() {
        initComponents();
    }
    
    public RegisterFrame(String sCode, String sName, String sBd,String sAddress, String sEmail,String sPhone,String sDate, String sSalary, String sRole, String sUser, String sPw, String sRePw, int row) {
        initComponents();
        codeField.setText(sCode);
        nameField.setText(sName);
        bdField.setText(sBd);
        addressField.setText(sAddress);
        mailField.setText(sEmail);
        phoneField.setText(sPhone);
        dateField.setText(sDate);
        salaryField.setText(sSalary);
        userField.setText(sUser);
        pwField.setText(sPw);
        cfpwField.setText(sRePw);
        if (sRole.equals("staff")) {
            staff.setSelected(true);
        } else {
            manager.setSelected(true);
        }
             
        code = codeField.getText();
        name = nameField.getText();
        bd = bdField.getText();
        address = addressField.getText();
        email = mailField.getText();
        phone = phoneField.getText();
        date = dateField.getText();
        salary = Integer.parseInt(salaryField.getText());
        role = (staff.isSelected()) ? staff.getText() : manager.getText();
        user = userField.getText();
        pw = new String(pwField.getPassword());
        rePw = new String(cfpwField.getPassword());
        this.row = this.row;
        isUpdate = true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        submitEmpBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        bdField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pwField = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        cfpwField = new javax.swing.JPasswordField();
        staff = new javax.swing.JRadioButton();
        manager = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        dateField = new javax.swing.JFormattedTextField();

        btng.add(staff);
        btng.add(manager);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel1.setText("Register Form");

        submitEmpBtn.setBackground(new java.awt.Color(51, 255, 204));
        submitEmpBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitEmpBtn.setText("Xác nhận");
        submitEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitEmpBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Mật khẩu");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Mã nhân viên");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Tên nhân viên");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Địa chỉ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Ngày sinh");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Email");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Ngày vào làm");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("SĐT");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Tài khoản");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Lương");

        pwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Nhập lại mật khẩu");

        cfpwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfpwFieldActionPerformed(evt);
            }
        });

        staff.setText("Nhân viên ");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        manager.setText("Quản lý");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Vị trí");

        dateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bdField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(staff)
                                                .addGap(38, 38, 38)
                                                .addComponent(manager)))
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateField))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cfpwField))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(staff)
                            .addComponent(manager, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(bdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cfpwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEmpBtnActionPerformed
        code = codeField.getText();
        name = nameField.getText();
        bd = bdField.getText();
        address = addressField.getText();
        email = mailField.getText();
        phone = phoneField.getText();
        date = dateField.getText();
        String sSalary = salaryField.getText();
        salary = Integer.parseInt(sSalary);
        role = (staff.isSelected()) ? staff.getText() : manager.getText();
        user = userField.getText();
        pw = new String(pwField.getPassword());
        rePw = new String(cfpwField.getPassword());
        
        StringBuilder sb = new StringBuilder();
        if (code.equals("")){
            sb.append("Ma nhan vien is empty!\n");
        }
        if (name.equals("")){
            sb.append("Ten nhan vien is empty!\n");
        }
        if (bd.equals("")){
            sb.append("Ngay sinh nhan vien is empty!\n");
        }
        if (address.equals("")){
            sb.append("Dia chi is empty!\n");
        }
        if (email.equals("")){
            sb.append("Email is empty!\n");
        }
        if (phone.equals("")){
            sb.append("SDT is empty!\n");
        }
        if (date.equals("")){
            sb.append("Ngay vao lam is empty!\n");
        }
        if (sSalary.equals("")){
            sb.append("Luong nhan vien is empty!\n");
        }
        if (user.equals("")){
            sb.append("Tai khoan is empty!\n");
        }
        if (pw.equals("")){
            sb.append("Mat khau is empty!\n");
        }
        if (rePw.equals("")){
            sb.append("Nhap lai mat khau is empty!\n");
        }
        if (!(rePw.equals(pw))){
            SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, "Mat khau khong trung khop", "Invalidation", JOptionPane.ERROR_MESSAGE);
        });

        }
        if (sb.length() > 0){
                    SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
        });
        }
//        Tạo id tự động cho Account
        String maxIdAccount = AccountDAO.getInstance().getMaxIdFromDatabase();
        if(maxIdAccount == null){
            maxIdAccount = "0";
        }
        int newIdAccount = Integer.parseInt(maxIdAccount) + 1;
        String newStringIdAcc = String.format("%04d", newIdAccount);
//        Tao emp va account
        System.out.println(newStringIdAcc);
        Employee employee = new Employee(code, name, bd, address, email, phone, date, role, salary, "None",newStringIdAcc);
        Account account = new Account(newStringIdAcc, user, pw, role);
        boolean check = EmployeeDAO.getInstance().isExistedID(code);
        if (check){
            if (isUpdate){
                int updateAcc = AccountDAO.getInstance().update(account);
                int updateEmp = EmployeeDAO.getInstance().update(employee);
                
                ManagerForm.updateEmpTable();
            }
            else{
                JOptionPane.showMessageDialog(this, "Ma nhan vien da duoc su dung!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            System.out.println(employee);
            System.out.println(account);
            int createAcc = AccountDAO.getInstance().insert(account);
            int createEmp = EmployeeDAO.getInstance().insert(employee);
            
            JOptionPane.showMessageDialog(this, "Register successfully!");
            if (isUpdate){
//                ManagerForm.replaceRowToServiceTable(getRow(),this.row);
                ManagerForm.updateEmpTable();
            }
            else {
                ManagerForm.addRowToEmpTable(getRow());
            }
        }
        dispose();
       
    }//GEN-LAST:event_submitEmpBtnActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffActionPerformed

    private void cfpwFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfpwFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfpwFieldActionPerformed

    private void pwFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField bdField;
    private javax.swing.ButtonGroup btng;
    private javax.swing.JPasswordField cfpwField;
    private javax.swing.JTextField codeField;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailField;
    private javax.swing.JRadioButton manager;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JRadioButton staff;
    private javax.swing.JButton submitEmpBtn;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
