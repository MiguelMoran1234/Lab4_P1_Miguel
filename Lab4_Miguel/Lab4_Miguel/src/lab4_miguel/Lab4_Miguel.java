/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_miguel;

import java.util.Scanner;

/**
 *
 * @author flash
 */
public class Lab4_Miguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Conjuntos");
            System.out.println("2.Contraseña mejorada");
            System.out.println("3.Salir");
            System.out.println("Ingrees una opcion");
            int opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    String A, B;
                    System.out.println("Porfavor use el formato de A={a,b,c,...,z}, A=(a,b,c,...,z) o A=[a,b,c,...,z]");
                    System.out.println("Ingrese el primer conjunto");
                    A = st.next();
                    System.out.println("Ingrese el segundo conjunto");
                    B = st.next();
                    boolean test = false;
                    if (A.length() == B.length()) {
                        for (int i = 3; i < A.length(); i += 2) {
                            char pA = A.charAt(i);
                            char pB = B.charAt(i);
                            if (pA != pB) {
                                test = true;
                                break;
                            }
                        }
                    } else if (A.length() != B.length() || test) {
                        System.out.println("Los conjuntos son diferentes");
                        System.out.print("La union de los conjuntos es:{");
                        int x = 3;
                        for (int i = 3; i < A.length() - 1; i += 2) {
                            char pA = A.charAt(i);
                            for (int j = 3; j < B.length() - 1; j += 2) {
                                char pB = B.charAt(j);
                                if (pA == pB) {
                                    System.out.print(pB + ",");
                                    break;
                                } else if (pA != pB & j == B.length() - 2) {
                                    pB = B.charAt(x);
                                    System.out.print(pB + ",");
                                    System.out.print(pA + ",");
                                }
                            }
                            x = x + 2;
                        }
                        System.out.print("}");
                        System.out.println("");
                        System.out.print("La interseccion de los conjuntos es:{");
                        for (int i = 3; i < A.length() - 1; i += 2) {
                            char pA = A.charAt(i);
                            for (int j = 3; j < B.length() - 1; j += 2) {
                                char pB = B.charAt(j);
                                if (pA == pB) {
                                    System.out.print(pB + ",");
                                }
                                break;
                            }
                        }
                    System.out.print("}");
                    System.out.println("");    
                    }
                    else{
                        System.out.println("Los conjuntos son iguales");
                    }
                    break;

                case 2:

                    break;

                case 3:
                    seguir = false;
                    break;

                default:
                    System.out.println("Porfavor ingrese una opcion valida");
            }
        }
    }

}
