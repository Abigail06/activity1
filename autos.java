/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagen;

/**
 *
 * @author UTBIS
 */
public class autos {
    
    private String color;
    private boolean status;
    private String nombre;
    private String id;
    private int numpersons;
    
    public autos (String color, boolean status, String nombre, String id, int  numpersons){
        
        this.color=color;
        this.status=status;
        this.nombre=nombre;
        this.id=id;
        this.numpersons=numpersons;
        
        
        
  
    }// cierre de constructor

    autos(String audi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods
    }
    public boolean getprender(){ //obtiene el status
        System.out.println("El coche esta: " +status);
        return status;
        
    }// cierre de getprender
    
     public void setprender(boolean status) { //modifica el status del auto
        this.status = status;
     }
    
    public void color(String b){
        this.color=b;
    }// cierre de color
    
    
    public String getcolor(){ //obtiene el color del auto
        System.out.println("El coche es: " +color);
        return color;
    }// cierre de getcolor 
    
    
    public void setcolor(String color) { //modifica el color del auto
        this.color = color;
    
    }// cierre de setcolor
    public String getnombre(){//obtiene el nombre del auto
        System.out.println("La marca es: " +nombre);
        return nombre;
    }// cierre de getnombre
    
     public void setnombre(String nombre) { //modifica el nombre del auto
        this.nombre = nombre;
     }//cierre setnombre
    
    
   public void id(String d){
        this.id=d;
    }// cierre de id
   public String getid(){//obtiene las placas del auto
        System.out.println("Placas: "+id);
        return id;
    }// cierre de getid
   
    public void setid(String id) {//modifia las placas del auto
        this.id = id;
     }
    
     public void numpersons(int e){ 
        this.numpersons=e;
    }// cierre de numpersons
    public int getnumpersons(){//obtiene el numero de personas
        System.out.println("El coche tiene:  " +numpersons+  "personas");
        return numpersons;
    }// cierre de getnumpersons
      
    
     public void setnumpersons(int numpersons) { //modifica el numero de personas
        this.numpersons = numpersons;
     }
      
        
    }//fin de la clase

