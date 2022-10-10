package com.bootcamp;

public class Main {
    public static void main(String[] args) {

        Integer numeroIf = 0;
        estructuraIF(numeroIf);

        Integer numeroWhile = 0;
        var estWhile = estructuraWhile(numeroWhile);
        estructuraDoWhile(estWhile);

        estructuraFor();

        String estacion = "Primavera";
        estructuraSwitch(estacion);

    }

    public static void estructuraIF(Integer numeroIf) {
        if(numeroIf > 0) {
            System.out.println(numeroIf + " es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es un numero negativo");
        } else {
            System.out.println(numeroIf + " es cero");
        }
    }

    public static Integer estructuraWhile(Integer numeroWhile) {
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        return numeroWhile;
    }

    public static Integer estructuraDoWhile(Integer numeroWhile) {
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        return numeroWhile;
    }

    public static void estructuraFor() {
        for (Integer numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void estructuraSwitch(String estacion) {
        switch (estacion) {
            case "Primavera":
            case "Verano":
            case "Otoño":
            case "Invierno":
                System.out.println("La estacion es: " + estacion);
                break;
            default:
                System.out.println(estacion + " no es una estación");
        }
    }
}
