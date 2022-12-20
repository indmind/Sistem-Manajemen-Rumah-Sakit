/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kel2.ti2a.sistemrumahsakit.ui.admin;

import kel2.ti2a.sistemrumahsakit.data.model.Pasien;
import kel2.ti2a.sistemrumahsakit.data.model.PasienAsuransi;
import kel2.ti2a.sistemrumahsakit.data.model.PasienBpjs;
import kel2.ti2a.sistemrumahsakit.data.model.PasienUmum;

/**
 *
 * @author tioirawan
 */
public class PendaftaranPasienBaru extends javax.swing.JFrame {

    /**
     * Creates new form PendaftaranPasienBaru
     */
    public PendaftaranPasienBaru() {
        initComponents();
        
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        asuransiField.setVisible(false);
        noAsuransiField.setVisible(false);
        noBPJSField.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jenisComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        radioPerempuan = new javax.swing.JRadioButton();
        radioLaki = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tglLahirField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        noKtp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatField = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        asuransiField = new javax.swing.JTextField();
        noAsuransiField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        noBPJSField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Jenis Pasien");

        jenisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BPJS", "Asuransi", "Umum", " " }));
        jenisComboBox.setSelectedIndex(2);
        jenisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        radioPerempuan.setText("Perempuan");
        radioPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPerempuanActionPerformed(evt);
            }
        });

        radioLaki.setText("Laki-laki");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Tanggal lahir");

        jLabel6.setText("No. KTP");

        noKtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noKtpActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        alamatField.setColumns(20);
        alamatField.setRows(5);
        jScrollPane1.setViewportView(alamatField);

        jLabel8.setText("No Asuransi");

        jLabel9.setText("Nama Asuransi");

        asuransiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asuransiFieldActionPerformed(evt);
            }
        });

        noAsuransiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noAsuransiFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("No BPJS");

        noBPJSField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBPJSFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        jLabel11.setText("Pendaftaran Pasien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(359, 359, 359))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jenisComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(radioPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tglLahirField)
                                        .addComponent(namaField)
                                        .addComponent(noKtp)
                                        .addComponent(asuransiField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(noAsuransiField)
                                        .addComponent(noBPJSField)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(radioPerempuan)
                            .addComponent(radioLaki))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tglLahirField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(noKtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jenisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(asuransiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(noAsuransiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(noBPJSField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AdministrasiForm form = new AdministrasiForm();

        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void noKtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noKtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noKtpActionPerformed

    private void radioPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPerempuanActionPerformed

    private void asuransiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asuransiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asuransiFieldActionPerformed

    private void jenisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisComboBoxActionPerformed
        // TODO add your handling code here:
        String value = jenisComboBox.getSelectedItem().toString();
        if (value.equals("BPJS")) {
            jLabel10.setVisible(true);
            noBPJSField.setVisible(true);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            asuransiField.setVisible(false);
            noAsuransiField.setVisible(false);
        } else if (value.equals("Asuransi")) {
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            asuransiField.setVisible(true);
            noAsuransiField.setVisible(true);
            jLabel10.setVisible(false);
            noBPJSField.setVisible(false);
        } else{
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            asuransiField.setVisible(false);
            noAsuransiField.setVisible(false);
            noBPJSField.setVisible(false);
        }
    }//GEN-LAST:event_jenisComboBoxActionPerformed

    private void noAsuransiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noAsuransiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noAsuransiFieldActionPerformed

    private void noBPJSFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBPJSFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noBPJSFieldActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
             
        String nama = namaField.getText();
        String jk = "";
        if(radioLaki.isSelected()){
            jk = "L";
        }else{
            jk = "P";
        }
        String tglLahir = tglLahirField.getText();
        String ktp = noKtp.getText();
        String alamat = alamatField.getText();
        String valueJenis = jenisComboBox.getSelectedItem().toString();
        
        if(valueJenis.equalsIgnoreCase("bpjs")){
            String noBpjs = noBPJSField.getText();
            PasienBpjs p = new PasienBpjs();
            p.setNama(nama);
            p.setJenisKelamin(jk);
            p.setTanggalLahir(tglLahir);
            p.setType(valueJenis);
            p.setNoBpjs(noBpjs);
            p.save();
        }else if(valueJenis.equalsIgnoreCase("asuransi")){
            String namaAsuransi = asuransiField.getText();
            String noAsuransi = noAsuransiField.getText();
            PasienAsuransi p = new PasienAsuransi();
            p.setNama(nama);
            p.setJenisKelamin(jk);
            p.setTanggalLahir(tglLahir);
            p.setType(valueJenis);
            p.setNamaAsuransi(namaAsuransi);
            p.setNoAsuransi(noAsuransi);
            p.save();
        }else{
            PasienUmum p = new PasienUmum();
            p.setNama(nama);
            p.setJenisKelamin(jk);
            p.setTanggalLahir(tglLahir);
            p.setType(valueJenis);
            p.setNoKtp(ktp);
            p.save();
        }        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PendaftaranPasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPasienBaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranPasienBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatField;
    private javax.swing.JTextField asuransiField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisComboBox;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField noAsuransiField;
    private javax.swing.JTextField noBPJSField;
    private javax.swing.JTextField noKtp;
    private javax.swing.JRadioButton radioLaki;
    private javax.swing.JRadioButton radioPerempuan;
    private javax.swing.JTextField tglLahirField;
    // End of variables declaration//GEN-END:variables
}
