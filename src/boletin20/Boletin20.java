/*
 * Boletin 20
 Suponer que desde secretaria nos piden un programa para gestionar una lista de alumnos. Cada alumno va a ser identificado por un numero de registro a la vez cada alumno tiene un nombre y una nota. Haz un menú con las siguientes opciones:
 1-Dar de alta alumno.
 2-Dar de baja alumno.
 3-Ver si existe un alumno(id).
 4-Visualizar todos los alumnos.
 Debemos tener en cuenta que cada alumno que matriculemos debe llevar el numero de registro siguiente al ultimo alumno dado de alta y este curso comenzamos con el num. 5500.

 *Numeo de registro String
 **TreeMap
 */
package boletin20;

/**
 *
 * @author oquintansocampo
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio b = new Colegio();
        int op;
        do {
            op = b.menu();
            switch (op) {
                case 1:
                    b.add();
                    break;
                case 2:
                    b.remove();
                    break;
                case 3:
                    b.consulta();
                    break;
                case 4:
                    b.visualizar();
                    break;
                case 5:
                    if (op == 5 && op == 0) {
                        System.exit(0);
                    }
            }

        } while (op != 5 && op != 0);
    }
}
