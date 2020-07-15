package tranning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayObject {
	public void arrayObject() {
		// array list
		List<String> strings = new ArrayList();
		
		System.out.println(" ------------- ");
		
		// thêm 1 phần tử vào mảng
		strings.add("Phê");
		strings.add("Công");
		strings.add("A");
		showArray(strings);
		System.out.println(" ------------- ");
		
		// sửa
		strings.set(1, "Nguyễn");
		showArray(strings);
		System.out.println(" ------------- ");
		
//		// xoá
//		strings.remove(1);
//		showArray(strings);
//		System.out.println(" ------------- ");
		
		Collections.sort(strings);
		
		showArray(strings);
		System.out.println(" ------------- ");
		
	}
	
	private void showArray(List<String> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
