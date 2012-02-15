import java.util.Arrays;

public class josephus {
	public static void main(String[] args) {
		System.out.println(queue(10, 3));
	}

	public static int queue(int total, int num) {
		int count = total;
		int index = 0;
		int next = 1;
		boolean[] attrs = new boolean[total];
		Arrays.fill(attrs, true);
		while (count > 1) {
			if (attrs[index] == true) {
				if (next == num) {
					next = 1;
					attrs[index] = false;
					count--;
				} else {
					next++;
				}
			}
			if (index == total - 1)
				index = 0;
			else
				index++;
		}
		for (int i = 0; i < total; i++) {
			if (attrs[i] == true)
				return i + 1;
		}
		return 0;
	}
}
