/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas9;

import Tugas8.*;
import Tugas7.*;
import Tugas6.*;
import Tugas5.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leorl
 */
public class GUI_ParkirMobil extends javax.swing.JFrame {
    
    private DefaultTableModel model;

    public GUI_ParkirMobil() {
      initComponents();
        
        // Inisialisasi model untuk JTable dengan kolom terpisah
        model = new DefaultTableModel();
        model.addColumn("Nama Pemilik");
        model.addColumn("Plat Nomor");
        model.addColumn("Jenis");
        model.addColumn("Merk");
        model.addColumn("Lama (Jam)");
        model.addColumn("Denda");
        model.addColumn("Total Biaya");
        model.addColumn("Status Parkir");
        tableParkir.setModel(model);
    }

    // Method untuk membersihkan form
    private void batal() {
       txtNama.setText("");
        txtPlat.setText("");
        txtMerk.setText("");
        txtLamaParkir.setText("");
        cmbPilihKendaraan.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtPlat = new javax.swing.JTextField();
        txtLamaParkir = new javax.swing.JTextField();
        cmbPilihKendaraan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParkir = new javax.swing.JTable();
        btnSimpan = new javax.swing.JToggleButton();
        btnHapus = new javax.swing.JToggleButton();
        btnBatal = new javax.swing.JToggleButton();
        btnClose = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistem Parkir Terpadu");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("Merk Mobil");

        jLabel4.setText("Plat Nomor");

        jLabel5.setText("Lama Parkir");

        txtMerk.addActionListener(this::txtMerkActionPerformed);

        txtPlat.addActionListener(this::txtPlatActionPerformed);

        txtLamaParkir.addActionListener(this::txtLamaParkirActionPerformed);

        cmbPilihKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kendaraan Standart", "Kendaraan Listrik", " " }));

        tableParkir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Lengkap", "Jenis Kendaraan", "Merk Mobil", "Plat Nomor", "Lama Parkir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableParkir);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnBatal.setText("Batal");
        btnBatal.addActionListener(this::btnBatalActionPerformed);

        btnClose.setText("Close");
        btnClose.addActionListener(this::btnCloseActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbPilihKendaraan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPilihKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal)
                    .addComponent(btnClose)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

    private void txtPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatActionPerformed

    private void txtLamaParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLamaParkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLamaParkirActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
 try {
        String nama = txtNama.getText();
        String merk = txtMerk.getText();
        String plat = txtPlat.getText();

        if (nama.isEmpty() || merk.isEmpty() || plat.isEmpty() || txtLamaParkir.getText().isEmpty()) {
            throw new IllegalArgumentException("Semua data wajib diisi!");
        }

        int lama = Integer.parseInt(txtLamaParkir.getText());

        if (lama <= 0) {
            throw new IllegalArgumentException("Lama parkir harus lebih dari 0 jam!");
        }

        int totalBiaya = 0;
        String infoJenis = "";
        String statusDenda = "-";

        // UPCASTING
        Kendaraan k;

        if (cmbPilihKendaraan.getSelectedIndex() == 0) {
            k = new ParkirMobil(nama, plat, merk);
            infoJenis = "Kendaraan Standart";

            int denda = 50000;
            totalBiaya = k.hitungBiaya(lama, denda);
            statusDenda = "Rp " + denda;

            JOptionPane.showMessageDialog(this,
                    "PERINGATAN: Kendaraan standart terkena denda karena parkir di zona khusus mobil listrik!",
                    "Pelanggaran Zona",
                    JOptionPane.WARNING_MESSAGE);

        } else if (cmbPilihKendaraan.getSelectedIndex() == 1) {
            k = new MobilElektrik(nama, plat, merk);
            infoJenis = "Kendaraan Listrik";

            totalBiaya = k.hitungBiaya(lama);
            statusDenda = "-";

        } else {
            throw new IllegalArgumentException("Pilih jenis kendaraan terlebih dahulu!");
        }

        model.addRow(new Object[]{
    k.getNamaPemilik(),
    k.getNomorPlat(),
    infoJenis,
    k.getMerk(),
    lama,
    statusDenda,
    "Rp " + totalBiaya,
    ((StatusParkir) k).tampilStatus()
});

        JOptionPane.showMessageDialog(this,
                "Data parkir berhasil disimpan!",
                "Informasi",
                JOptionPane.INFORMATION_MESSAGE);

        batal();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Pastikan lama parkir diisi dengan angka!",
                "Input Error",
                JOptionPane.WARNING_MESSAGE);

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this,
                e.getMessage(),
                "Input Error",
                JOptionPane.WARNING_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Terjadi kesalahan: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    
        }    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     int baris = tableParkir.getSelectedRow();
        if (baris >= 0) {
            model.removeRow(baris); // Hapus baris yang dipilih
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data di tabel terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
     batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    dispose(); // Menutup window aplikasi
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI_ParkirMobil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new GUI_ParkirMobil().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBatal;
    private javax.swing.JToggleButton btnClose;
    private javax.swing.JToggleButton btnHapus;
    private javax.swing.JToggleButton btnSimpan;
    private javax.swing.JComboBox<String> cmbPilihKendaraan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableParkir;
    private javax.swing.JTextField txtLamaParkir;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPlat;
    // End of variables declaration//GEN-END:variables
}
