/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n本日のおすすめ商品です。");

		int leftcitorn = (int) (citronStock - citron);
		int leftshokora = (int) (chocolaStock - chokola);
		int leftpistashu = (int) (pistacheStock - pistache);

		System.out.println("\nシトロン    \\250・・・残り" + leftcitorn + "個");
		System.out.println("ショコラ　　\\280・・・残り" + leftshokora + "個");
		System.out.println("ピスターシュ\\320・・・残り" + leftpistashu + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております.\n");

		System.out.println("売上の割合");
		System.out.println("売上合計 　  \\" + totalbuy + "");

		System.out.println("\n内訳");

		int citronpercent = (int) (citron / total * 100);
		int chokolapercent = (int) (chokola / total * 100);
		int pistachepercent = (int) (pistache / total * 100);

		System.out.println("シトロン    　\\" + citron * 250 + "・・・" + citronpercent + "%");
		System.out.println("ショコラ    　\\" + chokola * 280 + "・・・" + chokolapercent + "%");
		System.out.println("ピスターシュ　\\" + pistache * 320 + "・・・" + pistachepercent + "%");

	}

}
