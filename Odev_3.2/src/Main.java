
public class Main {

	public static void main(String[] args) {
		BaseManager[] managers=new BaseManager[]{new UserManager(),new InstructorManager(),new StudentManager()};
		for(BaseManager manager:managers) {
			manager.add();
			manager.delete();
			manager.update();
			
		}
			

	}

}
