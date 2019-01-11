
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasri
 */
public class F_S_M extends javax.swing.JFrame {
    static LinkedList<String> liste = new LinkedList<>();
    int nb_exmpl = 0;
    int id_p = 0;
    /**
     * Creates new form F_S_M
     */
    public F_S_M() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Text2 = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        bnt4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_R = new javax.swing.JTable();
        Home = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        n_ordre = new javax.swing.JTextField();
        id_pret = new javax.swing.JTextField();
        c_pret = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Reset = new javax.swing.JLabel();
        d_restitution = new com.toedter.calendar.JDateChooser();
        d_pret = new com.toedter.calendar.JDateChooser();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Gestion de la bibliothèque");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Text2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Saisir votre recherche :");

        bnt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Search.png"))); // NOI18N
        bnt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text2)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnt4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Input))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 340, 60));

        tb_R.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Memoire", "Auteur", "Titre", "Nom Encadreur", "année univ", "N° Exemplaire", "Theme", "CDD"
            }
        ));
        tb_R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_RMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_R);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 550, 350));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Home.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Back.png"))); // NOI18N
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 30, 40));

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Add.png"))); // NOI18N
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        n_ordre.setBackground(new java.awt.Color(204, 204, 204));
        n_ordre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n_ordreKeyReleased(evt);
            }
        });
        getContentPane().add(n_ordre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, -1));

        id_pret.setBackground(new java.awt.Color(204, 204, 204));
        id_pret.setEnabled(false);
        getContentPane().add(id_pret, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));

        c_pret.setBackground(new java.awt.Color(204, 204, 204));
        c_pret.setEnabled(false);
        getContentPane().add(c_pret, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 140, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Identifiant de la catégorie:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numéro d'ordre d'emprenteur:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Catégorie de prêt:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date de restitution:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date de prêt:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Delete_1.png"))); // NOI18N
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        d_restitution.setEnabled(false);
        getContentPane().add(d_restitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, -1));

        d_pret.setEnabled(false);
        getContentPane().add(d_pret, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 140, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt4MouseClicked
        Connection con = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String query = "SELECT * FROM "+liste.getFirst()+" WHERE "+liste.getLast()+" =?";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
            pst = con.prepareStatement(query);
            pst.setString(1, Input.getText());
            rs = pst.executeQuery();
            tb_R.setModel(DbUtils.resultSetToTableModel(rs));
            if(tb_R.getRowCount() == 0)
            JOptionPane.showMessageDialog(null,"Le mot entré n'a pas été trouvé");
        }catch(SQLException ex){
            System.out.println("Error: "+ex);

        }
    }//GEN-LAST:event_bnt4MouseClicked

    private void tb_RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_RMouseClicked
        DefaultTableModel model = (DefaultTableModel) tb_R.getModel();
        int selectedRowIndex = tb_R.getSelectedRow();
        String txtDate = new SimpleDateFormat("dd/MM/YYYY", Locale.FRANCE).format(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date result1 = sdf.parse(txtDate);
            d_pret.setDate(result1);
        } catch (ParseException ex) {
            Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        c_pret.setText(liste.getFirst());
        id_pret.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tb_RMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new Library().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        new S_M_1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int i = 0, j = 0;
        if(    d_pret.getDate().equals("") 
            || c_pret.getText().equals("")
            || id_pret.getText().equals("")
            || n_ordre.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Un ou plusieurs champs sont vides");
        }else{
            int idPret = Integer.parseInt(id_pret.getText());
            int nOrdre = Integer.parseInt(n_ordre.getText());
            
            try {
                j = DB_Managing.checkRight(nOrdre);
            } catch (SQLException ex) {
                Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(j != 0){
                try {
                    i = DB_Managing.check(nOrdre, idPret, liste.getFirst());
                } catch (SQLException ex) {
                    Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(i != 0){
                    Date d1 = d_pret.getDate();
                    java.sql.Date sgldate = new java.sql.Date(d1.getTime());
                    Date d2 = d_restitution.getDate();
                    java.sql.Date sgldate2 = new java.sql.Date(d2.getTime());

                    try {
                        DB_Managing.InsertPret(sgldate, sgldate2, c_pret.getText(), idPret, nOrdre);
                    } catch (SQLException ex) {
                        Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        DB_Managing.upNb_exemplaire(id_p, nb_exmpl, liste.getFirst());
                    } catch (SQLException ex) {
                        Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_B6MouseClicked

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        d_pret.setDate(null);
        d_restitution.setDate(null);
        c_pret.setText(null);
        id_pret.setText(null);
        n_ordre.setText(null);
    }//GEN-LAST:event_ResetMouseClicked

    private void n_ordreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_ordreKeyReleased
        int n_ordr = Integer.parseInt(n_ordre.getText());
        id_p = Integer.parseInt(id_pret.getText());
        String S1 = "",S2 = "", date = null;
        int N = 0;
        Connection con = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        
            
        String query1 = "SELECT nb_exemplaire FROM memoires WHERE id_memoire =?";
        String query = "SELECT categorie, n_Etudes FROM emprenteur WHERE n_Ordre =?";        
        
        try {            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
            pst = con.prepareStatement(query1);
            pst.setInt(1, id_p);
            rs = pst.executeQuery();
           
            while(rs.next())
                N = rs.getInt("nb_exemplaire");
            nb_exmpl = N;
        } catch (SQLException ex) {
            Logger.getLogger(F_S_L.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(N > 0){
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
                pst = con.prepareStatement(query);
                pst.setInt(1, n_ordr);
                rs = pst.executeQuery();
                while(rs.next()){
                    S1 = rs.getString("categorie");
                    S2 = rs.getString("n_Etudes");
                }
                if("Etudiant".equals(S1)){//L1, L2, L3, M1, M2, Doctorat 
                    if("L1".equals(S2) || "L2".equals(S2) || "L3".equals(S2)){
                        cal.setTime(d_pret.getDate());
                        cal.add(Calendar.DAY_OF_MONTH, 7);
                        Date futureDate = cal.getTime();
                        d_restitution.setDate(futureDate);
                    }
                    if("M1".equals(S2) || "M2".equals(S2) || "Doctorat".equals(S2)){
                        cal.setTime(d_pret.getDate());
                        cal.add(Calendar.DAY_OF_MONTH, 15);
                        Date futureDate = cal.getTime();
                        d_restitution.setDate(futureDate);
                    }
                }
                
                if("Professeur".equals(S1)){
                    cal.setTime(d_pret.getDate());
                    cal.add(Calendar.DAY_OF_MONTH, 30);
                    Date futureDate = cal.getTime();
                    d_restitution.setDate(futureDate);
                }
            } catch(SQLException ex){
                System.out.println("Error: "+ex);
            }
        }
        if(N == 0)
            JOptionPane.showMessageDialog(null,"Cette memoire n'est pas disponible");
    }//GEN-LAST:event_n_ordreKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Home;
    private javax.swing.JTextField Input;
    private javax.swing.JLabel Reset;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel bnt4;
    private javax.swing.JTextField c_pret;
    private com.toedter.calendar.JDateChooser d_pret;
    private com.toedter.calendar.JDateChooser d_restitution;
    private javax.swing.JTextField id_pret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField n_ordre;
    private static javax.swing.JTable tb_R;
    // End of variables declaration//GEN-END:variables

    static void Call(String Id){
                
        liste.add(Id);
    }
    private void setIcon(){
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Pictures/Library.png")));
    }    
}