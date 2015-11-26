/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author PhiLong
 */
public class DialogEditHuman extends javax.swing.JDialog {

    File f;
    int id;
    Image img;

    /**
     * Creates new form ReplaceHumanForm
     *
     * @param parent
     * @param modal
     */
    public DialogEditHuman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initRoom();
        initHuman();

        initCompoundBorder();
    }

    public final void initCompoundBorder() {
        txtBirthPlace.setBorder(ToolsDesign.comboundBorderAll());
        txtEmail.setBorder(ToolsDesign.comboundBorderAll());
        txtIDCard.setBorder(ToolsDesign.comboundBorderAll());
        txtNation.setBorder(ToolsDesign.comboundBorderAll());
        txtNativeCountry.setBorder(ToolsDesign.comboundBorderAll());
        txtOccupation.setBorder(ToolsDesign.comboundBorderAll());
        txtReligion.setBorder(ToolsDesign.comboundBorderAll());
//        cbbR.setBorder(ToolsDesign.comboundBorderAll());
        txtUserName.setBorder(ToolsDesign.comboundBorderAll());
        txtWorkPlace.setBorder(ToolsDesign.comboundBorderAll());
        lblImage.setBorder(ToolsDesign.compoundBorderLabel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new org.jdesktop.swingx.JXButton();
        btnExit = new org.jdesktop.swingx.JXButton();
        jPanel2 = new javax.swing.JPanel();
        txtIDCard = new javax.swing.JTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        txtNativeCountry = new javax.swing.JTextField();
        txtWorkPlace = new javax.swing.JTextField();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        btnFemale = new javax.swing.JRadioButton();
        lblImage = new org.jdesktop.swingx.JXLabel();
        txtArrivalDate = new org.jdesktop.swingx.JXDatePicker();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        txtEmail = new javax.swing.JTextField();
        txtNation = new javax.swing.JTextField();
        txtBirthPlace = new javax.swing.JTextField();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        btnMale = new javax.swing.JRadioButton();
        txtReligion = new javax.swing.JTextField();
        txtBirthDay = new org.jdesktop.swingx.JXDatePicker();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        txtUserName = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        btnBrowser = new org.jdesktop.swingx.JXButton();
        cbbRoom = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setBorder(null);
        btnSave.setText(" Lưu ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setBorder(null);
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExit, btnSave});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtIDCard.setText("9999999999999");
        txtIDCard.setToolTipText("Please enter your username");

        jXLabel7.setText("Quốc tịch");

        jXLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jXLabel11.setText("Số CMND");

        txtNativeCountry.setText("Kinh");
        txtNativeCountry.setToolTipText("Please enter your username");

        txtWorkPlace.setText("Ha Noi");
        txtWorkPlace.setToolTipText("Please enter your username");

        jXLabel6.setText("Dân tộc");

        btngGender.add(btnFemale);
        btnFemale.setText(" Nữ");
        btnFemale.setOpaque(false);

        lblImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtArrivalDate.setDate(new java.util.Date(1447606800000L));

        jXLabel1.setText("Họ tên");

        jXLabel15.setText("Email");

        jXLabel12.setText("Ngày đến");

        txtEmail.setText("thutuongchinhphu@hotmail.com");
        txtEmail.setToolTipText("Please enter your username");

        txtNation.setText("VietNam");
        txtNation.setToolTipText("Please enter your username");

        txtBirthPlace.setText("Sai Gon");
        txtBirthPlace.setToolTipText("Please enter your username");

        jXLabel5.setText("Nơi sinh");

        jXLabel4.setText("Giới tính");

        jXLabel14.setText("Ảnh");

        jXLabel13.setText("Phòng");

        btngGender.add(btnMale);
        btnMale.setText(" Nam");
        btnMale.setOpaque(false);
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        txtReligion.setText("Khong");
        txtReligion.setToolTipText("Please enter your username");
        txtReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReligionActionPerformed(evt);
            }
        });

        txtBirthDay.setDate(new java.util.Date(1447606800000L));
        txtBirthDay.setName(""); // NOI18N

        jXLabel8.setText("Tôn giáo");

        jXLabel3.setText("Ngày sinh");

        jXLabel10.setText("Nơi làm việc");

        txtUserName.setToolTipText("Please enter your username");
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtOccupation.setText("Thu Tuong");
        txtOccupation.setToolTipText("Please enter your username");

        jXLabel9.setText("Nghề nghiệp");

        btnBrowser.setBackground(new java.awt.Color(204, 204, 204));
        btnBrowser.setBorder(null);
        btnBrowser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/attachment.png"))); // NOI18N
        btnBrowser.setOpaque(false);
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        cbbRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBirthPlace)
                                .addComponent(txtNation)
                                .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBirthDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMale)
                            .addGap(30, 30, 30)
                            .addComponent(btnFemale))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtWorkPlace)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jXLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtIDCard)
                                    .addComponent(txtNativeCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFemale)
                            .addComponent(btnMale)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNativeCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbbRoom, txtOccupation});

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void txtReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReligionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReligionActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sql = "UPDATE tblHuman SET Name = ?, Birthday = ?, Gender = ?, "
                + "Birthplace = ?, [Native Country] = ?, Nation = ?, "
                + "Religion = ?,Occupation = ?,WorkPlace = ?,[ID Card] = ?, "
                + "[Date of arrival] = ?, Image = ?, RoomID = ?, Email = ? WHERE id = ?";
        Connection cn = Tools.getConn();
        try {
            cn.setAutoCommit(false);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtUserName.getText().trim());
            pst.setDate(2, new Date(txtBirthDay.getDate().getTime()));
            if (btnMale.isSelected()) {
                pst.setInt(3, 1);
            } else {
                pst.setInt(3, 0);
            }
            pst.setString(4, txtBirthPlace.getText().trim());
            pst.setString(5, txtNativeCountry.getText().trim());
            pst.setString(6, txtNation.getText().trim());
            pst.setString(7, txtReligion.getText().trim());
            pst.setString(8, txtOccupation.getText().trim());
            pst.setString(9, txtWorkPlace.getText().trim());
            pst.setString(10, txtIDCard.getText().trim());
            pst.setDate(11, new Date(txtArrivalDate.getDate().getTime()));
            InputStream image = null;
            if (f != null) {
                image = new FileInputStream(f);
            }
            pst.setBinaryStream(12, image);
            ///
            ModalRoom1 mr = (ModalRoom1) cbbRoom.getSelectedItem();
            pst.setInt(13, mr.getId());
            pst.setString(14, txtEmail.getText().trim());
            pst.setInt(15, ShareData.getInstance().getCurrentHumanID());
            pst.executeUpdate();
            cn.commit();
            cn.setAutoCommit(true);
//            JOptionPane.showMessageDialog(null, "Sửa thành công", "Thành công",
//                            JOptionPane.INFORMATION_MESSAGE, 
//                            new ImageIcon(getClass().getResource("/image/checkbox-marked-circle.png")));
            // Gọi OptionPane bằng ToolPopup
            ToolsPopup.showSuccessPopup("Sửa thành công");
            ShareData.getInstance().getPpd().initPeopleDetail(null);
            ShareData.getInstance().getPpd().initWidthTable();
            ShareData.getInstance().getPpd().initCellAlign();
            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(DialogEditHuman.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DialogEditHuman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new ImageFilter());
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                f = fileChooser.getSelectedFile();
                img = ImageIO.read(f);
                lblImage.setIcon(
                        new ImageIcon(img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH)));
            } catch (IOException ex) {
                Logger.getLogger(DialogEditHuman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBrowserActionPerformed

    final void initHuman() {
        String sql = "SELECT * FROM tblHuman where id = ?";
        try (
                Connection cn = Tools.getConn();
                PreparedStatement pst = cn.prepareStatement(sql);) {
            pst.setInt(1, ShareData.getInstance().getCurrentHumanID());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtUserName.setText(rs.getString(2));
                txtBirthDay.setDate(rs.getDate(3));
                if (rs.getInt(4) == 1) {
                    btnMale.setSelected(true);
                } else {
                    btnFemale.setSelected(true);
                }
                txtBirthPlace.setText(rs.getString(5));
                txtNativeCountry.setText(rs.getString(6));
                txtNation.setText(rs.getString(7));
                txtReligion.setText(rs.getString(8));
                txtOccupation.setText(rs.getString(9));
                txtWorkPlace.setText(rs.getString(10));
                txtIDCard.setText(rs.getString(11));
                txtArrivalDate.setDate(rs.getDate(12));
                InputStream is = rs.getBinaryStream(13);
                System.out.println(is);
                if (is != null) {
                    Image image = ImageIO.read(is);
                    img = image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
                    lblImage.setIcon(new ImageIcon(img));
                }

                int roomID = rs.getInt(14);
                System.out.println("ROOM ID: " + roomID);
                for (int i = 0; i < cbbRoom.getItemCount(); i++) {
                    System.out.println("ITEMCOUNT: " + cbbRoom.getItemCount());
                    ModalRoom1 mr = (ModalRoom1) cbbRoom.getItemAt(i);
                    System.out.println("TEST0-----------------------");
                    if (mr.getId() == roomID) {
                        System.out.println("CM.getID: " + mr.getId());
                        cbbRoom.setSelectedIndex(i);
                        break;
                    }
                }
                txtEmail.setText(rs.getString(15));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogEditHuman.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DialogEditHuman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    final void initRoom() {
        cbbRoom.removeAllItems();
        String sql = "SELECT * FROM tblRoom";
        try (Connection cn = Tools.getConn();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            DefaultComboBoxModel dcm = new DefaultComboBoxModel();

            while (rs.next()) {
                int id = rs.getInt(1);
                String room = rs.getString(2);
                dcm.addElement(new ModalRoom1(id, room));
                cbbRoom.setModel(dcm);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PanelRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnBrowser;
    private org.jdesktop.swingx.JXButton btnExit;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private org.jdesktop.swingx.JXButton btnSave;
    private javax.swing.ButtonGroup btngGender;
    private javax.swing.JComboBox cbbRoom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXLabel lblImage;
    private org.jdesktop.swingx.JXDatePicker txtArrivalDate;
    private org.jdesktop.swingx.JXDatePicker txtBirthDay;
    private javax.swing.JTextField txtBirthPlace;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtNation;
    private javax.swing.JTextField txtNativeCountry;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtReligion;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtWorkPlace;
    // End of variables declaration//GEN-END:variables
}
