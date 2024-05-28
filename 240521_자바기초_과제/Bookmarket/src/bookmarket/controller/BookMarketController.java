package bookmarket.controller;

import bookmarket.model.BookStorage;
import bookmarket.model.Cart;
import bookmarket.model.Customer;
import bookmarket.view.ConsoleView;

public class BookMarketController {

	ConsoleView view;
	BookStorage mBookStorage;
	Cart mCart;
	Customer mCustomer;

	String[] menuList = {
			"0. 종료",
			"1. 도서 정보 보기",
			"2. 장바구니 보기",
			"3. 장바구니에 도서 추가",
			"4. 장바구니 도서 삭제",
			"5. 장바구니 도서 수량 변경",
			"6. 장바구니 비우기",
			"7. 주문"
	};

	public BookMarketController(BookStorage bookStorage, Cart cart, ConsoleView view) {
		this.view = view;
		this.mBookStorage = bookStorage;
		this.mCart = cart;
	}

	public void start() {
		welcome();
		registerCustomerInfo();

		int menu;

		do {
			menu = view.selectMenu(menuList);

			switch (menu) {
				case 1:
					viewBookInfo();
					break;
				case 2:
					viewCart();
					break;
				case 3:
					addBook2Cart();
					break;
				case 4:
					deleteBookInCart();
					break;
				case 5:
					updateBookInCart();
					break;
				case 6:
					resetCart();
					break;
				case 7:
					order();
					break;
				case 0:
					end();
					break;
				default:
					view.showMessage("잘못된 메뉴 번호입니다.");
			}
		} while (menu != 0);
	}

	// 환영 인사
	private void welcome() {
		view.displayWelcome();
	}

	// 고객 정보 등록
	private void registerCustomerInfo() {
		mCustomer = new Customer();
		view.inputCustomerInfo(mCustomer);
	}

	// 도서 정보 보기
	private void viewBookInfo() {
		view.displayBookInfo(mBookStorage);
	}

	// 장바구니 보기
	private void viewCart() {
		view.displayCart(mCart);
	}

	// 장바구니에 도서 추가
	private void addBook2Cart() {
		view.displayBookInfo(mBookStorage);
		int bookId = view.selectBookId(mBookStorage);
		mCart.addItem(mBookStorage.getBookId(bookId));
		view.showMessage(">>장바구니에 도서를 추가하였습니다.");
	}

	// 장바구니 도서 삭제
	private void deleteBookInCart() {
		// 장바구니 보여주기
		view.displayCart(mCart);
		if (!mCart.isEmpty()) {
			// 도서 ID 입력 받기
			int bookId = view.selectBookId(mCart);
			if (view.askConfirm(">> 해당 도서를 삭제하려면 yes를 입력하세요 : ", "yes")) {
				// 해당 도서 ID의 cartItem 삭제
				mCart.deleteItem(bookId);
				view.showMessage(">> 해당 도서를 삭제했습니다.");
			}
		}
	}

	// 장바구니 도서 수량 변경
	private void updateBookInCart() {
		// 장바구니 보여주기
		view.displayCart(mCart);
		if (!mCart.isEmpty()) {
			// 도서 ID 입력 받기
			int bookId = view.selectBookId(mCart);
			// 수량 입력 받기
			int quantity = view.inputQuantity(0, mBookStorage.getMaxQuantity());
			// 도서 ID에 해당하는 cartItem 가져와서 cartItem quantity set 수량
			mCart.updateQuantity(bookId, quantity);
		}
	}

	// 장바구니 비우기
	private void resetCart() {
		view.displayCart(mCart);

		if (!mCart.isEmpty()) {
			if (view.askConfirm(">> 장바구니를 비우려면 yes를 입력하세요 : ", "yes")) {
				mCart.resetCart();
				view.showMessage(">> 장바구니를 비웠습니다.");
			}
		}

	}

	// 주문
	private void order() {
		// 배송 정보 추가
		getDeliveryInfo();
		// 구매 정보 보기 : 장바구니 내역, 배송 정보
		viewOrderInfo();
		// 진짜 주문할거니?
		if (view.askConfirm("진짜 주문하려면 yes를 입력하세요", "yes")) {
			// 주문 처리 -> 장바구니 초기화
			mCart.resetCart();
		}
	}

	private void getDeliveryInfo() {
		view.inputDeliveryInfo(mCustomer);
	}

	private void viewOrderInfo() {
		view.displayOrder(mCart, mCustomer);
	}

	// 종료
	private void end() {
		view.showMessage(">> Taehwan Book Market을 종료합니다.");
	}

}
