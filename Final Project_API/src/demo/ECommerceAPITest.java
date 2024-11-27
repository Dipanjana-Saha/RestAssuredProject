package demo;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import POJO.LoginRequest;
import POJO.LoginResponse;
import POJO.OrderDetails;
import POJO.Orders;
public class ECommerceAPITest {

	public static void main(String[] args) {
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType(ContentType.JSON).build();
		
		LoginRequest loginRequest=new LoginRequest();
		loginRequest.setUserEmail("saha@gmail.com");
		loginRequest.setUserPassword("Dipa#1998#");
		

		
		RequestSpecification reqLogin=given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest);
		LoginResponse loginResponse=reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract().response()
				.as(LoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		String token=loginResponse.getToken();
		String userId=loginResponse.getUserId();
		System.out.println(userId);
		
		
		
		//ADD PRODUCT
		RequestSpecification addProductBaseReq=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token)
				.build();
		
		RequestSpecification reqAddProduct=given().log().all().spec(addProductBaseReq).param("productName", "Laptop")
		.param("productAddedBy", userId).param("productCategory", "fashion")
		.param("productSubCategory", "shirts").param("productPrice", "11500")
		.param("productDescription", "hp").param("productFor", "women")
		.multiPart("productImage",new File("C://Users//Dipanjana Saha//Postman//files//wolf.png"));
		
		String addProductResponse=reqAddProduct.when().post("/api/ecom/product/add-product")
		.then().log().all().extract().response().asString();
		JsonPath js=new JsonPath(addProductResponse);
		String productId=js.get("productId");
		
		//Create Order
		RequestSpecification createOrderBaseReq=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON)
				.build();
		OrderDetails orderDetails=new OrderDetails();
		orderDetails.setCountry("India");
		orderDetails.setProductOrderedId(productId);
		
		List<OrderDetails> orderDetailList =new ArrayList<OrderDetails>();
		orderDetailList.add(orderDetails);
		Orders orders=new Orders();
		orders.setOrders(orderDetailList);
		
		RequestSpecification createOrderReq=given().log().all().spec(createOrderBaseReq).body(orders);
		String responseAddOrder=createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
		System.out.println(responseAddOrder);
		
		//DELETE THE PRODUCT
		RequestSpecification delProdBaseReq=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON)
				.build();
		
		RequestSpecification deleteProdReq=given().log().all().spec(delProdBaseReq).pathParam("productId", productId);
		
		String deleteProductResponse=deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().extract().response().asString();
		
		JsonPath js1=new JsonPath(deleteProductResponse);
		Assert.assertEquals("Product Deleted Successfully",js1.get("message"));
		
	}
	

}
