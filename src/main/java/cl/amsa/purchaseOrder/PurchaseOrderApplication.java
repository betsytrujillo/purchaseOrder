package cl.amsa.purchaseOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/spring-camel-context.xml"})
public class PurchaseOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseOrderApplication.class, args);
	}

}
