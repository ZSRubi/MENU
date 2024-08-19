package Restaurante;

// Perceptron es una clase que implementa un modelo de red neuronal simple conocido como perceptrón

import java.util.Random;

public class Perceptron {

    // Array que almacena los pesos del perceptrón
    private double[] weights;

    // Tasa de aprendizaje para actualizar los pesos
    private double learningRate;

    // Tamaño del vector de entrada (número de características)
    private int inputSize;

    // Constructor de la clase Perceptron
    // Inicializa el perceptrón con un tamaño de entrada y una tasa de aprendizaje
    public Perceptron(int inputSize, double learningRate) {
        this.inputSize = inputSize;
        this.learningRate = learningRate;

        // Inicializa el array de pesos con un tamaño igual al número de entradas más uno para el término de sesgo (bias)
        this.weights = new double[inputSize + 1];

        // Inicializa un objeto Random para generar pesos aleatorios
        Random rand = new Random();

        // Inicializa los pesos aleatoriamente
        for (int i = 0; i < weights.length; i++) {
            weights[i] = rand.nextDouble();
        }
    }

    // Función de activación que decide la salida del perceptrón
    // Aquí se utiliza la función de paso (step function) que devuelve 1 si la suma es mayor que 0, de lo contrario 0
    private double activate(double sum) {
        return sum > 0 ? 1.0 : 0.0;
    }

    // Método para entrenar el perceptrón
    // Recibe las entradas, las etiquetas y el número de épocas (iteraciones)
    public void train(double[][] inputs, double[] labels, int epochs) {
        // Itera a través de las épocas
        for (int epoch = 0; epoch < epochs; epoch++) {
            // Itera a través de todos los ejemplos de entrenamiento
            for (int i = 0; i < inputs.length; i++) {
                double[] input = inputs[i]; // Entrada actual
                double label = labels[i];   // Etiqueta correcta para la entrada actual

                // Realiza una predicción para la entrada actual
                double prediction = predict(input);

                // Calcula el error como la diferencia entre la etiqueta real y la predicción
                double error = label - prediction;

                // Actualiza los pesos basándose en el error
                // Ajusta los pesos para cada característica
                for (int j = 0; j < weights.length - 1; j++) {
                    weights[j] += learningRate * error * input[j];
                }

                // Actualiza el peso del término de sesgo
                weights[weights.length - 1] += learningRate * error;
            }
        }
    }

    // Método para realizar una predicción con el perceptrón
    public double predict(double[] input) {
        double sum = 0.0;

        // Calcula la suma ponderada de las entradas
        for (int i = 0; i < input.length; i++) {
            sum += input[i] * weights[i];
        }

        // Agrega el término de sesgo
        sum += weights[weights.length - 1];

        // Devuelve la salida de la función de activación
        return activate(sum);
    }
}
