/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOLabComputo;

/**
 *
 * @author cesar
 */
public class computadoraDTO {
    private int Computadora_ID;
    private String IP;
    private int NumeroPC;
    private String Estatus;
    private boolean estEliminado;
    private String TipoUsuario;

    
    
    
    public int getComputadora_ID() {
        return Computadora_ID;
    }

    public void setComputadora_ID(int Computadora_ID) {
        this.Computadora_ID = Computadora_ID;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getNumeroPC() {
        return NumeroPC;
    }

    public void setNumeroPC(int NumeroPC) {
        this.NumeroPC = NumeroPC;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public boolean isEstEliminado() {
        return estEliminado;
    }

    public void setEstEliminado(boolean estEliminado) {
        this.estEliminado = estEliminado;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
    
    
    
    
    
}
