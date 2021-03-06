import java.io.*;
import java.util.*;
public class SendTestMain {
	//送信テスト用のメインメソッド
	/*public static void main(String[] args) throws Exception {
		File[] files = {new File("row_data/"+"hoge")};
		System.out.println("send start");
		String myaddress = "hoge";
		String addressies[] = {"hoge"};
		NetworkServer net = new NetworkServer(myaddress,addressies);
		net.sendData(files, "localhost",11);
		System.out.println("ended");
	}*/
	public static void main(String[] args) {
		File file = new File("row_data/"+"hoge/hoge.txt");
		String servers[] = {"localhost"};
		Client client = new Client("localhost",servers);
		System.out.println("store start");
		if(client.store(file)){
			System.out.println("store success");
		}else{
			System.out.println("store failed");
		}
		System.out.println("find start");
		ArrayList<File> files = client.find(file.getName());
		for(File getFile : files){
			System.out.println(getFile.getPath());
		}
		System.out.println("delete start");
		if(client.delete(file.getName())){
			System.out.println("delete success");
		}else{
			System.out.println("delete failed");
		}
	}
}