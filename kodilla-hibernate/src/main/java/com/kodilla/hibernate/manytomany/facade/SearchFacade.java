package com.kodilla.hibernate.manytomany.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.math.BigDecimal;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
//    private final ComEmpService comEmpService;

/*    @Autowired
    public SearchFacade(ComEmpService comEmpService) {
        this.comEmpService = comEmpService;
    }               */

/*    public void processOrder(final OrderDto order, final Long userId) throws SearchProcessingException {
        boolean wasError = false;
        Long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, ID: " + orderId);
        if (orderId < 0) {
            LOGGER.error(SearchProcessingException.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_NOT_AUTHORISED);
        }
        try {
            for (ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + ", " + orderItem.getQty() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQty());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: " + value + " USD");
            if (!shopService.doPayment(orderId)) {
                LOGGER.error(SearchProcessingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if (!shopService.verifyOrder(orderId)) {
                LOGGER.error(SearchProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if (!shopService.submitOrder(orderId)) {
                LOGGER.error(SearchProcessingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        } finally {
            if (wasError) {
                LOGGER.info("Cancelling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }               */
}