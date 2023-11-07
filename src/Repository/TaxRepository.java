/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.TaxDAO;

/**
 *
 * @author Xuan Vinh
 */
public class TaxRepository implements ITaxRepository{

    @Override
    public void addFamily() {
        TaxDAO.Instance().addFamily();
    }
    
}
