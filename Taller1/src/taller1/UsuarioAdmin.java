/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc12
 */
public class UsuarioAdmin {

     //declarar la lista
    List<UsuarioModel>lista= new ArrayList<>();
    
    public void Guardar (UsuarioModel modelo){
        lista.add(modelo);
        
    }
    
    public List<UsuarioModel>Mostrar(){
        return lista;
    }
}
