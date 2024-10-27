package DTOLabComputo;

/**
 *
 * @author Equipo 3
 */
public class computadoraDTO {
    private Long Computadora_ID;
    private String IP;
    private int NumeroPC;
    private String Estatus;
    private boolean estEliminado;
    private String TipoUsuario;
    private centroLabDTO centro;

    public Long getComputadora_ID() {
        return Computadora_ID;
    }

    public void setComputadora_ID(Long Computadora_ID) {
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

    public centroLabDTO getCentro() {
        return centro;
    }

    public void setCentro(centroLabDTO centro) {
        this.centro = centro;
    }
    
    
    
    
    
}
