
public class StudentSearchTest {
	public static void main(String[] args) {
		SendLogCronTrriger trigger = new SendLogCronTrriger("0 0 23 * * ?", SendLogJob.class);
		trigger.triggerJob();
	}
}
