
package aplicacion;


public class Datos {
     private String  semana;
    private String ingreso;
    private String salida;
    private String contenido;
    private String obser;
      
    public Datos(String semana, String ingreso, String salida, String contenido, String obser) {
        this.semana = semana;
        this.ingreso = ingreso;
        this.salida= salida;
        this.contenido = contenido;
        this.obser = obser;
    }

 
      
  
    Datos(String semama,String salida, String contenido,String observacion){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    Object getObservacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
