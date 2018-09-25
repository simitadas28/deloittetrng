class Welcome
{
	public void accept()
		{
			System.out.println("Welcome in accept");
		}
	public void display()
		{
			System.out.print("Welcome to Deloitte");
			System.out.println("\nWelcome to ITPL");
		}
		
	static public void main(String a[])
	{
		System.out.println("Welcome to ITPL");
		Welcome w=new Welcome();
		w.display();
		w.accept();
		Bye b=new Bye();
		b.sayBye();
	}

}