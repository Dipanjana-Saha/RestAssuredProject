package POJO;
/*{
    "orders": [
        {
            "country": "India",
            "productOrderedId": "66a8d467ae2afd4c0b38613e"
        }
    ]
}*/

import java.util.List;

public class Orders {
	private List<OrderDetails> orders;

	public List<OrderDetails> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetails> orders) {
		this.orders = orders;
	}

}
