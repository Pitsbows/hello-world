package com.ironhack.main;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*System.out.println("Goodbye World :(");
        int a = 10;
        int b = 5;
        float var1 = 10.5f;
        System.out.println(var1);


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        if (a >= 10){
            System.out.println("Mayor o igual a 10");
        }
        else{
            System.out.println("Menor a 10");
        }

        int day = 5;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Weekend");
                break;

        }


        //Operador ternario: realiza asiganaciones en función de una condición
        // variable = <condición> ? <expresión1> : <expresión2>;

        String result = (day <= 1 && day <= 5) ? "Weekday" : "Weekend";
        System.out.println("Today is " + result);
        */


        //Ejercicio 1
        String productName = "";
        String date = "";

        System.out.println(productFormatter("Milka ", "Today"));


        //Arrays
        String[] names = {"Sandra", "Irene", "Bruno", "Alicia"};

        System.out.println("==== FOR ====");
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("==== FOREACH ====");
        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("==== WHILE ====");
        int i = 0;
        while (i < names.length){
            System.out.println(names[i++]);
        }

        System.out.println("==== DO WHILE ====");
        i = 0;
        do{
            System.out.println(names[i++]);
        }
        while (i < names.length);


        System.out.println("==== STREAM ====");
        Arrays.stream(names).forEach(System.out::println);
        // Otra forma de poner lo mismo es con las arrows de Java
        Arrays.stream(names).forEach(name -> System.out.println(name));


        //Ejercicio 2

        System.out.println("==== EJERCICIO 2 ====");
        int[] numbers = {5, 4, 3, 2, };
        int number0 = numbers[0];

        for (int j = 0; j < numbers.length; j++){
            if(j < numbers.length-1){
                numbers[j] = numbers[j] * numbers[j + 1];
            }
            else{
                numbers[j] = numbers[j] * number0;
            }

            System.out.println(numbers[j]);
        }


        // Ejercicio 3

        System.out.println("==== EJERCICIO 2 ====");

        for (int j=0; j < numbers.length/2; j++){
            int x = numbers[j];
            numbers[j] = numbers[numbers.length - (j + 1)];
            numbers[numbers.length - (j + 1)] = x;
        }

        for (int number : numbers){
            System.out.println(number);
        }

       System.out.println("==== EJERCICIO 2 DE OTRA FORMA ====");

        int[] aux =  new int[numbers.length];
        for (int j=numbers.length-1, k =0 ; j>=0 ; j--, k++){
            aux[k] = numbers[j];
        }
        System.out.println(Arrays.toString(aux));





        /*

        // Para leer información con el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wellcome to this app");
        System.out.println("Please introduce your name");

        String name = scanner.nextLine();
        System.out.println("Hello" + name);

        int age;

        do {
            System.out.println("Please introduce your age");
            age = scanner.nextInt();
        } while(age < 0);

        //Buena práctica: cerrar el scanner.

        scanner.close();

        if (age < 18){
            System.err.println("Forbiddem access");
        } else{
            System.out.println("Access grated");
        }


        */


        //Ejercicio 4 imprimir número de palabras que empiezan por vocal

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please introduce a sentence");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        int count = 0;
        for (i = 0; i<words.length; i++){
            if(words[i].toUpperCase().startsWith("A") ||words[i].toUpperCase().startsWith("E")
                    ||words[i].toUpperCase().startsWith("I")||words[i].toUpperCase().startsWith("O")
                    ||words[i].toUpperCase().startsWith("U")){

                count ++;

            }
            else{
                System.out.println("Palabras que no empiezan por vocal");
                System.err.println(words[i]);
            }
        }

        System.out.println("Hay " + count + " palabras que empiezan por vocal");






        //Para crear ficheros

        FileWriter writer = new FileWriter("demo.txt", true); //si no ponemos append, nos reescribe siempre el archivo
        writer.write("Hola mundo :D\n");
        writer.write("Segunda linea\n");
        writer.close();

        File file = new File("demo.txt");
        Scanner scannerReadFile = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();


        //cambio



    }

    //Ejercicio 1
    public static String productFormatter(String productName, String date){

        String newString;

        newString = productName + "_" + date;

        return newString.trim().replace(" ", "").toUpperCase();
    }



}


