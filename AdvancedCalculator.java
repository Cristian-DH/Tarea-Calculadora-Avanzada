
import java.util.Scanner; // Importamos la clase Scanner desde la librería estándar

public class AdvancedCalculator { // Declaramos la clase pública llamada AdvancedCalculator

    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer datos desde teclado
        int opcion; // Declaramos una variable entera para guardar la opción del usuario

        do { // Iniciamos un bucle do-while que se ejecuta al menos una vez

            mostrarMenu(); // Llamamos al método que imprime el menú en pantalla
            System.out.print("Seleccione una opción: "); // Mostramos mensaje solicitando opción
            opcion = scanner.nextInt(); // Guardamos la opción ingresada por el usuario

            switch (opcion) { // Evaluamos el valor de la opción usando switch moderno

                case 1 -> { // Caso 1: operación suma
                    System.out.print("Ingrese el primer número: "); // Solicitamos el primer número
                    double a = scanner.nextDouble(); // Leemos el primer número ingresado
                    System.out.print("Ingrese el segundo número: "); // Solicitamos el segundo número
                    double b = scanner.nextDouble(); // Leemos el segundo número ingresado
                    System.out.println("Resultado: " + sumar(a, b)); // Mostramos el resultado llamando a la función sumar
                } // Fin del bloque del case 1

                case 2 -> { // Caso 2: operación resta
                    System.out.print("Ingrese el primer número: "); // Pedimos el primer valor
                    double a = scanner.nextDouble(); // Guardamos el primer valor
                    System.out.print("Ingrese el segundo número: "); // Pedimos el segundo valor
                    double b = scanner.nextDouble(); // Guardamos el segundo valor
                    System.out.println("Resultado: " + restar(a, b)); // Mostramos el resultado de la resta
                } // Fin del bloque del case 2

                case 3 -> { // Caso 3: operación multiplicación
                    System.out.print("Ingrese el primer número: "); // Pedimos el primer número
                    double a = scanner.nextDouble(); // Leemos el primer número
                    System.out.print("Ingrese el segundo número: "); // Pedimos el segundo número
                    double b = scanner.nextDouble(); // Leemos el segundo número
                    System.out.println("Resultado: " + multiplicar(a, b)); // Mostramos el resultado de la multiplicación
                } // Fin del bloque del case 3

                case 4 -> { // Caso 4: operación división
                    System.out.print("Ingrese el primer número: "); // Pedimos el numerador
                    double a = scanner.nextDouble(); // Guardamos el numerador
                    System.out.print("Ingrese el segundo número: "); // Pedimos el denominador
                    double b = scanner.nextDouble(); // Guardamos el denominador

                    if (b == 0) { // Verificamos si el divisor es cero
                        System.out.println("❌ Error: No se puede dividir por cero."); // Mostramos mensaje de error
                    } else { // Si el divisor es válido
                        System.out.println("Resultado: " + dividir(a, b)); // Mostramos el resultado de la división
                    } // Fin del if-else
                } // Fin del bloque del case 4

                case 5 -> { // Caso 5: operación potencia
                    System.out.print("Ingrese la base: "); // Pedimos la base
                    double base = scanner.nextDouble(); // Guardamos la base
                    System.out.print("Ingrese el exponente: "); // Pedimos el exponente
                    double exponente = scanner.nextDouble(); // Guardamos el exponente
                    System.out.println("Resultado: " + potencia(base, exponente)); // Mostramos el resultado de la potencia
                } // Fin del bloque del case 5

                case 6 -> { // Caso 6: operación raíz cuadrada
                    System.out.print("Ingrese un número: "); // Pedimos el número
                    double numero = scanner.nextDouble(); // Guardamos el número ingresado

                    if (numero < 0) { // Verificamos si el número es negativo
                        System.out.println("❌ Error: No se puede calcular raíz de número negativo."); // Mostramos error
                    } else { // Si el número es válido
                        System.out.println("Resultado: " + raizCuadrada(numero)); // Mostramos la raíz cuadrada
                    } // Fin del if-else
                } // Fin del bloque del case 6

                case 7 -> { // Caso 7: operación módulo (residuo)
                    System.out.print("Ingrese el primer número: "); // Pedimos el dividendo
                    double a = scanner.nextDouble(); // Guardamos el dividendo
                    System.out.print("Ingrese el segundo número: "); // Pedimos el divisor
                    double b = scanner.nextDouble(); // Guardamos el divisor

                    if (b == 0) { // Validamos que el divisor no sea cero
                        System.out.println("❌ Error: No se puede calcular módulo con divisor 0."); // Mostramos error
                    } else { // Si el divisor es válido
                        System.out.println("Resultado: " + modulo(a, b)); // Mostramos el resultado del módulo
                    } // Fin del if-else
                } // Fin del bloque del case 7

                case 8 -> System.out.println("👋 Saliendo del programa..."); // Caso 8: mensaje de salida del programa

                default -> System.out.println("❌ Opción inválida."); // Caso por defecto si la opción no existe
            } // Fin del switch

        } while (opcion != 8); // Condición para repetir el menú hasta que el usuario elija salir

        scanner.close(); // Cerramos el Scanner para liberar recursos del sistema
    } // Fin del método main

    public static void mostrarMenu() { // Método que imprime el menú en consola
        System.out.println("\n========= CALCULADORA PRO MAX Ver.LIMITADA ========="); // Imprimimos el título del menú
        System.out.println("1. Sumar"); // Mostramos opción 1
        System.out.println("2. Restar"); // Mostramos opción 2
        System.out.println("3. Multiplicar"); // Mostramos opción 3
        System.out.println("4. Dividir"); // Mostramos opción 4
        System.out.println("5. Potencia"); // Mostramos opción 5
        System.out.println("6. Raíz cuadrada"); // Mostramos opción 6
        System.out.println("7. Módulo (Residuo)"); // Mostramos opción 7
        System.out.println("8. Salir"); // Mostramos opción 8
        System.out.println("========================================"); // Línea de cierre decorativa
    } // Fin del método mostrarMenu

    public static double sumar(double a, double b) { // Método que recibe dos números para sumar
        return a + b; // Retorna la suma de los dos valores
    } // Fin del método sumar

    public static double restar(double a, double b) { // Método que recibe dos números para restar
        return a - b; // Retorna la resta de los valores
    } // Fin del método restar

    public static double multiplicar(double a, double b) { // Método que recibe dos números para multiplicar
        return a * b; // Retorna el resultado de la multiplicación
    } // Fin del método multiplicar

    public static double dividir(double a, double b) { // Método que recibe dos números para dividir
        return a / b; // Retorna el resultado de la división
    } // Fin del método dividir

    public static double potencia(double base, double exponente) { // Método para calcular potencia sin usar Math.pow
        double resultado = 1; // Inicializamos la variable resultado en 1

        for (int i = 0; i < (int) exponente; i++) { // Bucle que se repite tantas veces como el exponente
            resultado *= base; // Multiplicamos el resultado por la base en cada iteración
        } // Fin del bucle for

        return resultado; // Retornamos el resultado final de la potencia
    } // Fin del método potencia

    public static double raizCuadrada(double numero) { // Método que calcula la raíz cuadrada
        return Math.sqrt(numero); // Retorna la raíz cuadrada usando función de Java
    } // Fin del método raizCuadrada

    public static double modulo(double a, double b) { // Método que calcula el residuo de una división
        return a % b; // Retorna el residuo usando el operador módulo
    } // Fin del método modulo
}
