/*
 *    
결백(2019)상영중
潔白 평점 08 . 8
드라마
한국
2020.06.10 개봉
 110분, 15세이상관람가
감독 박상현 주연 신혜선, 배종옥, 허준호
예매 2위 누적관객617,897명 
도움말

야구소녀(2019)상영중
Baseball Girl 평점 08 . 5
드라마
한국
2020.06.18 개봉
 105분, 12세이상관람가
감독 최윤태 주연 이주영
예매 7위 누적관객21,783명 
도움말
 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="결백(2019)";
		boolean isOpen=true;
		double score=8.8;
		String na="한국";
		String genre="드라마";
		String regdate="2020.06.18";
		String director="박상현";
		String actor="신혜선, 배종옥, 허준호";
		int time=110;
		int grade=15;
		int rank=2;
		int showUser=617897;

		System.out.println("========영화정보=======");
		System.out.print("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타"+" "+grade);
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위"+rank);
		System.out.println("누적관객수"+showUser);
		
		
		
		title="야구소녀(2019)";
		isOpen=true;
		score=8.5;
		na="한국";
		genre="드라마";
		regdate="2020.06.18";
		director="최윤태";
		actor="이주영";
		time=105;
		grade=12;
		rank=7;
		showUser=21783;
		
		System.out.println("========영화정보=======");
		System.out.print("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타"+" "+grade);
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위"+rank);
		System.out.println("누적관객수"+showUser);
		
		/*String regdate="2020.06.10";
		String director="최윤태";
		String actor="이주영";
		int time=105;
		int grade=12;
		int rank=7;
		int showUser=21,783;
		*/

	}

}
