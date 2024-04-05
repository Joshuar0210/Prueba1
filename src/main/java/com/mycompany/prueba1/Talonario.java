/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Joshuar
 */

class Talonario {
    private  String name;
        private int numero;
        private int numeroBoletos;

        public Talonario(int numero, int numeroBoletos, String name) {
            this.numero = numero;
            this.numeroBoletos = numeroBoletos;
            this.name=name;
            
        }

    public Talonario() {
    }

        public int getNumero() {
            return numero;
        }
        public String getName()
        {
            return name;
        }
        
        public int getNumeroBoletos() {
            return numeroBoletos;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumeroBoletos(int numeroBoletos) {
        this.numeroBoletos = numeroBoletos;
    }
        
        
    }

