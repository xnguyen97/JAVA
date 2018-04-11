/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh;

/**
 *
 * @author admin
 */
public class StudentInfo {
    private String ten;
    private String ns;
    private String gt;
    private int STT;
    public void setSTT(int stt)
    {
           this.STT=stt;
    }
    public int getStt(){
        return STT;
    }
    public void setHoTen(String ten)
    {
           this.ten=ten;
    }
    public String getHoTen(){
        return ten;
    }
    
    public void setGT(String gt)
    {
           this.gt=gt;
    }
    public String getGT(){
        return gt;
    }
    
    public void setNS(String ns)
    {
           this.ns=ns;
    }
    public String getNS(){
        return ns;
    }
}
 