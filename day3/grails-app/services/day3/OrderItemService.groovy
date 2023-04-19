package day3

import grails.gorm.services.Service

@Service(OrderItem)
interface OrderItemService {

    OrderItem get(Serializable id)

    List<OrderItem> list(Map args)

    Long count()

    void delete(Serializable id)

    OrderItem save(OrderItem orderItem)

}