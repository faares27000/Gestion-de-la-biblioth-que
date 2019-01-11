package Etudiant;

import java.awt.HeadlessException;
import java.sql.*;
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

    static Connection con;
    Statement st;
    ResultSet rs;
    static PreparedStatement pstmt; 
            
    public DB_Managing() {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotheque","root","");
            st = con.createStatement();
        }catch(SQLException ex){
            System.out.println("Error: "+ex);
        }
    }
    
    static void InsertSubsc(String Nom, String Prenom, String Adresse, String Categorie, String D_insc, String Institut, String N_etudes) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `emprenteur`(`nom`, `prenom`, `adresse`, `categorie`, `date_Inscription`, `institut`, `n_Etudes`) VALUES (?,?,?,?,?,?,?)");        
            pstmt.setString(1, Nom);
            pstmt.setString(2, Prenom);
            pstmt.setString(3, Adresse);
            pstmt.setString(4, Categorie);
            pstmt.setString(5, D_insc);
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
    
    static void UpdateSubsc(int N_Ordre, String Nom, String Prenom, String Adresse, String Categorie, String D_insc, String Institut, String N_etudes) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `emprenteur` SET `nom`=?,`prenom`=?,`adresse`=?,`categorie`=?,`date_Inscription`=?,`institut`=?,`n_Etudes`=? WHERE `n_Ordre`="+N_Ordre);        
            
            pstmt.setString(1, Nom);
            pstmt.setString(2, Prenom);
            pstmt.setString(3, Adresse);
            pstmt.setString(4, Categorie);
            pstmt.setString(5, D_insc);
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
    }
///////////////////////////////////////////////////////////////   
    static void InsertBooks(String Editeur, String Titre, String Pays, int Nb_exemplaire, String ISBN, String Date_edition, String CDD, String Theme, String Langage, String n_auteur, String p_auteur) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `livres`(`editeur`, `titre`, `pays`, `nb_exemplaire`, `ISBN`, `date_edition`, `CDD`, `theme`, `langage`, `n_auteur`, `p_auteur`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");        
            
            pstmt.setString(1, Editeur);
            pstmt.setString(2, Titre);
            pstmt.setString(3, Pays);
            pstmt.setInt(4, Nb_exemplaire);
            pstmt.setString(5, ISBN);
            pstmt.setString(6, Date_edition);
            pstmt.setString(7, CDD);
            pstmt.setString(8, Theme);
            pstmt.setString(9, Langage);
            pstmt.setString(10, n_auteur);
            pstmt.setString(11, p_auteur);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau emprunteur ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }
    
    static void UpdateBooks(int identifient, String Editeur, String Titre, String Pays, int Nb_exemplaire, String ISBN, String Date_edition, String CDD, String Theme, String Langage, String n_auteur, String p_auteur) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `Livres` SET `editeur`=?,`titre`=?,`pays`=?,`nb_exemplaire`=?,`ISBN`=?,`date_edition`=?,`CDD`=?,`theme`=?,`langage`=?,`n_auteur`=?,`p_auteur`=? WHERE `identifient`="+identifient);        
            
            pstmt.setString(1, Editeur);
            pstmt.setString(2, Titre);
            pstmt.setString(3, Pays);
            pstmt.setInt(4, Nb_exemplaire);
            pstmt.setString(5, ISBN);
            pstmt.setString(6, Date_edition);
            pstmt.setString(7, CDD);
            pstmt.setString(8, Theme);
            pstmt.setString(9, Langage);
            pstmt.setString(10, n_auteur);
            pstmt.setString(11, p_auteur);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Emprunteur modifier avec succès");
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
                JOptionPane.showMessageDialog(null, "Emprunteur supprimé avec succès");
            else
                JOptionPane.showMessageDialog(null, "Emprunteur non supprimé!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }   
/////////////////////////////////////////////////////
    static void InsertPret(String d_pret, String d_restitution, String c_pret, int id_pret, int n_ordre) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `pret`(`date_pret`, `date_restitution`, `categorie_pret`, `identifient_pret`, `n_ordre`) VALUES (?,?,?,?,?)");        
            pstmt.setString(1, d_pret);
            pstmt.setString(2, d_restitution);
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
    static void UpdatePret(int id_p, String d_pret, String d_restitution, String c_pret, int id_c, int n_ordre) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `pret` SET `date_pret`=?,`date_restitution`=?,`categorie_pret`=?,`identifient_pret`=?,`n_ordre`=? WHERE `id_pret`="+id_p);        
            
            pstmt.setString(1, d_pret);
            pstmt.setString(2, d_restitution);
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
    
    static void DeletePret(int idP){
        
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
    }
/////////////////////////////////////////////////////////////////////////
    static void InsertMemory(String auteur, String titre, String n_encadr, String ann_univ, int n_exmp, String theme, int CDD) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("INSERT INTO `memoires`(`auteur`, `titre`, `nom_encadreur`, `ann_univ`, `nb_exemplaire`, `theme`, `CDD`) VALUES (?,?,?,?,?,?,?)");        
            
            pstmt.setString(1, auteur);
            pstmt.setString(2, titre);
            pstmt.setString(3, n_encadr);
            pstmt.setString(4, ann_univ);
            pstmt.setInt(5, n_exmp);
            pstmt.setString(6, theme);
            pstmt.setInt(7, CDD);
        
            int i = pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null, "Nouveau memoire ajouté avec succès");
            else
                JOptionPane.showMessageDialog(null, "Les données ne sont pas ajouté!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);          
        }
    }

    static void UpdateMemory(int idM, String auteur, String titre, String n_encadr, String ann_univ, int n_exmp, String theme, int CDD) throws SQLException{
        
        try{
            pstmt = con.prepareStatement("UPDATE `memoires` SET `auteur`=?,`titre`=?,`nom_encadreur`=?,`ann_univ`=?,`nb_exemplaire`=?,`theme`=?,`CDD`=? WHERE `id_memoire`="+idM);        
            
            pstmt.setString(1, auteur);
            pstmt.setString(2, titre);
            pstmt.setString(3, n_encadr);
            pstmt.setString(4, ann_univ);
            pstmt.setInt(5, n_exmp);
            pstmt.setString(6, theme);
            pstmt.setInt(7, CDD);
        
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



