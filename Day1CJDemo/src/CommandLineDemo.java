
public class CommandLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Size : " + args.length);
		for(String arg : args){
			System.out.println(arg.toUpperCase());
		}
	}

}
