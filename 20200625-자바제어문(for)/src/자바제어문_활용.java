import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/*
 * <div class="info_detail" data-tiara-layer="thumb">
   <a href="javascript:topVideoPlay('134684');" class="link_play">
   <span class="btn_popcorn">�÷��̾�</span></a>
       <strong class="tit_detail">
 */
public class �ڹ����_Ȱ�� {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("https://movie.daum.net/main/new#slide-1-0").get();
		System.out.println(doc);
		Element title=doc.selectFirst();
		ele
		
	}

}
