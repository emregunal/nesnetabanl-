
public class evcilHayvan{
	private String  isim;
	public evcilHayvan(String isim){
		this.isim=isim;
		System.out.println(this.isim+" .oynamak istiyor.");
	}
    public String oyna()
    {
    	return(this.isim+" oynamaktan yoruldu.");
    }
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

}
