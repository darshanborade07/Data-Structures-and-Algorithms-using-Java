
public class Main {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		
		q.insert(10);
        System.out.println(q.delete());

        System.out.println(q.insert(20));
        System.out.println(q.insert(30));
        System.out.println(q.insert(40));
        System.out.println(q.insert(50));

        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());

        System.out.println(q.isEmpty() + " " + q.isFull());

	}

}
