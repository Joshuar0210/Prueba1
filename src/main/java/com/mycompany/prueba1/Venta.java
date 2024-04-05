

package com.mycompany.prueba1;

/**
 *
 * @author Joshuar
 */
class Venta {
        private int numeroTalonario;
        private int numeroBoletosVendidos;

        public Venta(int numeroTalonario, int numeroBoletosVendidos) {
            this.numeroTalonario = numeroTalonario;
            this.numeroBoletosVendidos = numeroBoletosVendidos;
        }

        public int getNumeroTalonario() {
            return numeroTalonario;
        }

        public int getNumeroBoletosVendidos() {
            return numeroBoletosVendidos;
        }
}      
