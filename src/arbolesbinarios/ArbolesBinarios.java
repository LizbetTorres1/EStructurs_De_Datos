
package arbolesbinarios;

//Integrantes:
//Omar Corona Bernal
//Yuridia Marlim Saldivar Hernandez
//Lizbet Torres Cruz
import javax.swing.JOptionPane;

public class ArbolesBinarios {

    public static void main(String[] args) {
        
        int opcion=0,elemento;
        String nombre;
        ArbolBinario arbolito= new ArbolBinario();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1. Agregar un nodo\n"
                       +"2. Recorrer el Arbol Inorden\n"
                       +"3.Salir\n"
                       +"Arboles Binarios\n","Elige una opcion..."
                        ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                case 1:
                elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa el Numero del Nodo...","Agregando Nodo",
                JOptionPane.QUESTION_MESSAGE));
                nombre=(JOptionPane.showInputDialog(null,
                "Ingresa el nombre: ","Agregando Nodo",
                JOptionPane.QUESTION_MESSAGE));
                break;
                case 2:
                    if(!arbolito.estaVacio()){
                    arbolito.inOrden(arbolito.raiz);
            }else{
                    JOptionPane.showMessageDialog(null,"El Arbol esta vacio",
                            "¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                    }
            break;
            case 3:
            JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
            "Fin",JOptionPane.INFORMATION_MESSAGE);
            break;
            default:
            JOptionPane.showMessageDialog(null,"Opccion Incorrecta",
                    "Cuidado",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
            }
        }while(opcion !=3);
    }
    
}
