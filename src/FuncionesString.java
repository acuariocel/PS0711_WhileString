
/**
 *
 * @author Ing. Diego Romero
 */
public class FuncionesString {

    public void metodosCadena(String cadena) {
        //Longitud de una cadena
        System.out.println(cadena.length());
        //Caracter en la ultima posición
        System.out.println(cadena.charAt(cadena.length() - 1));
        //Contar cuantos caracteres 'o' hay
        System.out.println("o    : " + contarCaracteres(cadena, 'o'));
        System.out.println("O    : " + contarCaracteres(cadena, 'O'));
        System.out.println("d y D: " + contarCaracteresMayMin(cadena, 'D'));
    }

    public int contarCaracteres(String cad, char c) {
        int can = 0, cont = 0;
        while (cont < cad.length()) {
//            if (cad.charAt(cont) == c) {
//                can++;
//            }
            can = (cad.charAt(cont) == c) ? ++can : can;
            cont++;
        }
        return can;
    }

    public int contarCaracteresMayMin(String cad, char c) {
        int can = 0, cont = 0;
        cad = cad.toUpperCase();
        while (cont < cad.length()) {
            can = (cad.charAt(cont) == convCharMayus(c)) ? ++can : can;
            cont++;
        }
        return can;
    }
    public int contarCaracteresMayMin1(String cad, char c) {
        int can = 0, cont = 0;
        while (cont < cad.length()) {
            can = (compChar(c, cad.charAt(cont))) ? ++can : can;
            cont++;
        }
        return can;
    }

    public char convCharMayus(char c) {
        return (c + "").toUpperCase().charAt(0);
    }
    public boolean compChar(char c,char x) {
        return (c+"").equalsIgnoreCase(x+"");
    }
}
