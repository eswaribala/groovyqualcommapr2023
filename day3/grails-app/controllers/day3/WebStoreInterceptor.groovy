package day3

import groovy.util.logging.Slf4j

@Slf4j
class WebStoreInterceptor {

    public WebStoreInterceptor() {
        // match all requests to the
        // reporting controller...
        match controller: 'inventory'

        // match a request to the create action
        // in the person controller
        match controller: 'customer', action: 'create'

        // match all requests to the award
        // or product controller
        match controller: ~/(award|product)/
    }
    boolean before() {
        // if the user has not been authenticated,
        // redirect to authenticate the user...
        if(session.isNew()) {
            // log a message
            log.info 'Redirecting to customer page'
            redirect controller: 'customer', action: 'create'
            return false
        }
        else
        {
            log.info 'Redirecting to order page'
            redirect controller: 'onlineOrder', action: 'create'
            return false
        }
        true

    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
