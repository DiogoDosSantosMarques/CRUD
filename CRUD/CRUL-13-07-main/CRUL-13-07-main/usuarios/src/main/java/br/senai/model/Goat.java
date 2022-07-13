package br.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "goat")
public class Goat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;



    @Size(max=100)
    private String nomeJogador;


    @Size(max=80)
    private String timeAuge;

    @Size(max=50)
    private int posicaoHistoria;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getTimeAuge() {
        return timeAuge;
    }

    public void setTimeAuge(String timeAuge) {
        this.timeAuge = timeAuge;
    }

    public int getPosicaoHistoria() {
        return posicaoHistoria;
    }

    public void setPosicaoHistoria(int posicaoHistoria) {
        this.posicaoHistoria = posicaoHistoria;
    }


    @Override
    public String toString() {
        return "Goat{" +
                "id=" + id +
                ", nomeJogador='" + nomeJogador + '\'' +
                ", timeAuge='" + timeAuge + '\'' +
                ", posicaoHistoria=" + posicaoHistoria +
                '}';
    }
}




