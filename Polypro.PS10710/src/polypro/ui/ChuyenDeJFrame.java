/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.ui;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import polypro.dao.ChuyenDeDAO;
import polypro.helper.DialogHelper;
import polypro.helper.ShareHelper;
import polypro.model.ChuyenDe;
import polypro.model.NguoiHoc;

/**
 *
 * @author PC
 */
public class ChuyenDeJFrame extends javax.swing.JFrame {

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    int index = 0;
    DecimalFormat df = new DecimalFormat("0.##");

    /**
     * Creates new form ChuyenDeJFrame
     */
    public ChuyenDeJFrame() {
        initComponents();
        init();
    }

    void back() {
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChuyende = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        txtTenCD = new javax.swing.JTextField();
        txtHocphi = new javax.swing.JTextField();
        txtMaCD = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArena = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnHinh = new javax.swing.JButton();
        txtThoiLuong = new javax.swing.JComboBox<>();
        pnlDanhSach = new javax.swing.JPanel();
        Spator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();
        txtCD = new javax.swing.JTextField();
        lblArrow1 = new javax.swing.JLabel();
        btnSreach = new javax.swing.JButton();
        LogoT = new javax.swing.JLabel();
        TitleTop = new javax.swing.JLabel();
        btnThongke = new javax.swing.JLabel();
        btnQuanly = new javax.swing.JLabel();
        btnHuongdan = new javax.swing.JLabel();
        btnDangxuat = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BGRT = new javax.swing.JLabel();
        BGRB = new javax.swing.JLabel();
        BGLT = new javax.swing.JLabel();
        BGLB = new javax.swing.JLabel();
        BGButton = new javax.swing.JLabel();
        BGLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlChuyende.setBackground(new java.awt.Color(0, 255, 51));
        pnlChuyende.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlChuyende.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        pnlCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        pnlCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenCD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtTenCD.setForeground(new java.awt.Color(0, 0, 255));
        txtTenCD.setBorder(null);
        pnlCapNhat.add(txtTenCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 230, -1));

        txtHocphi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtHocphi.setBorder(null);
        txtHocphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHocphiActionPerformed(evt);
            }
        });
        pnlCapNhat.add(txtHocphi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 230, -1));

        txtMaCD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtMaCD.setForeground(new java.awt.Color(255, 0, 0));
        txtMaCD.setBorder(null);
        txtMaCD.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        pnlCapNhat.add(txtMaCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 230, -1));

        txtArena.setColumns(20);
        txtArena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArena.setRows(5);
        jScrollPane2.setViewportView(txtArena);

        pnlCapNhat.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 480, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã chuyên đề:");
        pnlCapNhat.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên chuyên đề:");
        pnlCapNhat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Học phí:");
        pnlCapNhat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Thời lượng (giờ):");
        pnlCapNhat.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mô tả:");
        pnlCapNhat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        pnlCapNhat.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 72, 230, 10));
        pnlCapNhat.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 230, 10));
        pnlCapNhat.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 230, 10));
        pnlCapNhat.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 230, 10));

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 17.png"))); // NOI18N
        btnThem.setBorder(null);
        btnThem.setContentAreaFilled(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 18.png"))); // NOI18N
        btnSua.setBorder(null);
        btnSua.setContentAreaFilled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 19.png"))); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.setContentAreaFilled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 20.png"))); // NOI18N
        btnMoi.setBorder(null);
        btnMoi.setContentAreaFilled(false);
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 21.png"))); // NOI18N
        btnFirst.setBorder(null);
        btnFirst.setContentAreaFilled(false);
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 22.png"))); // NOI18N
        btnPrev.setBorder(null);
        btnPrev.setContentAreaFilled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 23.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/Rectangle 24.png"))); // NOI18N
        btnLast.setBorder(null);
        btnLast.setContentAreaFilled(false);
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        btnHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHinhActionPerformed(evt);
            }
        });
        pnlCapNhat.add(btnHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 210));

        txtThoiLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtThoiLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "60", "80", "100", "120" }));
        txtThoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoiLuongActionPerformed(evt);
            }
        });
        pnlCapNhat.add(txtThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 230, 30));

        pnlChuyende.addTab("Cập Nhật", pnlCapNhat);

        pnlDanhSach.setBackground(new java.awt.Color(255, 255, 255));
        pnlDanhSach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlDanhSach.add(Spator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 540, 10));

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã CD", "Tên CD", "Học phí", "Thời lượng", "Hình", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChuyenDe.setGridColor(new java.awt.Color(0, 0, 255));
        tblChuyenDe.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChuyenDe);
        if (tblChuyenDe.getColumnModel().getColumnCount() > 0) {
            tblChuyenDe.getColumnModel().getColumn(4).setMinWidth(0);
            tblChuyenDe.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblChuyenDe.getColumnModel().getColumn(4).setMaxWidth(0);
            tblChuyenDe.getColumnModel().getColumn(5).setMinWidth(0);
            tblChuyenDe.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblChuyenDe.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        pnlDanhSach.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 591, 330));

        txtCD.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCD.setText("Nhập mã chuyên đề");
        txtCD.setBorder(null);
        pnlDanhSach.add(txtCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 400, 30));

        lblArrow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/icons8_right_40px.png"))); // NOI18N
        pnlDanhSach.add(lblArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        btnSreach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/NguoiHoc/icons8_search_database_100px.png"))); // NOI18N
        btnSreach.setContentAreaFilled(false);
        btnSreach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSreachActionPerformed(evt);
            }
        });
        pnlDanhSach.add(btnSreach, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -1, -1, 50));

        pnlChuyende.addTab("Danh Sách", pnlDanhSach);

        getContentPane().add(pnlChuyende, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 620, 440));

        LogoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/icons8_java_48px.png"))); // NOI18N
        getContentPane().add(LogoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 100));

        TitleTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/HỆ THỐNG QUẢN LÝ ĐÀO TẠO.png"))); // NOI18N
        getContentPane().add(TitleTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        btnThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 10.png"))); // NOI18N
        btnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongkeMouseClicked(evt);
            }
        });
        getContentPane().add(btnThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, -1));

        btnQuanly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuanly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 6.png"))); // NOI18N
        btnQuanly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnQuanly, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btnHuongdan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 3.png"))); // NOI18N
        btnHuongdan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHuongdan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnDangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 4.png"))); // NOI18N
        btnDangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnDangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/Left.png"))); // NOI18N
        BtnExit.setContentAreaFilled(false);
        BtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 535, 100, 50));

        BGRT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 7.png"))); // NOI18N
        getContentPane().add(BGRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        BGRB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGRB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 8.png"))); // NOI18N
        getContentPane().add(BGRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, 30));

        BGLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 1.png"))); // NOI18N
        BGLT.setToolTipText("");
        getContentPane().add(BGLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BGLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 11.png"))); // NOI18N
        getContentPane().add(BGLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 320, 60));

        BGButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BGButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 9.png"))); // NOI18N
        getContentPane().add(BGButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 390));

        BGLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polypro/icon/img/Main/Rectangle 5.png"))); // NOI18N
        getContentPane().add(BGLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongkeMouseClicked
        // TODO add your handling code here:
        new MainFrame().setEnabled(true);
    }//GEN-LAST:event_btnThongkeMouseClicked

    private void txtHocphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHocphiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHocphiActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (checkMaCD() && checkHP()) {
            insert();
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            if (checkHP()) {
                update();
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Học phí và thời gian học chỉ được nhập số");
        }


    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblChuyenDe.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            index = tblChuyenDe.rowAtPoint(evt.getPoint());
            if (index >= 0) {
                txtMaCD.setEnabled(false);
                edit();
                pnlChuyende.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblChuyenDeMouseClicked

    private void btnHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHinhActionPerformed
        // TODO add your handling code here:
        UploadImage();
    }//GEN-LAST:event_btnHinhActionPerformed

    private void btnSreachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSreachActionPerformed
        // TODO add your handling code here:
        find();
    }//GEN-LAST:event_btnSreachActionPerformed

    private void txtThoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThoiLuongActionPerformed

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
            java.util.logging.Logger.getLogger(ChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenDeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGButton;
    private javax.swing.JLabel BGLB;
    private javax.swing.JLabel BGLT;
    private javax.swing.JLabel BGLogo;
    private javax.swing.JLabel BGRB;
    private javax.swing.JLabel BGRT;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel LogoT;
    private javax.swing.JSeparator Spator2;
    private javax.swing.JLabel TitleTop;
    private javax.swing.JLabel btnDangxuat;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHinh;
    private javax.swing.JLabel btnHuongdan;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel btnQuanly;
    private javax.swing.JButton btnSreach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel btnThongke;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblArrow1;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JTabbedPane pnlChuyende;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextArea txtArena;
    private javax.swing.JTextField txtCD;
    private javax.swing.JTextField txtHocphi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JComboBox<String> txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    void init() {
        load();
        setStatus(true);
        this.setLocationRelativeTo(null);
    }

    void load() {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0);
        try {
            List<ChuyenDe> list = cddao.Select();
            for (ChuyenDe cd : list) {
                Object[] row = {
                    cd.getMaCD(),
                    cd.getTenCD(),
                    (int) cd.getHocPhi(),
                    cd.getThoiLuong(),
                    cd.getHinh(),
                    cd.getMoTa()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Tải dữ liệu thất bại");
        }
    }

    void clear() {
        txtMaCD.setEnabled(true);
        txtMaCD.setText("");
        txtTenCD.setText("");
        txtHocphi.setText("");
        txtThoiLuong.setSelectedIndex(0);
        btnHinh.setIcon(null);
        txtArena.setText("");
        setStatus(true);
    }

    void insert() {
        try {
            ChuyenDe model = getModel();
            cddao.Insert(model);
            load();
            clear();
            DialogHelper.alert(this, "Thêm chuyên đề thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm chuyên đề không thành công");
        }
    }

    void update() {
        try {
            ChuyenDe model = getModel();
            cddao.Update(model);
            load();
            clear();
            DialogHelper.alert(this, "Cập nhật chuyên đề thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật chuyên đề không thành công");
        }
    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn có muốn xoá kháng?")) {
            String ma = txtMaCD.getText();
            if (ma != null) {
                try {
                    cddao.Delete(ma);
                    load();
                    clear();
                    DialogHelper.alert(this, "Xoá thành công!!");
                } catch (Exception e) {
                    DialogHelper.alert(this, "Mã không tồn tại");
                }
            } else {
                DialogHelper.alert(this, "Mã không tồn tại");
            }
        }
    }

    void find() {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0);
        String ma = txtCD.getText();
        try {
            if (ma != null) {
                List<ChuyenDe> list = (List<ChuyenDe>) cddao.findByID(ma);
                for (ChuyenDe cd : list) {
                    Object[] row = {
                        cd.getMaCD(),
                        cd.getTenCD(),
                        cd.getHocPhi(),
                        cd.getThoiLuong(),
                        cd.getHinh(),
                        cd.getMoTa()
                    };
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
        }
    }

    ChuyenDe getModel() {
        ChuyenDe model = new ChuyenDe();
        model.setMaCD(txtMaCD.getText());
        model.setTenCD(txtTenCD.getText());
        model.setHocPhi(Integer.parseInt(txtHocphi.getText()));
        model.setThoiLuong(Integer.parseInt(txtThoiLuong.getSelectedItem().toString()));
        model.setHinh(btnHinh.getToolTipText());
        model.setMoTa(txtArena.getText());
        return model;
    }

    void setModel(ChuyenDe model) {
        txtMaCD.setText(model.getMaCD());
        txtTenCD.setText(model.getTenCD());
        txtHocphi.setText(String.valueOf(df.format(model.getHocPhi())));
        txtThoiLuong.setSelectedItem(String.valueOf(model.getThoiLuong()));
        btnHinh.setToolTipText(model.getHinh());
        if (model.getHinh() != null) {
            btnHinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        } else {
            btnHinh.setIcon(null);
        }
        txtArena.setText(model.getMoTa());
    }

    void setStatus(boolean insertable) {
        btnThem.setEnabled(insertable);
        btnSua.setEnabled(!insertable);
        btnXoa.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblChuyenDe.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }

    void edit() {
        try {
            String macd = (String) tblChuyenDe.getValueAt(this.index, 0);
            ChuyenDe model = cddao.findByID(macd);
            if (model != null) {
                setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void UploadImage() {
        JFileChooser jfile = new JFileChooser();
        jfile.setDialogTitle("Chọn hình chuyên đề");
        if (jfile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jfile.getSelectedFile();
            if (ShareHelper.savelogo(file)) {
                btnHinh.setIcon(ShareHelper.readLogo(file.getName()));
                btnHinh.setToolTipText(file.getName());
            }
        }
    }

    boolean checkMaCD() {
        String ma = txtMaCD.getText();
        ChuyenDe cd = cddao.findByID(ma);
        if (txtCD.getText().length() == 5) {
            if (cd == null) {
                return true;
            } else {
                DialogHelper.alert(this, "Mã đã tồn tại");
                txtCD.requestFocus();
                return false;
            }
        } else {
            DialogHelper.alert(this, "Mã không được để trống và 5 kí tự");
            txtCD.requestFocus();
            return false;
        }
    }

    boolean checkHP() {
        int hp = Integer.parseInt(txtHocphi.getText());
        if (hp >= 0) {
            return true;
        } else {
            DialogHelper.alert(this, "Học phí phải là số dương");
            txtHocphi.requestFocus();
            return false;
        }
    }

//    boolean checkTL() {
//        int tl = Integer.parseInt(txtThoiluong.getText());
//        if (tl >= 0) {
//            return true;
//        }else{
//            DialogHelper.alert(this, "Thời gian học phải là số dương");
//            txtThoiluong.requestFocus();
//            return false;
//        }
//    }
}
