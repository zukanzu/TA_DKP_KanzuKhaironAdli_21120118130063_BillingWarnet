package program.billing.warnet;

/**
 *
 * @author kanzu
 */
public class Frame_billing_warnet extends javax.swing.JFrame {

    /**
     * Creates new form Frame_billing_warnet
     */
    public Frame_billing_warnet() {
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

        labelJudul1 = new javax.swing.JLabel();
        labelJudul2 = new javax.swing.JLabel();
        labelNamaKanzu = new javax.swing.JLabel();
        labelTotalBayar = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        labelHistory = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        labelJenis = new javax.swing.JLabel();
        comboBoxJenis = new javax.swing.JComboBox<>();
        labelBiayaPerJam = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        labelWaktu = new javax.swing.JLabel();
        txtWaktu = new javax.swing.JTextField();
        labelPesanan = new javax.swing.JLabel();
        txtLainnya = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TA PDKP Billing Warnet");
        setBackground(new java.awt.Color(10, 30, 70));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(300, 75));
        setPreferredSize(new java.awt.Dimension(780, 579));
        setResizable(false);
        getContentPane().setLayout(null);

        labelJudul1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        labelJudul1.setForeground(new java.awt.Color(240, 240, 240));
        labelJudul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul1.setText("Program");
        getContentPane().add(labelJudul1);
        labelJudul1.setBounds(50, 20, 290, 80);

        labelJudul2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        labelJudul2.setForeground(new java.awt.Color(240, 240, 240));
        labelJudul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul2.setText("Billing Warnet");
        getContentPane().add(labelJudul2);
        labelJudul2.setBounds(30, 80, 330, 60);

        labelNamaKanzu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelNamaKanzu.setForeground(new java.awt.Color(240, 240, 240));
        labelNamaKanzu.setText("Kanzu Khairon Adli (21120118130063)");
        getContentPane().add(labelNamaKanzu);
        labelNamaKanzu.setBounds(270, 520, 250, 20);

        labelTotalBayar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelTotalBayar.setForeground(new java.awt.Color(240, 240, 240));
        labelTotalBayar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTotalBayar.setLabelFor(txtBayar);
        labelTotalBayar.setText("Total Bayar");
        labelTotalBayar.setName(""); // NOI18N
        getContentPane().add(labelTotalBayar);
        labelTotalBayar.setBounds(70, 210, 220, 40);

        txtBayar.setBackground(new java.awt.Color(51, 51, 51));
        txtBayar.setColumns(1);
        txtBayar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        txtBayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBayar.setAutoscrolls(false);
        txtBayar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 78, 100), 1, true));
        txtBayar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBayar.setDisabledTextColor(new java.awt.Color(204, 51, 0));
        txtBayar.setDoubleBuffered(true);
        txtBayar.setEnabled(false);
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBayar);
        txtBayar.setBounds(70, 250, 220, 60);

        labelHistory.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelHistory.setForeground(new java.awt.Color(240, 240, 240));
        labelHistory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelHistory.setText("Pembayaran Terakhir");
        getContentPane().add(labelHistory);
        labelHistory.setBounds(70, 350, 220, 40);

        txtHistory.setBackground(new java.awt.Color(51, 51, 51));
        txtHistory.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        txtHistory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 78, 100), 1, true));
        txtHistory.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        txtHistory.setEnabled(false);
        txtHistory.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(txtHistory);
        txtHistory.setBounds(70, 390, 220, 50);

        labelJenis.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelJenis.setForeground(new java.awt.Color(255, 255, 255));
        labelJenis.setText("Jenis");
        getContentPane().add(labelJenis);
        labelJenis.setBounds(440, 50, 60, 30);

        comboBoxJenis.setBackground(new java.awt.Color(51, 51, 51));
        comboBoxJenis.setEditable(true);
        comboBoxJenis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        comboBoxJenis.setForeground(new java.awt.Color(240, 240, 240));
        comboBoxJenis.setMaximumRowCount(3);
        comboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Member" }));
        comboBoxJenis.setToolTipText("Pilih Jenis Paket");
        comboBoxJenis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        comboBoxJenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxJenis.setInheritsPopupMenu(true);
        comboBoxJenis.setKeySelectionManager(null);
        comboBoxJenis.setNextFocusableComponent(txtWaktu);
        comboBoxJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxJenisActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxJenis);
        comboBoxJenis.setBounds(440, 80, 290, 40);

        labelBiayaPerJam.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelBiayaPerJam.setForeground(new java.awt.Color(240, 240, 240));
        labelBiayaPerJam.setText("Biaya/Jam                       ...Rupiah");
        getContentPane().add(labelBiayaPerJam);
        labelBiayaPerJam.setBounds(440, 130, 290, 30);

        txtBiaya.setBackground(new java.awt.Color(51, 51, 51));
        txtBiaya.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        txtBiaya.setForeground(new java.awt.Color(240, 240, 240));
        txtBiaya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBiaya.setBorder(null);
        txtBiaya.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        txtBiaya.setEnabled(false);
        txtBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiayaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBiaya);
        txtBiaya.setBounds(440, 160, 290, 50);

        labelWaktu.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelWaktu.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktu.setText("Lama Penggunaan              ...Jam");
        getContentPane().add(labelWaktu);
        labelWaktu.setBounds(440, 220, 290, 30);

        txtWaktu.setBackground(new java.awt.Color(51, 51, 51));
        txtWaktu.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        txtWaktu.setForeground(new java.awt.Color(240, 240, 240));
        txtWaktu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWaktu.setToolTipText("Isi berapa lama penggunaan dalam Jam.");
        txtWaktu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 90, 150), 1, true));
        txtWaktu.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        txtWaktu.setNextFocusableComponent(txtLainnya);
        getContentPane().add(txtWaktu);
        txtWaktu.setBounds(440, 250, 290, 50);
        txtWaktu.getAccessibleContext().setAccessibleName("");
        txtWaktu.getAccessibleContext().setAccessibleDescription("");

        labelPesanan.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        labelPesanan.setForeground(new java.awt.Color(255, 255, 255));
        labelPesanan.setText("Pesanan Lain (Snack)   ...Rupiah");
        getContentPane().add(labelPesanan);
        labelPesanan.setBounds(440, 310, 290, 30);

        txtLainnya.setBackground(new java.awt.Color(51, 51, 51));
        txtLainnya.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        txtLainnya.setForeground(new java.awt.Color(240, 240, 240));
        txtLainnya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLainnya.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 90, 150), 1, true));
        txtLainnya.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        txtLainnya.setNextFocusableComponent(btnHitung);
        getContentPane().add(txtLainnya);
        txtLainnya.setBounds(440, 340, 290, 50);

        btnReset.setBackground(new java.awt.Color(176, 37, 50));
        btnReset.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(240, 240, 240));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setFocusPainted(false);
        btnReset.setNextFocusableComponent(comboBoxJenis);
        btnReset.setSelected(true);
        btnReset.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/program/billing/warnet/background2.png"))); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(440, 420, 90, 50);

        btnHitung.setBackground(new java.awt.Color(20, 50, 80));
        btnHitung.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(250, 250, 250));
        btnHitung.setText("Hitung");
        btnHitung.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHitung.setFocusPainted(false);
        btnHitung.setNextFocusableComponent(btnReset);
        btnHitung.setSelected(true);
        btnHitung.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/program/billing/warnet/background2.png"))); // NOI18N
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung);
        btnHitung.setBounds(540, 420, 190, 50);

        jSeparator8.setBackground(new java.awt.Color(205, 225, 255));
        jSeparator8.setForeground(new java.awt.Color(110, 140, 160));
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(30, 140, 330, 2);

        labelBackground.setBackground(new java.awt.Color(190, 210, 230));
        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/program/billing/warnet/background2.png"))); // NOI18N
        labelBackground.setText("jLabel2");
        labelBackground.setPreferredSize(new java.awt.Dimension(1370, 850));
        getContentPane().add(labelBackground);
        labelBackground.setBounds(-280, 0, 1080, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtBiaya.getText());
        int b = Integer.parseInt(txtWaktu.getText());
        int c = Integer.parseInt(txtLainnya.getText());
        int hasilnya = a * b + c;
        txtBayar.setText(""+ hasilnya);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void comboBoxJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxJenisActionPerformed
        // TODO add your handling code here:
        String selectedValue = comboBoxJenis.getSelectedItem().toString();
        if ("Normal".equals(selectedValue)){
        txtBiaya.setText("3000");
        }
        if ("Member".equals(selectedValue)){
        txtBiaya.setText("2000");
        }
    }//GEN-LAST:event_comboBoxJenisActionPerformed

    private void txtBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        int d = Integer.parseInt(txtBayar.getText());
        txtHistory.setText(" "+ d);
        txtBiaya.setText("");
        txtWaktu.setText("");
        txtLainnya.setText("");
        txtBayar.setText("");
              
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHistoryActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_billing_warnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_billing_warnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_billing_warnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_billing_warnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Frame_billing_warnet().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboBoxJenis;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelBiayaPerJam;
    private javax.swing.JLabel labelHistory;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelJudul1;
    private javax.swing.JLabel labelJudul2;
    private javax.swing.JLabel labelNamaKanzu;
    private javax.swing.JLabel labelPesanan;
    private javax.swing.JLabel labelTotalBayar;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtLainnya;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
