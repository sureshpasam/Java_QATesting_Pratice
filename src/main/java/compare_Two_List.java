

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class compare_Two_List {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<String> list1  = new ArrayList();
		list1.add("https://www.mcom-053.tbe.zeus.fds.com/shop/product/jm-collection-open-front-cardigan-created-for-macys?ID=2918600&CategoryID=260&RVI=Browse_1&tdp=cm_choiceId~z2918600~xcm_pos~zPos1");
		list1.add("https://www.mcom-053.tbe.zeus.fds.com/shop/product/jm-collection-flutter-sleeve-banded-hem-top-created-for-macys?ID=5770846&CategoryID=255&RVI=Browse_2&tdp=cm_choiceId~z5770846~xcm_pos~zPos2");
		list1.add("https://www.mcom-053.tbe.zeus.fds.com/shop/product/jm-collection-ribbed-metallic-cardigan-created-for-macys?ID=6824039&CategoryID=260&RVI=Browse_5&tdp=cm_choiceId~z6824039~xcm_pos~zPos5");
		list1.add("https://www.mcom-053.tbe.zeus.fds.com/shop/product/charter-club-open-front-cardigan-created-for-macys?ID=6388308&CategoryID=260&RVI=Browse_4&tdp=cm_choiceId~z6388308~xcm_pos~zPos4");
		
		/*List<String> list2  = new ArrayList<>();
		list2.add("Suresh");
		//list1.add("Raju");
		*/
		list1.stream().filter(p->p.contains("RVI=Browse")).forEach(p->System.out.println("adsdg+"+p));
		list1.forEach(p->System.out.println(p.contains("RVI=Browse")+p));
	

	}

}
