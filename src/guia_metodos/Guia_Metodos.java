package guia_metodos;

import java.util.Random;
import java.util.Scanner;

public class Guia_Metodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecla = new Scanner(System.in);
// EJERCICIO 1 DE LA GUIA        
        System.out.println("EJERCICIO 1 DE LA GUIA: Nums aleatorios");
        System.out.printf("Ingrese el limite inferior: ");
        int num1 = teclado.nextInt();
        System.out.printf("Ingrese el limite Superior: ");
        int num2 = teclado.nextInt();
        Guia_Metodos aleatorio = new Guia_Metodos();
        int x = aleatorio.Num_alea(num1, num2);
        System.out.println("Su numero es: " + x);
// EJERCICIO 2 DE LA GUIA        
        System.out.println("EJERCICIO 2 DE LA GUIA: Largo de numero");
        System.out.printf("Ingrese el numero: ");
        int num3 = teclado.nextInt();
        Guia_Metodos largo = new Guia_Metodos();
        int y = largo.Largo_numero(num3);
        System.out.println("El largo del numero es: " + y);
// EJERCICIO 3 DE LA GUIA
        System.out.println("EJERCICIO 3 DE LA GUIA: Conversor de temp");
        System.out.printf("Ingrese una temperatura en Celsius: ");
        int num4 = teclado.nextInt();
        Guia_Metodos temp = new Guia_Metodos();
        float grados = temp.CambioTemp(num4);
        System.out.println("Los grados Farenheit son: " + grados);
// EJERCICIO 4 DE LA GUIA
        System.out.println("EJERCICIO 4 DE LA GUIA: IMC");
        System.out.printf("Ingrese su peso: ");
        int num5 = teclado.nextInt();
        System.out.printf("Ingrese su altura: ");
        float num6 = teclado.nextInt();
        Guia_Metodos imc = new Guia_Metodos();
        float IMCTOTAL = imc.IndiceMasa(num5, num6);
        System.out.println("Su IMC es: " + IMCTOTAL);
// EJERCICIO 5 DE LA GUIA
        System.out.println("EJERCICIO 5 DE LA GUIA: Dia de la semana");
        System.out.printf("Ingrese el dia que desea: ");
        int num7 = teclado.nextInt();
        Guia_Metodos dia = new Guia_Metodos();
        String z = dia.DiaSemana(num7);
        System.out.println(z);
// EJERCICIO 6 DE LA GUIA
        System.out.println("EJERCICIO 6 DE LA GUIA: Divisores");
        System.out.printf("Ingrese un numero: ");
        int num8 = teclado.nextInt();
        Guia_Metodos div = new Guia_Metodos();
        div.Divisores(num8);
// EJERCICIO 7 DE LA GUIA
        System.out.println("EJERCICIO 7 DE LA GUIA: Binario");
        System.out.printf("Ingrese un numero binario: ");
        String binario = tecla.nextLine();
        Guia_Metodos bin = new Guia_Metodos();
        boolean sel = bin.NumeroBinario(binario);
        if (sel == true) {
            System.out.println("Numero Valido");
        } else if (sel == false) {
            System.out.println("Numero Invalido");
        }
// EJERCICIO 8 DE LA GUIA
        System.out.println("EJERCICIO 8 DE LA GUIA: Incluir IVA");
        System.out.printf("Ingrese un numero: ");
        int num9 = teclado.nextInt();
        Guia_Metodos iva = new Guia_Metodos();
        float ivainc = iva.AgregarIva(num9);
        System.out.println("El total mas IVA es: " + ivainc);
// EJERCICIO 9 DE LA GUIA
        System.out.println("EJERCICIO 9 DE LA GUIA: Numero primo");
        System.out.printf("Ingrese un numero: ");
        int num10 = teclado.nextInt();
        Guia_Metodos primo = new Guia_Metodos();
        boolean p = primo.EsPrimo(num10);
        if (p == true) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es Primo");
        }
// EJERCICIO 10 DE LA GUIA
        System.out.println("EJERCICIO 10 DE LA GUIA: tabla de multiplicar");
        System.out.printf("Ingrese un numero: ");
        int num11 = teclado.nextInt();
        Guia_Metodos multi = new Guia_Metodos();
        multi.TablaMulti(num11);
// EJERCICIO 11 DE LA GUIA
        System.out.println("EJERCICIO 11 DE LA GUIA: Cambio de moneda");
        System.out.printf("Ingrese un valor en pesos chilenos: ");
        int num12 = teclado.nextInt();
        Guia_Metodos cambio = new Guia_Metodos();
        cambio.CambioMoneda(num12);
// EJERCICIO 12 DE LA GUIA
        System.out.println("EJERCICIO 12 DE LA GUIA: Valores");
        System.out.printf("Ingrese un numero: ");
        int num13 = teclado.nextInt();
        Guia_Metodos nums = new Guia_Metodos();
        nums.numeros(num13);
// EJERCICIO 13 DE LA GUIA
        System.out.println("EJERCICIO 13 DE LA GUIA: Vector invertido");
        System.out.printf("Ingrese un numero: ");
        int num14 = teclado.nextInt();
        Guia_Metodos vector = new Guia_Metodos();
        vector.VectorInvertido(num14);

// EJERCICIO 14 DE LA GUIA
        System.out.println("EJERCICIO 14 DE LA GUIA: Vector invertido");
        int num15 = 0;
        Guia_Metodos mayorigual = new Guia_Metodos();
        mayorigual.VectorMayorIgual(num15);

// EJERCICIO 15 DE LA GUIA
        System.out.println("EJERCICIO 15 DE LA GUIA: Aleatorio segun boolean");

// EJERCICIO 16 DE LA GUIA
        System.out.println("EJERCICIO 16 DE LA GUIA: Vector invertido");
        System.out.printf("Ingrese un numero: ");
        int num17 = teclado.nextInt();
        Guia_Metodos largovector = new Guia_Metodos();
        largovector.LargoVector(num17);
    }

    // METODO EJERCICIO 1
    public int Num_alea(int num1, int num2) {
        Random rnd = new Random();
        int aleato = rnd.nextInt((num2 - num1) + 1) + num1;
        return aleato;
    }

    // METODO EJERCICIO 2
    public int Largo_numero(int num3) {
        int cantidad = 0;
        while (num3 > 0) {
            num3 = num3 / 10;
            cantidad++;
        }
        return cantidad;
    }

    // METODO EJERCICIO 3
    public float CambioTemp(int num4) {
        float faren = (float) ((num4 * 1.8) + 32);
        return faren;
    }

    // METODO EJERCICIO 4
    public float IndiceMasa(int num5, float num6) {
        num6 = (int) Math.pow(num6, 2);
        float indice = num5 / num6;
        return indice;
    }

    // METODO EJERCICIO 5
    public String DiaSemana(int num7) {
        String seleccion = "";
        String[] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";
        if ((num7 > 0) && (num7 < 8)) {
            seleccion = dias[num7 - 1];
        } else {
            seleccion = "Dia Invalido";
        }
        return seleccion;
    }

    // METODO EJERCICIO 6
    public void Divisores(int num8) {
        System.out.println("Los divisores de " + num8 + " son: ");
        for (int i = 1; i <= num8; i++) {
            if (num8 % i == 0) {
                System.out.println(i);
            }
        }
    }

    // METODO EJERCICIO 7
    public boolean NumeroBinario(String binario) {
        for (int i = 0; i < binario.length(); i++) {
            if ((binario.charAt(i) != 0) && (binario.charAt(i) != 1)) {
                return false;
            }
        }
        return true;
    }

    // METODO EJERCICIO 8
    public float AgregarIva(int num9) {
        float total = (float) (num9 * 1.19);
        return total;
    }

    // METODO EJERCICIO 9
    public boolean EsPrimo(int num10) {
        int contador = 0;
        for (int i = 1; i <= num10; i++) {
            if (num10 % i == 0) {
                contador++;
            }
        }
        if (contador != 2) {
            return false;
        } else {
            return true;
        }
    }

    // METODO EJERCICIO 10
    public void TablaMulti(int num11) {
        for (int i = 0; i <= 12; i++) {

            System.out.println(num11 + " x " + i + " = " + (num11 * i));
        }
    }

    // METODO EJERCICIO 11
    public void CambioMoneda(int num12) {
        float dolar = (float) num12 / 651;
        System.out.println("El Valor de " + num12 + " pesos, en dolares es: " + dolar + " dolares");
    }

    // METODO EJERCICIO 12
    public void numeros(int num13) {
        if (num13 > 0) {
            for (int i = 0; i <= num13; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= num13; i--) {
                System.out.println(i);
            }
        }
    }

    // METODO EJERCICIO 13
    public void VectorInvertido(int num14) {
        int[] invertir = new int[num14];
        Random random = new Random();
        for (int i = 0; i <= num14; i++) {
            invertir[i] = random.nextInt(101);
        }
        for (int i = num14 - 1; i >= 0; i--) {
            System.out.println(invertir[i]);
        }
    }

    // METODO EJERCICIO 14
    public void VectorMayorIgual(int num15) {
        int[] mayorigual = new int[10];
        Random rnd = new Random();
        int numero = 0;
        mayorigual[0] = rnd.nextInt();
        System.out.println(mayorigual[0]);
        for (int i = 1; i < 10;) {
            numero = rnd.nextInt();
            if (numero >= mayorigual[i - 1]) {
                mayorigual[i] = numero;
                i++;
                System.out.println(mayorigual[i]);
            }
        }
    }

    // METODO EJERCICIO 15
    public void mostrarAleatorio(boolean rnd1) {
        int[] aleatorio = new int[10];
        Random rnd = new Random();
        if (rnd1 == true) {
            for (int i = 0; i < 10; i++) {
                aleatorio[i] = rnd.nextInt(101);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                aleatorio[i] = rnd.nextInt(101) * -1;
            }
        }
    }

    // METODO EJERCICIO 16
    public float LargoVector(int num17) {
        Random rnd = new Random();
        int suma = 0;
        int[] vector1 = new int[num17];
        for (int i = 0; i <= num17; i++) {
            vector1[i] = (rnd.nextInt(51) * 2);
            suma = suma + vector1[i];
            System.out.println(vector1[i]);
        }
        float prom = suma / num17;
        return prom;
    }
}
