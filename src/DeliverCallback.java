import java.io.IOException;

import com.rabbitmq.client.Delivery;

@FunctionalInterface
public interface DeliverCallback {
    /**
     * Called when a <code><b>basic.deliver</b></code>is received for this consumer.
     * 
     * @param consumerTag the <i>consumer tag</i>associate with the consumer
     * @param message     the delivered message
     *                    d@throws IPException if the consumer ecounter an I/O error
     *                    while processing the message
     */
    void handle(String consumerTag, Delivery message) throws IOException;
}
