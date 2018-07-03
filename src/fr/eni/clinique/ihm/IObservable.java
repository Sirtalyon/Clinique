/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.clinique.ihm;

import java.util.Observable;

/**
 *
 * @author plaurent2017
 */
public interface IObservable<T> {

    void registreObserver(T observer);

    void unregistreObserver(T observer);
}
