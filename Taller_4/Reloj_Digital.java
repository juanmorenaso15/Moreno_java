package Taller_4;

public class Reloj_Digital {

    // 7. Reloj digital (versión super simple)
    public static void main(String[] args) {

        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    try {
                        Thread.sleep(1000); // Pausa de 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}