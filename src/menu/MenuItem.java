/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menu;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author NF
 */
public class MenuItem extends javax.swing.JPanel {

    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    
    private ActionListener act;
    
    public MenuItem(Icon icon, ActionListener act, MenuItem... subMenu) {
        initComponents();
        iPoster.setIcon(icon);
        
        if (act != null){
            this.act = act;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iPoster = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NumberNexus_home.png"))); // NOI18N
        iPoster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iPosterMouseClicked(evt);
            }
        });
        add(iPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void iPosterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPosterMouseClicked
         if (showing)
            hideMenu();
        else
            showMenu();
        if(act != null)
            act.actionPerformed(null);
    }//GEN-LAST:event_iPosterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iPoster;
    // End of variables declaration//GEN-END:variables

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    private void hideMenu() {
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = subMenu.size()-1; i>= 0; i--){
                    sleep();
                    subMenu.get(i).setVisible(false);
                    subMenu.get(i).hideMenu();
                }
                getParent().repaint();
                getParent().revalidate();
                showing = false;
            }
        }).start();
    }

    private void showMenu() {
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i < subMenu.size(); i++){
                    sleep();
                    subMenu.get(i).setVisible(true);
                }
                showing = true;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }
    
    private void sleep(){
        try{
            Thread.sleep(20);
        } catch(Exception e){}
    }

    private void execute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
