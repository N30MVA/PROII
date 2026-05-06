package com.mycompany.bloque2;
import java.util.List;
import java.util.function.Predicate;

public class Bloque2 {

    public static void main(String[] args) {
        ClubDeportivo club=new ClubDeportivo(15);    
        
        Corredor dep1=new Corredor(15.2, "12345678A", "Paco", "ABC", 19);
        Marca m1=new Marca(17, 100, "Ref 1", 2, 1, 2005);
        dep1.anadirMarca(m1);
        club.insertaDeportista(dep1);
        
        Nadador dep2=new Nadador(10.1, "87654321B", "Marta", "CBA", 21);
        Marca m2=new Marca(16, 50, "Ref 2", 1, 2, 2005);
        Marca m3=new Marca(13, 55, "Ref 3", 3, 3, 2005);
        dep2.anadirMarca(m2);
        dep2.anadirMarca(m3);
        club.insertaDeportista(dep2);
        
        System.out.println("---TODOS LOS DEPORITSTAS---");
        for(int i=0; i<club.getNumDeportistas(); i++){
            System.out.println(club.getDeportista(i));
        }
        
        System.out.println("\n---NADADORES---");
        List<Deportista> nadadores=club.filtrarDeportista(d->d instanceof Nadador);
        for(Deportista n:nadadores){
            System.out.println(n);
        }
    }
}
