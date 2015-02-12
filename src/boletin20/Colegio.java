package boletin20;

import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Colegio {

    TreeMap<String, Alumno> alum = new TreeMap<>();
    Alumno a = new Alumno();
    private static int reg = 5500;

    public int menu() {
        int op = JOptionPane.showOptionDialog(
                null, "Selecciona una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Dar de alta alumno",
                    "Dar de baja alumno",
                    "Consulta",
                    "Visualizar",
                    "Exit"},
                "Exit");
        return op + 1;
    }

    public void add() {
        int conf;
        do {

            String n = JOptionPane.showInputDialog("Introducir Nombre");
            int nt = Integer.parseInt(JOptionPane.showInputDialog("Introducir Nota"));
            a.setNombre(n);
            a.setNota(nt);
            String r = String.valueOf(reg);
            alum.put(r, a);
            reg++;
            conf = JOptionPane.showConfirmDialog(null, "Dar de alta otro alumno?");
        } while (conf == 0);
    }

    public void remove() {
        int conf;
        do {
            String r = JOptionPane.showInputDialog("Introducir Registro");
            alum.remove(r);
            conf = JOptionPane.showConfirmDialog(null, "Dar de baja otro alumno?");
        } while (conf == 0);
    }
    
    public void consulta(){
        
    }
    
    public void visualizar(){
        
    }

}
