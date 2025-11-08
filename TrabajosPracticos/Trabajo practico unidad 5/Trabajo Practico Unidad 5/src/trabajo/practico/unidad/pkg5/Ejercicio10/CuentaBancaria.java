
package trabajo.practico.unidad.pkg5.Ejercicio10;


public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular; 

    public CuentaBancaria(int cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.setClave(new ClaveSeguridad("654563","28/10")); 
        
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public int getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }
    

    public void mostrarCta(){
        System.out.println(toString());
    }
    
    
}


  /*
        a. Composición: CuentaBancaria → ClaveSeguridad 
        b. Asociación bidireccional: CuentaBancaria ↔ Titular  
        */