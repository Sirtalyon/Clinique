/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

/**
 *
 * @author plaurent2017
 */
public class Session {

    private static Session session;
    private CliniqueVeterinaire frameSession;

    public Session() {
    }

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public CliniqueVeterinaire getFrameSession() throws Exception {
        if (frameSession != null) {
            return frameSession;
        } else {
            throw new Exception("");
        }
    }

    public void setFrameSession(CliniqueVeterinaire frameSession) {
        this.frameSession = frameSession;
    }

}
