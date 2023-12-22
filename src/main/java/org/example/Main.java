package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Programa que busca datos de una base de datos
        int numeroArreglo=cantidadDePersonasArreglo();
        String personas[]=cargarPersonas(numeroArreglo);
        mostrarArreglo(personas);

        buscarNombre(personas);

    }
    public static String [] cargarPersonas (int numeroArreglo){
        Scanner  entrada= new Scanner(System.in);

        String nombres;
        String personas[]= new String [numeroArreglo];
        //CArgo el nombre de las personas en el arreglo
        System.out.println("Cargue los nombres deseados");
        for (int i=0; i< personas.length;i++){
            nombres= entrada.nextLine();
            personas[i]=nombres;
        }

        return  personas;
    }

    public static int cantidadDePersonasArreglo(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad deseada de Personas");
        int numeroArreglo=entrada.nextInt();
        //Agrego entrada.nextLine(); para que se vacie el buffer sino no me toma ej: 3 nombres, me toma 2
        entrada.nextLine();

        return numeroArreglo;

    }
    public static void mostrarArreglo(String personas[]){
        System.out.println("Muestro el arreglo");
        //Muestro los nombre por pantalla
        for (String nom:personas) {
            System.out.print(nom+" \n" );
        }


    }

    public static void buscarNombre(String personas[]){

        System.out.println("Bienvenido al buscador de personas");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el nombre que desea buscar: ");
        String personaBucada= entrada.nextLine();
        boolean encontrado=false;
        //Lo podemos hacer de dos manera. L aultima es mas eficiente
        /*
        System.out.println("La persona qeu busca es: "+personaBucada);
        for (int i=0; i<personas.length;i++){

            if (personaBucada.equalsIgnoreCase(personas[i])){//Ignora entre mayusculas y minusculas
                encontrado=true;
                System.out.println("Persona encontrada en la posicion [ "+i+"] ");
                break;
            }
        }*/

        for (int i=0; i<personas.length;i++){
            if (personas[i].toLowerCase().contains(personaBucada.toLowerCase())){
                encontrado=true;
                System.out.println("Persona encontrada en la posicion ["+i+":]"+personas[i]);
                break;
            }
        }



        if (!encontrado){
            System.out.println("La perosna no fue encontrada");
        }

    }
}