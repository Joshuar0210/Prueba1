/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;
//jhasua gay
/**
 *
 * @author Joshuar
 */
   // Clase para representar un boleto
    class Boleto {
        private int numeroTalonario;
        private int numero;

        public Boleto(int numeroTalonario, int numero) {
            this.numeroTalonario = numeroTalonario;
            this.numero = numero;
        }

        public int getNumeroTalonario() {
            return numeroTalonario;
        }

        public int getNumero() {
            return numero;
        }
    }