/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTL_NHOM15;

import BTL_NHOM15.login.DangNhap;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyNhanVien extends javax.swing.JFrame {

    public static ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    ArrayList<NhanVien> listTim = new ArrayList<NhanVien>();
    int dem = -1;
    int vitri;
    String pathFile;
    String duongdananh = "E:\\avatame.png";
    int timeRun = 0;
    boolean xetNext = false;

    public QuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        setForeground(Color.red);
        setTitle("QUAN LY NHAN VIEN");
       
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaNV = new java.awt.TextField();
        txtTen = new java.awt.TextField();
        txtTuoi = new java.awt.TextField();
        txtMail = new java.awt.TextField();
        txtLuong = new java.awt.TextField();
        lblanh = new javax.swing.JLabel();
        btnChonHinh = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnLuuFile = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanVien = new javax.swing.JTable();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSapXepTheoMa = new javax.swing.JButton();
        btnSapXepTheoTen = new javax.swing.JButton();
        btnSapXepTheoTuổi = new javax.swing.JButton();
        btnSapXepTheoEmail = new javax.swing.JButton();
        btnSapXepTheoLuong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlabelTable = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nhập mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nhập tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nhập tuổi");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nhập email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nhập lương");

        txtMaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaNV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMaNV.setName(""); // NOI18N
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        txtTen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblanh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BTL_NHOM15/login/avatasinhvienmacdinh.png"))); // NOI18N
        lblanh.setText("            AVATAR");

        btnChonHinh.setBackground(new java.awt.Color(204, 0, 0));
        btnChonHinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChonHinh.setForeground(new java.awt.Color(255, 255, 255));
        btnChonHinh.setText("Chọn hình");
        btnChonHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonHinhActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 0, 204));
        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnThemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 0, 204));
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.setToolTipText("");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 204));
        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(0, 0, 0));
        btnTim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm nhân viên");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnNhapMoi.setBackground(new java.awt.Color(255, 0, 204));
        btnNhapMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhapMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapMoi.setText("Nhập Mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 0, 204));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnLuuFile.setBackground(new java.awt.Color(255, 0, 204));
        btnLuuFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuuFile.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuFile.setText("Lưu File");
        btnLuuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuFileActionPerformed(evt);
            }
        });

        btnDocFile.setBackground(new java.awt.Color(255, 0, 204));
        btnDocFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDocFile.setForeground(new java.awt.Color(255, 255, 255));
        btnDocFile.setText("Đọc File");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnHienThi.setBackground(new java.awt.Color(255, 0, 204));
        btnHienThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHienThi.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThi.setText("Reset");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        tableNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ và Tên", "Tuổi", "Email", "Lương", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhanVien.setRowHeight(60);
        tableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNhanVien);

        btn2.setBackground(new java.awt.Color(102, 0, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("<<");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 0, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText(">>");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSapXepTheoMa.setBackground(new java.awt.Color(255, 102, 0));
        btnSapXepTheoMa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSapXepTheoMa.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXepTheoMa.setText("Sắp xếp theo mã");
        btnSapXepTheoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoMaActionPerformed(evt);
            }
        });

        btnSapXepTheoTen.setBackground(new java.awt.Color(0, 0, 204));
        btnSapXepTheoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSapXepTheoTen.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXepTheoTen.setText("Sắp xếp theo tên");
        btnSapXepTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoTenActionPerformed(evt);
            }
        });

        btnSapXepTheoTuổi.setBackground(new java.awt.Color(255, 51, 0));
        btnSapXepTheoTuổi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSapXepTheoTuổi.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXepTheoTuổi.setText("Sắp xếp theo tuổi");
        btnSapXepTheoTuổi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoTuổiActionPerformed(evt);
            }
        });

        btnSapXepTheoEmail.setBackground(new java.awt.Color(0, 153, 0));
        btnSapXepTheoEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSapXepTheoEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXepTheoEmail.setText("Sắp xếp theo email");
        btnSapXepTheoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoEmailActionPerformed(evt);
            }
        });

        btnSapXepTheoLuong.setBackground(new java.awt.Color(0, 102, 102));
        btnSapXepTheoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSapXepTheoLuong.setForeground(new java.awt.Color(255, 255, 255));
        btnSapXepTheoLuong.setText("Sắp xếp theo lương");
        btnSapXepTheoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoLuongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(454, 454, 454))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(btn2)
                                        .addGap(26, 26, 26)
                                        .addComponent(btn3)
                                        .addGap(82, 82, 82)
                                        .addComponent(jlabelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(40, 40, 40)))
                                            .addComponent(jLabel3))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addComponent(btnChonHinh))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSapXepTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnSapXepTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSapXepTheoTuổi)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnLuuFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnDocFile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSapXepTheoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSapXepTheoLuong)))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2)
                            .addComponent(btn3)
                            .addComponent(jlabelTable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThem)
                                    .addComponent(btnXoa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSua)
                                    .addComponent(btnHienThi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLuuFile)
                                    .addComponent(btnDocFile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNhapMoi)
                                    .addComponent(btnThoat)))
                            .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnChonHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXepTheoLuong)
                    .addComponent(btnSapXepTheoEmail)
                    .addComponent(btnSapXepTheoTuổi)
                    .addComponent(btnSapXepTheoTen)
                    .addComponent(btnSapXepTheoMa)
                    .addComponent(btnTim))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed

    }//GEN-LAST:event_txtMaNVActionPerformed

    private void btnChonHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonHinhActionPerformed

         duongdananh = ChonFile();
        lblanh.setIcon(SelectImage(duongdananh));
    }//GEN-LAST:event_btnChonHinhActionPerformed
 private String ChonFile() {
        String duongDan = "";
        JFileChooser c = new JFileChooser();
        int val = c.showOpenDialog(null);
        if (val == JFileChooser.APPROVE_OPTION) {
            String tenFile = c.getSelectedFile().getName();
            String tenODia = c.getCurrentDirectory().toString();
            duongDan = tenODia + "\\" + tenFile;
            JOptionPane.showMessageDialog(this, "Chọn File thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn File nào!!");
        }
        return duongDan;
    }
    private ImageIcon SelectImage(String path) {
        ImageIcon MyImage = new ImageIcon(path);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblanh.getWidth(), lblanh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void btnThemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnThemAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemAncestorAdded

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            String loiSo = "(^-)*\\d+(.\\d+)*";
            String loiEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            if (txtMaNV.getText().equals("") || txtTen.getText().equals("") || txtTuoi.getText().equals("") || txtMail.getText().equals("") || txtLuong.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui Lòng Điền Đầy Đủ Thông Tin");
            } else if (txtTen.getText().matches(loiSo) == true) {
                JOptionPane.showMessageDialog(this, "Tên nhân viên không được nhập số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtTen.setBackground(Color.RED);
            } else if (txtTuoi.getText().matches(loiSo) == false) {
                JOptionPane.showMessageDialog(this, "Tuổi nhân viên không được nhập ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtTuoi.setBackground(Color.RED);
            } else if (txtMail.getText().matches(loiEmail) == false) {
                JOptionPane.showMessageDialog(this, "Email bạn nhập chưa hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtMail.setBackground(Color.RED);
            } else if (txtLuong.getText().matches(loiSo) == false) {
                JOptionPane.showMessageDialog(this, "Lương chỉ được nhập số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtLuong.setBackground(Color.RED);
            } else if (kiemTraTrung(txtMaNV.getText()) == true) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên không được trùng", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtMaNV.setBackground(Color.RED);
            } else if (kiemTraTuoi(Integer.parseInt(txtTuoi.getText())) == true) {
                JOptionPane.showMessageDialog(this, "Tuổi Phải Từ 16 Đến 55", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtTuoi.setBackground(Color.RED);
            } else if (kiemTraLuong(Double.parseDouble(txtLuong.getText())) == true) {
                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 5 triệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                txtLuong.setBackground(Color.RED);
            } else {
                txtMaNV.setBackground(null);
                txtLuong.setBackground(null);
                txtMail.setBackground(null);
                txtTuoi.setBackground(null);
                txtTen.setBackground(null);
                themNhanVien();
                filltable();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi 1 : " + e, "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed
 public void themNhanVien() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText().toString());
        nv.setTenNV(txtTen.getText().toString());
        nv.setTuoi(Integer.parseInt(txtTuoi.getText().toString()));
        nv.setEmail(txtMail.getText().toString());
        nv.setLuong(Double.parseDouble(txtLuong.getText().toString()));
        nv.setAnh(duongdananh);
        list.add(nv);
    }

    public void filltable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableNhanVien.getModel();
        defaultTableModel.setRowCount(0);
        for (NhanVien nv : list) {
             Locale locale=new Locale("vi","VN");
             NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
             Object[] row = new Object[]{nv.getMaNV(), nv.getTenNV(), nv.getTuoi(), nv.getEmail(), numberFormat.format(nv.getLuong()), nv.getAnh()}; 
             defaultTableModel.addRow(row);
        }

    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        if (tableNhanVien.getSelectedRow() >= 0) {
            suaNhanVien();
            filltable();
        } else {
            JOptionPane.showMessageDialog(this, "chọn tên người cập nhật trên bảng");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    public void suaNhanVien() {
        int dongTable = tableNhanVien.getSelectedRow();
        NhanVien nv = list.get(dongTable);
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTen.getText());
        nv.setTuoi(Integer.parseInt(txtTuoi.getText()));
        nv.setEmail(txtMail.getText().toString());
        nv.setLuong(Double.parseDouble(txtLuong.getText().toString()));
        nv.setAnh(duongdananh);

    }

   

    public boolean kiemTraLuong(Double luong) {
        boolean check = false;
        if (luong < 5000000) {
            check = true;
        }
        return check;
    }

    public boolean kiemTraTuoi(int tuoi) {
        boolean check = false;
        if (tuoi < 15 || tuoi > 55) {
            check = true;
        }
        return check;
    }

    public boolean kiemTraTrung(String maNhanVien) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaNV().equalsIgnoreCase(maNhanVien)) {
                check = true;
            }
        }
        return check;
    }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Bạn Chắc Muốn Xóa Chứ", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
        tableNhanVien.getSelectedRow();
        if (input == 0) {
            list.remove(tableNhanVien.getSelectedRow());
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableNhanVien.getModel();
            defaultTableModel.setRowCount(0);
            for (NhanVien nhanVien : list) {
                Object[] row = new Object[]{
                    nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getTuoi(), nhanVien.getEmail(), nhanVien.getLuong(), nhanVien.getAnh()
                };
                defaultTableModel.addRow(row);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        DialogTim dailog = new DialogTim();
        dailog.setVisible(true);
        dailog.setOnSearchEvent(new DialogTim.OnSearchEvent() {
            @Override
            public void onSearch(String value) {
                listTim.clear();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMaNV().startsWith(value) == true || list.get(i).getTenNV().startsWith(value) == true || list.get(i).getEmail().startsWith(value) == true || String.valueOf(list.get(i).getTuoi()).startsWith(value) == true || String.valueOf(list.get(i).getLuong()).startsWith(value) == true) {
                        NhanVien nv1 = new NhanVien();
                        nv1.setMaNV(list.get(i).getMaNV());
                        nv1.setTenNV(list.get(i).getTenNV());
                        nv1.setTuoi(list.get(i).getTuoi());
                        nv1.setEmail(list.get(i).getEmail());
                        nv1.setLuong(list.get(i).getLuong());
                        nv1.setAnh(duongdananh);
                        listTim.add(nv1);
                    }
                }
                filltableTim();
            }
        });
    }//GEN-LAST:event_btnTimActionPerformed
    public void filltableTim() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableNhanVien.getModel();
        defaultTableModel.setRowCount(0);
         for (NhanVien nv : listTim) {
             Locale locale=new Locale("vi","VN");
             NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
             Object[] row = new Object[]{nv.getMaNV(), nv.getTenNV(), nv.getTuoi(), nv.getEmail(), numberFormat.format(nv.getLuong()), nv.getAnh()}; 
             defaultTableModel.addRow(row);
        }
    }
    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        txtMaNV.setText("");
        txtTen.setText("");
        txtTuoi.setText("");
        txtMail.setText("");
        txtLuong.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int diaLog = JOptionPane.YES_NO_OPTION;
        int diaLogResult = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình?", "Warring", diaLog);
        if (diaLogResult == JOptionPane.YES_OPTION) {
            DangNhap dangNhap = new DangNhap();
            dangNhap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnLuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuFileActionPerformed
        try {
            FileOutputStream fos = new FileOutputStream("E:\\NhanVien.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(list);
            ois.close();
            JOptionPane.showMessageDialog(this, "Lưu File Thành Công");
            return;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi : " + ex);
        }
    }//GEN-LAST:event_btnLuuFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        try {
            FileInputStream fis = new FileInputStream("E:\\NhanVien.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<NhanVien>) ois.readObject();
            for (NhanVien nhanVien : list) {
                filltable();
                ois.close();
                fis.close();
            }
            JOptionPane.showMessageDialog(this, "Đọc File Thành Công");
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi : " + ex);
        }
    }//GEN-LAST:event_btnDocFileActionPerformed

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed

        hienthi();
        filltable();
    }//GEN-LAST:event_btnHienThiActionPerformed
    boolean search = false;
    private void tableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhanVienMouseClicked

        int viTri = tableNhanVien.getSelectedRow();
        lblanh.setIcon(ResizeImage(String.valueOf(tableNhanVien.getValueAt(viTri, 5))));
        if (!search) {
            HienThiNhanVien(list.get(viTri));
        } else {
            HienThiNhanVien(listTim.get(viTri));
        }
    }//GEN-LAST:event_tableNhanVienMouseClicked
      public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblanh.getWidth(), lblanh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void HienThiNhanVien(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTen.setText(nv.getTenNV());
        int tuoi1 = nv.getTuoi();
        txtTuoi.setText(String.valueOf(tuoi1));
        txtMail.setText(nv.getEmail());
        double luong1 = (nv.getLuong());
        txtLuong.setText(String.valueOf(luong1));
        lblanh.setText(nv.getAnh());
    }

  
    public void hienthi() {
        try {

            DefaultTableModel defaultTableModel = (DefaultTableModel) tableNhanVien.getModel();
            defaultTableModel.setRowCount(0);
            for (NhanVien nv : list) {
                Object[] row = new Object[]{
                    nv.getMaNV(), nv.getTenNV(), nv.getLuong(), nv.getTuoi(), nv.getEmail(), nv.getLuong()
                };
                defaultTableModel.addRow(row);
            }
        } catch (Exception e) {
        }
    }
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        try {
            dem = tableNhanVien.getSelectedRow();
            dem--;
            if (dem == list.size()) {
                dem = 0;
            }
            tableNhanVien.setRowSelectionInterval(dem, dem);
            tableNhanVienMouseClicked(null);
            show(dem);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btn2ActionPerformed
    public void show(int i) {
        txtMaNV.setText(String.valueOf(tableNhanVien.getValueAt(i, 0)));
        txtTen.setText(String.valueOf(tableNhanVien.getValueAt(i, 1)));
        int tuoi = Integer.parseInt(tableNhanVien.getValueAt(i, 2).toString());
        txtTuoi.setText(String.valueOf(tuoi));
        txtMail.setText(String.valueOf(tableNhanVien.getValueAt(i, 3)));
        double luong = Double.parseDouble(tableNhanVien.getValueAt(i, 4).toString());
        txtLuong.setText(String.valueOf(luong));
        lblanh.setText(String.valueOf(tableNhanVien.getValueAt(i, 5)));
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

      try {
            dem = tableNhanVien.getSelectedRow();
            dem++;
          if (dem == list.size()) {
                dem = 0;
           }
            tableNhanVien.setRowSelectionInterval(dem, dem);
              tableNhanVienMouseClicked(null);
          show(dem);
          
        } catch (Exception ex) {

        }
        

    }//GEN-LAST:event_btn3ActionPerformed
  
    private void btnSapXepTheoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoMaActionPerformed
        // TODO add your handling code here:
        Comparator<NhanVien> sx = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getMaNV().compareTo(o2.getMaNV());
            }
        };
        Collections.sort(list, sx);
        filltable();
    }//GEN-LAST:event_btnSapXepTheoMaActionPerformed

    private void btnSapXepTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoTenActionPerformed
        // TODO add your handling code here:
        Comparator<NhanVien> sx = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTenNV().compareTo(o2.getTenNV());
            }
        };
        Collections.sort(list, sx);
        filltable();
    }//GEN-LAST:event_btnSapXepTheoTenActionPerformed

    private void btnSapXepTheoTuổiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoTuổiActionPerformed
        // TODO add your handling code here:
        Comparator<NhanVien> sx = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {

                double d1 = o1.getTuoi();
                double d2 = o2.getTuoi();
                return Double.compare(d1, d2);

            }
        };
        Collections.sort(list, sx);
        filltable();
    }//GEN-LAST:event_btnSapXepTheoTuổiActionPerformed

    private void btnSapXepTheoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoEmailActionPerformed
        // TODO add your handling code here:
        Comparator<NhanVien> sx = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        };
        Collections.sort(list, sx);
        filltable();
    }//GEN-LAST:event_btnSapXepTheoEmailActionPerformed

    private void btnSapXepTheoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoLuongActionPerformed
        // TODO add your handling code here:
        Comparator<NhanVien> sx = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {

                double d1 = o1.getLuong();
                double d2 = o2.getLuong();
                return Double.compare(d1, d2);

            }
        };
        Collections.sort(list, sx);
        filltable();
    }//GEN-LAST:event_btnSapXepTheoLuongActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        if (DangNhap.xetDangNhap == true) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new QuanLyNhanVien().setVisible(true);
                }
            });
        } else {
            int input = JOptionPane.showConfirmDialog(null, "Xin lỗi bạn ! Bạn cần đăng nhập trước khi sử dụng hệ thống .\n Bạn có muốn đăng nhập hay không ?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
            if (input == 0) {
                DangNhap dangNhap = new DangNhap();
                dangNhap.setVisible(true);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnChonHinh;
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnLuuFile;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSapXepTheoEmail;
    private javax.swing.JButton btnSapXepTheoLuong;
    private javax.swing.JButton btnSapXepTheoMa;
    private javax.swing.JButton btnSapXepTheoTen;
    private javax.swing.JButton btnSapXepTheoTuổi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelTable;
    private javax.swing.JLabel lblanh;
    private javax.swing.JTable tableNhanVien;
    private java.awt.TextField txtLuong;
    private java.awt.TextField txtMaNV;
    private java.awt.TextField txtMail;
    private java.awt.TextField txtTen;
    private java.awt.TextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
