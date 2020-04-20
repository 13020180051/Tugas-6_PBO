class hewan {
	
	void suara() {
		System.out.println("Suara hewan");
	}	

}

class kucing extends hewan {
	
	void suara() {
		System.out.println("meong");
	}
}

class anjing extends hewan {
	
	void suara() {
		System.out.println("mbeeekk");
	}
}


class demo{
	
	public static void main(String[] args) {
		hewan h = new hewan();
		h.suara();
		
		hewan k = new kucing();
		k.suara();
		
		hewan a = new kambing();
		a.suara();
	}
}
