package Übung3;

public class Binary {
	private int zahl;
	
	Binary(int zahl){
		this.zahl = zahl;
	}
	
	public String inBinary(){
		String erg="";
		int[] zahlenreihe = new int[32];
		int bit=1;
		int hilf;
		int count=0;
		for(int i=0;i<zahlenreihe.length;i++)
		{
			count = i-1;
			bit = bit << count;
			hilf = zahl << (30 - count);
			hilf = hilf >>> (31);
			if (zahl > 0) {
				if (hilf != 0) {
					zahlenreihe[i] = 1;
				} else {
					zahlenreihe[i] = 0;
				}
			} else {
				if (hilf == 0) {
					zahlenreihe[i] = 0;
				} else {
					zahlenreihe[i] = 1;
				}
			}
		}
		for(int i=zahlenreihe.length-1;i>=0;i--)
		{
			erg = erg + zahlenreihe[i];
		}
		return erg;
	}	
}
