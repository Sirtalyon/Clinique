/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.dao;

import fr.eni.clinique.bo.Animal;
import fr.eni.clinique.bo.Client;
import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.bo.Race;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class GetValuesDataBase {

    public Personnel getIdentifiant(String user, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Personnel perso = new Personnel();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && password != null) {
                stm = connect.prepareStatement("select * from Personnels where Nom='" + user + "' and MotPasse='" + password + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    perso = new Personnel();
                    
                    perso.setNom(rs.getString("Nom"));
                    perso.setMotDePase(rs.getString("MotPasse"));
                    perso.setRole(rs.getString("Role"));
                    
                    return perso;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String getCodeEmp(String user, String role) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && role != null) {
                stm = connect.prepareStatement("SELECT CodePers FROM Personnels WHERE Nom='" + user + "' and Role='" + role + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("CodePers");
                } else {
                    return "";
                }
            } else {
                return "";
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    public String getRole(String user, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (user != null && password != null) {
                stm = connect.prepareStatement("select Role from Personnels where Nom='" + user + "' and MotPasse='" + password + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("Role");

                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String getPassword(String CodeEmp) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        try {
            if (CodeEmp != null) {
                stm = connect.prepareStatement("select MotPasse from Personnels where CodePers='" + CodeEmp + "'");
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("MotPasse");

                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Personnel> getAll() {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Personnel> persos = new ArrayList<>();
        Personnel perso = new Personnel();
        try {

            stm = connect.prepareStatement("select * from Personnels");
            rs = stm.executeQuery();
            while (rs.next()) {

                perso = new Personnel();
                perso.setNom(rs.getString("Nom"));
                perso.setRole(rs.getString("Role"));
                String motDePasse = "";
                for (int i = 0; i < rs.getString("MotPasse").length(); i++) {
                    motDePasse += "*";
                }
                perso.setMotDePase(motDePasse);
                perso.setArchive(rs.getBoolean("Archive"));
                persos.add(perso);

            }
            return persos;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Animal> getAnimaux(String codeClient) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Animal> animaux = new ArrayList<>();
        Animal animal = new Animal();
        try {

            stm = connect.prepareStatement("select * from Animaux where CodeClient='" + codeClient + "'");
            rs = stm.executeQuery();
            while (rs.next()) {

                animal = new Animal();
                animal.setNomAnimal(rs.getString("NomAnimal"));
                animal.setSexe(rs.getString("Sexe"));
                animal.setCouleur(rs.getString("Couleur"));
                animal.setRace(rs.getString("Race"));
                animal.setEspece(rs.getString("Espece"));
                animal.setTatouage(rs.getString("Tatouage"));
                animal.setArchive(rs.getBoolean("Archive"));
                animaux.add(animal);

            }
            return animaux;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean addPersonnel(String user, String role, String password) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (user != null && password != null && role != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("INSERT INTO Personnels (Nom, Role, MotPasse, Archive) VALUES ('" + user + "', '" + role + "', '" + password + "', 'false')");
                if (rs == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean archivePersonnel(String codePers) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (codePers != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("UPDATE Personnels SET Archive='true' WHERE CodePers='" + codePers + "'");
                if (rs == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Client> getClient() {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Client> clients = new ArrayList<>();
        Client cli = new Client();
        try {

            stm = connect.prepareStatement("select * from Client");
            rs = stm.executeQuery();
            while (rs.next()) {

                cli = new Client();
                cli.setNomClient(rs.getString("NomClient"));
                cli.setPrenomClient(rs.getString("PrenomClient"));
                cli.setCodePostal(rs.getString("CodePostal"));
                cli.setVille(rs.getString("Ville"));
                clients.add(cli);

            }
            return clients;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Client getClient(String nom, String prenom) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        Client cli = new Client();
        try {

            stm = connect.prepareStatement("select * from Clients where NomClient='" + nom + "' and PrenomClient='" + prenom + "'");
            rs = stm.executeQuery();
            while (rs.next()) {

                cli = new Client();
                cli.setNomClient(rs.getString("NomClient"));
                cli.setPrenomClient(rs.getString("PrenomClient"));
                cli.setCodePostal(rs.getString("CodePostal"));
                cli.setVille(rs.getString("Ville"));
                cli.setCodeClient(rs.getInt("CodeClient"));

            }
            return cli;

        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Client> rechercheClient(String param) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Client> clients = new ArrayList<>();

        try {

            stm = connect.prepareStatement("select * from Clients where NomClient like '" + param + "%'");
            rs = stm.executeQuery();
            while (rs.next()) {
                Client cli = new Client();
                cli.setNomClient(rs.getString("NomClient"));
                cli.setPrenomClient(rs.getString("PrenomClient"));
                cli.setCodePostal(rs.getString("CodePostal"));
                cli.setVille(rs.getString("Ville"));
                clients.add(cli);
            }
            return clients;
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean updatePassword(String codePers, String newPassword) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (codePers != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("UPDATE Personnels SET MotPasse='" + newPassword + "' WHERE CodePers='" + codePers + "'");
                if (rs == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean addAnimal(String nomAnimal, String sexe, String couleur, String race, String espece, String codeClient, String tatouage, Boolean archive) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (nomAnimal != null && race != null && espece != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("INSERT INTO Animaux (NomAnimal, Sexe, Couleur, Race, Espece, CodeClient, Tatouage, Antecedents, Archive) VALUES ('" + nomAnimal + "', '" + sexe + "', '" + couleur + "', '" + race + "', '" + espece + "', '" + codeClient + "', '" + tatouage + "', ' ', 'false')");
                if (rs == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
    }
    
    public List<Race> SelAnimaux(String espece){
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        PreparedStatement stm;
        ResultSet rs;
        List<Race> races = new ArrayList<>();
        try {

            stm = connect.prepareStatement("select Race from Races where Espece='" + espece + "'");
            rs = stm.executeQuery();
            while (rs.next()) {
                Race race = new Race();
                race.setRace(rs.getString("Race"));
                races.add(race);
            }
            return races;
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
        public boolean addClient(Client client) {
        ConnexionDataBase co = new ConnexionDataBase();
        Connection connect = co.getCo();
        Statement stm;
        int rs = 0;
        try {
            if (client.getNomClient() != null && client.getPrenomClient() != null && client.getVille() != null) {
                stm = connect.createStatement();
                rs = stm.executeUpdate("INSERT INTO Clients (NomClient, PrenomClient, Adresse1, Adresse2, CodePostal, Ville, Archive) VALUES ('" + client.getNomClient() + "', '" + client.getPrenomClient()+ "', '" + client.getAdresse1() + "', '" + client.getAdresse2() + "', '" + client.getCodePostal() + "', '" + client.getVille() + "', 'false')");
                if (rs == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetValuesDataBase.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
    }
    
}
