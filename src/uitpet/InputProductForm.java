/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uitpet;

import ClassModel.Product;
import DAOmodel.ProductDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khang
 */
public class InputProductForm extends javax.swing.JFrame {

    /**
     * Creates new form InputServiceForm
     */
    String code="" , name="" ,note="" ,date="";
    int quantity ;
    int inPrice, outPrice;
    boolean isUpdate = false;
    int row;
    public Object[] getRow() {
        return new Object[] { code , name  , quantity, inPrice,outPrice,note, date };
    }
    
    public InputProductForm(String pCode, String pName,int pQuantity, long inPrice, long outPrice, String pNote, String date,int row) {
        initComponents();
        codeField.setText(pCode);
        nameField.setText(pName);
        quantityField.setValue(pQuantity);
        inPriceField.setText(Long.toString(inPrice));
        outPriceField.setText(Long.toString(outPrice));
        noteField.setText(pNote);
        dateField.setText(date);
        this.row = row;
        title.setText("Cập nhật sản phẩm");
        isUpdate = true;
    }
    
    
    
    public InputProductForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inPriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteField = new javax.swing.JTextArea();
        inputProductSubmitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        codeField = new javax.swing.JTextField();
        quantityField = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        dateField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        outPriceField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Số lượng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Giá nhập");

        inPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPriceFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Ghi chú");

        noteField.setColumns(20);
        noteField.setRows(5);
        jScrollPane1.setViewportView(noteField);

        inputProductSubmitBtn.setBackground(new java.awt.Color(153, 255, 153));
        inputProductSubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputProductSubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        inputProductSubmitBtn.setText("Xác nhận");
        inputProductSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputProductSubmitBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Tên sản phẩm");

        quantityField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Ngày nhập");

        dateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Giá bán");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputProductSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inPriceField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(quantityField)
                            .addComponent(jScrollPane1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(dateField)
                            .addComponent(outPriceField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(inPriceField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(outPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(inputProductSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("THÊM SẢN PHẨM");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPriceFieldActionPerformed

    private void inputProductSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputProductSubmitBtnActionPerformed
         boolean valid = true;
        StringBuilder sb = new StringBuilder();
        code = codeField.getText();
        name = nameField.getText();
        String stringPrice = outPriceField.getText();
        note = noteField.getText();
        if (note.equals("")){
            note = "NONE";
        }
        else {
            note = noteField.getText();
        }
        String stringImportPrice = inPriceField.getText();
        quantity = (int) quantityField.getValue();
        date = dateField.getText();
        note = noteField.getText();
//        Kiểm tra input
        if (code.equals("")){
            sb.append("Ma san pham is empty!\n");
            valid = false;
        }
        if (name.equals("")){
            sb.append("Ten san pham is empty!\n");
            valid = false;
        }
        if (stringPrice.equals("")){
            sb.append("Gia ban is empty!\n");
            valid = false;
        }
        if (stringImportPrice.equals("")){
            sb.append("Gia nhap is empty!\n");
            valid = false;
        }
        if (quantity <= 0){
            valid = false;
            SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, "So luong must larger than 0!", "Invalidation", JOptionPane.ERROR_MESSAGE);
        });

        }
        if (date.equals("")){
            valid = false;
            sb.append("Ngay nhap is empty!\n");
        }       
        if (sb.length() > 0){
                    SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
        });
        }
//        Ep kieu
        
        if (valid == true){
            inPrice = Integer.parseInt(stringImportPrice);
            outPrice = Integer.parseInt(stringPrice);
            Product product = new Product(code, name, outPrice, note, inPrice, quantity, date);
            boolean productCheck = ProductDAO.getInstance().isExistedID(code);
            System.out.println(productCheck);
            if (productCheck == true){
                if (isUpdate){
                    int updatePro = ProductDAO.getInstance().update(product);
                    ManagerForm.productArrayOrigin = ProductDAO.getInstance().SelectAll();
                       ManagerForm.productArray = ProductDAO.SelectAvble();
                       ManagerForm.productArrayDel = new ArrayList<>();
                    ManagerForm.updateProductListTable();
                    ManagerForm.updateProductTable();

                }
                else {
                    JOptionPane.showMessageDialog(this, "Ma san pham da duoc su dung!", "Error!", JOptionPane.ERROR_MESSAGE);

                }
            }
            else {
                int createProduct = ProductDAO.getInstance().insert(product);
                JOptionPane.showMessageDialog(this, "Register successfully!");
                if (isUpdate) {
//                    ManagerForm.replaceRowToProductListTable(getRow(),this.row);
                       ManagerForm.updateProductListTable();
                       ManagerForm.productArrayOrigin = ProductDAO.getInstance().SelectAll();
                       ManagerForm.productArray = ProductDAO.SelectAvble();
                       ManagerForm.productArrayDel = new ArrayList<>();
//                       ManagerForm.resetTable();
                        ManagerForm.updateProductTable();
                }
                else {
                    ManagerForm.productArrayOrigin = ProductDAO.getInstance().SelectAll();
                       ManagerForm.productArray = ProductDAO.SelectAvble();
                       ManagerForm.productArrayDel = new ArrayList<>();
                    ManagerForm.updateProductListTable();
//                       ManagerForm.resetTable();
                        ManagerForm.updateProductTable();
                }
            }
            dispose();
        }
        else {
            valid = true;
        }
        
     
    }//GEN-LAST:event_inputProductSubmitBtnActionPerformed


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
            java.util.logging.Logger.getLogger(InputProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeField;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JTextField inPriceField;
    private javax.swing.JButton inputProductSubmitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextArea noteField;
    private javax.swing.JTextField outPriceField;
    private javax.swing.JSpinner quantityField;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
