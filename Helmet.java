class Helmet{
	
	String brand;
	String type;
	int rating;
	double cost;
	String size;
	
	Helmet(){
		this("Vega","motorcycle",4,3000,"medium");
	
		
		
		System.out.println("Helmet is Created........");
	}
	Helmet(String brand){
	
		this.brand=brand;
		System.out.println("Helmet brand:"+brand);
		
	}
	Helmet(String brand,String type){
	
		this.brand=brand;
		this.type=type;
		System.out.println("Helmet brand:"+brand);
		System.out.println("Helmet type:"+type);
	}
	Helmet(String brand,String type,int rating){
	
	
		this.brand=brand;
		this.type=type;
		this.rating=rating;
		System.out.println("Helmet brand:"+brand);
		System.out.println("Helmet type:"+type);
		System.out.println("Helmet rating:"+rating);
	}
	Helmet(String brand,String type,int rating,double cost){
	
	
		this.brand=brand;
		this.type=type;
		this.rating=rating;
		this.cost=cost;
		System.out.println("Helmet brand:"+brand);
		System.out.println("Helmet type:"+type);
		System.out.println("Helmet rating:"+rating);
		System.out.println("Helmet cost:"+cost);
		
	}
	Helmet(String brand,String type,int rating,double cost,String size){
	
		
		this.brand=brand;
		this.type=type;
		this.rating=rating;
		this.cost=cost;
		this.size=size;
		System.out.println("Helmet brand:"+brand);
		System.out.println("Helmet type:"+type);
		System.out.println("Helmet rating:"+rating);
		System.out.println("Helmet cost:"+cost);
		System.out.println("Helmet size:"+size);
	
    }
}