package system;

import dao.Persistencia;
import controlador.Controlador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import vista.VentanaPrincipal;

public class System {
    
    public static void main(String[] args) {
// TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("integradorPU");
        // creo objeto de Persistencia (DAO)
        Persistencia persistencia = new Persistencia(emf);
        // creo controlador y asocio (inyecto) al controlador el objeto de Persistencia (DAO)
        Controlador c = new Controlador(persistencia);
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(c);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }
    
}
