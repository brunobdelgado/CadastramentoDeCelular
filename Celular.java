package celular;

import java.util.Scanner;

public class Celular {

    String marca, modelo, processador, cartaoMemoria;
    int peso, memoriaRam, armarInterno;
    double tamanhoTela;

    public void setMarca(String mar) {
        marca = mar;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setProcessador(String proc) {
        processador = proc;
    }

    public String getProcessador() {
        return processador;
    }

    public void setCTMem(String ctmem) {
        cartaoMemoria = ctmem;
    }

    public String getCTMem() {
        return cartaoMemoria;
    }

    public void setTtela(double Ttela) {
        tamanhoTela = Ttela;
    }

    public double getTtela() {
        return tamanhoTela;
    }

    public void setPeso(int Peso) {
        peso = Peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setMRam(int MRam) {
        memoriaRam = MRam;
    }

    public int getMRam() {
        return memoriaRam;
    }

    public void setAInt(int AInt) {
        armarInterno = AInt;
    }

    public int getAInt() {
        return armarInterno;
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Marca do Celular :");
        setMarca(entrada.nextLine());
        System.out.println("Digite o Modelo do Celular :");
        setModelo(entrada.nextLine());
        System.out.println("Digite o Processador do Celular :");
        setProcessador(entrada.nextLine());
        System.out.println("Digite a Quantidade do Cartão de Memória :");
        setCTMem(entrada.nextLine());
        System.out.println("Digite o Peso do Celular :");
        setPeso(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite a Memória Ram do Celular :");
        setMRam(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite a quantidade de Armazenamento do Celular :");
        setAInt(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o Tamanho da Tela do Celular :");
        setTtela(Double.parseDouble(entrada.nextLine()));

    }

    public void imprimir() {
        System.out.println("----------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Processador: " + getProcessador());
        System.out.println("Cartão de Memória: " + getCTMem());
        System.out.println("Peso: " + getPeso());
        System.out.println("Memória Ram: " + getMRam());
        System.out.println("Armazenamento Interno: " + getAInt());
        System.out.println("Tamanho da Tela: " + getTtela());
    }
}
