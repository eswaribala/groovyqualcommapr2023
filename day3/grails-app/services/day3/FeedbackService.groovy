package day3

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Feedback)
interface FeedbackService {
    Feedback get(Serializable id)

    List<Feedback> list(Map args)

    Long count()

    void delete(Serializable id)

    Feedback save(Feedback feedback)

}
