package Etudiant;

import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fares
 */
public class S_livre_1 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame2
     */
    public S_livre_1() {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titreRB = new javax.swing.JRadioButton();
        auteurRB = new javax.swing.JRadioButton();
        motcleRB = new javax.swing.JRadioButton();
        coteRB = new javax.swing.JRadioButton();
        D_editionRB = new javax.swing.JRadioButton();
        isbnRB = new javax.swing.JRadioButton();
        B5 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("GESTION DU BIBLIOTHEQUE ");
        getContentPane().add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 30));

        Text3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Recherché par :");
        getContentPane().add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        titreRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        titreRB.setForeground(new java.awt.Color(255, 255, 255));
        titreRB.setText("Titre");
        titreRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreRBActionPerformed(evt);
            }
        });
        jPanel2.add(titreRB);

        auteurRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        auteurRB.setForeground(new java.awt.Color(255, 255, 255));
        auteurRB.setText("Auteur");
        auteurRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auteurRBActionPerformed(evt);
            }
        });
        jPanel2.add(auteurRB);

        motcleRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        motcleRB.setForeground(new java.awt.Color(255, 255, 255));
        motcleRB.setText("Mot-clé ");
        motcleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motcleRBActionPerformed(evt);
            }
        });
        jPanel2.add(motcleRB);

        coteRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        coteRB.setForeground(new java.awt.Color(255, 255, 255));
        coteRB.setText("La cote ");
        coteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coteRBActionPerformed(evt);
            }
        });
        jPanel2.add(coteRB);

        D_editionRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        D_editionRB.setForeground(new java.awt.Color(255, 255, 255));
        D_editionRB.setText("Date d'édition");
        D_editionRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_editionRBActionPerformed(evt);
            }
        });
        jPanel2.add(D_editionRB);

        isbnRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        isbnRB.setForeground(new java.awt.Color(255, 255, 255));
        isbnRB.setText("ISBN");
        isbnRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnRBActionPerformed(evt);
            }
        });
        jPanel2.add(isbnRB);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 460, 30));

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Back.png"))); // NOI18N
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 50, 40));

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Next.png"))); // NOI18N
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 50, 40));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Home.png"))); // NOI18N
        Home.setText("jLabel1");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 50, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bg3.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motcleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motcleRBActionPerformed
        if(motcleRB.isSelected())
        titreRB.setSelected(false);
        D_editionRB.setSelected(false);
        isbnRB.setSelected(false);
        coteRB.setSelected(false);
        auteurRB.setSelected(false);
    }//GEN-LAST:event_motcleRBActionPerformed

    private void D_editionRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_editionRBActionPerformed
        if(D_editionRB.isSelected())
        titreRB.setSelected(false);
        motcleRB.setSelected(false);
        isbnRB.setSelected(false);
        coteRB.setSelected(false);
        auteurRB.setSelected(false);
    }//GEN-LAST:event_D_editionRBActionPerformed

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        new Library().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B5MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        int i=0;
        if(coteRB.isSelected()){
            new S_livre_2().setVisible(true);
            this.setVisible(false);
            i++;           
        }
        if(titreRB.isSelected()||auteurRB.isSelected()||motcleRB.isSelected()||D_editionRB.isSelected()||isbnRB.isSelected()){
            new F_S_L().setVisible(true);
            this.setVisible(false);
            i++;
            if(titreRB.isSelected())
            F_S_L.Call("titre");

            if(auteurRB.isSelected())
            F_S_L.Call("auteur");
            
            if(motcleRB.isSelected())
            F_S_L.Call("theme");

            if(D_editionRB.isSelected())
            F_S_L.Call("date_edition");

            if(isbnRB.isSelected())
            F_S_L.Call("ISBN");            
        }
        if(i == 0){
            JOptionPane.showMessageDialog(null, "Les choix ne sont pas sélectionnés.");
        }
    }//GEN-LAST:event_B4MouseClicked

    private void titreRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreRBActionPerformed
        if(titreRB.isSelected())
        motcleRB.setSelected(false);
        D_editionRB.setSelected(false);
        isbnRB.setSelected(false);
        coteRB.setSelected(false);
        auteurRB.setSelected(false);
    }//GEN-LAST:event_titreRBActionPerformed

    private void auteurRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auteurRBActionPerformed
        if(auteurRB.isSelected())
        titreRB.setSelected(false);
        D_editionRB.setSelected(false);
        isbnRB.setSelected(false);
        coteRB.setSelected(false);
        motcleRB.setSelected(false);
    }//GEN-LAST:event_auteurRBActionPerformed

    private void coteRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coteRBActionPerformed
        if(coteRB.isSelected())
        titreRB.setSelected(false);
        D_editionRB.setSelected(false);
        isbnRB.setSelected(false);
        auteurRB.setSelected(false);
        motcleRB.setSelected(false);
    }//GEN-LAST:event_coteRBActionPerformed

    private void isbnRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnRBActionPerformed
        if(isbnRB.isSelected())
        titreRB.setSelected(false);
        D_editionRB.setSelected(false);
        coteRB.setSelected(false);
        auteurRB.setSelected(false);
        motcleRB.setSelected(false);
    }//GEN-LAST:event_isbnRBActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new Library().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel Background;
    private javax.swing.JRadioButton D_editionRB;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text3;
    private javax.swing.JRadioButton auteurRB;
    private javax.swing.JRadioButton coteRB;
    private javax.swing.JRadioButton isbnRB;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton motcleRB;
    private javax.swing.JRadioButton titreRB;
    // End of variables declaration//GEN-END:variables
}
