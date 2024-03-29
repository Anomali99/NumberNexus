/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sapes;

import javax.swing.JOptionPane;

/**
 *
 * @author fatiq
 */
public class Persegi extends javax.swing.JPanel {

    /**
     * Creates new form Persegi
     */
    public Persegi() {
        initComponents();
    }
    public String y; 
    public int sisi;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_contenMenu2 = new javax.swing.JPanel();
        hasil = new javax.swing.JLabel();
        v_sisi = new javax.swing.JTextField();
        pilih = new javax.swing.JComboBox<>();
        satuan = new javax.swing.JComboBox<>();
        ScrollPn = new javax.swing.JScrollPane();
        cara = new javax.swing.JTextArea();
        Judul = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        pn_ilustrasi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        pn_contenMenu2.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasil.setBackground(new java.awt.Color(0, 0, 0));
        hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil.setText("hasil");
        pn_contenMenu2.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 240, -1));

        v_sisi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        v_sisi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                v_sisiFocusLost(evt);
            }
        });
        v_sisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_sisiActionPerformed(evt);
            }
        });
        pn_contenMenu2.add(v_sisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 140, -1));

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luas", "Keliling" }));
        pn_contenMenu2.add(pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 250, -1));

        satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "km", "hm", "dam", "m", "dm", "cm", "mm" }));
        satuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                satuanFocusLost(evt);
            }
        });
        pn_contenMenu2.add(satuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 100, -1));

        cara.setColumns(20);
        cara.setRows(5);
        ScrollPn.setViewportView(cara);

        pn_contenMenu2.add(ScrollPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 250, 170));

        Judul.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        Judul.setText("Persegi");
        pn_contenMenu2.add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        pn_contenMenu2.add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 250, -1));

        pn_ilustrasi.setBackground(new java.awt.Color(255, 255, 255));
        pn_ilustrasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/persegi.png"))); // NOI18N
        pn_ilustrasi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setText("Sisi =");
        pn_ilustrasi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jLabel2.setText("Sisi =");
        pn_ilustrasi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel3.setText("0");
        pn_ilustrasi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 200, -1));

        pn_contenMenu2.add(pn_ilustrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        jLabel4.setText("0");
        pn_contenMenu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_contenMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_contenMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void v_sisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_sisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_sisiActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
            int x;
            if(pilih.getSelectedIndex()==0){
//            luas
              x = sisi*sisi;
              hasil.setText("Luas = "+x+" "+y);
              cara.setText("Sisi = "+sisi+" "+y+"\n \nLuas = sisi * sisi\nLuas = "+sisi+y+"*"+sisi+y+"\nLuas = "+x+" "+y);
            }
            else{
//            keliling
              x = 4*sisi;
              hasil.setText("Keliling = "+x+" "+y);
              cara.setText("Sisi = "+sisi+" "+y+"\n \nKeliling = 4 * sisi\nKeliling = 4*"+sisi+y+"\nKeliling = "+x+" "+y);
            }
    }//GEN-LAST:event_hitungActionPerformed

    private void satuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_satuanFocusLost
        switch(satuan.getSelectedIndex()){
            case 0 :
                break;
            case 1 :
                y = "km";
                break;
            case 2 :
                y = "hm";
                break;
            case 3 :
                y = "dam";
                break;
            case 4 :
                y = "m";
                break;
            case 5 :
                y = "dm";
                break;
            case 6 :
                y = "cm";
                break;
            case 7 :
                y = "mm";
                break;
        }
        jLabel3.setText(sisi+" "+y);
        jLabel4.setText(sisi+" "+y);
    }//GEN-LAST:event_satuanFocusLost

    private void v_sisiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_sisiFocusLost
        try{
        sisi = Integer.parseInt(v_sisi.getText());
        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(this, "Masukkan input sisi dengan benar");
          v_sisi.setText("");
        }
        jLabel3.setText(sisi+" "+y);
        jLabel4.setText(sisi+" "+y);
    }//GEN-LAST:event_v_sisiFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JScrollPane ScrollPn;
    private javax.swing.JTextArea cara;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JPanel pn_contenMenu2;
    private javax.swing.JPanel pn_ilustrasi;
    private javax.swing.JComboBox<String> satuan;
    private javax.swing.JTextField v_sisi;
    // End of variables declaration//GEN-END:variables
}
