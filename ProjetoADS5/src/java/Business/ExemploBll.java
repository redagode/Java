/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Interface.IExemploBll;
import DataAccess.Interface.IExemploDal;
import Entity.Exemplo;
import javax.inject.Inject;

/**
 *
 * @author matheusdsl
 */
public class ExemploBll implements IExemploBll {

    @Inject
    private IExemploDal ExemploDal;
    
    @Override
    public Exemplo Buscar() {
        return this.ExemploDal.Buscar();
    }

    
}
