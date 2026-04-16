package iunidade.array;

public class ExerciciosEmSala {

    public static void main(String[] args) {
        ExerciciosEmSala ex = new ExerciciosEmSala();
        ex.primeiraAula();
    }

    public void primeiraAula() {
        //1. Declarar um iunidade.array sem utilizar a inicialização direta e imprimir um elemento qualquer
        int[] elementos = new int[5];
        System.out.println(elementos[2]);

        //2. Impressão de elemento igual ao tamanho do vetor declarado
        //System.out.println(elementos[5]);//linha comentada para permitir a execução

        //3. Repetir para booleans e Strings
        boolean[] meusBooleans = new boolean[5];
        System.out.println(meusBooleans[2]);
        String[] minhasStrings = new String[5];
        System.out.println(minhasStrings[2]);

        //4. Dado o seguinte iunidade.array de inteiros int[] inteiros = {10, 20, 30, 40, 50};, imprima os valores separados por quebra de linha
        int[] inteiros = {10, 20, 30, 40, 50};
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println(inteiros[i]);
        }
        //5. Dado o seguinte iunidade.array de números double[] notas = {7.5, 8.0, 6.5, 9.0};, calcule e imprima a média dos valores.
        double[] notas = {7.5, 8.0, 6.5, 9.0};
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        System.out.println("Media: " + soma/notas.length);

        //6. Dado o seguinte iunidade.array de inteiros int[] numeros = {5, 12, 8, 20, 3};, verifique se o número 8 existe no iunidade.array e imprima a sua posição.
        int[] numeros = {5, 12, 8, 20, 3};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 8) {
                System.out.println("Posicão do número 8: " + i);
            }
        }

        //7. Dado o seguinte iunidade.array de inteiros int[] valores = {1, 2, 3, 2, 4, 2};, substitua todos os valores 2 por 9 e imprima o iunidade.array atualizado.
        int[] valores = {1, 2, 3, 2, 4, 2};
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 2) {
                valores[i] = 9;
            }
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        //8. Dado o seguinte iunidade.array de nomes String[] assentos = {"Ana", null, "Carlos","", "Mariana"};, imprima os índices dos assentos que estão vazios.
        String[] assentos = {"Ana", null, "Carlos","", "Mariana"};
        for (int i = 0; i < assentos.length; i++) {
            if (assentos[i] == null || assentos[i].isEmpty()) {
                System.out.println("Assento " + i + " está vazio");
            }
        }
        //9. Dado o seguinte iunidade.array de idades int[] idades = {18, 20, 25, 30, 22};, calcule e imprima a média das idades.
        int[] idades = {18, 20, 25, 30, 22};
        int somaIdades = 0;
        for (int i = 0; i <idades.length; i++) {
            somaIdades += idades[i];
        }
        System.out.println("Média: " + somaIdades/idades.length);

        //10. Dado o seguinte iunidade.array de inteiros int[] numeros = {15, 3, 27, 8, 19};, determine e imprima o maior e o menor valor do iunidade.array.
        int[] maiorMenor = {15, 3, 27, 8, 19};
        int maior = maiorMenor[0];
        int menor  = maiorMenor[0];
        for (int i = 1; i < maiorMenor.length; i++) {
            if (maiorMenor[i] > maior) {
                maior = maiorMenor[i];
            }
            if (maiorMenor[i] < menor) {
                menor = maiorMenor[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        //11. Dado o seguinte iunidade.array bidimensional representando um hotel String[][] hospedes = new String[][] {{"Rex", "Toto", "Bruce"}, {"Amora", "Dulce", "Brutus"}};, troque o hóspede "Dulce" pelo hóspede "Barto" e imprima o iunidade.array atualizado.
        String[][] hospedes = new String[][] {{"Rex", "Toto", "Bruce"}, {"Amora", "Dulce", "Brutus"}};

        for (int i = 0; i < hospedes.length; i++) {
            for (int j = 0; j < hospedes[i].length; j++) {
                if (hospedes[i][j].equals("Dulce")) {
                    hospedes[i][j] = "Barto";
                }
            }
        }

        for (int i = 0; i < hospedes.length; i++) {
            for (int j = 0; j < hospedes[i].length; j++) {
                System.out.println("Andar "  + i + " - quarto " + j + " - hospede: " + hospedes[i][j]);
            }
        }
    }
}
