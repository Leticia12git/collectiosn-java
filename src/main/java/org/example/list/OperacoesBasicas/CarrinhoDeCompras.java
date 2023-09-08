package org.example.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    List<Itens> itensList = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Itens("caneta", 2.00, 2));
    }
    public void removerItem(String nome){
        if(itensList.equals(nome));
        itensList.remove(nome);
    }
    public void calcularValorTotal(double preco, int quantidade){
         double valortotal = preco * quantidade;
        System.out.println("O valor total é: " + valortotal);

    }

    public void exibirItens(){
        itensList.size();
    }

    public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    carrinhoDeCompras.adicionarItem("caderno", 2.00, 10);
    carrinhoDeCompras.adicionarItem("caderno", 2.00, 10);
    carrinhoDeCompras.adicionarItem("caderno", 2.00, 10);
    carrinhoDeCompras.adicionarItem("caderno", 2.00, 10);
    carrinhoDeCompras.exibirItens();
    carrinhoDeCompras.removerItem();
    carrinhoDeCompras.calcularValorTotal();
    }
}
