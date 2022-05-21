
public class Site {
	public String url;
	public Internauta visitas[];
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Internauta[] getVisitas() {
		return visitas;
	}
	public void setVisitas(Internauta[] visitas) {
		this.visitas = visitas;
	}
	public Site(String url, Internauta[] visitas) {
		super();
		this.url = url;
		this.visitas = visitas;
	}
}
