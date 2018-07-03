/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm.Controller.Mediator;

import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author plaurent2017
 */
public interface IControler {

    void setMediator(IMediator mediator);
    
    JPanel getPanel();
    
    JDialog getDialogue();
}
