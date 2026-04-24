/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("シトロン" + citron + "個");
		System.out.println("ショコラ" + chokola + "個");
		System.out.println("ピスターシュ" + pistache + "個");

		double total = citron + chokola + pistache;
		int totalbuy = (int) (citron * 250 + chokola * 280 + pistache * 320);

		System.out.println("合計個数" + total + "個");
		System.out.println("合計金額" + totalbuy + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");

		int leftcitorn = (int) (citronStock - citron);
		int leftshokola = (int) (chocolaStock - chokola);
		int leftpistashu = (int) (pistacheStock - pistache);

		System.out.println("\nシトロン    \\250・・・残り" + leftcitorn + "個");
		System.out.println("ショコラ　　\\280・・・残り" + leftshokola + "個");
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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味・・・" + citronpercent + "%");
		System.out.println("ショコラの味・・・" + chokolapercent + "%");
		System.out.println("ピスターシュの味・・・" + pistachepercent + "%");

		System.out.println("\nが楽しめます！\n");

		int macaron = (int) ((int) totalbuy / total);

		System.out.println("値段は\\" + macaron + "です。");

	}

}
