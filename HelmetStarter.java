class HelmetStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Helmet in HelmetStarter");
		
		Helmet Helmet=new Helmet();
		System.out.println("Helmet brand is: "+Helmet.brand);
		System.out.println("Helmet type is: "+Helmet.type);
		System.out.println("Helmet rating is: "+Helmet.rating);
		System.out.println("Helmet cost is: "+Helmet.cost);
		System.out.println("Helmet size is: "+Helmet.size);
		
		Helmet Helmet1=new Helmet("Vega");
		System.out.println("Helmet1 brand is: "+Helmet1.brand);
		System.out.println("Helmet1 type is: "+Helmet1.type);
		System.out.println("Helmet1 rating is: "+Helmet1.rating);
		System.out.println("Helmet1 cost is: "+Helmet1.cost);
		System.out.println("Helmet1 size is: "+Helmet1.size);
		
		Helmet Helmet2=new Helmet("Vega","motorcycle");
		System.out.println("Helmet2 brand is: "+Helmet2.brand);
		System.out.println("Helmet2 type is: "+Helmet2.type);
		System.out.println("Helmet2 rating is: "+Helmet2.rating);
		System.out.println("Helmet2 cost is: "+Helmet2.cost);
		System.out.println("Helmet2 size is: "+Helmet2.size);
		
		Helmet Helmet3=new Helmet("Vega","motorcycle",4);
		System.out.println("Helmet3 brand is: "+Helmet3.brand);
		System.out.println("Helmet3 type is: "+Helmet3.type);
		System.out.println("Helmet3 rating is: "+Helmet3.rating);
		System.out.println("Helmet3 cost is: "+Helmet3.cost);
		System.out.println("Helmet3 size is: "+Helmet3.size);
		
		Helmet Helmet4=new Helmet("Vega","motorcycle",4,3000);
		System.out.println("Helmet4 brand is: "+Helmet4.brand);
		System.out.println("Helmet4 type is: "+Helmet4.type);
		System.out.println("Helmet4 rating is: "+Helmet4.rating);
		System.out.println("Helmet4 cost is: "+Helmet4.cost);
		System.out.println("Helmet4 size is: "+Helmet4.size);
		
				
		Helmet Helmet5=new Helmet("Vega","motorcycle",4,3000,"medium");
		System.out.println("Helmet5 brand is: "+Helmet5.brand);
		System.out.println("Helmet5 type is: "+Helmet5.type);
		System.out.println("Helmet5 rating is: "+Helmet5.rating);
		System.out.println("Helmet5 cost is: "+Helmet5.cost);
		System.out.println("Helmet5 size is: "+Helmet5.size);
		
		System.out.println("Ending Helmet in HelmetStarter");
	}
}