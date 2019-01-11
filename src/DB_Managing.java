
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DB_Managing {
    static int Nb_exemplaire = 0;
    static Connection con;
    static Statement st;
    static ResultSet rs = null;
    static PreparedStatement pstmt,pstmt2 = null; 
            
    public DB_Managing() {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
            st = con.createStatement();
        }catch(SQLException ex){
            System.out.println("Error: "+ex);
        }
    }
    
    static void InsertSubsc(String Nom, String Prenom, String Adresse, String Categorie, java.util.Date D_insc, String Institut, String N_etudes) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `emprenteur`(`nom`, `prenom`, `adresse`, `categorie`, `date_Inscription`, `institut`, `n_Etudes`) VALUES (?,?,?,?,?,?,?)");        
            pstmt.setString(1, Nom);
            pstmt.setString(2, Prenom);
            pstmt.setString(3, Adresse);
            pstmt.setString(4, Categorie);
            pstmt.setDate(5, (Date) D_insc);
            pstmt.setString(6, Institut);
            pstmt.setString(7, N_etudes);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau emprunteur ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static void UpdateSubsc(int N_Ordre, String Nom, String Prenom, String Adresse, String Categorie, java.util.Date D_insc, String Institut, String N_etudes) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `emprenteur` SET `nom`=?,`prenom`=?,`adresse`=?,`categorie`=?,`date_Inscription`=?,`institut`=?,`n_Etudes`=? WHERE `n_Ordre`="+N_Ordre);        
            
            pstmt.setString(1, Nom);
            pstmt.setString(2, Prenom);
            pstmt.setString(3, Adresse);
            pstmt.setString(4, Categorie);
            pstmt.setDate(5, (Date) D_insc);
            pstmt.setString(6, Institut);
            pstmt.setString(7, N_etudes);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Emprunteur modifier avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas modifier!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static void DeleteSubsc(int N_Ordre){
        
        Connection con = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String H = null;
        
        String query = "SELECT categorie_pret FROM pret WHERE n_ordre =?";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
            pst = con.prepareStatement(query);
            pst.setInt(1, N_Ordre);
            rs = pst.executeQuery();
            while(rs.next())
                H = rs.getString("categorie_pret");

            if(H == null){
                try{
                pstmt = con.prepareStatement("DELETE FROM `emprenteur` WHERE `n_Ordre`="+N_Ordre);
                int i = pstmt.executeUpdate();
                if(i>0)
                    JOptionPane.showMessageDialog(null, "Emprunteur supprimé avec succès");
                else
                    JOptionPane.showMessageDialog(null, "Emprunteur non supprimé!");
                }catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null,e);          
                }               
            }else{
                JOptionPane.showMessageDialog(null, "Cet emprunteur a pris un "+H);
            }    
        }catch(SQLException ex){
            System.out.println("Error: "+ex);

        }      
    }
///////////////////////////////////////////////////////////////   
    static void InsertBooks(String Editeur, String Titre, String Pays, int Nb_exemplaire, String ISBN, java.util.Date Date_edition, String CDD, String Theme, String Langage, String n_auteur, String p_auteur) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `livres`(`editeur`, `titre`, `pays`, `nb_exemplaire`, `ISBN`, `date_edition`, `CDD`, `theme`, `langage`, `n_auteur`, `p_auteur`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");        
            
            pstmt.setString(1, Editeur);
            pstmt.setString(2, Titre);
            pstmt.setString(3, Pays);
            pstmt.setInt(4, Nb_exemplaire);
            pstmt.setString(5, ISBN);
            pstmt.setDate(6, (Date) Date_edition);
            pstmt.setString(7, CDD);
            pstmt.setString(8, Theme);
            pstmt.setString(9, Langage);
            pstmt.setString(10, n_auteur);
            pstmt.setString(11, p_auteur);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau livre ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static void UpdateBooks(int identifient, String Editeur, String Titre, String Pays, int Nb_exemplaire, String ISBN, java.util.Date Date_edition,String CDD, String Theme, String Langage, String n_auteur, String p_auteur) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `Livres` SET `editeur`=?,`titre`=?,`pays`=?,`nb_exemplaire`=?,`ISBN`=?,`date_edition`=?,`CDD`=?,`theme`=?,`langage`=?,`n_auteur`=?,`p_auteur`=? WHERE `identifient`="+identifient);        
            
            pstmt.setString(1, Editeur);
            pstmt.setString(2, Titre);
            pstmt.setString(3, Pays);
            pstmt.setInt(4, Nb_exemplaire);
            pstmt.setString(5, ISBN);
            pstmt.setDate(6, (Date) Date_edition);
            pstmt.setString(7, CDD);
            pstmt.setString(8, Theme);
            pstmt.setString(9, Langage);
            pstmt.setString(10, n_auteur);
            pstmt.setString(11, p_auteur);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Livre modifier avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas modifier!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
        
    static void DeleteBooks(int Identifient){
        
        try{
            pstmt = con.prepareStatement("DELETE FROM `Livres` WHERE `identifient`="+Identifient);        
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Livre supprimé avec succès");
            else
                JOptionPane.showMessageDialog(null, "Livre non supprimé!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }   
    
    static void upNb_exemplaire(int identifient, int Nb_exemplaire, String cat) throws SQLException{
        
        try{
            if("livres".equals(cat))
                pstmt = con.prepareStatement("UPDATE "+cat+" SET `nb_exemplaire`=? WHERE `identifient`="+identifient);        
            else
                pstmt = con.prepareStatement("UPDATE "+cat+" SET `nb_exemplaire`=? WHERE `id_memoire`="+identifient);        

            pstmt.setInt(1, --Nb_exemplaire);
        
            int i = pstmt.executeUpdate();
            if(i>0 && "livres".equals(cat))
                JOptionPane.showMessageDialog(null, "Livre modifier avec succès");
            if(i>0 && "memoires".equals(cat))
                JOptionPane.showMessageDialog(null, "Memoire modifier avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas modifier!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static int check(int n_ordre, int id_C, String cat) throws SQLException{
        int i = 0;
        String query2 = "";
        String query = "SELECT * FROM emprenteur WHERE n_Ordre = '" + n_ordre + "'";
        st = con.createStatement();       
        rs = st.executeQuery(query);
        if(rs.next()){
            i++;
            rs = null;
            if("livres".equals(cat)){
                query2 = "SELECT nb_exemplaire FROM "+cat+" WHERE identifient = '" + id_C + "'"; 
            }else
                query2 = "SELECT nb_exemplaire FROM "+cat+" WHERE id_memoire = '" + id_C + "'";
            
            st = con.createStatement();       
            rs = st.executeQuery(query2);
            if(rs.next()){
                Nb_exemplaire = rs.getInt("nb_exemplaire");
                i++;
                if(Nb_exemplaire == 0 && "livres".equals(cat)){
                    i = 0;
                    JOptionPane.showMessageDialog(null,"Ce livre n'est pas disponible");
                }
                if(Nb_exemplaire == 0 && "memoires".equals(cat)){
                    i = 0;
                    JOptionPane.showMessageDialog(null,"Cette mémoire n'est pas disponible");
                }
            }else{
                if("livres".equals(cat)){
                JOptionPane.showMessageDialog(null, "Ce livre n'existe pas!");
                i = 0;
                }else{
                    JOptionPane.showMessageDialog(null, "Cette mémoire n'existe pas!");
                    i = 0;
                }
            }    
        }else
            JOptionPane.showMessageDialog(null, "Cet emprunteur n'existe pas!");
    return i;
    }
    
    static int checkRight(int n_ordre) throws SQLException{
        
        int i = 0, j = 0;
        String Categorie = "",n_E = "";
                        
        rs = st.executeQuery("SELECT COUNT(*) AS duplicat FROM pret WHERE n_ordre = '" + n_ordre + "'");
        rs.next();
        j = rs.getInt("duplicat");      
        String query = "SELECT categorie, n_Etudes FROM emprenteur WHERE n_Ordre = '" + n_ordre + "'";
        
        st = con.createStatement();       
        rs = st.executeQuery(query);
        
        if(rs.next()){
            Categorie = rs.getString("categorie");
            n_E = rs.getString("n_Etudes");
        }
        if("Etudiant".equals(Categorie)){
            
            if("L1".equals(n_E) || "L2".equals(n_E) || "L3".equals(n_E)){               
               if(j >= 2)
                   JOptionPane.showMessageDialog(null, "Cet étudiant a pris le nombre maximum permis dans une semaine");
               else
                   i++;
            }
            if("M1".equals(n_E) || "M2".equals(n_E) || "Doctorat".equals(n_E)){
                if(j >= 3)
                    JOptionPane.showMessageDialog(null, "Cet étudiant a pris le nombre maximum permis dans 15 jours");
                else
                    i++;
            }
        }
        if("Professeur".equals(Categorie)){
            if(j >= 5)
                JOptionPane.showMessageDialog(null, "Ce professeur a pris le nombre maximum permis dans un mois");
            else
                i++;
        }
            
            
        return i;
    }
/////////////////////////////////////////////////////java.sql.Date
    static void InsertPret(java.util.Date d_pret, java.util.Date d_restitution, String c_pret, int id_pret, int n_ordre) throws SQLException{
        JOptionPane.showMessageDialog(null, d_pret);
        JOptionPane.showMessageDialog(null, d_restitution);
        try{
            pstmt = con.prepareStatement("INSERT INTO `pret`(`date_pret`, `date_restitution`, `categorie_pret`, `identifient_pret`, `n_ordre`) VALUES (?,?,?,?,?)");        
            pstmt.setDate(1, (Date) d_pret);
            pstmt.setDate(2, (Date) d_restitution);
            pstmt.setString(3, c_pret);
            pstmt.setInt(4, id_pret);
            pstmt.setInt(5, n_ordre);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau emprunteur ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    } 
    static void UpdatePret(int id_p, java.sql.Date d_pret, java.sql.Date d_restitution, String c_pret, int id_c, int n_ordre) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `pret` SET `date_pret`=?,`date_restitution`=?,`categorie_pret`=?,`identifient_pret`=?,`n_ordre`=? WHERE `id_pret`="+id_p);        
            
            pstmt.setDate(1, d_pret);
            pstmt.setDate(2, d_restitution);
            pstmt.setString(3, c_pret);
            pstmt.setInt(4, id_c);
            pstmt.setInt(5, n_ordre);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Emprunteur modifier avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas modifier!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static void DeletePret(int idP, int id_C, String cat){
        
        String query = "";
        try{
            pstmt = con.prepareStatement("DELETE FROM `pret` WHERE `id_pret`="+idP);  
                    
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Emprunteur supprimé avec succès");
            else
                JOptionPane.showMessageDialog(null, "Emprunteur non supprimé!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
        
        if("livres".equals(cat))
            query = "SELECT nb_exemplaire FROM "+cat+" WHERE identifient = '" + id_C + "'";
        else
            query = "SELECT nb_exemplaire FROM "+cat+" WHERE id_memoire = '" + id_C + "'";
        
        try {       
            st = con.createStatement();
            rs = st.executeQuery(query);
            if(rs.next())
                Nb_exemplaire = rs.getInt("nb_exemplaire");
        } catch (SQLException ex) {
            Logger.getLogger(DB_Managing.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {  
            if("livres".equals(cat))
                pstmt = con.prepareStatement("UPDATE `Livres` SET `nb_exemplaire`=? WHERE `identifient`="+id_C);
            else
                pstmt = con.prepareStatement("UPDATE `memoires` SET `nb_exemplaire`=? WHERE `id_memoire`="+id_C);

            pstmt.setInt(1, ++Nb_exemplaire);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_Managing.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
/////////////////////////////////////////////////////////////////////////
    static void InsertMemory(String auteur, String titre, String n_encadr, String ann_univ, int n_exmp, String theme, String CDD) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `memoires`(`auteur`, `titre`, `nom_encadreur`, `ann_univ`, `nb_exemplaire`, `theme`, `CDD`) VALUES (?,?,?,?,?,?,?)");        
            
            pstmt.setString(1, auteur);
            pstmt.setString(2, titre);
            pstmt.setString(3, n_encadr);
            pstmt.setString(4, ann_univ);
            pstmt.setInt(5, n_exmp);
            pstmt.setString(6, theme);
            pstmt.setString(7, CDD);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau memoire ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }

    static void UpdateMemory(int idM, String auteur, String titre, String n_encadr, String ann_univ, int n_exmp, String theme, String CDD) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `memoires` SET `auteur`=?,`titre`=?,`nom_encadreur`=?,`ann_univ`=?,`nb_exemplaire`=?,`theme`=?,`CDD`=? WHERE `id_memoire`="+idM);        
            
            pstmt.setString(1, auteur);
            pstmt.setString(2, titre);
            pstmt.setString(3, n_encadr);
            pstmt.setString(4, ann_univ);
            pstmt.setInt(5, n_exmp);
            pstmt.setString(6, theme);
            pstmt.setString(7, CDD);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Memoire modifier avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas modifier!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }        
    
    static void DeleteMemory(int idM){
        
        try{
            pstmt = con.prepareStatement("DELETE FROM `memoires` WHERE `id_memoire`="+idM);        
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Memoire supprimé avec succès");
            else
                JOptionPane.showMessageDialog(null, "Memoire non supprimé!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
}



