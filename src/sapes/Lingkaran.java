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
public class Lingkaran extends javax.swing.JPanel {

    /**
     * Creates new form Persegi
     */
    public Lingkaran() {
        initComponents();
    }
    public String y; 
    public int jari;

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
        v_jari = new javax.swing.JTextField();
        pilih = new javax.swing.JComboBox<>();
        satuan = new javax.swing.JComboBox<>();
        ScrollPn = new javax.swing.JScrollPane();
        cara = new javax.swing.JTextArea();
        Judul = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        pn_ilustrasi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        pn_contenMenu2.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasil.setBackground(new java.awt.Color(0, 0, 0));
        hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hasil.setText("hasil");
        pn_contenMenu2.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 240, -1));

        v_jari.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        v_jari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                v_jariFocusLost(evt);
            }
        });
        v_jari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_jariActionPerformed(evt);
            }
        });
        pn_contenMenu2.add(v_jari, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 140, -1));

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
        Judul.setText("Lingkaran");
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

        jLabel2.setText("Jari-jari =");
        pn_ilustrasi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel3.setText("0");
        pn_ilustrasi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lingkaran.png"))); // NOI18N
        pn_ilustrasi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pn_contenMenu2.add(pn_ilustrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

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

    private void v_jariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_jariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_jariActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
            double x;
            if(jari%7==0){
                if(pilih.getSelectedIndex()==0){
    //            luas
                  x = 22*jari*jari/7;
                  hasil.setText("Luas = "+x+" "+y);
                  cara.setText("r = "+jari+" "+y+"\nπ = 22/7\n(Karena "+jari+" habis dibagi 7)\n \nLuas =  π * r * r\nLuas =  22/7*"+jari+y+"*"+jari+y+"\nLuas = "+x+" "+y);
                }
                else{
    //            keliling
                  x = 2*22*jari/7;
                  hasil.setText("Keliling = "+x+" "+y);
                  cara.setText("r = "+jari+" "+y+"\nπ = 22/7\n(Karena "+jari+" habis dibagi 7)\n \nKeliling = 2 * π * r\nKeliling = 2*22/7*"+jari+y+"\nKeliling = "+x+" "+y);
                }
            }
            else{
                if(pilih.getSelectedIndex()==0){
    //            luas
                  x = 3.14*jari*jari;
                  hasil.setText("Luas = "+x+" "+y);
                  cara.setText("r = "+jari+" "+y+"\nπ = 3,14\n(Karena "+jari+" tidak habis dibagi 7)\n \nLuas =  π * r * r\nLuas =  3,14*"+jari+y+"*"+jari+y+"\nLuas = "+x+" "+y);
                }
                else{
    //            keliling
                  x = 2*3.14*jari;
                  hasil.setText("Keliling = "+x+" "+y);
                  cara.setText("r = "+jari+" "+y+"\nπ = 3,14\n(Karena "+jari+" tidak habis dibagi 7)\n \nKeliling = 2 * π * r\nKeliling = 2*3,14*"+jari+y+"\nKeliling = "+x+" "+y);
                }
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
        jLabel3.setText(jari+" "+y);
    }//GEN-LAST:event_satuanFocusLost

    private void v_jariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_jariFocusLost
        try{
        jari = Integer.parseInt(v_jari.getText());
        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(this, "Masukkan input jari-jari dengan benar");
          v_jari.setText("");
        }
        jLabel3.setText(jari+" "+y);
    }//GEN-LAST:event_v_jariFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JScrollPane ScrollPn;
    private javax.swing.JTextArea cara;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JPanel pn_contenMenu2;
    private javax.swing.JPanel pn_ilustrasi;
    private javax.swing.JComboBox<String> satuan;
    private javax.swing.JTextField v_jari;
    // End of variables declaration//GEN-END:variables
}
