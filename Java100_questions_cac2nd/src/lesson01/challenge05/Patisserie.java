/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？\n");
		System.out.print("シトロン   >");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String citronstring = reader.readLine();
		int citorn = Integer.parseInt(citronstring);

		System.out.print("ショコラ   >");

		String chokolastring2 = reader.readLine();
		int chokola = Integer.parseInt(chokolastring2);

		System.out.print("ピスターシュ　>");

		String pistashestring3 = reader.readLine();
		int pistashe = Integer.parseInt(pistashestring3);

		System.out.println("\nシトロン" + citorn + "個");
		System.out.println("ショコラ" + chokola + "個");
		System.out.println("ピスターシュ" + pistashe + "個");

		int total = citorn + chokola + pistashe;
		int totalbuy = citorn * 250 + chokola * 280 + pistashe * 320;

		System.out.println("\n合計個数" + total + "個");
		System.out.println("合計金額" + totalbuy + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
