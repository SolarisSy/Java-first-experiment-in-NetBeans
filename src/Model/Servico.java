/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tiago
 */
public class Servico {
    
    private int id;
    private String descricao;
    private float valor;

    /**
     * Construtor completo de um servico
     * @param id identificador do servico
     * @param descricao é o nome do servico por exemplo "corte", ou "barba"
     * @param valor é o valor padrao que o servico custa, o valor passado aqui será recomendado como preco desse servico
     */
    
    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    /**
     * Esse cliente foi criado a partir da função da IDE e passando as informações desejadas do modelo
     * que foi criado
     * 
     * A public servico tá acessível diferentemente das suas variáveis internas
     */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /***
     * Esses getters e setters do modelo criado pode ser construído automaticamente
     * à partir da IDE apertando ALT + INSERT na opção gerar Getters e Setters
     */
    
    @Override
    public String toString() {
        return getDescricao();
    }
       
    
}
