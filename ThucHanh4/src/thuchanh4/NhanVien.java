/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh4;

/**
 *
 * @author admin
 */
public class NhanVien {
    
   private String manv;
   private String px;
   private float ssp;
   private float luong;
   
   public void setmanv(String manv)
   {    
       this.manv=manv;
   }
   public String getmanv(){
       return manv;
   }
   public void setpx(String px)
   {
       this.px=px;
   }
   public String getpx()
   {
       return px;
   }
   public void setssp(float ssp)
   {
       this.ssp=ssp;
   }
    public float getssp()
    {
        return ssp;
    }
    //
    public  float getChuan()
    {
        if(px=="A") return 300;
        else return 500;
    }    
    //
    public boolean VuotChuan()
    {
        if(ssp>getChuan()) return true;
        else return false;
    }
    //
    public float TinhLuong()
    {
        if(VuotChuan()==true)   luong=(ssp-getChuan())*30000 +getChuan()*20000;
        else luong= ssp*20000;
        return luong;
    }
       
    
    
}
