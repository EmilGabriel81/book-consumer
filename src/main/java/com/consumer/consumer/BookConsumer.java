package com.consumer.consumer;

import org.common.dto.BookDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BookConsumer {

    @KafkaListener(topics = "books-topic", groupId = "book-consumer-group")
    public void consume(BookDTO book) {
        System.out.println("📘 Consumed book: " + book.getTitle() + " - $" + book.getPrice());
        System.out.println("--------------------------------------------------------------------");
        // here you could save to DB, send email, trigger workflow, etc.
    }
}