package Tugas4.Enkapsulasi;

public class GUI_ParkirMobil extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI_ParkirMobil.class.getName());

    public GUI_ParkirMobil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        cmbPilihKendaraan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPlat = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtLamaParkir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoHasil = new javax.swing.JTextArea();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistem Manajemen Parkir Terpadu");
        cmbPilihKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[0] Kendaraan Standar", "[1] Mobil Elektrik" }));
        jLabel2.setText("Jenis Kendaraan");
        jLabel3.setText("Nama Pemilik");
        jLabel4.setText("Nomor Plat");
        jLabel5.setText("Merk Mobil");
        jLabel6.setText("Lama Parkir");

        memoHasil.setColumns(20);
        memoHasil.setRows(5);
        jScrollPane1.setViewportView(memoHasil);

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(this::btnCetakActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbPilihKendaraan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txtLamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCetak)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPilihKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLamaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCetak)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {                                         
        memoHasil.setText(""); // Bersihkan area teks

        try {
            // Jika user memilih Kendaraan Standar (Index 0)
            if(cmbPilihKendaraan.getSelectedIndex() == 0) {
                Kendaraan k = new Kendaraan();
                
                // PENERAPAN ENKAPSULASI: Menggunakan Setter
                k.setNamaPemilik(txtNama.getText());
                k.setNomorPlat(txtPlat.getText());
                
                int lama = Integer.parseInt(txtLamaParkir.getText()); 
                int tarifStandarPerJam = 5000; 
                int dendaPerJam = 30000;       
                
                int totalHarga = lama * tarifStandarPerJam;
                int totalDenda = lama * dendaPerJam;
                int totalBayar = totalHarga + totalDenda;
                
                // PENERAPAN ENKAPSULASI: Menggunakan Getter
                memoHasil.append("TIKET PARKIR STANDAR\n");
                memoHasil.append("--------------------------------------\n");
                memoHasil.append("Nama Pemilik : " + k.getNamaPemilik() + "\n");
                memoHasil.append("Nomor Plat   : " + k.getNomorPlat() + "\n");
                memoHasil.append("Lama Parkir  : " + lama + " jam\n");
                memoHasil.append("Harga Per Jam: Rp " + tarifStandarPerJam + "\n");
                memoHasil.append("Harga Denda  : Rp " + dendaPerJam + "\n");
                
                memoHasil.append("\nPERINGATAN PELANGGARAN ZONA:\n");
                memoHasil.append("Terkena denda dikarenakan parkir di\n");
                memoHasil.append("zona khusus kendaraan listrik roda 4!\n");
                memoHasil.append("Denda        : Rp " + totalDenda + "\n");
                memoHasil.append("--------------------------------------\n");
                memoHasil.append("TOTAL BAYAR  : Rp " + totalBayar + "\n");

            // Jika user memilih Mobil Elektrik (Index 1)
            } else if (cmbPilihKendaraan.getSelectedIndex() == 1) {
                String nama = txtNama.getText();
                String merk = txtMerk.getText();
                String plat = txtPlat.getText();
                int lama = Integer.parseInt(txtLamaParkir.getText());
                
                MobilElektrik mobil = new MobilElektrik(nama, merk, plat, lama);
                
                // PENERAPAN ENKAPSULASI: Menggunakan Getter
                memoHasil.append("TIKET PARKIR ELEKTRIK\n");
                memoHasil.append("--------------------------------------\n");
                memoHasil.append("Nama Pemilik : " + mobil.getNamaPemilik() + "\n");
                memoHasil.append("Merk Mobil   : " + mobil.getMerkMobil() + "\n");
                memoHasil.append("Nomor Plat   : " + mobil.getNomorPlat() + "\n");
                memoHasil.append("Lama Parkir  : " + mobil.getLamaParkir() + " jam\n");
                
                // PERBAIKAN: Memanggil method hitungBiaya() yang benar
                memoHasil.append("Total Biaya  : Rp " + mobil.hitungBiaya() + "\n"); 
                memoHasil.append("--------------------------------------\n");
            }
        } catch (NumberFormatException e) {
            memoHasil.setText("Error: Pastikan Lama Parkir diisi dengan angka bulat!");
        }
    
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new GUI_ParkirMobil().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnCetak;
    private javax.swing.JComboBox<String> cmbPilihKendaraan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memoHasil;
    private javax.swing.JTextField txtLamaParkir;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPlat;
}