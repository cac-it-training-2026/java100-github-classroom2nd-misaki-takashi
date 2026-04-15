/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？\n");
		System.out.print("シトロン   >");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String citronstring = reader.readLine();
		int citron = Integer.parseInt(citronstring);

		System.out.print("ショコラ   >");

		String chokolastring2 = reader.readLine();
		int chokola = Integer.parseInt(chokolastring2);

		System.out.print("ピスターシュ　>");

		String pistashestring3 = reader.readLine();
		int pistashe = Integer.parseInt(pistashestring3);

		System.out.println("\nシトロン" + citron + "個");
		System.out.println("ショコラ" + chokola + "個");
		System.out.println("ピスターシュ" + pistashe + "個");

		int total = citron + chokola + pistashe;
		int totalbuy = citron * 250 + chokola * 280 + pistashe * 320;

		System.out.println("\n合計個数" + total + "個");
		System.out.println("合計金額" + totalbuy + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		int leftcitorn = 30 - citron;
		int leftshokora = 30 - chokola;
		int leftpistashu = 30 - pistashe;

		System.out.println("シトロン    \\250・・・残り" + leftcitorn + "個");
		System.out.println("ショコラ　　\\280・・・残り" + leftshokora + "個");
		System.out.println("ピスターシュ\\320・・・残り" + leftpistashu + "個");

	}

}
