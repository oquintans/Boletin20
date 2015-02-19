package boletin20;

import java.util.Iterator;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Colegio {

    TreeMap<String, Alumno> alum = new TreeMap<>();
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

            String r = String.valueOf(reg);
            alum.put(r, new Alumno(n, nt));
            reg++;
            conf = JOptionPane.showConfirmDialog(null, "Dar de alta otro alumno?");
        } while (conf == 0);
    }

    public void remove() {
        int conf;
        do {
            String r = JOptionPane.showInputDialog("Introducir Registro");
            boolean x = alum.containsKey(r);
            if (x) {
                int p = JOptionPane.showConfirmDialog(null, "Seguro que quiere borrar al alumno " + r);
                if (p == 0) {
                    JOptionPane.showMessageDialog(null, alum.remove(r) + " ha sido borrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno con registro: " + r);
            }
            conf = JOptionPane.showConfirmDialog(null, "Dar de baja otro alumno?");
        } while (conf == 0);
    }

    public void consulta() {
        int conf;
        do {
            String r = JOptionPane.showInputDialog("Introducir Registro");
            boolean x = alum.containsKey(r);
            if (x) {
                JOptionPane.showMessageDialog(null, alum.get(r));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno con registro: " + r);
            }
            conf = JOptionPane.showConfirmDialog(null, "Consultar otro alumno?");
        } while (conf == 0);
    }

    public void visualizar() {
        String s = "";
        /*
         for (String r : alum.keySet()) {
         s += r + "\nNombre: " + alum.get(r).getNombre() + alum.get(r).getNota()+"\n<----------->\n";
         System.out.println(alum.get(r));
         }
         */
        Iterator it = alum.keySet().iterator();
        while (it.hasNext()) {
            String clave = (String) it.next();
            Alumno aux = alum.get(clave);
            s += clave + aux + "\n<----------->\n";
        }
        JOptionPane.showMessageDialog(null, s);

    }

}
