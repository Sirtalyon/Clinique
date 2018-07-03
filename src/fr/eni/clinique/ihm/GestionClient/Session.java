/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.GestionClient;

import fr.eni.clinique.ihm.CliniqueVeterinaire;
import fr.eni.clinique.ihm.GestionClient.ClientPanel;

/**
 *
 * @author plaurent2017
 */
public class Session {

    private static Session session;
    private CliniqueVeterinaire cliniqueVeterinaireSession;
    private ClientPanel clientPanelSession;
    private RechercheClient rechercheClientSession;

    public Session() {
    }

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public CliniqueVeterinaire getCliniqueVeterinaireFrameSession() throws Exception {
        if (cliniqueVeterinaireSession != null) {
            return cliniqueVeterinaireSession;
        } else {
            throw new Exception("");
        }
    }

    public void setCliniqueVeterinaireFrameSession(CliniqueVeterinaire frameSession) {
        this.cliniqueVeterinaireSession = frameSession;
    }

    public ClientPanel getClientPanelFrameSession() throws Exception {
        if (clientPanelSession != null) {
            return clientPanelSession;
        } else {
            throw new Exception("");
        }
    }

    public void setClientPanelFrameSession(ClientPanel clientPanelSession) {
        this.clientPanelSession = clientPanelSession;
    }

    public RechercheClient getRechercheClientFrameSession() throws Exception {
        if (rechercheClientSession == null) {
            rechercheClientSession = new RechercheClient(null, true);
        }
        return rechercheClientSession;
    }

    public void setRechercheClientFrameSession(RechercheClient rechercheClientSession) {
        this.rechercheClientSession = rechercheClientSession;
    }

}
