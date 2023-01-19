
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author xavi
 */
public class Controlador {
    public void menu(){
        Scanner leer = new Scanner (System.in);
        int op=0;
        Cliente c1 = new Cliente();
        Directivo dr1 = new Directivo();
        Empleado em1 = new Empleado();
        int seleccionar_opcion = 0;
        Empresa emp1 = new Empresa();
        
        
        do {  
            System.out.println("Bienvenidos al sistema de facturacion\n"
                +"ELIJE UNA OPCIÓN\n"
                + "1 - REGISTRAR CLIENTE\n"
                + "2 - REGISTRAR DIRECTIVO\n"
                + "3 - REGISTRAR EMPLEADO\n"
                + "4 - REGISTRAR EMPRESA\n"
                + "5 - SALIR"); 
            op = leer.nextInt();
            switch(op){
                case 1:
                    
                System.out.println("INGRESE EL NÚMERO DE CÉDULA");
                c1.setCedula(leer.next());
                System.out.println("INGRESE EL PRIMER NOMBRE DEL CLIENTE : ");
                c1.setNombre1(leer.next());
                System.out.println("INGRESE EL SEGUNDO NOMBRE DEL CLIENTE : ");
                c1.setNombre2(leer.next());
                System.out.println("INGRESE EL PRIMER APELLIDO DEL CLIENTE : ");
                c1.setApellido1(leer.next());
                System.out.println("INGRESE EL SEGUNDO APELLIDO DEL CLIENTE : ");
                c1.setApellido2(leer.next());
                System.out.println("INGRESE LA DIRECCIÓN : ");
                c1.setDireccion(leer.next());
                System.out.println("INGRESE EL NÚMERO DE TELEFONO : ");
                c1.setTelefono(leer.next());
                System.out.println("INGRESE EL EMAIL : ");
                c1.setEmail(leer.next());
             
                break;
            case 2: 
                System.out.println("INGRESE ID DEL DIRECTIVO");
                dr1.setIdDirectivo(leer.nextInt());
                System.out.println("INGRESE LA CATEGORIA DEL DIRECTIVO");
                dr1.setCategoria(leer.next());
                System.out.println("INGRESE EL NÚMERO DE CÉDULA");
                dr1.setCedula(leer.next());
                System.out.println("INGRESE EL PRIMER NOMBRE DEL DIRECTIVO : ");
                dr1.setNombre1(leer.next());
                System.out.println("INGRESE EL SEGUNDO NOMBRE DEL DIRECTIVO  : ");
                dr1.setNombre2(leer.next());
                System.out.println("INGRESE EL PRIMER APELLIDO DEL DIRECTIVO  : ");
                c1.setApellido1(leer.next());
                System.out.println("INGRESE EL SEGUNDO APELLIDO DEL DIRECTIVO  : ");
                dr1.setApellido2(leer.next());
                System.out.println("INGRESE LA DIRECCIÓN : ");
                dr1.setDireccion(leer.next());
                System.out.println("INGRESE EL NÚMERO DE TELEFONO : ");
                dr1.setTelefono(leer.next());
                System.out.println("INGRESE EL EMAIL : ");
                dr1.setEmail(leer.next());
                break;
            case 3:
                System.out.println("INGRESE EL NÚMERO DE CÉDULA");
                em1.setCedula(leer.next());
                System.out.println("INGRESE EL PRIMER NOMBRE DEL EMPLEADO : ");
                em1.setNombre1(leer.next());
                System.out.println("INGRESE EL SEGUNDO NOMBRE DEL EMPLEADO : ");
                em1.setNombre2(leer.next());
                System.out.println("INGRESE EL PRIMER APELLIDO DEL EMPLEADO : ");
                em1.setApellido1(leer.next());
                System.out.println("INGRESE EL SEGUNDO APELLIDO DEL EMPLEADO : ");
                em1.setApellido2(leer.next());
                System.out.println("INGRESE LA DIRECCIÓN : ");
                em1.setDireccion(leer.next());
                System.out.println("INGRESE EL NÚMERO DE TELEFONO : ");
                em1.setTelefono(leer.next());
                System.out.println("INGRESE EL EMAIL : ");
                em1.setEmail(leer.next());
                System.out.println("INGRESE EL SUELDO BRUTO");
                em1.setSueldoBruto(leer.nextDouble());
                    
                    
               
                break;
            case 4:
                System.out.println("INGRESE EL ID DE EMPRESA");
                emp1.setIdEmpresa(leer.next());
          
                break;    
            default:
                     System.out.println("OPCIÓN INVALIDA");
                 
               
                } 
       
         try {
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();
            String sistemaOperativo = System.getProperty("os.name");
            ArrayList<String> comando= new ArrayList<>();
            if(sistemaOperativo.contains("Windows")){        
                comando.add("cmd");
                comando.add("/C");
                comando.add("cls");
                
            } else {
                comando.add("clear");
            } 
            
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process iniciarProceso = pb.inheritIO().start();
            iniciarProceso.waitFor();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    
         
        
         }
        while(seleccionar_opcion!=5);
        {
            System.out.println("HA DECIDIDO SALIR DE LA APLICACIÓN,GRACIAS");
        }
            
        } 
    
       
    }
    

    
