/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolaStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolaStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？\n");
		System.out.print("シトロン   >");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String citronstring = reader.readLine();
		double citron = Double.parseDouble(citronstring);

		System.out.print("ショコラ   >");

		String chokolastring2 = reader.readLine();
		double chokola = Double.parseDouble(chokolastring2);

		System.out.print("ピスターシュ　>");

		String pistachestring3 = reader.readLine();
		double pistache = Double.parseDouble(pistachestring3);

		System.out.println("\nシトロン" + citron + "個");
		System.out.println("ショコラ" + chokola + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		double total = citron + chokola + pistache;
		int totalbuy = (int) (citron * 250 + chokola * 280 + pistache * 320);

		System.out.println("\n合計個数" + total + "個");
		System.out.println("合計金額" + totalbuy + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		int leftcitorn = (int) (citronStock - citron);
		int leftshokora = (int) (chocolaStock - chokola);
		int leftpistashu = (int) (pistacheStock - pistache);

		System.out.println("シトロン    \\250・・・残り" + leftcitorn + "個");
		System.out.println("ショコラ　　\\280・・・残り" + leftshokora + "個");
		System.out.println("ピスターシュ\\320・・・残り" + leftpistashu + "個");

	}

}
