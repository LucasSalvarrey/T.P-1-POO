package tpn1poo;


import javax.swing.JOptionPane;

public class Jugadores {
	private String username;
	private boolean vivo;
	private boolean eliminado;
	
	public Jugadores(String username, String vivo, String eliminado) {
		super();
		this.username = username;
		this.vivo = true;
		this.eliminado = true;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	@Override
	public String toString() {
		return "Jugadores [username=" + username + ", vivo=" + vivo + ", eliminado=" + eliminado + "]";
	}
	
	public boolean Vivo(boolean vivo) {
		return true;
	}
	public boolean Eliminado(boolean eliminado) {
		return true;
	}
	
	
}