package com.k2pan.api.services.order;

import org.springframework.stereotype.Service;

import com.k2pan.api.interfaces.order.IOrderNotifier;
import com.k2pan.api.models.order.Order;
import com.k2pan.api.models.book.BookDetail;
@Service
public class OrderService {
    private OrderServiceFactory orderServiceFactory;
    
    public OrderService(){
        this.orderServiceFactory = new OrderServiceFactory();
        BookDetail bookDetail = new BookDetail.Builder()
                                        .setAuthor("VO DINH QUOC")
                                        .setDescription("Make Vietnam great again")
                                        .setLanguage("Vietnamese")
                                        .build();
        System.out.println("Result");
        System.out.println(bookDetail);
    }
    public void updateOrderStatus(Order order) {
        IOrderNotifier iOrderNotifier = this.orderServiceFactory.createNotifyOrderMethod("email");
        iOrderNotifier.sendNotification(order, "Thanh toán thành công");
    }

}
