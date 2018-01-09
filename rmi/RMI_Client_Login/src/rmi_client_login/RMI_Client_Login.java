/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_client_login;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi_interfacelib.RMI_InterfaceLib;

/**
 *
 * @author MacOS
 */
public class RMI_Client_Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RMI_InterfaceLib login = (RMI_InterfaceLib) Naming.lookup("rmi://127.0.0.1:9999/login");
            System.out.println(login.Login("admin", "adsmin"));

        } catch (NotBoundException ex) {
            Logger.getLogger(RMI_Client_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMI_Client_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMI_Client_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
