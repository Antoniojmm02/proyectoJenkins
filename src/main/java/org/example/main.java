package org.example;
public class main {
    public static boolean dia_laboral(String dia) {
        switch(dia) {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }
}