package com.mycompany.practica_5;

public class Autor {
    private String orcid;
    private String apellidos;
    private String nombre;
    private String institucion;
    
    public Autor(String orcid, String apellidos, String nombre, String institucion){
        this.orcid=orcid;
        this.apellidos=apellidos;
        this.nombre=nombre;
        this.institucion=institucion;
    }
    
    public String getOrcid(){
        return orcid;
    }
    
    public void setOrcid(String orcid){
        this.orcid=orcid;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getInstitucion(){
        return institucion;
    }
    
    public void setInstitucion(String institucion){
        this.institucion=institucion;
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append("[ Orcid:").append(getOrcid());
        salida.append(" || Apellidos: ").append(getApellidos());
        salida.append(" || Nombre: ").append(getNombre());
        salida.append(" || Institucion: ").append(getInstitucion()).append(" ]");
        return salida.toString();
    }
}
