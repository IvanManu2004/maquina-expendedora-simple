public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    //Total dinero acumulado despues de vaciado
    private int getTotalDineroAcumulado;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 20;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Madrid";
    }

    /**
     * Segundo constructor en el que solo se indica ciudad destino y precio billete
     */
    public MaquinaExpendedoraSimple(int precioDelBillete, String destino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = destino;
    }
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }

    /**
     * Devuelve total dinero acumulado
     */
    
    public int getTotalDineroAcumulado() {
         return totalDineroAcumulado;   
    }
    
    /**
     * Cambiar precio billete
     */
    public void setPrecioBillete(int precioBilleteNuevo) {
        precioBillete = precioBilleteNuevo;
    }
    
    /**
     * Reducir precio billete la cantitdad deseada
     */
    public void reducirPrecioBillete(int getreducirPrecioBillete) {
        precioBillete = precioBillete - getreducirPrecioBillete;
    }
    
    /**
     * Vaciar Dinero acumulado
     */
    public void vaciarDepositoDinero(){
        totalDineroAcumulado = 0;
    }
    
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
