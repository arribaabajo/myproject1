package jdbctest;

public class PageVO {
	private String ID;
	private String PW;
	private String NAME;
	private String NICKNAME;
	private String LET;
	private String NO;
	public String getNO() {
		return NO;
	}



	public void setNO(String nO) {
		NO = nO;
	}



	public String getTITLE() {
		return TITLE;
	}



	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}



	public String getIMG() {
		return IMG;
	}



	public void setIMG(String iMG) {
		IMG = iMG;
	}



	private String TITLE;
	private String IMG;
	
	
	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getPW() {
		return PW;
	}



	public void setPW(String pW) {
		PW = pW;
	}



	public String getNAME() {
		return NAME;
	}



	public void setNAME(String nAME) {
		NAME = nAME;
	}



	public String getNICKNAME() {
		return NICKNAME;
	}



	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}



	public String getLET() {
		return LET;
	}



	public void setLET(String lET) {
		LET = lET;
	}



	@Override
	public String toString() {return "PageVO [ID=" + ID + ", PW=" + PW + ", NAME=" + NAME + ", NICKNAME=" + NICKNAME + ", LET=" + LET + "]";
	}


}
