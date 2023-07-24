/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.chuongtrinh;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Date implements Serializable{
    private int D, M, Y;

    public Date() {
    }

    public Date(int D, int M, int Y) {
        this.D = D;
        this.M = M;
        this.Y = Y;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return D + "/" + M + "/" + Y;
    }
    
    
}
