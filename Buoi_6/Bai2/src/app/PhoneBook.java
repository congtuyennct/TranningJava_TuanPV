package app;

import java.util.ArrayList;

public class PhoneBook extends Phone{
	// Tạo một ArrayList tên this.phoneList để lưu dữ liệu.
	private ArrayList<BasePhone> phoneList = new ArrayList<>();
	
	@Override
	void insertPhone(String name, String phone) {
		int index = 0;
		
		// nếu phone list rỗng thì add luôn vào
		if(this.phoneList.isEmpty()) {
			BasePhone base = new BasePhone();
			base.setName(name);
			base.setPhone(phone);
			
			// thêm vào mảng this.phoneList
			this.phoneList.add(base);
		}else {
			for (BasePhone basePhone : phoneList) {
				// kiểm tra xem name truyền vào đã có trong this.phoneList chưa
				if(basePhone.getName().equals(name)) {
					// trương hợp dã có name trong this.phoneList
					if(!basePhone.getPhone().equals(phone)) {
						// trường hợp phone truyền vào khác phone trong this.phoneList
						basePhone.setPhone(basePhone.getPhone() + " : " + phone);
						
						// cập nhật lại vào mảng this.phoneList
						this.phoneList.add(index, basePhone);
					}
				}else {
					BasePhone base = new BasePhone();
					// trường hợp chưa có name trong this.phoneList
					
					// gán giá trị cho base phone
					base.setName(name);
					base.setPhone(phone);
					
					// thêm vào mảng this.phoneList
					this.phoneList.add(base);
				}
				index++;
			}
		}
		System.out.println(" Danh sách phone ");
		show();
	}

	@Override
	void removePhone(String name) {
		for (BasePhone basePhone : this.phoneList) {
			// nếu name truyền vào mà có trong this.phoneList thì xoá đi
			if(basePhone.getName().equals(name)) {
				this.phoneList.remove(basePhone);
			}
		}
		
	}

	@Override
	void updatePhone(String name, String newphone) {
		int index = 0;
		for (BasePhone basePhone : this.phoneList) {
			// nếu name truyền vào mà có trong this.phoneList thì cập nhật lại phone
			if(basePhone.getName().equals(name)) {
				basePhone.setPhone(newphone);
				// update lại phone
				this.phoneList.add(index, basePhone);
			}
			index++;
		}
		
	}

	@Override
	void searchPhone(String name) {
		
	}

	@Override
	void sort() {
		
	}
	
	public void show() {
		for (BasePhone basePhone : this.phoneList) {
			System.out.println("Name: " + basePhone.getName() + "\t Phone: " + basePhone.getPhone());
		}
	}
}
