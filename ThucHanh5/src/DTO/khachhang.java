/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class khachhang {
    private String mkh;
    private String tencongty;
    private String tengiaodich;
    private String diachi;
    private String email;
    private String dienthoai;

        public void setmkh(String mkh)
    {
           this.mkh=mkh;
    }
    public String getmkh(){
        return mkh;
    }
        public void settencongty(String tencongty)
    {
           this.tencongty=tencongty;
    }
    public String gettencongty(){
        return tencongty;
    }
    
    public void settengiaodich(String tengiaodich)
    {
           this.tengiaodich=tengiaodich;
    }
    public String gettengiaodich(){
        return tengiaodich;
    }
            public void setdiachi(String diachi)
    {
           this.diachi=diachi;
    }
    public String getdiachi(){
        return diachi;
    }
            public void setemail(String email)
    {
           this.email=email;
    }
    public String getemail(){
        return email;
    }
            public void setdienthoai(String dienthoai)
    {
           this.dienthoai=dienthoai;
    }
    public String getdienthoai(){
        return dienthoai;
    }
}
