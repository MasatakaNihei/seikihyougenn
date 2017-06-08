package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
public class Test {
	
	static Pattern bp = Pattern.compile("^[ -~｡-ﾟ]+$");
	public static void main(String[] args){
		
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("文字列と正規表現がマッチするかを調べます。");
			System.out.println("チェックしたい文字列を入力してください。");
			System.out.println("終了するには　end　と入力してください");
			System.out.println("正規表現を入力してください↓");
			String pattern = reader.readLine();
			if(pattern.equals("end")){
				System.out.println("プログラムを終了します");return;
			}
			System.out.println("検証する文字列を入力してください↓");
			String line = reader.readLine();
			if(line.equals("end")){
				System.out.println("プログラムを終了します");return;
			}
			while(!line.equals("end") && !pattern.equals("end")){
				
				System.out.print("\""+line+ "\""+ "は"+"\""+ pattern+"\"" + "に");
				if(line.matches(pattern)){
					System.out.println("マッチします。");
				}else{
					System.out.println("マッチしません。");
				}
				
				System.out.println("終了するには　end　と入力してください");
				System.out.println("正規表現を入力してください(前回と同じならそのままenter)↓");
				String newPattern = reader.readLine();
				if(newPattern.equals("end")){
					System.out.println("プログラムを終了します");return;
				}
				if(!newPattern.isEmpty()){
					pattern = newPattern;
				}
				System.out.println("検証する文字列を入力してください↓");
				line = reader.readLine();
				
				if(line.equals("end")){
					System.out.println("プログラムを終了します");return;
				}
				
			}
		}catch(IOException e){
			System.out.println(e);
			
		}
		
		
	}
}
