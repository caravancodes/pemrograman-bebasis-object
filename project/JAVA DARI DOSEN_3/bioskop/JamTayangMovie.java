package id.d3if.java.projectpbo.bioskop;

public class JamTayangMovie {

	String idJamTayang, waktuJamTayang;

	public JamTayangMovie() {
	}
	
	public JamTayangMovie(String idJamTayang, String waktuJamTayang) {
		setIdJamTayang(idJamTayang); setWaktuJamTayang(waktuJamTayang);
	}

	public String getIdJamTayang() {
		return idJamTayang;
	}

	public void setIdJamTayang(String idJamTayang) {
		this.idJamTayang = idJamTayang;
	}

	public String getWaktuJamTayang() {
		return waktuJamTayang;
	}

	public void setWaktuJamTayang(String waktuJamTayang) {
		this.waktuJamTayang = waktuJamTayang;
	}

}
