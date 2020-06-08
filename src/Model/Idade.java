package Model;

import java.util.Arrays;

public class Idade {
    // Atributos
    private int[] idades;

    // Acessores
    public int[] getIdades() {
        return idades;
    }
    public void setIdades(int[] idades) {
        this.idades = idades;
    }

    // Construtor
    public Idade(int idx) {
        this.idades = new int[idx];
    }

    // Métodos
    public void cadastrarIdade(int i, int idade) {
        this.idades[i] = idade;
    }

    public double calcularMediaIdades() {
        double sum = 0;

        for (int i = 0; i < this.idades.length; i++) {
            sum = sum + this.idades[i];
        }

        return sum / this.idades.length;
    }

    public int maiorIdade() {
        int max = 0;

        for(int i = 0; i < this.idades.length; i++)
        {
            if(max < this.idades[i])
            {
                max = this.idades[i];
            }
        }

        return max;
    }

    public int contarMaioresIdade() {
        int acum = 0;

        for (int i = 0; i < this.idades.length; i++) {
            if (this.idades[i] >= 18) {
                acum++;
            }
        }

        return acum;
    }

    // toString
    @Override
    public String toString() {
        return "Idades digitadas: " + Arrays.toString(idades);
    }
}
